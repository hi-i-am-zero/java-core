package buoi4;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        nhapMang(a, sc);
        tinhTong(a);
        timSoLonNhatNhoNhat(a);
        sapxep(a);
    }

    public static void sapxep(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        hienThi(a);
    }

    public static void hienThi(int[] a) {
        System.out.println("danh sach:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }

    public static void timSoLonNhatNhoNhat(int[] a) {
        int soLonNhat = 0;
        int soNhoNhat = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > soLonNhat) {
                soLonNhat = a[i];
            }
            if (a[i] < soNhoNhat) {
                soNhoNhat = a[i];
            }
        }
        System.out.println("So lon nhat: " + soLonNhat);
        System.out.println("So nho nhat: " + soNhoNhat);
    }

    public static void tinhTong(int[] a) {
        int tong = 0;
        for (int i = 0; i < a.length; i++) {
            tong += a[i];
        }
        System.out.println("tong: " + tong);
    }

    private static void nhapMang(int[] a, Scanner sc) {
        int dulieu = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("nhap so phan tu thu " + (i + 1) + ":");
            dulieu = sc.nextInt();
            a[i] = dulieu;
        }
        hienThi(a);
    }
}
