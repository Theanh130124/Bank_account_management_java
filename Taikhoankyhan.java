/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai34;

import static Bai34.Cauhinh.FORMATTER;
import java.time.LocalDate;

/**
 *
 * @author LAPTOP
 */
public class Taikhoankyhan extends TaiKhoan {

    private KyHan kyhan;
    private LocalDate ngaydaohan;

    public Taikhoankyhan(KyHan kyhan, String ten, double sotien) {
        super(ten, sotien);
        this.kyhan = kyhan;
        this.ngaydaohan = kyhan.tinhDaoHan(LocalDate.now());// kyhan là dùng cái kyhan không dùng KyHan

    }

    @Override
    public String disPlay() {
        return "Taikhoankyhan" + "{" + "KyHan" + kyhan + "NgayDaoHan" + ngaydaohan.format(FORMATTER) + super.disPlay() + "}"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean isDaoHan() {
        return ngaydaohan.equals(LocalDate.now()); // Chỉ được nạp vào trong ngày đáo hạn
    }

    @Override
    public void nopTien(double sotien) {
        if (isDaoHan()) {
            this.sotien += sotien; // phải protectede bên TaiKhoan
            System.out.println("NOP TIEN THANH CONG !");
            System.out.println("SO TIEN HIEN TAI LA:"+this.sotien);
        } else {
            System.out.println("NOP TIEN THAT BAI !");
        }
    }

    @Override
    public void rutTien(double sotien) {
        if (isDaoHan() && this.sotien >= sotien) {
            System.out.println("SO TIEN BAN RUT LA :" + sotien);
            this.sotien -= sotien;
            System.out.println("SO TIEN TRONG TAI KHOAN CON LAI LA" + this.sotien);

        } else {
            System.out.println("RUT TIEN KHONG THANH CONG !");
        }
    }

    @Override
    public double tinhLai() {
        if(isDaoHan()==false) // nho chuyen ve true de dung 
        {
        return this.sotien+=kyhan.tinhLai(this.sotien); // số tiền lãi nhận được trong một năm
        }
        return this.sotien;  // Không được tính lãi
       
       
    }
    

}
