import student.Student;

public class MainStudentManagementArrayList {
    public static void main(String[] args) {
        Student a = new Student("1", "thanh", "tb", "a2", 8);
        Student b = new Student("2", "van", "hn", "a3", 7);
        Student c = new Student("3", "tran", "tb", "a1", 6);
        Student d = new Student("4", "chiến", "hn", "a2", 9);


        StudentManagementArrayList myStudent = new StudentManagementArrayList();
        myStudent.add(a);
        myStudent.add(b);
        myStudent.add(c);

        myStudent.editStudent("2", d);
        myStudent.showStudents();
    }


}
