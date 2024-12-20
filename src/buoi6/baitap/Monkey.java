package buoi6.baitap;

public class Monkey extends Animal {

    @Override
    public void eat() {
        System.out.println("Monkey is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey is chattering");
    }

    @Override
    public void showInfo() {
        System.out.println("Monkey Info: ");
        super.showInfo();
    }

    @Override
    public void action() {
        System.out.println("The monkey is climbing trees");
    }

    @Override
    public void enterInfor() {
        System.out.println("Enter monkey infor: ");
        super.enterInfor();
    }
}
