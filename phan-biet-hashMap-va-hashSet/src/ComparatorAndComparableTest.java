import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorAndComparableTest {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Nam", 20, "HN");
        students[1] = new Student("Hung", 19, "HN");
        students[2] = new Student("Ha", 22, "HN");

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("-----------------");
        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("---------------------");
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(students[0]);
        listStudent.add(students[1]);
        listStudent.add(students[2]);


        ComparatorStudent comparatorStudent = new ComparatorStudent();
        Collections.sort(listStudent,comparatorStudent);
        for (Student student : listStudent) {
            System.out.println(student);
        }

    }
}
