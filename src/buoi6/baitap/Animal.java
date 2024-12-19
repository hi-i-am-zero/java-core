package buoi6.baitap;

public abstract class Animal {
    public String name;
    public int age;

    public abstract void eat();
    public abstract void makeSound();

    public void run(){
        System.out.println("Animal is running");
    }
}
