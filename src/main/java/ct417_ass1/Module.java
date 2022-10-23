package ct417_ass1;

import java.util.ArrayList;

public class Module {

    String modName, modId;

    ArrayList<Student> enrolledStudents;
    Lecturer assignedLecturer;
    ArrayList<Course> associatedCourses;

    public Module(String modName, String modId, Lecturer lect) {
        this.modName = modName;
        this.modId = modId;
        assignedLecturer = lect;
        enrolledStudents = new ArrayList<Student>();
        associatedCourses = new ArrayList<Course>();
    }

    @Override
    public String toString() {
        String toReturn = "\nModule Name: " + modName;
        toReturn += "\nModule ID: " + modId;
        toReturn += "\nAssigned Lecturer: " + assignedLecturer;
        toReturn += "\nNumber of students in Module: " + enrolledStudents.size();
        toReturn += "\nNumber of courses using this Module: " + associatedCourses.size();
        toReturn += "\n";

        return toReturn ;
    }

    public String getModName() {
        return modName;
    }
    public void setModName(String modName) {
        this.modName = modName;
    }

    public String getModId() {
        return modId;
    }
    public void setModId(String modId){
        this.modId = modId;
    }


    public void setLecturer(Lecturer lect) {
        assignedLecturer = lect;
    }
    public Lecturer getLecturer() {
        return assignedLecturer;
    }

    public ArrayList<Course> getCourses(){
        return associatedCourses;
    }
    public void addCourse(Course course) {
        associatedCourses.add(course);
    }
    public void removeCourse(Course course){
        associatedCourses.remove(course);
    }

    public ArrayList<Student> getStudents(){
        return enrolledStudents;
    }
    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }
    public void removeStudent(Student student){
        enrolledStudents.remove(student);
    }


}
