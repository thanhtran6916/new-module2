package wiew;

import controller.StudentManagement;
import model.Student;

import java.util.Scanner;

import static wiew.Main.scanner;

public class MainStudentManagement {
    public static StudentManagement students = new StudentManagement();
    public static void run() {
        int choose;
        do {
            menu();
            System.out.println("Nhập lựa chọn");
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    students.show();
                    break;
                case 2:
                    Student studentAdd = inputStudent(scanner);
                    students.add(studentAdd);
                    break;
                case 3:
                    editStudent(students, scanner);
                    break;
                case 4:
                    Student student = searchStudent(scanner);
                    if (student == null) {
                        System.out.println("Không có");
                    } else {
                        System.out.println(student);
                    }
                    break;
                case 5:
                    deleteStudent(students, scanner);
                    break;
                case 6:
                    students.sort();
                    break;
                case 7:
                    break;
                case 8:
                    break;
            }

        } while (choose != 0);


    }

    public static void deleteStudent(StudentManagement students, Scanner scanner) {
        System.out.println("Nhập id");
        String id = scanner.nextLine();
        boolean result = students.delete(id);
        if (result) {
            System.out.println("Done");
        } else {
            System.out.println("Không thấy id");
        }
    }

    public static void editStudent(StudentManagement students, Scanner scanner) {
        System.out.println("Nhập id");
        String id = scanner.nextLine();
        Student studentSearch = students.search(id);
        if (studentSearch == null) {
            System.out.println("Không tìm thấy");
        } else {
            Student studentEdit = inputStudent(scanner);
            students.edit(id, studentEdit);
        }
    }


    public static Student searchStudent(Scanner scanner) {
        System.out.println("Nhập id");
        String id = scanner.nextLine();
        Student studentSearch = students.search(id);
        return studentSearch;
    }

    public static Student inputStudent(Scanner scanner) {
        System.out.println("Nhập id");
        String id = scanner.nextLine();
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = scanner.nextInt();
        System.out.println("Nhập điểm");
        int point = scanner.nextInt();
        scanner.nextLine();
        Student student = new Student(id, name, age, point);
        return student;
    }

    public static void menu() {
        System.out.println("MENU");
        System.out.println("1. Hiển thị");
        System.out.println("2. Thêm");
        System.out.println("3. Sửa");
        System.out.println("4. Tìm kiếm");
        System.out.println("5. Xóa");
        System.out.println("6. Sắp xếp");
        System.out.println("7. Lưu");
        System.out.println("8. Đọc");
        System.out.println("0. Thoát");
    }
}
