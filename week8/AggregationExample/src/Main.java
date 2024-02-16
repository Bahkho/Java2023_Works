import nscc.itDept.Course;
import nscc.itDept.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Student> pythonList = new ArrayList<>();
        ArrayList<Student> javaList = new ArrayList<>();
        pythonList.add(new Student("w11111","Yousef",50,70));
        pythonList.add(new Student("w22222","David",95,97));

        javaList.add(new Student("W3333","Brad",88,98));
        javaList.add(new Student("W4444","Geoff",98,95));

        Course javaCourse = new Course();
        javaCourse.setCourseName("Java Programming");
        javaCourse.setCourseList(javaList);

        Course pythonCourse = new Course();
        pythonCourse.setCourseName("Python Programming");
        pythonCourse.setCourseList(pythonList);


    }
}