package buoi6.BTVN.baitap0;

import buoi6.baitap.Animal;
import buoi6.baitap.Elephant;
import buoi6.baitap.Lion;
import buoi6.baitap.Monkey;

import java.util.Scanner;


public class ManagerAnimal {
    private Animal[] animals;
    private int currentAnimal;
    private int totalAnimal;

    private final int DEFAULT_NEW_SIZE = 10;

    public ManagerAnimal(int totalAnimal) {
        this.totalAnimal = totalAnimal;
        animals = new Animal[this.totalAnimal];
    }

    public void searchAnimal() {
        System.out.println("Enter animal name: ");
        String name = new Scanner(System.in).nextLine();
        for (int i = 0; i < currentAnimal; i++) {
            if (!name.equalsIgnoreCase(animals[i].getName())) {
                continue;
            }
            System.out.println("Done: " + i);
            animals[i].showInfo();
        }
    }

    public void deleteAnimal() {
        System.out.println("Enter animal name: ");
        String name = new Scanner(System.in).nextLine();
        for (int i = 0; i < currentAnimal; i++) {
            if (animals[i] == null) {
                continue;
            }
            if (!name.equalsIgnoreCase(animals[i].getName())) {
                continue;
            }
            for (int j = i; j < currentAnimal; j++) {
                if (j == currentAnimal - 1) {
                    animals[j] = null;
                } else {
                    animals[j] = animals[j + 1];
                }
            }
            this.currentAnimal--;
        }
    }

    public void addAnimal() {
        System.out.println("Nhap vao dong vat muon them: ");
        int type = 0;
        do {
            System.out.println("1. Lion");
            System.out.println("2. Elephant");
            System.out.println("3. Monkey");
            System.out.println("4. Exit");
            type = new Scanner(System.in).nextInt();
            Animal animal = null;
            switch (type) {
                case 1:
                    animal = new Lion();
                    break;
                case 2:
                    animal = new Elephant();
                    break;
                case 3:
                    animal = new Monkey();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    type = 1;
            }
            if (animal != null) {
                animal.enterInfor();
                reSizeArray();
                this.animals[currentAnimal] = animal;
                this.currentAnimal++;
                System.out.println("Done: " + currentAnimal + "successful");
            }
        } while (type < 4);
    }

    private void reSizeArray() {
        if (currentAnimal == totalAnimal) {
            this.totalAnimal = this.totalAnimal + DEFAULT_NEW_SIZE;
            this.animals = copyArray(totalAnimal, this.animals);
        }
    }

    public Animal[] copyArray(int newSize, Animal[] oldArray) {
        Animal[] newArray = new Animal[newSize];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }

    public void showAnimals() {
        for (int i = 0; i < currentAnimal; i++) {
            if (animals[i] == null) {
                continue;
            }
            System.out.println(" Con vat thu " + i);
            animals[i].showInfo();
        }
    }

}
