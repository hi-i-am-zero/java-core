package buoi3;

import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            // Hiển thị menu
            System.out.println("Chon bai:");
            System.out.println("1.Bai 3");
            System.out.println("2.Bai 4");
            System.out.println("3.Bai 5");
            System.out.println("4.Exit");
            System.out.print("Your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhap n: ");
                    int n = sc.nextInt();
                    if (n < 0) {
                        System.out.println("n phai la so nguyen duong.");
                    } else {
                        long factorial = 1;
                        for (int i = 1; i <= n; i++) {
                            factorial *= i;
                        }
                        System.out.println("gia thua cua " + n + " là: " + factorial);
                    }
                    break;

                case 2:
                    System.out.println("Cac phuong an la:");
                    int count = 0;
                    for (int x = 0; x <= 200; x++) { // 1000đ
                        for (int y = 0; y <= 100; y++) { // 2000đ
                            for (int z = 0; z <= 40; z++) { // 5000đ
                                if (x * 1000 + y * 2000 + z * 5000 == 200000) {
                                    count++;
                                    System.out.println("Phuong an " + count + ": " + x + " loai 1000đ, " + y + " loai 2000đ, " + z + " loai 5000đ");
                                }
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhap so can tinh: ");
                    int m = sc.nextInt();
                    if (m < 0) {
                        System.out.println("Phai la so nguyen duong.");
                    } else {
                        StringBuilder binary = new StringBuilder();
                        while (m > 0) {
                            binary.insert(0, (m % 2));
                            m /= 2;
                        }
                        System.out.println("So nhi phan: " + binary);
                    }
                    break;

                case 4:
                    break;
                default:
                    System.out.println("Not found");
            }
        } while (choice != 4);
    }
}
