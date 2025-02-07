package buoi8.baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        int type = 0;
        do {
            System.out.println("Nhap cac chuc nang: ");
            System.out.println("1. Nhap thong tin cong ty");
            System.out.println("2. Phan bo nhan vien vao truong phong");
            System.out.println("3. Them thong tin mot nhan su");
            System.out.println("4. Xoa thong tin mot nhan su");
            System.out.println("5. Hien thi danh sach nhan vien");
            System.out.println("6. Tinh va xuat tong luong cho toan bo cong ty");
            System.out.println("7. Tim nhan vien thuong co luong cao nhat");
            System.out.println("8. Tim truong phong co luong nhan vien duoi quyen nhieu nhat");
            System.out.println("9. Sap xep toan bo nhan vien trong cong ty voi thu tu ABC");
            System.out.println("10. Sap xep toan bo nhan vien trong cong ty voi thu tu luong giam dan");
            System.out.println("11. Tim giam doc co luong co phieu nhieu nhat");
            System.out.println("12. Hien thi tong thu thap cua tung giam doc");
            System.out.println("13. Thoat");
            type = new Scanner(System.in).nextInt();
            switch (type) {
                case 1:
                    company.nhapThongTinCongTy();
                    break;
                case 2:
                    company.phanBoNhanVienVaoPhong();
                    break;
                case 3:
                    company.themNhanSu();
                    break;
                case 4:
                    company.xoaNhanVien();
                    break;
                case 5:
                    company.hienThiToanBoNhanVien();
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
            }
        } while (type != 6);
    }
}
