package buoi3;

import java.util.Scanner;

public class BTVN3 {
    Scanner scanner = new Scanner(System.in);

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static boolean isArmstrongNumber(int num) {
        int sum = 0, original = num;
        int digits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }

    public static boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap day so nguyen duong (cach nhau bang space):");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        for (String numberStr : numbers) {
            int num = Integer.parseInt(numberStr);

            if (isPerfectNumber(num)) {
                System.out.println(num + " la so hoan hao.");
            } else {
                System.out.println(num + " khong la so hoan hao.");
            }

            if (isArmstrongNumber(num)) {
                System.out.println(num + " la so Armstrong.");
            } else {
                System.out.println(num + " khong la so Armstrong.");
            }

            if (isPalindrome(num)) {
                System.out.println(num + " la so doi xung.");
            } else {
                System.out.println(num + " khong phai la so doi xung");
            }

            System.out.println("Tong cac chu so cua " + num + " la: " + sumOfDigits(num) + ".");
            System.out.println();
        }
    }
}
