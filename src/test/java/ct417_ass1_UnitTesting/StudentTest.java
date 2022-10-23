package ct417_ass1_UnitTesting;

import ct417_ass1.Student;
import ct417_ass1.Lecturer;
import ct417_ass1.Module;
import ct417_ass1.Course;

//import org.aspectj.lang.annotation.Before;
import org.joda.time.DateTime;
import java.time.LocalDate;
import java.util.ArrayList;

//import org.joda.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student s2, s1;
    ArrayList<Module> modulesTest;

    @BeforeAll
    static void initialSetup(){
//        DateTime startDate = new DateTime(2022, 9, 1, 9, 0);
//        DateTime endDate = new DateTime(2023, 5, 1, 18, 0);
//        Course c1 = new Course("ECE4", startDate, endDate);
//
//        LocalDate dob = LocalDate.of(2001, 1, 2);
//
//        StudentTest test1 = new StudentTest();
//
//        test1.s1 = new Student("Neil Dozio", 21, 19388323, dob, c1);
//
//        test1.s2 = test1.s1;
//        test1.s3 = s1;
    }




    @BeforeEach
    void setUp() {
        DateTime startDate = new DateTime(2022, 9, 1, 9, 0);
        DateTime endDate = new DateTime(2023, 5, 1, 18, 0);
        Course c1 = new Course("ECE4", startDate, endDate);

        LocalDate dob = LocalDate.of(2001, 1, 2);

        StudentTest test1 = new StudentTest();

        Lecturer l1 = new Lecturer("Bob Robbins", 47, 9293848, LocalDate.of(1975, 3, 15), null);//String name, int age, int id, LocalDate dob
        Lecturer l2 = new Lecturer("Dan Leman", 35, 5383234, LocalDate.of(1987, 5, 3), null);
        Module m1 = new Module("Software Engineering 3", "CT417", l1);
        Module m2 = new Module("Programming 4", "CT403", l2);
        ArrayList<Module> modules = new ArrayList<Module>();
        modules.add(m1);
        modules.add(m2);
        modulesTest = modules;

        s2 = new Student("Neil Dozio", 21, 19388323, dob, c1, modules);



    }

    @AfterEach
    void tearDown() {
//        s2 = null;
    }

    @Test
    void getUsername() {
        assertEquals("Neil Dozio21", s2.getUsername());
    }

    @Test
    void testToString() {
        assertEquals("Neil Dozio, 19388323, Neil Dozio21", s2.toString());
    }

    @Test
    void getName() {
        assertEquals("Neil Dozio", s2.getName());
    }

    @Test
    void setName() {
        String newName = "Brian";
        s2.setName(newName);
        assertEquals(newName, s2.getName());
    }

    @Test
    void getAge() {
        assertEquals(21, s2.getAge());
    }

    @Test
    void setAge() {
        int newAge = 94;
        s2.setAge(newAge);
        assertEquals(newAge, s2.getAge());
    }

    @Test
    void getId() {
        assertEquals(19388323, s2.getId());
    }

    @Test
    void setId() {
        int newId = 1234;
        s2.setId(newId);
        assertEquals(newId, s2.getId());
    }

    @Test
    void getDob() {
        assertEquals(LocalDate.of(2001, 1, 2), s2.getDob());
    }

    @Test
    void setDob() {
        LocalDate newDob = LocalDate.of(2022, 10, 5);
        s2.setDob(newDob);
        assertEquals(newDob, s2.getDob());
    }

    @Test
    void getCourse() {
        DateTime startDate = new DateTime(2022, 9, 1, 9, 0);
        DateTime endDate = new DateTime(2023, 5, 1, 18, 0);
        Course c2 = new Course("ECE4", startDate, endDate);

        assertEquals(c2.toString(), s2.getCourse());
    }

    @Test
    void setCourse() {
        DateTime startDate = new DateTime(2022, 9, 1, 9, 0);
        DateTime endDate = new DateTime(2023, 5, 1, 18, 0);
        Course c2 = new Course("CS4", startDate, endDate);

        s2.setCourse(c2);

        assertEquals(c2.toString(), s2.getCourse());
    }

    @Test
    void getModules() {
        assertEquals(modulesTest.toString(), s2.getModules());
    }

    @Test
    void addModule() {
        Lecturer l3 = new Lecturer("George Bullet", 31, 3483234, LocalDate.of(1995, 4, 19), null);
        Module m3 = new Module("System on Chip", "EE405", l3);
        s2.addModule(m3);
        modulesTest.add(m3);

        assertEquals(modulesTest.toString(), s2.getModules());
    }

    @Test
    void removeModule() {
        Lecturer l3 = new Lecturer("George Bullet", 31, 3483234, LocalDate.of(1995, 4, 19), null);
        Module m3 = new Module("System on Chip", "EE405", l3);
        s2.addModule(m3);
        modulesTest.add(m3);

        s2.removeModule(m3);
        modulesTest.remove(m3);
//
        assertEquals(modulesTest.toString(), s2.getModules());
    }
}