import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Assignment1 Partial Solution!");
        //Declaration Part:
        Scanner sc = new Scanner(System.in);
        String name;
        double assignment1,assignment2;
        Course[] courses = new Course[2];
        Student[] javaStudents = new Student[6]; //Array of Student objects
        Student[] pythonStudents = new Student[6]; //Array of Student objects
        double totalAssignment1=0,totalAssignment2=0;

        double assignment1Average;
        double assignment2Average;

        /*
        Programming IT Courses
        COURSE ENTRY
        ================================
        Enter name for course # 1:
        Java Programming
        Enter name for course # 2:
        Python Programming
         */
        System.out.println("Programming IT Courses");
        System.out.println("Course Entry");
        printTheLine();
        for (int i = 0; i < courses.length; i++) {
            System.out.println(String.format("Enter name for course # %d:",i+1));
            courses[i] = new Course(sc.nextLine());
        }

        /*
        Enter students for Java Programming:
        Enter name for student # 1:
        Randy McDonald
        Enter Assignment1 mark for Randy David:
        70
        Enter Assignment2 mark for Randy David:
        80
         */

        System.out.println("Enter students for Java Programming: ");
        for (int i = 0; i < javaStudents.length; i++) {
            System.out.println(String.format("Enter name for student # %d:",i+1));
            name = sc.nextLine();
            System.out.println(String.format("Enter Assignment1 mark for %S:",
                    name));
            assignment1 = sc.nextDouble();
            System.out.println(String.format("Enter Assignment2 mark for %S:",
                    name));
            assignment2 = sc.nextDouble();
            sc.nextLine();
            javaStudents[i] = new Student(name,assignment1,assignment2);
            //Calculating the total mark of assignment1 for all of the 6 students:
            totalAssignment1 += assignment1;
            //Calculating the total mark of assignment2 for all of the 6 students:
            totalAssignment2 += assignment2;
        }
        assignment1Average = totalAssignment1/6;
        assignment2Average = totalAssignment2/6;
        courses[0].assign1Average = assignment1Average;
        courses[0].assign2Average = assignment2Average;
        courses[0].coursesAverage = (assignment1Average + assignment2Average)/2;
        /*
        REPORT: Stats per Course
        ================================
        Java Programming : Assignment1 – 70 Assignment2 – 80 Average - 75
        Course Rating: C
         */
        System.out.println("REPORT: Stats per Course");
        printTheLine();
        System.out.println(courses[0].coursesReport());


        /*
        REPORT: Stats per student
        ================================
         */
        System.out.println("REPORT: Stats per student");
        printTheLine();
        System.out.println(courses[0].coursesName);
        for (int i = 0; i < javaStudents.length; i++) {
            System.out.println(javaStudents[i].stdReport());

        }

    }
    //The other methods in the scope of Main Class.
    public static void printTheLine(){
        System.out.println("=".repeat(40));
    }

}