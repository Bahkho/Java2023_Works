package GUI;

import Classes.Circle;
import Classes.Rectangle;
import Classes.ShapeColor;
import Classes.Triangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends JFrame {

    private static Circle theCircle;

    public MainFrame() {    //Constructor

        //Set Frame Properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 750, 750);
        setTitle("Shapetastic!");
        setLayout(new CardLayout());

        //Create "default" shapes
        theCircle = new Circle(null, 19);

        //Add Panel "screens"
        ChoosePanel chooseScreen = new ChoosePanel();
        DisplayPanel displayScreen = new DisplayPanel();

        JButton myChangePageButton = chooseScreen.getDisplayBtn();
        myChangePageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                chooseScreen.setVisible(false);
                displayScreen.setVisible(true); }
        });

        add(chooseScreen);
        add(displayScreen);

    }

    public static Circle getTheCircle() {
        return theCircle;
    }
}
