
import javax.swing.*;
import java.awt.*;

/**
 * Define inner class DrawCanvas, which is a JPanel used for custom drawing.
 */
public class DrawCanvas extends JPanel {
    // Override paintComponent to perform your own painting
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);     // paint parent's background
        setBackground(Color.BLACK);  // set background color for this JPanel

        // Your custom painting codes. For example,
        // Drawing primitive shapes
        g.setColor(Color.YELLOW);    // set the drawing color
        g.drawLine(30, 40, 100, 200);
        g.drawOval(150, 180, 10, 10);
        g.drawRect(200, 210, 20, 30);
        g.setColor(Color.RED);       // change the drawing color
        g.fillOval(300, 310, 30, 50);
        g.fillRect(400, 350, 60, 50);
        // Printing texts
        g.setColor(Color.WHITE);
        g.setFont(new Font("Monospaced", Font.PLAIN, 12));
        g.drawString("Testing custom drawing ...", 10, 20);
    }
}
