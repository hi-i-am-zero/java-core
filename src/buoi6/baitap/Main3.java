package buoi6.baitap;


import buoi6.BTVN.baitap0.ManagerAnimal;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        ManagerAnimal managerAnimal = new ManagerAnimal(0);
        System.out.println("Nhap lua chon: ");
        int type = 0;
        do {
            System.out.println("1. add");
            System.out.println("2. information");
            System.out.println("3. search by name");
            System.out.println("4. delete");
            System.out.println("5. exit");
            type = new Scanner(System.in).nextInt();
            Animal animal = null;
            switch (type) {
                case 1:
                    managerAnimal.addAnimal();
                    break;
                case 2:
                    managerAnimal.showAnimals();
                    break;
                case 3:
                    managerAnimal.searchAnimal();
                    break;
                case 4:
                    managerAnimal.deleteAnimal();
                    break;
                case 5:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    type = 1;
            }
        } while (type < 5);
    }
}
