package buoi6.BTVN.baitap2;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 4.5);

        account.withdraw(2500);

        account.deposit(3000);

        System.out.println("Số dư hiện tại: " + account.getBalance());
        System.out.println("Tiền lãi hàng tháng: " + account.getMonthlyInterest());
        System.out.println("Ngày tài khoản được tạo: " + account.getDateCreated());
    }
}
