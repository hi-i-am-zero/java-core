package buoi2.BTVN;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap nam: ");
        int year = sc.nextInt();

        System.out.print("Nhap thang: ");
        int month = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Nhap sai thang");
        } else {
            int days = getDaysInMonth(year, month);
            System.out.printf("Thang %d nam %d có %d ngay.\n", month, year, days);
        }
    }
    public static int getDaysInMonth(int year, int month) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
