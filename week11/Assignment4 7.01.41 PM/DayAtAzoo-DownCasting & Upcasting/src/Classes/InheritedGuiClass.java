package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InheritedGuiClass extends JFrame {
    //I will simulate the same approach in 2ndGuiApp
    //Constructor:
    public InheritedGuiClass(){

        //I will create 3 objects of Cat,Lion,Dog:
        Lion myLion = new Lion("Lion",600,"Jungle",true,60);
        //Cat
        //Dog
        setTitle("Second GUI App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setBounds(10,10,500,600);

        Font fontName = new Font("Courier", Font.BOLD, 20);



        //I will create the parent JPanel:
        //JPanel is the object that contains the control objects like (JButton, JLabel , ... , etc)
        JPanel parentPanel = new JPanel();
        //I will assign the parent panel to the content pane attribute of the JFrame:
        setContentPane(parentPanel); //this.contentPane = parentPanel;
        parentPanel.setLayout(new CardLayout(10,10));

        //Now, I will create the children of the parentPanel:
        //The first child: ------------------------------------------------------------//
        JPanel firstPanel = new JPanel();
        firstPanel.setLayout(null);
        parentPanel.add(firstPanel);
        firstPanel.setBackground(Color.MAGENTA);

        //I will add the control objects in firstPanel:
        JLabel firstLabel = new JLabel("Inside the first panel.");
        firstLabel.setBounds(50,100,200,30);
        firstPanel.add(firstLabel);

        JButton firstBtn = new JButton("Go To Panel Two");
        firstBtn.setBounds(50,200,200,30);
        firstPanel.add(firstBtn);

        //You need to declare a 3 radioButtons:
        //You will add actionListeners for each of them. See the firstBtn actionListener below:


        // The second child: ------------------------------------------------------//
        JPanel secondPanel = new JPanel();
        secondPanel.setLayout(null);
        parentPanel.add(secondPanel);
        secondPanel.setBackground(Color.cyan);

        //I will add the required control objects:
        JLabel secondLabel = new JLabel("Inside the second panel.");
        secondLabel.setBounds(50,100,200,30);
        secondPanel.add(secondLabel);

        JButton secondBtn = new JButton("Go To Panel One");
        secondBtn.setBounds(50,150,200,30);
        secondPanel.add(secondBtn);

        JLabel imageLabel = new JLabel();
        imageLabel.setBounds(50,200,350,350);
        secondPanel.add(imageLabel);
        //imageLabel.setIcon(new ImageIcon(getClass().getResource("/Images/cat.jpg")));

        JTextField speciesTxt = new JTextField();
        speciesTxt.setBounds(150,200,200,30);
        speciesTxt.setFont(fontName);
        secondPanel.add(speciesTxt);




        //ActionListeners: ----------------------------------------------------------//
        firstBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                firstPanel.setVisible(false);
                secondPanel.setVisible(true);
                speciesTxt.setText(myLion.getSpecies());
                //textAreaReport.setText(myLion.toString());

                imageLabel.setIcon(new ImageIcon(getClass().getResource("/Classes/Images/lion.jpg")));
                //I will do the math related to the amount of food:
                double amountOfFood = 0.15 * myLion.getMaxWeight();
                speciesTxt.setText(String.format("%.2flb",amountOfFood));


            }
        });

        secondBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                firstPanel.setVisible(true);
                secondPanel.setVisible(false);

            }
        });


    }
}
