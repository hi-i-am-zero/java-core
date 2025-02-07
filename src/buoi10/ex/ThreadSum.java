package buoi10.ex;

public class ThreadSum extends Thread {
    private String name;
    private int start;
    private int end;
    private int total;

    public ThreadSum(String name, int start, int end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println(this.name + " start");
        for (int i = start; i <= end; i++) {
             this.total += i;
        }
        System.out.println(this.name + " end");
    }

    public int getTotal() {
        return total;
    }
}
