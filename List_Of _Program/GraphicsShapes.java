// Q62: Draw rectangle, oval and line

import javax.swing.*;
import java.awt.*;

class GraphicsShapes extends JPanel {

    public void paint(Graphics g) {

        g.drawRect(50, 50, 100, 50); // rectangle
        g.drawOval(50, 120, 100, 50); // oval
        g.drawLine(50, 200, 150, 200); // line
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new GraphicsShapes());
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
