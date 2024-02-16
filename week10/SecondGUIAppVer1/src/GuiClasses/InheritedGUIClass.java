package GuiClasses;

import javax.swing.*;
import java.awt.*;

//For the ActionListeners:
//import java.awt.event.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InheritedGUIClass extends JFrame {

    //I will create the constructor:

    public InheritedGUIClass(){
        //JFrame attributes:
        setTitle("Second Gui App");
        //setVisible(true);
        setBounds(10,10,400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Declare the parent panel (contentPane):
        JPanel parentPanel = new JPanel();
        setContentPane(parentPanel); //this.contentPane = parentPanel;
        //I will set the layout of the parentPanel to be cardlayout:
        parentPanel.setLayout(new CardLayout(0,0));

        JPanel firstPanel = new JPanel();
        //------------------------------------------------------------------------//
        firstPanel.setLayout(null); //absolute positioning
        parentPanel.add(firstPanel);
        firstPanel.setBackground(Color.GREEN);
        //The first JPanel control object:
        JLabel labelOne = new JLabel("In the first Panel");
        labelOne.setBounds(100,100,200,30);
        firstPanel.add(labelOne);

        JButton firstBtn = new JButton("Go To Panel 2");
        firstBtn.setBounds(100,140,200,30);
        firstPanel.add(firstBtn);



        JPanel secondPanel = new JPanel();
        //------------------------------------------------------------------------//
        secondPanel.setLayout(null); //absolute positioning
        parentPanel.add(secondPanel);
        secondPanel.setBackground(Color.PINK);

        //The second JPanel control object:
        JLabel labelTwo = new JLabel("In the second Panel");
        labelTwo.setBounds(100,100,200,30);
        secondPanel.add(labelTwo);

        JButton secondBtn = new JButton("Go To Panel 1");
        secondBtn.setBounds(100,140,200,30);
        secondPanel.add(secondBtn);

        JLabel imageLabel = new JLabel();
        imageLabel.setBounds(100,180,350,350);
        imageLabel.setIcon(new ImageIcon(getClass().getResource("/Images/smiley3.jpg")));

        secondPanel.add(imageLabel);


        //ActionListeners:  ---------------------------------------------------//
        firstBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                firstPanel.setVisible(false);
                secondPanel.setVisible(true);
            } });

        secondBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                firstPanel.setVisible(true);
                secondPanel.setVisible(false);
            } });






    }


}
