package view;

import controller.ClassSchoolManagement;
import model.ClassSchool;
import model.Student;


import static view.Main.scanner;
import static view.StudentMain.studentManagement;

public class ClassMain {
    public static ClassSchoolManagement classManagement = new ClassSchoolManagement();
    public static void run() {
        int choose = -1;
        System.out.println("Menu quản lý lớp học");
        do {
            System.out.println("Nhập lựa chọn");
            menu();
            try {
                choose = scanner.nextInt();
                scanner.nextLine();
                if (choose < 0 || choose > 10) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập sai lựa chọn");
            }
            switch (choose) {
                case 1:
                    classManagement.show();
                    break;
                case 2:
                    ClassSchool classSchool = inputClass();
                    classManagement.add(classSchool);
                    break;
                case 3:
                    editClass();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    classManagement.sort();
                    break;
                case 6:
                    addStudentInClass();
                    break;
                case 7:
                    showStudentInClass();
                    break;
                case 8:
                    showStudentNumberInClass();
                    break;
                case 9:
                    studentManagement.saveToFile();
                    break;
                case 10:
                    studentManagement.readToFile();
                    break;
            }
        } while (choose != 0);
    }

    public static void showStudentNumberInClass() {
        for (ClassSchool classSchool : classManagement.getClassList()) {
            String className = classSchool.getName();
            int count = 0;
            for (Student student : studentManagement.getStudentMap().values()) {
                if (student.getClassSchool().getName().equals(className)) {
                    count++;
                }
            }
            System.out.println(className + " có " + count);
        }
    }

    public static void showStudentInClass() {
        for (ClassSchool classSchool : classManagement.getClassList()) {
            String className = classSchool.getName();
            System.out.println("Lớp " + className + " có:");
            for (Student student : studentManagement.getStudentMap().values()) {
                if (student.getClassSchool().getName().equals(className)) {
                    System.out.println(student);
                }
            }
        }
    }

    public static void addStudentInClass() {
        System.out.println("Nhập id lớp bạn muốn thêm sinh viên");
        String idClass = scanner.nextLine();
        ClassSchool classSchool = classManagement.search(idClass);
        if (classSchool == null) {
            System.out.println("Không tồn tại lớp nào có id này");
        } else {
            System.out.println("Nhập id sinh viên bạn muốn thêm");
            String idStudent = scanner.nextLine();
            if (studentManagement.getStudentMap().containsKey(idStudent)) {
                Student student = studentManagement.search(idStudent);
                student.setClassSchool(classSchool);
                studentManagement.getStudentMap().replace(student.getId(), student);
            } else {
                System.out.println("Không tồn tại id sinh viên này");
            }
        }
    }

    public static void remove() {
        System.out.println("Nhập id của lớp muốn xóa");
        String id = scanner.nextLine();
        int index = classManagement.searchClassById(id);
        if (index == -1) {
            System.out.println("Không tồn tại id của lớp này");
        } else {
            classManagement.remove(index);
            System.out.println("Done!");
        }
    }

    public static void editClass() {
        System.out.println("Nhập id của lớp cần thay đổi");
        String id = scanner.nextLine();
        int index = classManagement.searchClassById(id);
        if (index == -1) {
            System.out.println("Không tồn tại id lớp này");
        } else {
            ClassSchool classSchool = inputClass();
            classManagement.edit(index, classSchool);
            System.out.println("Done!");
        }
    }

    public static ClassSchool inputClass() {
        System.out.println("Nhập thông tin lớp học");
        System.out.println("Nhập id của lớp học");
        String id = scanner.nextLine();
        System.out.println("Nhập tên của lớp học");
        String name = scanner.nextLine();
        return new ClassSchool(id, name);
    }

    public static void menu() {
        System.out.println("1. Hiển thị danh sách lớp học");
        System.out.println("2. Thêm lớp học");
        System.out.println("3. Sửa lớp học");
        System.out.println("4. Xóa lớp học");
        System.out.println("5. Sắp xếp lớp học");
        System.out.println("6. Thêm sinh viên vào lớp học");
        System.out.println("7. Hiển thị danh sách học viên của từng lớp học");
        System.out.println("8. Thống kê mỗi lớp có bao nhiêu bạn học sinh");
        System.out.println("9. Lưu");
        System.out.println("10. Đọc file");
        System.out.println("0. Quay lại");
    }
}
