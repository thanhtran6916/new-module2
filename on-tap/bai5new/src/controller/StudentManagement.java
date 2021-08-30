package controller;

import model.Student;

import java.io.*;
import java.util.*;

import static view.ClassMain.classManagement;

public class StudentManagement implements GeneralManagement<Student>, Serializable {
    public static String fileData = "E:\\CodeGym\\module_2\\tuan-2\\on-tap\\bai5new\\data.txt";
    private Map<String, Student> studentMap = new LinkedHashMap<>();

    public Map<String, Student> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<String, Student> studentMap) {
        this.studentMap = studentMap;
    }

    @Override
    public void show() {
        for (Map.Entry<String, Student> value : studentMap.entrySet()) {
            System.out.println(value.getValue());
        }
    }

    @Override
    public Student search(String id) {
        return studentMap.get(id);
    }

    @Override
    public void add(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void edit(int index, Student student) {
    }

    public void edit(String id, Student student) {
        studentMap.replace(id, student);
    }

    @Override
    public void remove(int index) {
    }

    public void remove(String id) {
        studentMap.remove(id);
    }

    @Override
    public void sort() {
        TreeMap<String, Student> map = new TreeMap<>();
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            map.put(entry.getValue().getName(), entry.getValue());
        }
        studentMap = new LinkedHashMap<>(map);
    }

    public LinkedList<Student> showTop5() {
        LinkedList<Student> topStudent = new LinkedList<>();
        int count = 0;
        LinkedList<Student> students = new LinkedList<>(studentMap.values());
        while (count < 5) {
            Student studentMax = students.getFirst();
            for (Student student : students) {
                if (studentMax.getPoint() < student.getPoint()) {
                    studentMax = student;
                }
            }
            topStudent.add(studentMax);
            students.remove(studentMax);
            count++;
        }
        return topStudent;
    }

    public void saveToFile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileData);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(studentMap);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Done!");
        } catch (IOException e) {
            System.err.println("Lỗi lưu file");
        }
    }

    public void readToFile() {
        try {
            File file = new File(fileData);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            studentMap = (Map<String, Student>) objectInputStream.readObject();
            for (Student student : studentMap.values()) {
                classManagement.add(student.getClassSchool());
            }
            fileInputStream.close();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            System.err.println("File lưu trữ không tồn tại");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
