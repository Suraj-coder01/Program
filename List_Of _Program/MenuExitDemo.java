// Q63: Menu bar with Exit and confirmation dialog

import javax.swing.*;
import java.awt.event.*;

class MenuExitDemo {

    public static void main(String[] args) {

        JFrame f = new JFrame("Menu Demo");

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem exit = new JMenuItem("Exit");

        exit.addActionListener(e -> {
            int res = JOptionPane.showConfirmDialog(f, "Exit?");
            if (res == 0) System.exit(0); // exit if yes
        });

        file.add(exit);
        mb.add(file);
        f.setJMenuBar(mb);

        f.setSize(300, 200);
        f.setVisible(true);
    }
}