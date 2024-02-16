import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Friend> guestList = new ArrayList<>();

        JOptionPane.showMessageDialog(null,
                """
                Welcome to the Party Picker.

                Enter the names of potential guests, the food they usually bring, and whether they're invited.""",
                "Message",
                JOptionPane.INFORMATION_MESSAGE);

        boolean continueEntering = true;
        while (continueEntering) {
            String firstName = JOptionPane.showInputDialog("Enter first name");
            String lastName = JOptionPane.showInputDialog("Enter last name");
            String foodToBring = JOptionPane.showInputDialog("Enter the food they usually bring");
            int response = JOptionPane.showConfirmDialog(null, "Choose if this guest is invited or NOT", "Party Picker", JOptionPane.YES_NO_OPTION);

            boolean isInvited = (response == JOptionPane.YES_OPTION);
            Friend guest = new Friend(firstName, lastName, isInvited, foodToBring);
            guestList.add(guest);

            response = JOptionPane.showConfirmDialog(null, "Enter another guest?", "Party Picker?", JOptionPane.YES_NO_OPTION);
            continueEntering = (response == JOptionPane.YES_OPTION);
        }

        String report = "Guests:\n\n";
        for (Friend guest : guestList) {
            report += guest + "\n";
        }

        JOptionPane.showMessageDialog(null, report.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
