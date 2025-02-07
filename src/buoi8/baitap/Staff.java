package buoi8.baitap;

public class Staff extends Employee {
    public Manager truongPhong;

    public Staff() {
        super.setLuongMotNgay(100d);
    }

    @Override
    public double cachTinhLuongThang() {
        System.out.println("Quan li: ");
        return super.getLuongMotNgay() * super.getSoNgayLamViec();
    }

    @Override
    public void nhapThongTin() {
        System.out.println("Nhap thong tin nhan vien: ");
        super.nhapThongTin();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("hien thi thong tin nhan vien: ");
        super.hienThiThongTin();
        System.out.println("Thong tin quan ly: " + truongPhong.getMaNV() + " | " + truongPhong.getHoTen());
    }

    public Manager getTruongPhong() {
        return truongPhong;
    }

    public void setTruongPhong(Manager truongPhong) {
        this.truongPhong = truongPhong;
    }
}
