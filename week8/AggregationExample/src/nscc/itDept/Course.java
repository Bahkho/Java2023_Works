package nscc.itDept;

import java.util.ArrayList;

public class Course {
    private String courseName;
    //I will implement the aggregation concept, which means:
    //Class inside another class:
    //private Student[] courseList = new Student[2];

    private ArrayList<Student> courseList = new ArrayList<>(); //1 - M RelationShip




    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Student> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Student> courseList) {
        this.courseList = courseList;
    }


//    public String courseReport(){
//
//    }
}
