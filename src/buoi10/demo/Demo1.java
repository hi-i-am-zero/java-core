package buoi10.demo;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Main thread start");
        MyThread thread1 = new MyThread("Thread1");
        MyThread thread2 = new MyThread("Thread2");

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Chờ thread1 kết thúc
            thread2.join(); // Chờ thread2 kết thúc
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread end");
    }
}
