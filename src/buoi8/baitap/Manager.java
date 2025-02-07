package buoi8.baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class Manager extends Employee {
    private List<Staff> danhSachNhanVien = new ArrayList<>();

    public Manager() {
        super();
        super.setLuongMotNgay(200d);
    }

    @Override
    public double cachTinhLuongThang() {
        System.out.println("Quan li: ");
        return super.getLuongMotNgay() * super.getSoNgayLamViec() + (100 * danhSachNhanVien.size());
    }

    @Override
    public void nhapThongTin() {
        System.out.println("Nhap thong tin quan ly: ");
        super.nhapThongTin();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("hien thi thong tin quan ly: ");
        super.hienThiThongTin();
        System.out.println("Danh sach ma nhan vien cua quan ly");
        for (Staff staff : danhSachNhanVien) {
            System.out.println(staff.getMaNV() + " ");
        }
        System.out.println();
    }

    public List<Staff> getDanhSachNhanVien() {
        return danhSachNhanVien;
    }

    public void setDanhSachNhanVien(List<Staff> danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }
}
