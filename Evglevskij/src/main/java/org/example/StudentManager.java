package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(String studentId) {
        students.removeIf(student -> student.getStudentId().equals(studentId));
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students); // Возвращаем копию списка, чтобы предотвратить модификацию исходного списка
    }

    public List<Student> getStudentsOverAge(int age) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() > age) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }
}
