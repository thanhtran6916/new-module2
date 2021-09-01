public class Student {
    private String name;
    private String classStudent;
    private int point;

    public Student(String name, String classStudent, int point) {
        this.name = name;
        this.classStudent = classStudent;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
