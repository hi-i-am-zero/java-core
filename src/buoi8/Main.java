package buoi8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Iterable<Integer> integers;
        Collection collection;
        List<Integer> list;

        Integer[] integer = new Integer[10];
        List<Integer> interger1 = new ArrayList<Integer>();
        interger1.add(1);
        interger1.add(2);
        interger1.add(3);
        interger1.add(4);

        System.out.println(interger1.size());
        interger1.set(1, 10);

        Integer data = interger1.get(1);
        System.out.println("data: " + data);

        System.out.println(interger1.contains(1));

        for(Integer element : interger1) {
            System.out.println(element);
        }

        Iterator<Integer> iterator = interger1.iterator();
        while(iterator.hasNext()) {
            Integer data1 = iterator.next();
            System.out.println("Lay phan tu phia sau: " + data1);
        }

        Set<Integer> set = new HashSet<>();
        SortedSet<Integer> sortedSet = new TreeSet<>();
        List<Integer> list1 = new Vector<>();
        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
    }
}
