package buoi6.baitap;

public class Main {
    public static void main(String[] args) {

        Lion lion = new Lion();
        Elephant elephant = new Elephant();
        lion.eat();
        elephant.eat();
        lion.roar();
        elephant.trumpet();

        Animal tiger = new Animal() {
            @Override
            public void eat() {
                System.out.println("Tiger is eating.");
            }

            @Override
            public void makeSound() {
                System.out.println();
            }
        };
        tiger.eat();
    }
}
