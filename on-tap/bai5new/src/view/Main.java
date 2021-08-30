package view;

import model.ClassSchool;
import model.Student;

import javax.print.attribute.standard.Fidelity;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static controller.StudentManagement.fileData;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choose = -1;
        do {
            menu();
            System.out.println("Nhập lựa chọn");
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    StudentMain.run();
                    break;
                case 2:
                    ClassMain.run();
                    break;
                case 3:
                    try {
                        File file = new File(fileData);
                        if (!file.exists()) {
                            throw new FileNotFoundException();
                        }
                        file.delete();
                    } catch (FileNotFoundException e) {
                        System.err.println("Lỗi fileData không tồn tại");
                    }
                    break;
            }
        } while (choose != 0);

    }

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1. Quản lý sinh viên");
        System.out.println("2. Quản lý lớp học");
        System.out.println("3. RESET");
        System.out.println("0. Thoát");
    }

}
