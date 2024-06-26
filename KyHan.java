
package Bai34;

import java.time.LocalDate;

public enum KyHan {
MOT_TUAN(7 ,0.5) { // Phải tại biến double lãi suất và thêm vào Constructor thì mới không báo lỗi
    @Override
    public LocalDate tinhDaoHan(LocalDate d) { // xóa throw new
        return d.plusDays(this.khoangthoigian); // tương đương với cộng 7 ngày
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double tinhLai(double sotien) {
        return sotien*(this.laisuat/100) ; 
    }
},
MOT_THANG(1, 4.5) {
    @Override
    public LocalDate tinhDaoHan(LocalDate d) {
        return d.plusMonths(this.khoangthoigian);
    }

    @Override
    public double tinhLai(double sotien) {
        return sotien*(this.laisuat/100); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
},
MOT_NAM(1,6.8) {
    @Override
    public LocalDate tinhDaoHan(LocalDate d) {
        return d.plusYears(this.khoangthoigian); // ngày LocalDate d + khoang thoi gian
    }

    @Override
    public double tinhLai(double sotien) {
        return sotien*(this.laisuat/100); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}; // Thằng cuối cùng này phải là ; để không bị lỗi 
//
protected int khoangthoigian; // nếu khai báo private thì this.khoangthoigian trong các Override không dùng được 
protected double laisuat ; 
public abstract LocalDate tinhDaoHan(LocalDate d); // sau khi tạo tuần tháng năm rồi thì tạo này rồi click trên public enum KyHan

    private KyHan(int khoangthoigian ,double laisuat) {
        this.khoangthoigian = khoangthoigian;
        // KyHan(int khoangthoigian) == MOT_TUAN(int khoang thoi gian)
        this.laisuat=laisuat ; // sao khi tại biến lãi  suất thì phải thêm vào Constructor
    }
    
     public abstract double tinhLai(double sotien);

    private KyHan() {
    }
     

    

        
    
    
    
    
}

