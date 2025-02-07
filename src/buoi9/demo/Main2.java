package buoi9.demo;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        System.out.println("size: " + set.size());
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("map: tap hop cac entry, moi entry co 2 thanh phan key - value");
        Map<Integer, String> mapIdName = new HashMap<Integer, String>();
        mapIdName.put(1, "Trung");
        mapIdName.put(2, "Tuan");
        mapIdName.put(3, "Cuong");
        mapIdName.put(4, "Minh");
        System.out.println("Truy cap phan tu cua map, su dung key value, vi du key = 1, value: " + mapIdName.get(1));
        System.out.println("Lay ra phan tu voi key = 2, value: " + mapIdName.get(2));
        System.out.println("Duyet map");
        for (Map.Entry<Integer, String> entry : mapIdName.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Map<Integer, String> mapHashTable = new Hashtable<>();

        Set<Integer> integers = new HashSet<>();
        ListDemo<Integer> integerListDemo = new ArrayListDemo<>();
        integerListDemo.add(1);
        integerListDemo.add(2);

        ListDemo<Integer> listDemo = new ArrayListDemo<>();
        listDemo.add(1);
        System.out.println("Lay ra phan tu: " + listDemo.get(0));
    }
}
