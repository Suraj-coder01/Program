// Q66: Use MouseAdapter to handle mouseClicked

import javax.swing.*;
import java.awt.event.*;

class MouseAdapterDemo extends JFrame {

    MouseAdapterDemo() {

        addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked at: " + e.getX() + "," + e.getY());
            }
        });

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseAdapterDemo();
    }
}