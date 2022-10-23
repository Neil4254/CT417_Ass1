package ct417_ass1_UnitTesting;

import ct417_ass1.Course;
import ct417_ass1.Lecturer;
import ct417_ass1.Module;
import ct417_ass1.Student;
import org.joda.time.DateTime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ModuleTest {

    Module m1;
    Lecturer l1;
    ArrayList<Student> enrolledStudents;
    ArrayList<Course> associatedCourses;
    DateTime startDate = new DateTime(2022, 9, 1, 9, 0);
    DateTime endDate = new DateTime(2023, 5, 1, 18, 0);

    @BeforeEach
    void setUp() {
        //String name, int age, int id, LocalDate dob, ArrayList<Module> modules
        l1 = new Lecturer("Bob Robbins", 47, 9293848, LocalDate.of(1975, 3, 15), null);//String name, int age, int id, LocalDate dob

        //String modName, String modId, Lecturer lect
        m1 = new Module("System on Chip", "EE405", l1);


        enrolledStudents = new ArrayList<Student>();
        Student s1 = new Student("Neil Dozio", 21, 19388323, LocalDate.of(2001, 1, 2), null, null);
        Student s2 = new Student("Gary Browskins", 20, 1942954, LocalDate.of(2001, 11, 5), null, null);
        enrolledStudents.add(s1);
        enrolledStudents.add(s2);
        m1.addStudent(s1);
        m1.addStudent(s2);

        associatedCourses = new ArrayList<Course>();
        Course c1 = new Course("ECE4", startDate, endDate);
        Course c2 = new Course("CT4", startDate, endDate);
        associatedCourses.add(c1);
        associatedCourses.add(c2);
        m1.addCourse(c1);
        m1.addCourse(c2);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToString() {

        String toReturn = "\nModule Name: " + "System on Chip";
        toReturn += "\nModule ID: " + "EE405";
        toReturn += "\nAssigned Lecturer: " + l1;
        toReturn += "\nNumber of students in Module: " + enrolledStudents.size();
        toReturn += "\nNumber of courses using this Module: " + associatedCourses.size();
        toReturn += "\n";

        assertEquals(toReturn, m1.toString());
    }

    @Test
    void getModName() {
        assertEquals("System on Chip", m1.getModName());
    }

    @Test
    void setModName() {
        m1.setModName("Fish on Chip");
        assertEquals("Fish on Chip", m1.getModName());
    }

    @Test
    void getModId() {
        assertEquals("EE405", m1.getModId());
    }

    @Test
    void setModId() {
        m1.setModId("CT100");
        assertEquals("CT100", m1.getModId());
    }

    @Test
    void getLecturer() {

        assertEquals(l1, m1.getLecturer());
    }

    @Test
    void setLecturer() {
        Lecturer l2 = new Lecturer("George Williams", 65, 98583923, LocalDate.of(1957, 5, 23), null);
        m1.setLecturer(l2);

        assertEquals(l2, m1.getLecturer());
    }

    @Test
    void getCourses() {
        assertEquals(associatedCourses, m1.getCourses());
    }

    @Test
    void addCourse() {
        Course c3 = new Course("Test Course", startDate, endDate);
        m1.addCourse(c3);
        associatedCourses.add(c3);

        assertEquals(associatedCourses, m1.getCourses());
    }

    @Test
    void removeCourse() {
        Course c2 = new Course("CT4", startDate, endDate);
        m1.removeCourse(c2);
        associatedCourses.remove(c2);

        assertEquals(associatedCourses, m1.getCourses());
    }

    @Test
    void getStudents() {
        assertEquals(enrolledStudents, m1.getStudents());
    }

    @Test
    void addStudent() {
        Student s3 = new Student("Simon Smith", 22, 18523432, LocalDate.of(2000, 2, 14), null, null);
        m1.addStudent(s3);
        enrolledStudents.add(s3);

        assertEquals(enrolledStudents, m1.getStudents());
    }

    @Test
    void removeStudent() {
        Student s2 = new Student("Gary Browskins", 20, 1942954, LocalDate.of(2001, 11, 5), null, null);
        enrolledStudents.remove(s2);
        m1.removeStudent(s2);

        assertEquals(enrolledStudents, m1.getStudents());
    }
}