package copy_file_text;

import java.util.ArrayList;

public class StudentManagement {
    private ArrayList<Student> students = new ArrayList<Student>();

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void showStudent() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void add(Student student) {
        students.add(student);
    }

    public void sort() {
        ComparatorStudentName comparatorStudentName = new ComparatorStudentName();
        students.sort(comparatorStudentName);
    }

    private int checkId(String id) {
        this.sort();
        final int size = students.size();
        int index = -1;
        int first = 0;
        int last = size - 1;
        while (last >= first) {
            int haft = (last + first) / 2;
            Student studentHaft = students.get(haft);
            if (id.equals(studentHaft.getId())) {
                index = haft;
                break;
            } else if (id.compareTo(studentHaft.getId()) > 0) {
                first = haft + 1;
            } else {
                last = haft - 1;
            }
        }
        return index;
    }

    public Student search(String id) {
        Student searchStudent = null;
        int index = checkId(id);
        if (index != -1) {
            searchStudent = students.get(index);
        }
        return searchStudent;
    }

    public boolean edit(String id, Student student) {
        int index = checkId(id);
        if (index == -1) {
            return false;
        }
        students.set(index, student);
        return true;
    }

    public boolean deleteStudent(String id) {
        Student deleteStudent = search(id);
        if (deleteStudent == null) {
            return false;
        }
        students.remove(deleteStudent);
        return true;
    }
}
