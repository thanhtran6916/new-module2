package controller;

import Comparator.ComparatorClass;
import Interface.ManagementMethod;
import model.ClassSchool;
import model.Student;

import java.util.LinkedList;

public class ClassesManagement implements ManagementMethod<ClassSchool> {
    private LinkedList<ClassSchool> classSchools = new LinkedList<>();

    public LinkedList<ClassSchool> getClassSchools() {
        return classSchools;
    }

    public void setClassSchools(LinkedList<ClassSchool> classSchools) {
        this.classSchools = classSchools;
    }


    @Override
    public void show() {
        for (ClassSchool classSchool : classSchools) {
            System.out.println(classSchool);
        }
    }

    @Override
    public void add(ClassSchool t) {
        classSchools.add(t);
    }

    @Override
    public ClassSchool search(String id) {
        ClassSchool classSearch = null;
        for (ClassSchool classSchool : classSchools) {
            if (id.equals(classSchool.getId())) {
                classSearch = classSchool;
                break;
            }
        }
        return classSearch;
    }

    @Override
    public boolean delete(String id) {
        ClassSchool classSearch = search(id);
        if (classSearch == null) {
            System.out.println("Không có");
            return false;
        } else {
            classSchools.remove(classSearch);
            return true;
        }
    }

    @Override
    public boolean edit(String id, ClassSchool classSchool) {
        ClassSchool classEdit = search(id);
        if (classEdit == null) {
            System.out.println("Không có");
            return false;
        } else {
            classSchools.remove(classEdit);
            classSchools.add(classSchool);
            return true;
        }
    }

    @Override
    public void sort() {
        ComparatorClass comparatorClass = new ComparatorClass();
        classSchools.sort(comparatorClass);
        show();
    }

    public void addStudentToTheClass(String id, Student student) {
        ClassSchool classSchool = search(id);
        if (classSchool == null) {
            System.out.println("Không có");
        } else {
            student.setStudentClass(classSchool);
        }
    }
}
