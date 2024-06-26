package Bai34;

public class Tester {

    public static void main(String[] args) {
        System.out.println("--------------1.XEM THONG TIN TAI KHOAN.------------");
        Taikhoankhongkyhan tkc = new Taikhoankhongkyhan("TranTheAnh", 1000000);
        Taikhoankyhan tkp = new Taikhoankyhan(KyHan.MOT_TUAN, "Nguyen THi Minh Tuyet", 200000);
        Taikhoankyhan tkp4 = new Taikhoankyhan(KyHan.MOT_NAM,"THE ANH", 300000);
        Taikhoankyhan tkp2 = new Taikhoankyhan(KyHan.MOT_THANG, "NHAT HUY", 500000);
        Taikhoankyhan tkp3 = new Taikhoankyhan(KyHan.MOT_NAM, "MINH KHA", 350000);
        System.out.println(tkc.disPlay());
        System.out.println(tkp.disPlay());
        System.out.println(tkp2.disPlay());
        System.out.println(tkp3.disPlay());
        System.out.println("--------------2. NAP TIÊN-----------");
        tkc.nopTien(100000);
        tkp.nopTien(2000000);
        tkp2.nopTien(300000);
        tkp3.nopTien(4000000);
        System.out.println("-----------3.RUT TIEN-----------");
        tkc.rutTien(100000);
        tkp.rutTien(2000);
        tkp2.rutTien(1000000);
        tkp3.rutTien(149);
        System.out.println("---------------------.4. TINH TIEN LAI----------------");
        System.out.println(tkc.tinhLai() + "\n"
                + tkp.tinhLai() + "\n"
                + tkp2.tinhLai() + "\n"
                + tkp3.tinhLai() + "\n"
                + ""
                + ""
                // lAY RA DANH SACH CAC TAI KHOAN TUAN / CAC TK THANG / TK NAM
        );

    }

}
