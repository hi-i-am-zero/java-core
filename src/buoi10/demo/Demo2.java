package buoi10.demo;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Main thread start");
        System.out.println("Task1 start1");
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Task1 finish");
        System.out.println("Main thread end");
    }
}
