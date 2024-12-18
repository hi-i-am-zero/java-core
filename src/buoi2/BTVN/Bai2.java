package buoi2.BTVN;

import java.util.Scanner;

public class Bai2 {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
    }
}
