package buoi3;

import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("n phai la so nguyen duong");
            }
        } while (n <= 0);

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 3);
        }

        System.out.println("Tong S(n) = " + sum);
    }
}
