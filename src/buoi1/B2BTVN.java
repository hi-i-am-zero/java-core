package buoi1;

import java.util.Scanner;

public class B2BTVN {
    public static void main(String[] args) {
        System.out.println("Enter r: ");
        double r = new Scanner(System.in).nextDouble();
        double area = Math.PI * r * r;
        System.out.println("Diện tích hình tròn có bán kính " + r + " là: " + area);
        double circumference = 2 * Math.PI * r;
        System.out.println("Chu vi hình tròn có bán kính " + r + " là: " + circumference);
    }
}
