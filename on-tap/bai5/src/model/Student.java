package model;

public class Student {
    private String id;
    private String name;
    private int age;
    private int point;
    private ClassSchool studentClass;

    public Student(String id, String name, int age, int point) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.point = point;
        this.studentClass = null;
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


    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public ClassSchool getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(ClassSchool studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + age + "," + point + "," + studentClass;
    }
}
