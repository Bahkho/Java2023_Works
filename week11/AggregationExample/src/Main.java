import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aggregation Example!");

        Scanner sc = new Scanner(System.in);


        Course javaCourse = new Course();
        javaCourse.setCourseName("Java Programming");
        Course pythonaCourse = new Course();
        pythonaCourse.setCourseName("Python Programming");


//        System.out.println("Input the first course name");
//        javaCourse.setCourseName(sc.nextLine());
        //We will instantiate an ArrayList of Students:
        ArrayList<Student> javaStudList = new ArrayList<>();
        javaStudList.add(new Student("Yousef",77,88));
        javaStudList.add(new Student("Lilyan",88,99));
        javaStudList.add(new Student("Brad",95,85));

        javaCourse.setStudentList2(javaStudList);

        //I will print java student list's report from Student class's object
        System.out.println("Getting the student report from the local ArrayList in Main.java");

        for (Student currentStudent :javaStudList) {
            System.out.println(currentStudent.stdReport());
        }

        System.out.println("Getting the student report from the Course object:javaCourse");

        for (Student currentStudent:javaCourse.getStudentList2()) {
            System.out.println(currentStudent.stdReport());

        }
        System.out.println(javaCourse.courseReport());






    }
}