package baiKiemTraThucHanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\nMenu Quản Lý Danh Sách Sinh Viên");
                System.out.println("1. Thêm sinh viên vào danh sách.");
                System.out.println("2. Sửa thông tin sinh viên.");
                System.out.println("3. Xóa sinh viên khỏi danh sách.");
                System.out.println("4. Tìm kiếm sinh viên theo tên.");
                System.out.println("5. Hiển thị danh sách sinh viên.");
                System.out.println("6. Thoát.");
                System.out.print("Chọn chức năng: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Nhập tên sinh viên: ");
                        String name = scanner.nextLine();

                        System.out.print("Nhập tuổi sinh viên: ");
                        int age = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        System.out.print("Nhập mã sinh viên: ");
                        String studentId = scanner.nextLine();

                        manager.addStudent(new Student(name, age, studentId));
                        break;
                    case 2:
                        System.out.print("Nhập mã sinh viên cần chỉnh sửa: ");
                        String editId = scanner.nextLine();
                        manager.editStudent(editId);
                        break;
                    case 3:
                        System.out.print("Nhập mã sinh viên cần xóa: ");
                        String deleteId = scanner.nextLine();
                        manager.deleteStudent(deleteId);
                        break;
                    case 4:
                        System.out.print("Nhập tên sinh viên cần tìm: ");
                        String searchName = scanner.nextLine();
                        manager.searchStudentByName(searchName);
                        break;
                    case 5:
                        manager.displayStudents();
                        break;
                    case 6:
                        System.out.println("Đã thoát khỏi chương trình.");
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Vui lòng nhập một số hợp lệ!");
                scanner.nextLine();
            }
        }
    }
}
