package buoi1;

import java.util.Scanner;

public class B1BTVN {
    public static void main(String[] args) {

        System.out.println("Nhập vào thông tin cá nhân: ");
        String hoTen = new Scanner(System.in).nextLine();
        System.out.println("Ngay sinh: ");
        int ngaySinh = new Scanner(System.in).nextInt();
        System.out.println("Nhap thang sinh: ");
        int thang = new Scanner(System.in).nextInt();
        System.out.println("Nam sinh: ");
        int nam = new Scanner(System.in).nextInt();

        System.out.println("Nhap que quan: ");
        String que = new Scanner(System.in).nextLine();
        System.out.println("Truong: ");
        String truong = new Scanner(System.in).nextLine();
        System.out.println("Xin chào "+ hoTen + " đến từ " + que +
                ", sinh ngày " + ngaySinh +  "/" + thang + "/" + nam + ", học tại\n" +
                " trường " + truong);


    }
}
