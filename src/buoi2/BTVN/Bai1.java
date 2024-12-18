package buoi2.BTVN;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        System.out.println("Nhap diem chuyen can: ");
        float diemChuyenCan = new Scanner(System.in).nextFloat();
        System.out.println("Nhap diem giua ki: ");
        float diemGiuaKi = new Scanner(System.in).nextFloat();
        System.out.println("Nhap diem cuoi ki: ");
        float diemCuoiKi = new Scanner(System.in).nextFloat();
        float dtb = (diemChuyenCan+diemGiuaKi+diemCuoiKi)/3;
        System.out.println("Diem trung binh: " + dtb);
        if (dtb >= 9){
            System.out.println("Xep loai A");
        } else if (dtb >= 7){
            System.out.println("Xep loai B");
        } else if (dtb >= 5){
            System.out.println("Xep loai C");
        } else {
            System.out.println("Xep loai D");
        }
    }
}
