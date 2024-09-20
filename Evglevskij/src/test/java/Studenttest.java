import org.example.Student;
import org.example.StudentManager;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testStudentCreation() {
        Student student = new Student("Иван", 20, "12345");
        assertEquals("Иван", student.getName());
        assertEquals(20, student.getAge());
        assertEquals("12345", student.getStudentId());
    }

    @Test
    void testSettersAndGetters() {
        Student student = new Student("Иван", 20, "12345");
        student.setName("Петр");
        student.setAge(21);
        student.setStudentId("67890");

        assertEquals("Петр", student.getName());
        assertEquals(21, student.getAge());
        assertEquals("67890", student.getStudentId());
    }
}


class StudentManagerTest {

    @Test
    void testAddStudent() {
        StudentManager manager = new StudentManager();
        Student student = new Student("Иван", 20, "12345");
        manager.addStudent(student);
        assertEquals(1, manager.getStudents().size());
        assertEquals(student, manager.getStudents().get(0));
    }

    @Test
    void testRemoveStudent() {
        StudentManager manager = new StudentManager();
        Student student1 = new Student("Иван", 20, "12345");
        Student student2 = new Student("Петр", 21, "67890");
        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.removeStudent("12345");
        assertEquals(1, manager.getStudents().size());
        assertEquals(student2, manager.getStudents().get(0));
    }

    @Test
    void testGetStudents() {
        StudentManager manager = new StudentManager();
        Student student1 = new Student("Иван", 20, "12345");
        Student student2 = new Student("Петр", 21, "67890");
        manager.addStudent(student1);
        manager.addStudent(student2);
        List<Student> students = manager.getStudents();
        assertEquals(2, students.size());
        assertTrue(students.contains(student1));
        assertTrue(students.contains(student2));
    }

    @Test
    void testGetStudentsOverAge() {
        StudentManager manager = new StudentManager();
        Student student1 = new Student("Иван", 20, "12345");
        Student student2 = new Student("Петр", 21, "67890");
        manager.addStudent(student1);
        manager.addStudent(student2);
        List<Student> studentsOver20 = manager.getStudentsOverAge(20);
        assertEquals(1, studentsOver20.size());
        assertEquals(student2, studentsOver20.get(0));
    }
}