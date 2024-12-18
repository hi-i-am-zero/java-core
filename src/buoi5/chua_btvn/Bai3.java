package buoi5.chua_btvn;

import java.util.Scanner;

public class Bai3 {
    public static int soLuongPhanTu = 0;

    public static int giaTriMoRongMacDinh = 10;

    public static void main(String[] args) {
//        int[] array = nhapThongTinMang();
        int[] array = {7, 4, 3, 8, 1, 4, 3};
        soLuongPhanTu = array.length;
        hienThi(array);
        boolean tiepTuc = true;
        do {
            System.out.println("Nhap vao cac chuc nang muon su dung: ");
            System.out.println("2. Tính tổng các phần tử chẵn và tổng các phần tử lẻ trong mảng.");
            System.out.println("3. Tìm và in ra các số nguyên tố có trong mảng.");
            System.out.println("4. Sắp xếp mảng");
            System.out.println("5. Chia mảng thành 2 mảng con:");
            System.out.println("6. Tìm số lượng phần tử trùng lặp trong mảng và in ra các phần tử trùng lặp.");
            System.out.println("7. Thêm một phần tử vào mảng:");
            System.out.println("8. Xóa 1 phần tử khỏi mảng:");
            System.out.println("9. Thoát!");
            int luaChon = new Scanner(System.in).nextInt();
            switch (luaChon) {
                case 2:
                    tinhTong(array);
                    break;
                case 3:
                    hienThiCacSoNguyenTo(array);
                    break;
                case 4:
                    sapXepMang(array);
                    break;
                case 5:
                    System.out.println("Tinh nang chua phat trien");
                    break;
                case 6:
                    inPhanTuTrungLap(array);
                    break;
                case 7:
                    themPhantu(array);
                case 8:
                    xoaPhanTu(array);
                    break;
                case 9:
                    System.out.println("Thoat truong trinh");
                    tiepTuc = false;
            }
        } while (tiepTuc);
    }

    public static void xoaPhanTu(int[] array) {
        System.out.println("Nhap vao phan tu muon xoa: ");
        int data = new Scanner(System.in).nextInt();
        for (int i = 0; i < soLuongPhanTu; i++) {
            if (array[i] == data) {
                for (int j = i; j < soLuongPhanTu; j++) {
                    if (j != soLuongPhanTu - 1) {
                        array[j] = array[j + 1];
                    }
                }
                soLuongPhanTu--;
            }
        }
        hienThi(array);
    }

    public static void themPhantu(int[] array) {
        System.out.println("Nhap vao vi tri muon them bat dau tu 1: ");
        int index = new Scanner(System.in).nextInt();
        index = index - 1;
        System.out.println("Nhap vao du lieu muon the");
        int data = new Scanner(System.in).nextInt();

        if (index >= array.length) {
            System.out.println("index khong hop le, index can nho hon: " + array.length);
            return;
        }

        if (soLuongPhanTu >= array.length) {
            int[] arrayCopy = array;
            array = new int[array.length + giaTriMoRongMacDinh];
            for (int i = 0; i < soLuongPhanTu; i++) {
                array[i] = arrayCopy[i];
            }
        }
        themPhanTuVaoIndex(array, index, data);
        hienThi(array);
    }

    private static void themPhanTuVaoIndex(int[] array, int index, int data) {
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        soLuongPhanTu++;
    }

    public static void inPhanTuTrungLap(int[] array) {
        System.out.println("Cac phan tu trung lap la");
        for (int i = 0; i < soLuongPhanTu; i++) {
            int ptu = array[i];
            boolean phanTuDaDuocKiemTra = false;
            for (int j = 0; j < i; j++) {
                if (array[j] == ptu) {
                    phanTuDaDuocKiemTra = true;
                }
            }
            if (phanTuDaDuocKiemTra) {
                continue;
            }
            int count = 0;
            for (int j = i; j < soLuongPhanTu; j++) {
                if (array[j] != ptu) {
                    continue;
                }
                count++;
            }
            if (count >= 2) {
                System.out.print(ptu + " ");
            }
        }
    }

    public static void sapXepMang(int[] array) {
        for (int i = 0; i < soLuongPhanTu; i++) {
            //sap xep cac so chan
            if (array[i] % 2 == 0) {
                for (int j = i + 1; j < soLuongPhanTu; j++) {
                    if (array[j] % 2 != 0 || array[i] > array[j]) {
                        continue;
                    }
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            } else {
                for (int j = i + 1; j < soLuongPhanTu; j++) {
                    if (array[j] % 2 == 0 || array[i] < array[j]) {
                        continue;
                    }
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        hienThi(array);
    }

    public static void hienThiCacSoNguyenTo(int[] array) {
        System.out.println("Danh sach so nguyen to: ");
        for (int i = 0; i < soLuongPhanTu; i++) {
            if (!laSoNguyenTo(array[i]))
                continue;
            System.out.println(array[i] + " ");
        }
    }

    public static void hienThi(int[] array) {
        System.out.println("Danh sach cac phan tu cua mang: ");
        for (int i = 0; i < soLuongPhanTu; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static boolean laSoNguyenTo(int data) {
        if (data == 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(data); i++) {
            if (data % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void tinhTong(int[] array) {
        int tongChan = 0;
        int tongLe = 0;
        for (int i = 0; i < soLuongPhanTu; i++) {
            if (array[i] % 2 == 0) {
                tongChan += array[i];
                continue;
            }
            tongLe += array[i];
        }
        System.out.println("Tong chan: " + tongChan);
        System.out.println("Tong le: " + tongLe);
    }

    public static int[] nhapThongTinMang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu thu: " + (i + 1));
            array[i] = sc.nextInt();
            soLuongPhanTu++;
        }
        return array;
    }
}
