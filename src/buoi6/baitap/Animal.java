package buoi6.baitap;

import java.util.Scanner;

public abstract class Animal {
    public String name;
    public int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void eat();

    public abstract void makeSound();

    public void run() {
        System.out.println("Animal is running");
    }

    public int run(String ten) {
        System.out.println(ten + " is running");
        return 0;
    }

    public int run(String ten1, String ten2) {
        return 0;
    }

    public void showInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public abstract void action();

    public void enterInfor() {
        System.out.println("Name: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Age: ");
        this.age = new Scanner(System.in).nextInt();
    }
}
