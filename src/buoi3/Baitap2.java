package buoi3;

import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        while (n < 0) {
            System.out.print("n phai la so nguyen duong ");
             n = sc.nextInt();
        }

        int reversedNumber = 0;

        while (n != 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }

        System.out.println("So dao nguoc la: " + reversedNumber);
    }
}
