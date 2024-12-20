package buoi6.baitap;

public class Elephant extends Animal {
    public void trumpet() {
        System.out.println("Elephant is trumpeting");
    }

    @Override
    public void eat() {
        System.out.println("Elephant is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant is trumpeting");
    }

    @Override
    public void showInfo() {
        System.out.println("Elephant Info: ");
        super.showInfo();
    }

    @Override
    public void action() {
        System.out.println("The elephant is spraying water");
    }

    @Override
    public void enterInfor() {
        System.out.println("Enter elephant infor: ");
        super.enterInfor();
    }
}
