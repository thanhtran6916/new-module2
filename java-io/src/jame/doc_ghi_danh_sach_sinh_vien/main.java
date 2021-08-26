package jame.doc_ghi_danh_sach_sinh_vien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        students.add(new Student(6, "Quân Lê", "Hà Nội"));

        write("C:\\Users\\t\\OneDrive\\Desktop\\text.txt", students);

        List<Student> list = readFile("C:\\Users\\t\\OneDrive\\Desktop\\result.txt");
        for (Student student : list) {
            System.out.println(student);
        }

    }

    public static void write(String filePatch, ArrayList<Student> students) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePatch);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Student> readFile(String filePatch){
        List<Student> students = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(filePatch);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            students = (List<Student>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

}