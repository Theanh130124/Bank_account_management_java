/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai34;

/**
 *
 * @author LAPTOP
 */
public class Taikhoankhongkyhan extends TaiKhoan {

    public Taikhoankhongkyhan(String ten, double sotien) {
        super(ten, sotien);
    }
    public boolean isDaoHan()
    {
        return true; 
    }

    @Override
    public String disPlay() {
        return "Taikhoankhongkyhan" + "{" + super.disPlay() + "}"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    @Override
    public void nopTien(double sotien)
    {
        this.sotien +=sotien;
    }
    @Override
    public void rutTien(double sotien) // them isDaoHan vao day cung duoc 
    {
        if(this.sotien>=sotien)
            System.out.println("SO TIEN BAN RUT LA :"+sotien);
        this.sotien -= sotien;
        System.out.println("SO TIEN CON LAI TRONG TAI KHOAN LA:"+this.sotien);
    }

    @Override
    public double tinhLai() {
      return this.sotien*(0.1/100);// số tiền lãi nhận được trong một năm
      
    }

}
