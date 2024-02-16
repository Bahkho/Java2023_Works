import javax.swing.*;
import classes.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIClass1 extends JFrame {


    public GUIClass1(){
        setTitle("GUI Shape App");
        setVisible(true);
        setBounds(10,10,400,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);//Absolute positioning

        //Create shape objects:
        Circle myCircle = new Circle("Circle","Red",100);

        //Control Objects:

        //JLabel
        JLabel radiusLabel = new JLabel("Radius value:");
        radiusLabel.setBounds(50,100,200,30);
        add(radiusLabel);

        //JTextField:
        JTextField radiusValue = new JTextField();
        radiusValue.setBounds(260,100,100,30);
        String radius = Double.toString(myCircle.getRadius());
        radiusValue.setText(radius);
        add(radiusValue);

        //JRadioButton:
        JRadioButton circleAreaRdoBtn = new JRadioButton("Circle Area");
        circleAreaRdoBtn.setBounds(50,150,200,30);
        add(circleAreaRdoBtn);

        JTextField circleAreaText = new JTextField();
        circleAreaText.setBounds(250,150,100,30);
        add(circleAreaText);

        //Anonymous calculations:
        JTextField squareSizeText = new JTextField();
        squareSizeText.setBounds(50,200,100,30);
        squareSizeText.setText("20");
        add(squareSizeText);

        JTextField squareArea = new JTextField();
        squareArea.setBounds(160,200,100,30);
        add(squareArea);


        JButton CalculateArea = new JButton("Calculate Area");
        CalculateArea.setBounds(50,300,100,30);
        add(CalculateArea);


        JButton clearBtn = new JButton("Clear");
        clearBtn.setBounds(50,400,100,30);
        add(clearBtn);

        //ActionListeners:
        circleAreaRdoBtn.addActionListener(new ActionListener() {//Anonymous Class(Class without name)
            @Override
            public void actionPerformed(ActionEvent e) {
                String area = String.format("%.2f", myCircle.getArea());
//                circleAreaText.setText(Double.toString(myCircle.getArea()));
                circleAreaText.setText(area);


            }
        });

        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String area = String.format("%.2f", myCircle.getArea());
//                circleAreaText.setText(Double.toString(myCircle.getArea()));
                circleAreaText.setText("");
                radiusValue.setText("");


            }
        });

        CalculateArea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sqArea = Double.parseDouble(squareSizeText.getText()) * Double.parseDouble(squareSizeText.getText());
                squareArea.setText(Double.toString(sqArea));


            }
        });
    }
}
