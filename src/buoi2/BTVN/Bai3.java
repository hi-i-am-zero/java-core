package buoi2.BTVN;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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
    }
}
