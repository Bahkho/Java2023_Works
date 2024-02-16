public class Staff extends Person{
    private int yearsOfExperience;
    private double annualSalary;

    /*
Staff: Salary is calculated from a base pay of $50,000. Staff are paid step increases of
$500 for each full year of service.
Staff get paid every 2 weeks (bi-weekly) so the result of running the accounting process
should be to pay the yearly salary divided by 26
     */

    public Staff(String name, String address, int yearsOfExperience) {
        super(name, address);
        this.setYearsOfExperience(yearsOfExperience);
        this.setAnnualSalary(50000 + yearsOfExperience * 500);
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
}
