package buoi1;

public class B4BTVN {
    public static void main(String[] args) {
        System.out.printf("%-5s %-5s %-5s%n", "a", "a^2", "a^3");
        for (int a = 1; a <= 4; a++) {
            System.out.printf("%-5d %-5d %-5d%n", a, a * a, a * a * a);
        }
    }
}
