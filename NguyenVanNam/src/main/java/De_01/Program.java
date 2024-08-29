package De_01;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Cauthu qlct = new Cauthu();
        qlct.khoitao();

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------ MENU ------");
            System.out.println("1.Nhap danh sach cau thu");
            System.out.println("2.Xuat danh sach cau thu");
            System.out.println("3.Xuat danh sach cau thu co luong cau nhat");
            System.out.println("4.sap xep danh sach cau thu theo so ao");
            System.out.println("5.ket thuc");
            System.out.print("Chon menu: ");
            System.out.print("click number(1=>5)");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
//                    nhap();
                    break;
                case 2:
//                    xuatdanhsach();
                    break;
                case 3:
//                    maxluong();
                    break;
                case 4:
//                    sapxep();
                    break;
                case 5:
                    System.out.println("Ket thuc chuong trinh.");
                    System.exit(0);
                default:
                    System.out.println("Khong hop le. vui long chon lai.");
            }
            //    }     private static void nhap() {
            //        Scanner sc = new Scanner(System.in);
            //        System.out.print("So luong cau thu: ");
            //        int soluong = sc.nextInt();
            //        sc.nextLine();
            //
            //        for (int i = 0; i < soluong; i++) {
            //            System.out.println("Thong tin cau thu thu " + (i + 1) + ":");
            //            System.out.print("so ao: ");
            //            int soao = sc.nextInt();
            //            System.out.print("Ho ten: ");
            //            String hoten = sc.nextLine();
            //            System.out.print("Nam sinh: ");
            //            int namsinh = sc.nextInt();
            //            System.out.print("luong: ");
            //            int luong = sc.nextInt();
            //            System.out.print("tien thuong: ");
            //            int tienthuong = sc.nextInt();
            //            System.out.print("tien phat: ");
            //            int tienphat = sc.nextInt();
            //            sc.nextLine();
        }
