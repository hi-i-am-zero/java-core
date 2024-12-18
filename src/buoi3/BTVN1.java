package buoi3;

public class BTVN1 {
    public static void main(String[] args) {
        System.out.println("Cac phuong an la:");
        int count = 0;
        for (int x = 0; x <= 200; x++) { // 1000đ
            for (int y = 0; y <= 100; y++) { // 2000đ
                for (int z = 0; z <= 40; z++) { // 5000đ
                    if (x * 1000 + y * 2000 + z * 5000 == 200000) {
                        count++;
                        System.out.println("Phuong an " + count + ": " + x + " loai 1000đ, " + y + " loai 2000đ, " + z + " loai 5000đ");
                    }
                }
            }
        }
    }
}
