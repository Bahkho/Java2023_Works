package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MySecondGUIClass extends JFrame {

    //Constructor
    public MySecondGUIClass(){
        this.setTitle("My Second GUI Application");
        this.setBounds(150,150,700,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setVisible(true);

        //Set up the JPanel for this frame(MySecondGUIClass)

        //contentPane is the parent JPanel
        JPanel contentPane = new JPanel();
        //contentPane.setBorder(new EmptyBorder(50,10,50,10));
        this.setContentPane(contentPane); // this.contentPane = contentPane
        //Setting the Parent layout
        contentPane.setLayout(new CardLayout(10,10)); //For the parent layout

        //First Panel
        JPanel panelOne = new JPanel();
        panelOne.setBackground(Color.red);
        panelOne.setLayout(null);//Absolute positioning
        contentPane.add(panelOne);

        // Adding Control Objects for the first panel ( panelOne)
        JLabel labelOne = new JLabel("In The First Panel (PanelOne)");
        labelOne.setBounds(50,100,200,30);
        panelOne.add(labelOne);

        JButton buttonOne = new JButton("Go To Panel 2");
        buttonOne.setBounds(50,140,200,30);
        panelOne.add(buttonOne);

        JLabel imageLabel = new JLabel();
        imageLabel.setBounds(50,180,300,300);
        imageLabel.setIcon(new ImageIcon(getClass().getResource("/Images/smiley3.jpg")));

        panelOne.add(imageLabel);

        //=========================================================================//


        //Second Panel
        JPanel panelTwo = new JPanel();
        panelTwo.setBackground(Color.blue);
        panelTwo.setLayout(null);
        contentPane.add(panelTwo);

        // Adding Control Objects for the first panel ( panelOne)
        JLabel labelTwo = new JLabel("In The Second Panel (PanelTwo)");
        labelTwo.setBounds(50,100,200,30);
        panelTwo.add(labelTwo);

        JButton buttonTwo = new JButton("Go To Panel 1");
        buttonTwo.setBounds(50,140,200,30);
        panelTwo.add(buttonTwo);


        // ======== Action Listeners ==================================//

        buttonOne.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                // I want to set the panel one to be invisible
                //Set PanelTwo to be visible
                panelTwo.setVisible(true);
                panelOne.setVisible(false);
            }
        });

        buttonTwo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                // I want to set the panel one to be invisible
                //Set PanelTwo to be visible
                panelTwo.setVisible(false);
                panelOne.setVisible(true);
            }
        });




    }




}
