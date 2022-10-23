package ct417_ass1_UnitTesting;

import ct417_ass1.Student;
import ct417_ass1.Lecturer;
import ct417_ass1.Module;
import ct417_ass1.Course;

import org.joda.time.DateTime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    Course c1;

    DateTime startDate = new DateTime(2022, 9, 1, 9, 0);
    DateTime endDate = new DateTime(2023, 5, 1, 18, 0);

    ArrayList<Module> modulesList;
    ArrayList<Student> enrolledStudents;
    @BeforeEach
    void setUp() {
        c1 = new Course("ECE4", startDate, endDate);

        modulesList = new ArrayList<Module>();
        Module m1 = new Module("Software Engineering 3", "CT417", null);
        Module m2 = new Module("Programming 4", "CT403", null);
        c1.addModule(m1);
        c1.addModule(m2);
        modulesList.add(m1);
        modulesList.add(m2);

        enrolledStudents = new ArrayList<Student>();
        Student s1 = new Student("Neil Dozio", 21, 19388323, LocalDate.of(2001, 1, 2), null, null);
        Student s2 = new Student("Gary Browskins", 20, 1942954, LocalDate.of(2001, 11, 5), null, null);
        enrolledStudents.add(s1);
        enrolledStudents.add(s2);
        c1.addStudent(s1);
        c1.addStudent(s2);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToString() {
        String toReturn = "\nCourse: " + "ECE4";
        toReturn += "\nStart Date: " + startDate;
        toReturn += "\nEnd Date: " + endDate;

        assertEquals(toReturn, c1.toString());
    }

    @Test
    void getCourseName() {
        assertEquals("ECE4", c1.getCourseName());
    }

    @Test
    void setCourseName() {
        c1.setCourseName("CT4");
        assertEquals("CT4", c1.getCourseName());
    }

    @Test
    void getStartDate() {
        assertEquals(startDate, c1.getStartDate());
    }

    @Test
    void setStartDate() {//    DateTime startDate = new DateTime(2022, 9, 1, 9, 0);
        DateTime newStartDate = new DateTime(2020, 8, 5, 9, 0);
        c1.setStartDate(newStartDate);

        assertEquals(newStartDate, c1.getStartDate());
    }

    @Test
    void getEndDate() {
        assertEquals(endDate, c1.getEndDate());
    }

    @Test
    void setEndDate() {
        DateTime newEndDate = new DateTime(2020, 3, 27, 4, 0);
        c1.setEndDate(newEndDate);

        assertEquals(newEndDate, c1.getEndDate());
    }

    @Test
    void getModules() {
        assertEquals(modulesList, c1.getModules());
    }

    @Test
    void addModule() {
        Module m3 = new Module("Social Studies", "AT500", null);
        c1.addModule(m3);
        modulesList.add(m3);

        assertEquals(modulesList, c1.getModules());
    }

    @Test
    void removeModule() {
        Module m2 = new Module("Programming 4", "CT403", null);
        c1.removeModule(m2);
        modulesList.remove(m2);

        assertEquals(modulesList, c1.getModules());
    }

    @Test
    void getStudents() {
        assertEquals(enrolledStudents, c1.getStudents());
    }

    @Test
    void addStudent() {
        Student s3 = new Student("Simon Smith", 22, 18523432, LocalDate.of(2000, 2, 14), null, null);
        c1.addStudent(s3);
        enrolledStudents.add(s3);

        assertEquals(enrolledStudents, c1.getStudents());
    }

    @Test
    void removeStudent() {
        Student s2 = new Student("Gary Browskins", 20, 1942954, LocalDate.of(2001, 11, 5), null, null);
        enrolledStudents.remove(s2);
        c1.removeStudent(s2);

        assertEquals(enrolledStudents, c1.getStudents());
    }
}