package buoi8.baitap;

import java.util.*;

public class Company {
    private String tenCongTy;
    private String maSoThue;
    private String doanhThuThang;

    private List<Employee> danhSachNhanVien;

    public void nhapThongTinCongTy() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cong ty: ");
        this.tenCongTy = sc.nextLine();
        System.out.println("Nhap ma so thue: ");
        this.maSoThue = sc.nextLine();
        System.out.println("Nhap doanh thu thang: ");
        this.doanhThuThang = sc.nextLine();
    }

    public void hienThiToanBoNhanVien() {
        System.out.println("==================Thong tin toan bo nhan vien trong cong ty ================");
        for (Employee emp : danhSachNhanVien) {
            emp.hienThiThongTin();
        }
    }

    public void themNhanSu() {
        System.out.println("Them nhan vien: ");
        Employee employee = chonLoaiNhanVien();
        if (employee == null) {
            return;
        }
        danhSachNhanVien.add(employee);
    }

    public void tinhTongLuong(){
        System.out.println("Tinh va hien thi tong luong cua tat ca nhan vien cong ty: ");
        double tong = 0;
        for (Employee emp : danhSachNhanVien) {
            System.out.println("Luong cua nhan vien: " + emp.getMaNV() + " so ngay lam viec: " + emp.getSoNgayLamViec() + " luong 1 ngay " + emp.getLuongMotNgay() + " = " + emp.cachTinhLuongThang());
            tong += emp.cachTinhLuongThang();
        }
    }

    public void tinhTongLuongC2(){
        double tong = this.danhSachNhanVien.stream().mapToDouble(emp-> {
            System.out.println("Luong cua nhan vien: " + emp.getMaNV() + " so ngay lam viec: " + emp.getSoNgayLamViec() + " luong 1 ngay " + emp.getLuongMotNgay() + " = " + emp.cachTinhLuongThang());
            return emp.cachTinhLuongThang();
        }).sum();
        System.out.println("Tien luong thang cua cong ty la: " + tong);
    }

    public void timKiemNhanVienCoLuongCaoNhat() {
        System.out.println("Duyet danh sach nhan vien: ");
        double maxLuong = Double.MIN_VALUE;
        Employee employee = null;
        for (Employee emp : danhSachNhanVien) {
            if (!(emp instanceof Staff)){
                continue;
            }
            if (emp.cachTinhLuongThang() > maxLuong) {
                maxLuong = emp.cachTinhLuongThang();
                employee = emp;
            }
        }
        if (employee != null) {
            System.out.println("Nhan vien co luong cao nhat: ");
            employee.hienThiThongTin();
            return;
        }
        System.out.println("Khong tim thay nhan vien");
    }

    public void timKiemNhanVienCoLuongCaoNhatC2() {
        Optional<Employee> employeeOptional = danhSachNhanVien.stream()
                .max(
                        Comparator.comparingDouble(Employee::cachTinhLuongThang)
                );
        if (employeeOptional.isPresent()) {
            System.out.println("Nhan vien co luong cao nhat: ");
            Employee employee = employeeOptional.get();
        }
    }

    private Employee chonLoaiNhanVien() {
        Employee employee = null;
        int luaChon = 0;
        System.out.println("Chon chuc vu muon them: ");
        System.out.println("1. Giam doc");
        System.out.println("2. Quan ly");
        System.out.println("3. Nhan vien");
        System.out.println("4. Cancel");
        luaChon = new Scanner(System.in).nextInt();
        switch (luaChon) {
            case 1:
                employee = new Director();
                break;
            case 2:
                employee = new Manager();
                break;
            case 3:
                employee = new Staff();
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        return employee;
    }

    public void xoaNhanVien() {
        System.out.println("Nhap vao ma nhan vien: ");
        String maNVXoa = new Scanner(System.in).nextLine();
        Employee employeeDelete = timkiemNhanVien(maNVXoa);
        if (employeeDelete == null) {
            System.out.println("Khong tim thay nhan vien voi ma: " + maNVXoa);
            return;
        }
        if (employeeDelete instanceof Director || employeeDelete instanceof Staff) {
            this.danhSachNhanVien.remove(employeeDelete);
        } else if (employeeDelete instanceof Manager) {
            xoaTruongPhongKhoiNhanVien(maNVXoa);
            this.danhSachNhanVien.remove(employeeDelete);
        }
        System.out.println("Xoa thanh cong");
    }

    public void phanBoNhanVienVaoPhong() {
        System.out.println("Nhap vao ma nhan vien muon dua vao quan ly: ");
        String maNV = new Scanner(System.in).nextLine();
        Employee employee = timkiemNhanVien(maNV);
        if (!(employee instanceof Staff)) {
            System.out.println("Khong ton tai nhan vien voi ma: " + maNV);
            return;
        }
        Staff staff = (Staff) employee;
        if (staff.getTruongPhong() != null) {
            System.out.println("Nhan vien " + maNV + " da duoc dua vao cho quan ly " + staff.getTruongPhong().getMaNV());
            return;
        }
        System.out.println("Nhap vao ma nhan vien cua quan ly: ");
        String maNVQuanLy = new Scanner(System.in).nextLine();
        Employee employeeManager = timkiemNhanVien(maNVQuanLy);
        if (!(employeeManager instanceof Manager)) {
            System.out.println("Khong ton tai nhan vien voi ma: " + maNV);
            return;
        }
        Manager manager = (Manager) employeeManager;
        staff.setTruongPhong(manager);
        List<Staff> staffManager = manager.getDanhSachNhanVien();
        staffManager.add(staff);
    }

    private void xoaTruongPhongKhoiNhanVien(String maNVXoa) {
        List<Employee> employees = new ArrayList<>();
        for (Employee emp : this.danhSachNhanVien) {
            if (emp instanceof Director || emp instanceof Manager) {
                continue;
            }
            Staff staff = (Staff) emp;
            if (staff.getTruongPhong() != null && staff.getTruongPhong().getMaNV().equalsIgnoreCase(maNVXoa)) {
                staff.setTruongPhong(null);
            }
        }
    }

    public Employee timkiemNhanVien(String maNV) {
        for (Employee emp : this.danhSachNhanVien) {
            if (maNV.equalsIgnoreCase(emp.getMaNV())) {
                return emp;
            }
        }
        return null;
    }

    public List<Employee> getDanhSachNhanVien() {
        return danhSachNhanVien;
    }

    public void setDanhSachNhanVien(List<Employee> danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public String getDoanhThuThang() {
        return doanhThuThang;
    }

    public void setDoanhThuThang(String doanhThuThang) {
        this.doanhThuThang = doanhThuThang;
    }
}
