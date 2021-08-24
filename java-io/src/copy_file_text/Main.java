package copy_file_text;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagement myStudent = new StudentManagement();
        Scanner scanner = new Scanner(System.in);
        int choose = -1;
        do {
            displayMenu();
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    myStudent.showStudent();
                    break;
                case 2:
                    Student student = inputStudent(scanner);
                    myStudent.add(student);
                    String filePatch = "C:\\Users\\t\\OneDrive\\Desktop\\text";
                    write(filePatch, student);
                    break;
                case 3:
                    System.out.println("Nhập id sinh viên muốn sửa");
                    String id = scanner.nextLine();
                    boolean result = myStudent.edit(id, inputStudent(scanner));
                    if (result) {
                        System.out.println("Đã sửa");
                    } else {
                        System.out.println("Không có mà sửa");
                    }
                    break;
                case 4:
                    deleteStudent(myStudent, scanner);
                    break;
                case 5:
                    searchStudent(myStudent, scanner);
                    break;
            }


        } while (choose != 0);


    }

    private static void write(String filePatch, Student student) {
        try {
            FileWriter fileWriter = new FileWriter(filePatch, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(student.toString() + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deleteStudent(StudentManagement myStudent, Scanner scanner) {
        System.out.println("Nhập id sinh viên muốn xóa");
        String id = scanner.nextLine();
        boolean result = myStudent.deleteStudent(id);
        if (result) {
            System.out.println("Đã xóa");
        } else {
            System.out.println("Không có mà xóa");
        }
    }

    private static void searchStudent(StudentManagement myStudent, Scanner scanner) {
        System.out.println("Nhập id sinh viên muốn tìm kiếm");
        String id = scanner.nextLine();
        Student searchStudent = myStudent.search(id);
        if (searchStudent == null) {
            System.out.println("Không có id này");
        } else {
            System.out.println(searchStudent);
        }
    }

    private static Student inputStudent(Scanner scanner) {
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập id");
        String id = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = scanner.nextInt();
        scanner.nextLine();
        Student student = new Student(name, id, age);
        return student;
    }


    public static void displayMenu() {
        System.out.println("MENU");
        System.out.println("1. Hiển thị");
        System.out.println("2. Thêm");
        System.out.println("3. Sửa");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("0. Thoát");
    }

}
