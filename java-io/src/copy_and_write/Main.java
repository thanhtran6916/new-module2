package copy_and_write;

import copy_file_text.Student;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String FILE_PATCH = "C:\\Users\\t\\OneDrive\\Desktop\\student.txt";
        Scanner scanner = new Scanner(System.in);
        int choose = -1;
        do {
            menu();
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    read(FILE_PATCH);
                    break;
                case 2:
                    Student student = inputStudent(scanner);
                    write(FILE_PATCH, student);
                    break;
                case 3:
                    delete(FILE_PATCH);
                    break;
            }
        } while (choose != 0);
    }

    public static Student inputStudent(Scanner scanner) {
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

    public static void menu() {
        System.out.println("MENU");
        System.out.println("1. Hiển thị");
        System.out.println("2. Thêm");
        System.out.println("3. Xóa");
        System.out.println("0. Thoát");
    }

    public static void delete(String filePatch) {
        try {
            File file = new File(filePatch);
            if (!file.exists()) {
                throw new IOException();
            }
            file.delete();
            System.out.println("Done");
        } catch (IOException e) {
            System.err.println("Chưa có tập tin hoặc tập tin lỗi");
        }
    }

    public static void read(String dataPatch) {
        try {
            File file = new File(dataPatch);
            if (!file.exists()) {
                throw new IOException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Chưa có tập tin hoặc tập tin lỗi");
        }
    }

    public static void write(String dataPatch, Student student) {
        try {
            FileWriter fileWriter = new FileWriter(dataPatch, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(student.getName() + " " + student.getId() + " " + student.getAge() + "\n");
            bufferedWriter.close();
            System.out.println("Done");
        } catch (IOException e) {
            System.out.println("Lỗi vị trí lưu tập tin");
        }
    }
}
