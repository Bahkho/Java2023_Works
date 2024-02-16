import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the first GUI App-Using JOOptionPane");
        //1. ShowMessageDialog:-Information_Message
        JOptionPane.showMessageDialog(null,//Parent
                "Welcome to NSCC",//Message
                "NSCC Open House",//Title
                JOptionPane.INFORMATION_MESSAGE);//optionType
//        JOptionPane.showMessageDialog(null,//Parent
//                "Welcome to NSCC",//Message
//                "NSCC Open House",//Title
//                JOptionPane.WARNING_MESSAGE);//optionType
//        JOptionPane.showMessageDialog(null,//Parent
//                "Welcome to NSCC",//Message
//                "NSCC Open House",//Title
//                JOptionPane.QUESTION_MESSAGE);//optionType
//        JOptionPane.showMessageDialog(null,//Parent
//                "Welcome to NSCC",//Message
//                "NSCC Open House",//Title
//                JOptionPane.ERROR_MESSAGE);//optionType

        //2. ConfirmDialog
        int x = JOptionPane.showConfirmDialog(null,
                "Do you like your current program?",
                "NSCC Open House",
                JOptionPane.YES_NO_OPTION);
//        System.out.println(x);
        if(x==0){
            System.out.println("You like your program ");
            JOptionPane.showMessageDialog(null,
                    "ok Thank you and bye!",
                    "Welcome to NSCC",
                JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            System.out.println("ok, let's discuss your options:");
            //3. ShowInputDialog
            String name = JOptionPane.showInputDialog("What's your name: ");
            System.out.println("Welcome, "+name);
//          String budget = JOptionPane.showInputDialog("What's your budget: ");
            int budget = Integer.parseInt(JOptionPane.showInputDialog("What's your budget: "));
            double expectedInstallmet = 0.25 * budget;
            System.out.println("Your expected payment is: $"+expectedInstallmet);
        //4. OptionDialog
            Object[] thePrograms = {"IT-Programming","IT-Web","IT-DAs","Nursing"};
        int selection = JOptionPane.showOptionDialog(null,
                "Which program do you like?",
                "NSCC Open House",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                thePrograms,
                thePrograms[1]);
            System.out.println("You like: "+thePrograms[selection]);
        }



    }
}