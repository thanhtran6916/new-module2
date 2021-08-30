package view;

import controller.StudentManagement;
import model.Student;

import java.util.LinkedList;

import static view.Main.scanner;

public class StudentMain {
    public static StudentManagement studentManagement = new StudentManagement();
    public static void run() {
        int choose = -1;
        System.out.println("Menu quản lý sinh viên");
        do {
            menu();
            System.out.println("Nhập lựa chọn của bạn");
            try {
                choose = scanner.nextInt();
                scanner.nextLine();
                if (choose < 0 || choose > 9) {
                    throw new NumberFormatException();
                }
            } catch (Exception e) {
                System.err.println("Nhập sai lựa chọn");
            }
            switch (choose) {
                case 1:
                    studentManagement.show();
                    break;
                case 2:
                    searchStudent();
                    break;
                case 3:
                    try {
                        studentManagement.add(inputStudent());
                    } catch (Exception e) {
                        System.err.println("Bạn nhập sai định dạng thông tin");
                        break;
                    }
                    break;
                case 4:
                    editStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    studentManagement.sort();
                    break;
                case 7:
                    LinkedList<Student> top5Student = studentManagement.showTop5();
                    top5Student.forEach((n) -> {
                        System.out.println(n);
                    });
                    break;
                case 8:
                    studentManagement.saveToFile();
                    break;
                case 9:
                    studentManagement.readToFile();
                    break;
            }
        } while (choose != 0);
    }

    public static void deleteStudent() {
        System.out.println("Nhập id sinh viên bạn muốn xóa");
        String id = scanner.nextLine();
        if (studentManagement.getStudentMap().containsKey(id)) {
            studentManagement.remove(id);
        } else {
            System.out.println("Không tồn tại id này");
        }
    }

    public static void editStudent() {
        System.out.println("Nhập id sinh viên bạn muốn sửa");
        String id = scanner.nextLine();
        if (studentManagement.getStudentMap().containsKey(id)) {
            Student student = null;
            try {
                student = inputStudent();
            } catch (Exception e) {
                System.err.println("Bạn nhập sai thông tin sinh viên");
            }
            studentManagement.edit(id, student);
        } else {
            System.out.println("Không tồn tại id này");
        }

    }

    public static Student inputStudent() throws Exception, NullPointerException {
        Student inputStudent = null;
        System.out.println("Nhập id sinh viên");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sinh viên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi sinh viên");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập điểm sinh viên");
        double point = scanner.nextDouble();
        scanner.nextLine();
        inputStudent = new Student(id, name, age, point);
        return inputStudent;
    }

    public static void searchStudent() {
        System.out.println("Nhập id của sinh viên");
        String id = scanner.nextLine();
        if (studentManagement.getStudentMap().containsKey(id)) {
            System.out.println(studentManagement.search(id));
        } else {
            System.out.println("Không có tồn tại id này");
        }
    }

    public static void menu() {
        System.out.println("1. Hiển thị danh sách sinh viên");
        System.out.println("2. Tìm kiếm sinh viên theo mã sinh viên");
        System.out.println("3. Thêm sinh viên");
        System.out.println("4. Cập nhập thông tin sinh viên");
        System.out.println("5. Xóa sinh viên");
        System.out.println("6. Sắp xếp danh sách sinh viên");
        System.out.println("7. Hiển thị top 5 sinh viên có điểm cao nhất");
        System.out.println("8. Lưu");
        System.out.println("9. Đọc file");
        System.out.println("0. Thoát");
    }
}
