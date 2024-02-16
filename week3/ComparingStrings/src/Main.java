import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Comparing Strings");
        Scanner sc = new Scanner(System.in);

        System.out.println("Are you a full time student or part time (Part/Full)? ");
        String stdEnrollment = sc.nextLine();
        String lowerCaseEnroll= stdEnrollment.toLowerCase();

//        if (stdEnrollment.equals("Full")){
//            System.out.println("Your annual tuition fees is $9000");
//        }
//        else
//            System.out.println("Your annual tuition fees is $1000");

//        if (lowerCaseEnroll.equals("full")){
//            System.out.println("Your annual tuition fees is $9000");
//        }
//        else
//            System.out.println("Your annual tuition fees is $1000");

        if (stdEnrollment.equalsIgnoreCase ("full")){
            System.out.println("Your annual tuition fees is $9000");
        }
        else
            System.out.println("Your annual tuition fees is $1000");


    }
}