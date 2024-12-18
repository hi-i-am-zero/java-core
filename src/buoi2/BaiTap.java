package buoi2;

import java.util.Scanner;

public class BaiTap {
    public static double B2(double a, double b) {
        if (a != 0) {
            return -b / a;
        } else {
            System.out.println("error");
            return 0;
        }
    }

    public static double calculateDelta(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static void B3(double a, double b, double c) {
        if (a == 0) {
            if (b != 0) {
                System.out.println("Phương trình bậc 1, nghiệm là: x = " + (-c / b));
            } else {
                System.out.println(c == 0 ? "Phương trình vô số nghiệm." : "Phương trình vô nghiệm.");
            }
        } else {
            double delta = calculateDelta(a, b, c);
            System.out.println("Delta = " + delta);
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + x);
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        }
    }

    public static double B1(int h) {
        if (h > 40) {
            return 50000 * 1.5 * h;
        } else {
            return 50000 * h;
        }
    }

    public static void main(String[] args) {
        System.out.println("Lựa chọn bài tập: ");
        System.out.println("1.B1");
        System.out.println("2.B2");
        System.out.println("3.B3");
        System.out.println("Lựa chọn: ");
        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                System.out.println("Nhập số giờ: ");
                int a = new Scanner(System.in).nextInt();
                System.out.println("Số lương là : " + B1(a));
                break;
            case 2:
                System.out.println("Nhập a: ");
                double m = new Scanner(System.in).nextDouble();
                System.out.println("Nhập b: ");
                double n = new Scanner(System.in).nextDouble();
                System.out.println("Nghiệm của x là: " + B2(m, n));
                break;
            case 3:
                System.out.println("Nhập a: ");
                double x = new Scanner(System.in).nextDouble();
                System.out.println("Nhập b: ");
                double y = new Scanner(System.in).nextDouble();
                System.out.println("Nhập c: ");
                double z = new Scanner(System.in).nextDouble();
                B3(x, y, z);
                break;
            default:
                System.out.println("nhập sai lựa chọn!");
                break;
        }
    }
}
