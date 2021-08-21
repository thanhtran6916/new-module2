import student.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementArrayList {
    List<Student> studentList = new ArrayList<>();

    public void showStudents() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public void add(Student student) {
        studentList.add(student);
    }

    public void sort() {
        ComparatorStudentForArrayList studentSort = new ComparatorStudentForArrayList();
        studentList.sort(studentSort);
    }

    public void add(int index, Student student) {
        studentList.add(index, student);
    }

    public int searchStudent(String idSearch) {
        sort();
        int index = -1;
        int first = 0;
        int last = studentList.size() - 1;
        while (first <= last) {
            int medium = (first + last) / 2;
            String idStudent = studentList.get(medium).getId();
            if (studentList.get(medium).getId().equals(idSearch)) {
                index = medium;
                break;
            } else if (idSearch.compareTo(idStudent) > 0) {
                first = medium + 1;
            } else {
                last = medium - 1;
            }
        }
        return index;
    }

    public void editStudent(String id, Student student) {
        int index = searchStudent(id);
        studentList.remove(index);
        studentList.add(index, student);
    }


}
