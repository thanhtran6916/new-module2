import student.Student;

import java.util.LinkedList;
import java.util.List;

public class StudentManagementLinkedList {
    private List<Student> studentList = new LinkedList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void add(Student student) {
        studentList.add(student);
    }

    public void add(int index, Student student) {
        studentList.add(index, student);
    }

    public void showAll() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public void deleteStudent(String id) {
        int index = searchStudent(id);
        if (index != -1) {
            studentList.remove(index);
        }
    }

    public int searchStudent(String id) {
        int index = -1;
        int last = 0;
        int first = studentList.size() - 1;
        while (last <= first) {
            int haft = (last + first) / 2;
            if (id.equals(studentList.get(haft).getId())) {
                index = haft;
                break;
            } else if (id.compareTo(studentList.get(haft).getId()) > 0) {
                last = haft + 1;
            } else {
                first = haft - 1;
            }
        }
        return index;
    }

    public void editStudent(String id, Student student) {
        int index = searchStudent(id);
        if (index == -1) {
            return;
        }
        Student deleteStudent = studentList.get(index);
        studentList.remove(deleteStudent);
        studentList.add(index, student);
    }

    public void sort() {
        ComparatorStudentForLinkedList comparatorStudent = new ComparatorStudentForLinkedList();
        studentList.sort(comparatorStudent);
    }
}
