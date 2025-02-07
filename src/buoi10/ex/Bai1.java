package buoi10.ex;

public class Bai1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread start");
        int n = 10;
        ThreadSum threadSum1 = new ThreadSum("Thread1", 1, 5);
        ThreadSum threadSum2 = new ThreadSum("Thread2", 6, 10);
        threadSum1.start();
        threadSum2.start();

        threadSum1.join();
        threadSum2.join();

        int total = threadSum1.getTotal() + threadSum2.getTotal();
        System.out.println("Total: " + total);

        System.out.println("Main thread end");


    }
}
