import javax.swing.*;

public class GuiClass {
    //Constructor:
    public GuiClass(){
        //I will create the main container, which is JFrame container:
        //I will create a new object of JFrame built-in class:
        JFrame mainFrame = new JFrame();
        //I will set the properties of the mainFrame object:
        mainFrame.setBounds(50,100,400,400);
        mainFrame.setTitle("Main Frame from GuiClass Class");
        mainFrame.setVisible(true);
        //I have to specify the layout manager:
        mainFrame.setLayout(null); // Absolute positioning:



        //I will add the required control objects:
        //A. JButton:
        JButton firstButton = new JButton("Click Me");
        firstButton.setBounds(100,50,100,30);
        mainFrame.add(firstButton);

        JButton secondButton = new JButton();
        secondButton.setText("Go To");
        secondButton.setBounds(100,90,100,30);
        mainFrame.add(secondButton);
    }
}
