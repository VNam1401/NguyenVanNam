package De_01;

import java.util.ArrayList;

class Quanlycauthu {

    static ArrayList<Cauthu> danhsachcauthu = new ArrayList<>();

    public void khoitaodanhsach() {
        System.out.println("<<<\nDANH SACH CAU THU>>>");
        danhsachcauthu.add(new Cauthu(2, "Tran Van Dong", 1999, 12000000, 500000, 1000000));
        danhsachcauthu.add(new Cauthu(4, "Do Van Trinh", 2000, 10000000, 200000, 0));
        danhsachcauthu.add(new Cauthu(1, "Pham Thi Bach Hop", 2001, 9000000, 50000, 500000));
        danhsachcauthu.add(new Cauthu(7, "Nguyen Van Nam", 2002, 8000000, 100000, 7000000));
        danhsachcauthu.add(new Cauthu(8, "Tran Thien Trang", 1999, 5000000, 500000, 600000));
        danhsachcauthu.add(new Cauthu(10, "Tran Thu Ha", 1998, 3000000, 700000, 0));
        danhsachcauthu.add(new Cauthu(6, "Trieu Quang Huy", 1997, 7000000, 20000, 400000));
        danhsachcauthu.add(new Cauthu(5, "Nguyen Duy Duc", 1996, 4000000, 100000, 400000));
        danhsachcauthu.add(new Cauthu(14, "Pham Thi Thuong", 1995, 15000000, 1200000, 150000));
        danhsachcauthu.add(new Cauthu(34, "Hoang The Phung", 2001, 14000000, 100000, 610000));
        danhsachcauthu.add(new Cauthu(24, "Do Thi Thu Ha", 2003, 1000000, 0, 130000));
    }

    public boolean themCauThu(CauThu newcauthu) {
        for (Cauthu cauThu : danhsachcauthu) {
            if (cauThu.getSoao() == newcauthu.getSoao()) {
            }
        }
        danhsachcauthu.add(newcauthu);
        return false;
    }
     public void Xuat() {
        double tongluong = 0;
        for (Cauthu ct : danhsachcauthu) {
            System.out.println(ct);
            tongluong += ct.luongthuclanh();
        }
        System.out.println("Tong luong: " + tongluong);
    }
      public void cauthuluongcaunhat() {
        double luongcaonhat = 0;
        for (Cauthu ct : danhsachcauthu) {
            double luongTL = ct.luongthuclanh();
            if (luongTL > luongcaonhat) {
                luongcaonhat = luongTL;
            }
        }
    }
       public void sapxeptheoluong() {
    }
    public double tinhluongtrungbinh() {
        double luongcungtb = 0;
        for (Cauthu ct : danhsachcauthu) {
            luongcungtb += ct.getLuongcung();
        }
        return luongcungtb / danhsachcauthu.size();
    }
}
