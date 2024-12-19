package buoi6.BTVN.baitap0;

import buoi6.baitap.Animal;
import buoi6.baitap.Lion;

import java.util.HashSet;
import java.util.Set;

public class ManagerAnimal {
    private Animal[] animals;
    private int numberCurrentAnimal;

    public static void main(String[] args) {
        Lion lion1 = new Lion();
        lion1.name = "Lion";
        Lion lion2 = new Lion();
        lion2.name = "Lion";

        System.out.println(lion1 == lion2);
        System.out.println(lion1.equals(lion2));

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(1);

        Set<Lion>  lionSet = new HashSet<>();
        lionSet.add(lion1);
        lionSet.add(lion2);
        lionSet.forEach(data -> System.out.println(data));
    }
}
