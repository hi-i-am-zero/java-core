package buoi8.baitap;

import java.util.Scanner;

public class Director extends Employee {
    private Double coPhan;

    public Director() {
        super();
        super.setLuongMotNgay(300d);
    }

    @Override
    public void nhapThongTin() {
        System.out.println("Nhap thong tin giam doc: ");
        System.out.println("Nhap thong tin co phan(theo %, khong duoc qua 100%): ");
        boolean khongHopLe = true;
        do {
            this.coPhan = new Scanner(System.in).nextDouble();
            if (this.coPhan > 0 && this.coPhan <= 100) {
                khongHopLe = false;
            } else {
                System.out.println("De nghi nhap lai");
            }
        } while (khongHopLe);
        super.nhapThongTin();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("hien thi thong tin giam doc: ");
        super.hienThiThongTin();
    }

    @Override
    public double cachTinhLuongThang() {
        System.out.println("giam doc: ");
        return super.getLuongMotNgay() * super.getSoNgayLamViec();
    }

    public Double getCoPhan() {
        return coPhan;
    }

    public void setCoPhan(Double coPhan) {
        this.coPhan = coPhan;
    }
}
