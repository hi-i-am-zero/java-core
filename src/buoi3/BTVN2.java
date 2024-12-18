package buoi3;

import java.util.Scanner;

public class BTVN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can tinh: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Phai la so nguyen duong.");
        } else {
            StringBuilder binary = new StringBuilder();
            while (n > 0) {
                binary.insert(0, (n % 2));
                n /= 2;
            }
            System.out.println("So nhi phan: " + binary);
        }
    }
}
