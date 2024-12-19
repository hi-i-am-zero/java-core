package baiKiemTraThucHanh;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> studentList;

    public StudentManager() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        for (Student s : studentList) {
            if (s.getStudentId().equals(student.getStudentId())) {
                System.out.println("Mã sinh viên đã tồn tại, không thể thêm sinh viên.");
                return;
            }
        }
        studentList.add(student);
        System.out.println("Sinh viên đã được thêm vào danh sách.");
    }

    public void editStudent(String studentId) {
        for (Student student : studentList) {
            if (student.getStudentId().equals(studentId)) {
                System.out.println("Thông tin sinh viên hiện tại: \n" + student);
                Scanner scanner = new Scanner(System.in);

                System.out.print("Nhập tên sinh viên chỉnh sửa: ");
                student.setName(scanner.nextLine());

                System.out.print("Nhập tuổi sinh viên chỉnh sửa: ");
                student.setAge(scanner.nextInt());

                scanner.nextLine(); // Consume newline
                System.out.print("Nhập mã sinh viên chỉnh sửa: ");
                student.setStudentId(scanner.nextLine());

                System.out.println("Thông tin sinh viên đã được cập nhật.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã " + studentId + ".");
    }

    public void deleteStudent(String studentId) {
        for (Student student : studentList) {
            if (student.getStudentId().equals(studentId)) {
                studentList.remove(student);
                System.out.println("Sinh viên đã được xóa khỏi danh sách.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã " + studentId + ".");
    }

    public void searchStudentByName(String name) {
        boolean found = false;
        for (Student student : studentList) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên nào có tên " + name + ".");
        }
    }

    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách sinh viên hiện đang trống.");
        } else {
            System.out.println("Danh sách sinh viên hiện tại:");
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }
}
