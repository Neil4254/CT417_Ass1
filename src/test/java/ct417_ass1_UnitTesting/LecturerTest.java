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

class LecturerTest {

    Lecturer l1;
    ArrayList modulesTest;


    @BeforeEach
    void setUp() {

        Module m1 = new Module("Software Engineering 3", "CT417", null);
        Module m2 = new Module("Programming 4", "CT403", null);

        ArrayList<Module> modules = new ArrayList<Module>();
        modules.add(m1);
        modules.add(m2);

        modulesTest = modules;

        l1 = new Lecturer("Bob Robbins", 47, 9293848, LocalDate.of(1975, 3, 15), modules);
    }

    @Test
    void getUsername() {
        assertEquals("Bob Robbins47", l1.getUsername());
    }

    @Test
    void testToString() {
        assertEquals("Bob Robbins, 9293848, Bob Robbins47", l1.toString());
    }

    @Test
    void getName() {
        assertEquals("Bob Robbins", l1.getName());
    }

    @Test
    void setName() {
        l1.setName("Christopher Bartholomew");

        assertEquals("Christopher Bartholomew", l1.getName());
    }

    @Test
    void getAge() {
        assertEquals(47, l1.getAge());
    }

    @Test
    void setAge() {
        l1.setAge(35);

        assertEquals(35 ,l1.getAge());
    }

    @Test
    void getId() {
        assertEquals(9293848, l1.getId());
    }

    @Test
    void setId() {
        l1.setId(14583938);

        assertEquals(14583938, l1.getId());
    }

    @Test
    void getDob() {
        assertEquals(LocalDate.of(1975, 3, 15), l1.getDob() );
    }

    @Test
    void setDob() {
        LocalDate tempDate = LocalDate.of(2000, 5, 8);
        l1.setDob(tempDate);
        assertEquals(tempDate, l1.getDob());
    }

    @Test
    void getModules() {
        assertEquals(modulesTest.toString(), l1.getModules());

    }

    @Test
    void addModule() {
        Module m3 = new Module("System on Chip", "EE405", null);
        l1.addModule(m3);
        modulesTest.add(m3);

        assertEquals(modulesTest.toString(), l1.getModules());
    }

    @Test
    void removeModule() {
        Module m2 = new Module("Programming 4", "CT403", null);

        l1.removeModule(m2);
        modulesTest.remove(m2);

        assertEquals(modulesTest.toString(), l1.getModules());
    }
}