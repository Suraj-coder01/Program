// Q59: Display mouse coordinates on click

import javax.swing.*;
import java.awt.event.*;

class MouseClickCoordinates extends JFrame {

    MouseClickCoordinates() {

        addMouseListener(new MouseAdapter() {

            // only mouseClicked used (efficient)
            public void mouseClicked(MouseEvent e) {
                System.out.println("X: " + e.getX() + " Y: " + e.getY());
            }
        });

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseClickCoordinates();
    }
}
