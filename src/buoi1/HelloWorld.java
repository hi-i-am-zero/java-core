package buoi1;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("B1");
        System.out.println("B2");
        System.out.println("B3");
        System.out.println("Enter your choice: ");
        String choice = sc.nextLine();
        switch (choice) {
            case "B1":
                System.out.println("Enter your name: ");
                String name = sc.nextLine();
                System.out.println("Enter your birthday: ");
                String birthday = sc.nextLine();
                System.out.println("Enter your address: ");
                String address = sc.nextLine();
                System.out.println("Enter your school: ");
                String school = sc.nextLine();
                System.out.println("Xin chào " + name + " đến từ " + address +
                        ", sinh ngày " + birthday + ", học tại trường " + school);
                break;
            case "B2":
                System.out.println("Enter a: ");
                double a = sc.nextDouble();
                System.out.println("Enter b: ");
                double b = sc.nextDouble();
                System.out.println("Sum: " + (a + b));
                System.out.println("multiplication: " + (a * b));
                System.out.println("subtraction: " + (a - b));
                if (b == 0) {
                    System.out.println("b cannot be zero");
                } else {
                    System.out.println("division: " + (a / b));
                }
                break;
            case "B3":
                System.out.println("Enter lengh: ");
                int l = sc.nextInt();
                System.out.println("Enter width: ");
                int w = sc.nextInt();
                System.out.println("perimeter: " + (l+w)*2);
                System.out.println("area: " + l*w);
                break;
                default:
                    System.out.println("Invalid choice");
                    break;
        }
    }
}
