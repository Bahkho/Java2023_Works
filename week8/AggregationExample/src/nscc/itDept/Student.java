package nscc.itDept;

public class Student {
    private String stdWnumber;
    private String stdName;
    private double firstAssignment;
    private double secondAssignment;

    public Student(String stdWnumber, String stdName, double firstAssignment, double secondAssignment) {
        this.setStdWnumber(stdWnumber);
        this.setStdName(stdName);
        this.setFirstAssignment(firstAssignment);
        this.setSecondAssignment(secondAssignment);
    }


    public String getStdWnumber() {
        return stdWnumber;
    }

    public void setStdWnumber(String stdWnumber) {
        this.stdWnumber = stdWnumber;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public double getFirstAssignment() {
        return firstAssignment;
    }

    public void setFirstAssignment(double firstAssignment) {
        this.firstAssignment = firstAssignment;
    }

    public double getSecondAssignment() {
        return secondAssignment;
    }

    public void setSecondAssignment(double secondAssignment) {
        this.secondAssignment = secondAssignment;
    }

    public String stdReport(){
        double stdTotalMark = this.firstAssignment+this.secondAssignment;
        return String.format("%s get %.2f in assignment 1 and %.2f in assignment 2. The total mark is %.2f",
                this.stdName,this.firstAssignment,this.secondAssignment,stdTotalMark);

    }
}
