public class Student extends Person {
    private int year;
    private double fees;

    /*
Students: Fees are calculated in the class constructor based on which year
they are a student. The
amount of fees goes up by $100 dollars depending on which year you are.
So first years pay $3000,
second years pay $3100, and so on.
A student pays fees in 2 installments, so you only invoice for half the
fee amount
     */

    public Student(String name, String address,int year) {
        super(name,address);
        this.setYear(year);


        if (this.getYear() == 1)
            this.setFees(3000);
        else if (this.getYear() == 2)
            this.setFees(3100);
        else if (this.getYear() == 3)
            this.setFees(3200);
        else if (this.getYear() == 4)
            this.setFees(3300);

        //this.fees = 2900 + year*100

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
    
}
