import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InheritedGuiClass extends JFrame {
    //Constructor:
    public InheritedGuiClass(){
        //I will create the main container, which is JFrame container:
        //I will create a new object of JFrame built-in class:
        //JFrame mainFrame = new JFrame();--------------
        //I will set the properties of the mainFrame object:
        setBounds(50,100,400,400);
        setTitle("Main Frame from Inherited Gui Class");
        setVisible(true);
        //I have to specify the layout manager:
        setLayout(null); // Absolute positioning:



        //I will add the required control objects:
        //A. JButton:
        JButton firstButton = new JButton("Click Me");
        firstButton.setBounds(100,50,100,30);
        add(firstButton);

        JButton secondButton = new JButton();
        secondButton.setText("Go To");
        secondButton.setBounds(100,90,100,30);
        add(secondButton);

        //B. JLabel:
        JLabel addressLabel = new JLabel();
        addressLabel.setText("City: ");
        addressLabel.setBounds(100,130,100,30);
        add(addressLabel);

        //C. JTextField:
        JTextField addressTextField  = new JTextField();
        //
        addressTextField.setText("Halifax");
        addressTextField.setBounds(210,130,100,30);
        add(addressTextField);

        //D. JradioButton

        JRadioButton fullTimeRdo = new JRadioButton("Full Time");
        fullTimeRdo.setBounds(100,180,100,30);
        add(fullTimeRdo);

        JRadioButton partTimeRdo = new JRadioButton("Part Time");
        partTimeRdo.setBounds(100,220,100,30);
        add(partTimeRdo);

        //In order to let the radio buttons toggle perfectly, we have to
        // add them to a radio group button.
        ButtonGroup enrollmentGroupButton = new ButtonGroup();
        enrollmentGroupButton.add(partTimeRdo);
        enrollmentGroupButton.add(fullTimeRdo);

        //JTextField:
        JTextField fullPartTime = new JTextField();
        fullPartTime.setBounds(210,200,100,30);
        add(fullPartTime);


        //ActionListeners Methods:
        firstButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                addressTextField.setText("Empty");
            }
        });

        fullTimeRdo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                fullPartTime.setText("Full Time");
            }
        });

        partTimeRdo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                fullPartTime.setText("Part Time");
            }
        });



    }
}
