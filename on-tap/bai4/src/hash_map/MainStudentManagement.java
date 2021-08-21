package hash_map;

import student.Student;

public class MainStudentManagement {
    public static void main(String[] args) {
        Student a = new Student("1", "thanh", "tb", "a2", 8);
        Student b = new Student("2", "van", "hn", "a3", 7);
        Student c = new Student("3", "tran", "tb", "a1", 6);
        Student d = new Student("4", "chiến", "hn", "a2", 9);

        StudentManagementHashMap myStudents = new StudentManagementHashMap();
        myStudents.add(a);
        myStudents.add(c);
        myStudents.add(b);

        myStudents.showAll();
        System.out.println("------------------");
        myStudents.sort();
    }

}
