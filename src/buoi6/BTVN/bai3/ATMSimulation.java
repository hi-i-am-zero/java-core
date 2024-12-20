package buoi6.BTVN.bai3;

import buoi6.BTVN.baitap2.Account;

import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100, 0);
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Yêu cầu nhập ID tài khoản
            System.out.print("Nhập ID tài khoản (0-9): ");
            int id = scanner.nextInt();

            if (id < 0 || id > 9) {
                System.out.println("ID không hợp lệ. Vui lòng nhập lại.");
                continue;
            }

            Account currentAccount = accounts[id];

            // Hiển thị menu chính
            while (true) {
                System.out.println("\n===== MENU CHÍNH =====");
                System.out.println("1: Xem số dư");
                System.out.println("2: Rút tiền");
                System.out.println("3: Gửi tiền");
                System.out.println("4: Thoát");
                System.out.print("Lựa chọn của bạn: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Số dư hiện tại: $" + currentAccount.getBalance());
                        break;

                    case 2:
                        System.out.print("Nhập số tiền cần rút: ");
                        double withdrawAmount = scanner.nextDouble();
                        if (withdrawAmount <= 0) {
                            System.out.println("Số tiền rút phải lớn hơn 0.");
                        } else if (withdrawAmount > currentAccount.getBalance()) {
                            System.out.println("Số tiền rút vượt quá số dư tài khoản.");
                        } else {
                            currentAccount.withdraw(withdrawAmount);
                        }
                        break;

                    case 3:
                        System.out.print("Nhập số tiền cần gửi: ");
                        double depositAmount = scanner.nextDouble();
                        if (depositAmount <= 0) {
                            System.out.println("Số tiền gửi phải lớn hơn 0.");
                        } else {
                            currentAccount.deposit(depositAmount);
                        }
                        break;

                    case 4:
                        System.out.println("Đã thoát. Quay lại màn hình nhập ID.");
                        break;

                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                }

                if (choice == 4) {
                    break;
                }
            }
        }
    }
}
