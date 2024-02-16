import java.util.ArrayList;

public class Course {
    private String courseName;
    //The following is the aggregation with 1-1 relationship
    //private Student studentList1; // 1 to 1 Relationship.

    //The following is the aggregation with 1-M relationship

    private ArrayList<Student> studentList2 = new ArrayList<>(); //1 to Many Relationship.

    public Course(){

    }



    public Course(String courseName, ArrayList<Student> studentList2) {
        this.setCourseName(courseName);
        this.setStudentList2(studentList2);
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Student> getStudentList2() {
        return studentList2;
    }

    public void setStudentList2(ArrayList<Student> studentList2) {
        this.studentList2 = studentList2;
    }

    public String courseReport(){
        //Local variables:
        double assignment1Total = 0;
        double assignment2Total = 0;
        for (Student currentStudent :this.studentList2) {
            assignment1Total += currentStudent.getAssignmentOne();
            assignment2Total += currentStudent.getAssignmentTwo();

        }
        double average = (assignment1Total + assignment2Total) / (2*this.studentList2.size());
        return String.format("The average of %s is %.2f",this.courseName,average);

    }


}
