package buoi6.baitap;

import java.util.Objects;

public class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("Lion is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion is roaring");
    }

    public void roar() {
        System.out.println("Lion is roaring");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Lion) {
            return (((Lion) obj).name.equals(this.name));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    @Override
    public String toString() {
        return "Lion{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println("Lion Info: ");
        super.showInfo();
    }

    @Override
    public void action() {
        System.out.println("The lion is hunting");
    }

    @Override
    public void enterInfor() {
        System.out.println("Enter lion infor: ");
        super.enterInfor();
    }
}
