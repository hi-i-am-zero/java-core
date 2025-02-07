package buoi9.demo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        //them phan tu
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        //hien thi
        for (String s : stack) {
            System.out.println(s);
        }
        System.out.println("size: " + stack.size());
        System.out.println("Lay phan tu o dinh");
        System.out.println(stack.pop());
        System.out.println("size: " + stack.size());
        System.out.println("Lay phan tu o dinh, khong xoa");
        System.out.println(stack.peek());
        System.out.println("size: " + stack.size());

        Queue<String> queue = new LinkedList<String>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        System.out.println("hien thi queue");
        for (String s : queue) {
            System.out.println(s);
        }
        System.out.printf("size: " + queue.size());
        System.out.println("lay phan tu dau tien: ");
        System.out.println(queue.poll());
        System.out.println("size: " + queue.size());
        System.out.println("lay phan tu ma khong xoa: ");
        System.out.println(queue.peek());
        System.out.println("size: " + queue.size());
    }
}
