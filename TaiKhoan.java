/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai34;

import java.time.LocalDate;

/**
 *
 * @author LAPTOP
 */
public abstract class TaiKhoan {

    private static int dem = 0;
    private String stk;
    private String ten;
    private String sdt;
    private String email;
    protected double sotien;
    private LocalDate ngaytao; // khỏi tạo trong Constructor
    private String trangthai;

    {
        setStk(String.format("%06d", ++dem));
    }

//Tự động tăng thì không bỏ stk vào Constructor
    //abstract sài private mà có get set khỏi dùng protected
    public TaiKhoan(String ten, double sotien) {
        this.ten = ten;
        this.sotien = sotien;

    }

    public static int getDem() {
        return dem;
    }

    public static void setDem(int aDem) {
        dem = aDem;
    }

    public String getStk() {
        return stk;
    }

    public void setStk(String stk) {
        this.stk = stk;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSotien() {
        return sotien;
    }

    public void setSotien(double sotien) {
        this.sotien = sotien;
    }

    public LocalDate getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(LocalDate ngaytao) {
        this.ngaytao = ngaytao;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String disPlay() {
        return "stk=" + stk + ", ten=" + ten + ", sotien=" + sotien + '}';
    }

    public abstract boolean isDaoHan();

    public abstract void nopTien(double sotien);

    public abstract void rutTien(double sotien);
    
    public abstract double tinhLai();
    

}
