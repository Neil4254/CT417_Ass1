package ct417_ass1_UnitTesting;

import ct417_ass1.Student;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Before
    void initialSetup(){
        Student s1 = new Student("")
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getUsername() {

    }

    @Test
    void testToString() {
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void getAge() {
    }

    @Test
    void setAge() {
    }

    @Test
    void getId() {
    }

    @Test
    void setId() {
    }

    @Test
    void getDob() {
    }

    @Test
    void setDob() {
    }

    @Test
    void getCourse() {
    }

    @Test
    void setCourse() {
    }

    @Test
    void getModules() {
    }

    @Test
    void addModule() {
    }

    @Test
    void removeModule() {
    }
}