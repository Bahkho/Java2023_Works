package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //new MySecondGUIClass();
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MySecondGUIClass frame = new MySecondGUIClass();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });




    }
}
