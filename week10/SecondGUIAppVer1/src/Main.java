import GuiClasses.InheritedGUIClass;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Second GUI App");

        //new InheritedGUIClass();

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    InheritedGUIClass mainFrame = new InheritedGUIClass();
                    mainFrame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


    }
}