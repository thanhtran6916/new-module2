package model;

import java.io.Serializable;

public class Student implements Serializable {
    private String id;
    private String name;
    private int age;
    private double point;
    private ClassSchool classSchool;

    public Student(String id, String name, int age, double point) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.point = point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public ClassSchool getClassSchool() {
        return classSchool;
    }

    public void setClassSchool(ClassSchool classSchool) {
        this.classSchool = classSchool;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", point=" + point +
                ", classSchool=" + classSchool +
                '}';
    }
}
