package copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MainIO {
    static final String FILE_DATA = "C:\\Users\\t\\OneDrive\\Desktop\\students";
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> myStudent = new ArrayList<>();
        int choose = -1;
        do {
            menu();
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    try {
                        File file = new File(FILE_DATA);
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
                        System.out.println("Lỗi tập tin không tồn tại hoặc bị lỗi");
                    }
                    break;

                case 2:
                    Student student = inputStudent(scanner);

                    try {
                        FileWriter fileWriter = new FileWriter(FILE_DATA, true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        bufferedWriter.write(student.StringIO() + "\n");
                        bufferedWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Nhập id");
                    String id = scanner.nextLine();
                    try {
                        File file = new File(FILE_DATA);
                        if (!file.exists()) {
                            throw new IOException();
                        } 
                        FileReader fileReader = new FileReader(file);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String line = bufferedReader.readLine();
                        while (line != null) {
                            String[] studentElement = line.split(" ");
                            for (String value : studentElement) {
                                if (value.equals(id)) {
                                    System.out.println(line);
                                    break;
                                }
                            }
                            line = bufferedReader.readLine();
                        }
                        
                    } catch (IOException e) {
                        System.out.println("Lỗi tập tin không tồn tại hoặc bị lỗi");
                    }
                    break;
            }
        } while (choose != 0);


    }

    private static Student inputStudent(Scanner scanner) {
        System.out.println("Nhập id");
        String id = scanner.nextLine();
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = scanner.nextInt();
        scanner.nextLine();
        Student student = new Student(name, id, age);
        return student;
    }

    private static void menu() {
        System.out.println("Menu");
        System.out.println("1. Hiển thị");
        System.out.println("2. Thêm");
        System.out.println("3. Tìm kiếm");
        System.out.println("0. Thoát");
    }

}
