package buoi10.demo;

public class DemoRunnable implements Runnable {
    private String name;
    public DemoRunnable(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(this.name + " start 1");
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this.name + " finish");
    }

    public static void main(String[] args) {
        System.out.println("Main thread start");
        DemoRunnable demoRunnable = new DemoRunnable("Task1");
        Thread thread = new Thread(demoRunnable);
        thread.start();
        System.out.println("Main thread end");
    }
}
