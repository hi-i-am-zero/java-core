package buoi8.baitap;

import java.util.Scanner;

public abstract class Employee {
    private String maNV;
    private String hoTen;
    private String sdt;
    private Integer soNgayLamViec;
    private Double luongMotNgay;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin MaNV: ");
        this.maNV = sc.nextLine();
        System.out.println("Nhap thong tin HoTen: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap thong tin SDT: ");
        this.sdt = sc.nextLine();
        System.out.println("Nhap thong tin SoNgayLamViec: ");
        this.soNgayLamViec = sc.nextInt();
//        System.out.println("Nhap thong tin LuongMotNgay: ");
//        this.luongMotNgay = sc.nextDouble();
    }

    public void hienThiThongTin() {
        System.out.println("MaNV: " + maNV);
        System.out.println("HoTen: " + hoTen);
        System.out.println("SDT: " + sdt);
        System.out.println("SoNgayLamViec: " + soNgayLamViec);
        System.out.println("LuongMotNgay: " + luongMotNgay);

    }

    public abstract double cachTinhLuongThang();

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Integer getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(Integer soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public Double getLuongMotNgay() {
        return luongMotNgay;
    }

    public void setLuongMotNgay(Double luongMotNgay) {
        this.luongMotNgay = luongMotNgay;
    }
}
