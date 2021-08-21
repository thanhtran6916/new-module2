package hash_map;
import student.Student;

import java.util.*;

public class StudentManagementHashMap {
    private Map<String, Student> studentMap = new HashMap<>();

    public Map<String, Student> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<String, Student> studentMap) {
        this.studentMap = studentMap;
    }

    public void add(Student student) {
        studentMap.put(student.getId(), student);
    }

    public void showAll() {
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public void deleteStudent(String id) {
        studentMap.remove(id);
    }

    public boolean searchStudent(String id) {
        return studentMap.containsKey(id);
    }

    public void editStudent(String id, Student student) {
        studentMap.replace(id, student);
    }

    public void sort() {
        Map<String, Student> temp = new TreeMap<>(studentMap);
        for (Map.Entry<String, Student> entry : temp.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
