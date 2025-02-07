package buoi9.btvn;

import java.util.*;
import java.util.stream.Collectors;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<Student>();
    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao thong tin sinh vien muon them");
        System.out.println("Nhap vao id ");
        String id = sc.nextLine();
        Set<String> setId = this.students.stream().map(Student::getId).collect(Collectors.toSet());
        if (setId.contains(id)) {
            throw new CustomException("id is exist");
        }
        Student student = new Student();
        student.setId(id);
        student.enterInfor();
        this.students.add(student);
        System.out.println("Them hoc sinh thanh cong");
    }

    public void remove() {
        System.out.println("Nhap vao id xoa");
        String id = new Scanner(System.in).nextLine();
        Student studentRemove = this.students.stream()
                .filter(student -> student != null && id.equalsIgnoreCase(student.getId()))
                .findFirst()
                .orElseThrow(() -> new CustomException("Student is not exist"));
        students.remove(studentRemove);
        System.out.println("Xoa thanh cong");
    }

    public void showAll() {
        this.students.forEach(Student::showInfor);
    }

    public void findByName() {
        System.out.println("Nhap vao ten sinh vien: ");
        String name = new Scanner(System.in).nextLine();
        List<Student> studentsTarget = this.students.stream()
                .filter(student -> student != null && name.equalsIgnoreCase(student.getName()))
                .collect(Collectors.toList());
        if (studentsTarget.isEmpty()) {
            throw new CustomException("Student is empty");
        }
        studentsTarget.forEach(Student::showInfor);
    }

    public void sortByPoint() {
        List<Student> studentsCopy = new ArrayList<>(this.students);
        studentsCopy.stream()
                .sorted((s1, s2) -> (int) (s1.getPoint() - s2.getPoint()))
                .forEach(Student::showInfor);
    }

    public void checkExist() {
        System.out.println("Nhap vao id xoa");
        String id = new Scanner(System.in).nextLine();
        Student studentTarget = this.students.stream()
                .filter(student -> student != null && id.equalsIgnoreCase(student.getId()))
                .findFirst()
                .orElseThrow(() -> new CustomException("Student is not exist"));
        studentTarget.showInfor();
    }
}
