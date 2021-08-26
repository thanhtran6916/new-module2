import jame.doc_ghi_danh_sach_sinh_vien.Student;

import java.io.*;
import java.util.ArrayList;

public class DocGhiFile {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
//        writeText("C:\\Users\\t\\OneDrive\\Desktop\\text.txt", students);
//
//        ArrayList<Student> a = readText("C:\\Users\\t\\OneDrive\\Desktop\\text.txt");
//
//        for (Student student : a) {
//            System.out.println(student);
//        }

//        writeBinary("C:\\Users\\t\\OneDrive\\Desktop\\result.txt", students);
//        ArrayList<Student> a = readBinary("C:\\Users\\t\\OneDrive\\Desktop\\result.txt");
//        for (Student student : a) {
//            System.out.println(student);
//        }
        copyBinaryFile("C:\\Users\\t\\OneDrive\\Desktop\\result.txt", "C:\\Users\\t\\OneDrive\\Desktop\\file.txt");



    }

    public static void writeText(String dataPatch, ArrayList<Student> students) {
        try {
            FileWriter fileWriter = new FileWriter(dataPatch, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student : students) {
                bufferedWriter.write(student.toString() + "\n");
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Student> readText(String dataPatch) {
        ArrayList<Student> students = new ArrayList<>();
        File file = new File(dataPatch);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] a = line.split(",");
                Student student = new Student(Integer.parseInt(a[0]), a[1], a[2]);
                students.add(student);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void writeBinary(String filePatch, ArrayList<Student> students) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePatch);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Student> readBinary(String filePatch) {
        ArrayList<Student> students = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(filePatch);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            students = (ArrayList<Student>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void copyBinaryFile(String file, String copyFile) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(copyFile);
            byte[] bytes = new byte[1024];
            int length = fileInputStream.read(bytes);
            while (length > 0) {
                fileOutputStream.write(bytes, 0, length);
                length = fileInputStream.read(bytes);
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
