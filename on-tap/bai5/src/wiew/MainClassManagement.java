package wiew;

import controller.ClassesManagement;
import controller.StudentManagement;
import model.ClassSchool;
import model.Student;

import java.util.LinkedList;

import static wiew.Main.scanner;
import static wiew.MainStudentManagement.students;

public class MainClassManagement {
    public static ClassesManagement classManagement = new ClassesManagement();
    public static void run() {
        int choose;
        do {
            menu();
            System.out.println("Nhập lựa chọn");
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    classManagement.show();
                    break;
                case 2:
                    break;
                case 3:
                    ClassSchool inputClassSchool = inputClass();
                    classManagement.add(inputClassSchool);
                    break;
                case 4:
                    int choose1;
                    do {
                        System.out.println("1. Thêm học viên mới");
                        System.out.println("2. Thêm học viên đã nhập");
                        System.out.println("0. Thoát");
                        System.out.println("Nhập lựa chọn");
                        choose1 = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Nhập id");
                        String id = scanner.nextLine();
                        switch (choose1) {
                            case 1:
                                ClassSchool searchClass = classManagement.search(id);
                                if (searchClass == null) {
                                    System.out.println("Không có");
                                } else {
                                    Student student = MainStudentManagement.inputStudent(scanner);
                                    student.setStudentClass(searchClass);
                                }
                                break;
                            case 2:
                                Student student = MainStudentManagement.searchStudent(scanner);
                                if (student == null) {
                                    System.out.println("Không có");
                                } else {
                                    classManagement.addStudentToTheClass(id, student);
                                }
                                break;
                        }
                    } while (choose1 != 0);

                    break;
                case 5:
                    deleteClass(classManagement);
                    break;
                case 6:
                    LinkedList<Student> studentsList = students.getStudents();
                    LinkedList<ClassSchool> classSchoolsList = classManagement.getClassSchools();
                    thongKe(studentsList, classSchoolsList);
                    break;
            }
        } while (choose != 0);

    }

    private static void thongKe(LinkedList<Student> studentsList, LinkedList<ClassSchool> classSchoolsList) {
        for (ClassSchool classSchool : classSchoolsList) {
            String className = classSchool.getClassName();
            int count = 0;
            for (Student student : studentsList) {
                if (classSchool.getClassName().equals(student.getStudentClass().getClassName())) {
                    count++;
                }
            }
            System.out.println(className + " có " + count);
        }
    }

    public static void menu() {
        System.out.println("1. Hiển thị danh sách lớp");
        System.out.println("2. Hiển thị danh sách học viên của một lớp");
        System.out.println("3. Thêm lớp học");
        System.out.println("4. Thêm học sinh vào lớp");
        System.out.println("5. Xóa lớp học");
        System.out.println("6. Thống kê mỗi lớp có bao nhiêu học viên");
        System.out.println("0. Thoát");
    }

    public static ClassSchool inputClass() {
        System.out.println("Nhập id");
        String id = scanner.nextLine();
        System.out.println("Nhập tên lớp");
        String name = scanner.nextLine();
        return new ClassSchool(id, name);
    }

    public static void deleteClass(ClassesManagement classManagement) {
        System.out.println("Nhập id");
        String id = scanner.nextLine();
        classManagement.delete(id);
    }

}
