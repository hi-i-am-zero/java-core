package buoi2.BTVN;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {

            System.out.println("+......................... +\n" +
                    "\n" +
                    "1. Tính điểm sinh viên\n" +
                    "\n" +
                    "2. Kiểm tra loại tam giác\n" +
                    "\n" +
                    "3. Tính tiền điện\n" +
                    "\n" +
                    "4. Kết thúc\n" +
                    "\n" +
                    "+........................... +\n" +
                    "Chọn chức năng: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap diem chuyen can: ");
                    float diemChuyenCan = new Scanner(System.in).nextFloat();
                    System.out.println("Nhap diem giua ki: ");
                    float diemGiuaKi = new Scanner(System.in).nextFloat();
                    System.out.println("Nhap diem cuoi ki: ");
                    float diemCuoiKi = new Scanner(System.in).nextFloat();
                    float dtb = (diemChuyenCan + diemGiuaKi + diemCuoiKi) / 3;
                    System.out.println("Diem trung binh: " + dtb);
                    if (dtb >= 9) {
                        System.out.println("Xep loai A");
                    } else if (dtb >= 7) {
                        System.out.println("Xep loai B");
                    } else if (dtb >= 5) {
                        System.out.println("Xep loai C");
                    } else {
                        System.out.println("Xep loai D");
                    }
                    break;
                case 2:
                    System.out.println("Nhap canh a: ");
                    int a = sc.nextInt();
                    System.out.println("Nhap canh b: ");
                    int b = sc.nextInt();
                    System.out.println("Nhap canh c: ");
                    int c = sc.nextInt();
                    if (a + b > c && a + c > b && b + c > a) {
                        if (a == b && b == c) {
                            System.out.println("Tam giac deu");
                        } else if (a == b || b == c || a == c) {
                            if (isRightTriangle(a, b, c)) {
                                System.out.println("Tam giac vuong can");
                            } else {
                                System.out.println("Tam giac can");
                            }
                        } else if (isRightTriangle(a, b, c)) {
                            System.out.println("Tam giac vuong");
                        } else {
                            System.out.println("Tam giac thuong");
                        }
                    } else {
                        System.out.println("Khong phai tam giac");
                    }
                    break;
                case 3:
                    System.out.print("Nhap so dien su dung trong thang (kWh): ");
                    int kWh = sc.nextInt();

                    double totalCost = 0;

                    if (kWh <= 50) {
                        totalCost = kWh * 1.678;
                    } else if (kWh <= 100) {
                        totalCost = 50 * 1.678 + (kWh - 50) * 1.734;
                    } else if (kWh <= 200) {
                        totalCost = 50 * 1.678 + 50 * 1.734 + (kWh - 100) * 2.014;
                    } else if (kWh <= 300) {
                        totalCost = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + (kWh - 200) * 2.536;
                    } else if (kWh <= 400) {
                        totalCost = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + 100 * 2.536 + (kWh - 300) * 2.834;
                    } else {
                        totalCost = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + 100 * 2.536 + 100 * 2.834 + (kWh - 400) * 2.927;
                    }
                    System.out.printf("Tong so tien dien phai tra: %.2f VND\n", totalCost);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Nhap lai");
            }
        } while (choice != 4);

    }

    public static boolean isRightTriangle(double a, double b, double c) {
        double max = Math.max(a, Math.max(b, c));
        double min, mid;
        if (max == a) {
            mid = Math.max(b, c);
            min = Math.min(b, c);
        } else if (max == b) {
            mid = Math.max(a, c);
            min = Math.min(a, c);
        } else {
            mid = Math.max(a, b);
            min = Math.min(a, b);
        }
        return max * max == mid * mid + min * min;
    }
}
