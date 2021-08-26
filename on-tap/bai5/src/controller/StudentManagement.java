package controller;

import Comparator.ComparatorStudent;
import Interface.ManagementMethod;
import model.Student;

import java.util.Iterator;
import java.util.LinkedList;

public class StudentManagement implements ManagementMethod<Student> {
    private LinkedList<Student> students = null;

    public StudentManagement() {
        this.students = new LinkedList<>();
    }

    public LinkedList<Student> getStudents() {
        return students;
    }

    public void setStudents(LinkedList<Student> students) {
        this.students = students;
    }

    @Override
    public void add(Student t) {
        students.add(t);
    }

    @Override
    public void show() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public Student search(String id) {
        Student searchStudent = null;
        for (Student student : students) {
            if (id.equals(student.getId())) {
                searchStudent = student;
            }
        }
        return searchStudent;
    }

    @Override
    public boolean delete(String id) {
        boolean flag = false;
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            Student removeStudent = studentIterator.next();
            if (id.equals(removeStudent.getId())) {
                students.remove(removeStudent);
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Override
    public boolean edit(String id, Student student) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (id.equals(students.get(i).getId())) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        } else {
            students.set(index, student);
            return true;
        }
    }

    @Override
    public void sort() {
        ComparatorStudent comparatorStudent = new ComparatorStudent();
        students.sort(comparatorStudent);
        show();
    }

}
