package ct417_ass1;

import java.util.ArrayList;
import org.joda.time.DateTime;

import javax.swing.*;

public class Course {

    String courseName;
    ArrayList<Module> modules;
    ArrayList<Student> students;
    DateTime startDate;
    DateTime endDate;

    public Course(String courseName, DateTime startDate, DateTime endDate){
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        modules = new ArrayList<Module>();
        students = new ArrayList<Student>();
    }

    public String toString(){
        String toReturn = "\nCourse: " + courseName;
        toReturn += "\nStart Date: " + startDate;
        toReturn += "\nEnd Date: " + endDate;
        return toReturn;
    }

    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public DateTime getStartDate(){
        return startDate;
    }
    public void setStartDate(DateTime startDate){
        this.startDate = startDate;
    }

    public DateTime getEndDate(){
        return endDate;
    }
    public void setEndDate(DateTime endDate){
        this.endDate = endDate;
    }

    public ArrayList<Module> getModules(){
        return modules;
    }
    public void addModule(Module mod){
        modules.add(mod);
    }
    public void removeModule(Module mod){
        modules.remove(mod);
    }

    public ArrayList<Student> getStudents(){
        return students;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }
}
