package ct417_ass1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student {
    String name, username;
    int age, id;
    LocalDate dob;
    Course course;
    ArrayList<Module> modules;

    public Student (String name, int age, int id, LocalDate dob, Course course) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.dob = dob;
        this.course = course;
        modules = new ArrayList<Module>();
    }

    public String getUsername() {
        return name + Integer.toString(age);
    }

    @Override
    public String toString() {
        return name + ", " + id + ", " + getUsername();
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getCourse(){
        return course.toString();
    }
    public void setCourse(Course course){
        this.course = course;
    }

    public String getModules(){
        return modules.toString();
    }
    public void addModule(Module mod){
        modules.add(mod);
    }
    public void removeModule(Module mod){
        modules.remove(mod);
    }
}
