public class Student {
    private String stdName;
    private double assignmentOne;
    private double assignmentTwo;



    public Student(String stdName, double assignmentOne, double assignmentTwo) {
        this.setStdName(stdName);
        this.setAssignmentOne(assignmentOne);
        this.setAssignmentTwo(assignmentTwo);
    }


    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public double getAssignmentOne() {
        return assignmentOne;
    }

    public void setAssignmentOne(double assignmentOne) {
        this.assignmentOne = assignmentOne;
    }

    public double getAssignmentTwo() {
        return assignmentTwo;
    }

    public void setAssignmentTwo(double assignmentTwo) {
        this.assignmentTwo = assignmentTwo;
    }

    public String stdReport(){
        double stdTotal = this.getAssignmentOne() + this.getAssignmentTwo();
        return String.format("%s got %.2f in assignment one, and %.2f in assignment 2. The total is: %.2f",
                this.getStdName(),this.getAssignmentOne(),this.assignmentTwo,stdTotal);
    }
}
