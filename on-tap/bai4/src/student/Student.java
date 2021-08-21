package student;

public class Student {
    private String id;
    private String name;
    private String address;
    private String studentClass;
    private double pointTest;

    public Student(String id, String name, String address, String studentClass, double pointTest) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.studentClass = studentClass;
        this.pointTest = pointTest;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public double getPointTest() {
        return pointTest;
    }

    public void setPointTest(double pointTest) {
        this.pointTest = pointTest;
    }

    @Override
    public String toString() {
        return "student.Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", studentClass='" + studentClass + '\'' +
                ", pointTest=" + pointTest +
                '}';
    }
}
