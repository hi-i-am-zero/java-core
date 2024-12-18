package buoi4.BTVN;

import java.util.*;

public class Bai3 {

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập mảng
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Tính tổng các phần tử chẵn và lẻ
        int evenSum = 0, oddSum = 0;
        for (int num : array) {
            if (num % 2 == 0) evenSum += num;
            else oddSum += num;
        }
        System.out.println("Tổng các phần tử chẵn: " + evenSum);
        System.out.println("Tổng các phần tử lẻ: " + oddSum);

        // Tìm và in số nguyên tố
        System.out.println("Các số nguyên tố trong mảng:");
        for (int num : array) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Sắp xếp mảng chẵn giảm dần, lẻ tăng dần
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for (int num : array) {
            if (num % 2 == 0) evenList.add(num);
            else oddList.add(num);
        }
        evenList.sort(Collections.reverseOrder());
        oddList.sort(Comparator.naturalOrder());
        System.out.println("Mảng sau khi sắp xếp:");
        evenList.forEach(num -> System.out.print(num + " "));
        oddList.forEach(num -> System.out.print(num + " "));
        System.out.println();

        // Chia mảng thành hai mảng con
        double average = Arrays.stream(array).average().orElse(0);
        List<Integer> belowOrEqualAvg = new ArrayList<>();
        List<Integer> aboveAvg = new ArrayList<>();
        for (int num : array) {
            if (num <= average) belowOrEqualAvg.add(num);
            else aboveAvg.add(num);
        }
        System.out.println("Mảng các phần tử <= trung bình: " + belowOrEqualAvg);
        System.out.println("Mảng các phần tử > trung bình: " + aboveAvg);

        // Tìm và in các phần tử trùng lặp
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Các phần tử trùng lặp: ");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " xuất hiện " + entry.getValue() + " lần");
            }
        }

        // Thêm phần tử vào mảng
        System.out.print("Nhập phần tử cần thêm: ");
        int newElement = scanner.nextInt();
        System.out.print("Nhập vị trí cần thêm: ");
        int index = scanner.nextInt();
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(Arrays.stream(array).boxed().toArray(Integer[]::new)));
        if (index >= 0 && index <= arrayList.size()) {
            arrayList.add(index, newElement);
            System.out.println("Mảng sau khi thêm: " + arrayList);
        } else {
            System.out.println("Vị trí không hợp lệ!");
        }

        // Xoá phần tử khỏi mảng
        System.out.print("Nhập phần tử cần xoá: ");
        int elementToRemove = scanner.nextInt();
        if (arrayList.remove((Integer) elementToRemove)) {
            System.out.println("Mảng sau khi xoá: " + arrayList);
        } else {
            System.out.println("Phần tử không tồn tại trong mảng!");
        }
    }
}
