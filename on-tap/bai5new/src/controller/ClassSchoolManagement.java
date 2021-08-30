package controller;

import model.ClassSchool;
import model.ComparatorClass;

import java.util.ArrayList;
import java.util.List;

public class ClassSchoolManagement implements GeneralManagement<ClassSchool> {
    private List<ClassSchool> classList = new  ArrayList<>();

    public List<ClassSchool> getClassList() {
        return classList;
    }

    public void setClassList(List<ClassSchool> classList) {
        this.classList = classList;
    }

    public int searchClassById(String id) {
        int index = -1;
        for (int i = 0; i < classList.size(); i++) {
            if (id.equals(classList.get(i).getId())) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public void show() {
        classList.forEach((n) -> {
            System.out.println(n);
        });
    }

    @Override
    public ClassSchool search(String id) {
        int index = searchClassById(id);
        if (index == -1) {
            return null;
        }
        return classList.get(index);
    }

    @Override
    public void add(ClassSchool classSchool) {
        classList.add(classSchool);
    }

    @Override
    public void edit(int index, ClassSchool classSchool) {
        classList.set(index, classSchool);
    }

    @Override
    public void remove(int index) {
        classList.remove(index);
    }

    @Override
    public void sort() {
        ComparatorClass comparatorClass = new ComparatorClass();
        classList.sort(comparatorClass);
    }
}
