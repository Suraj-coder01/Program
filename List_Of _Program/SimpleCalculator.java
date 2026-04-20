// Q60: Simple calculator using JTextField and buttons

import javax.swing.*;
import java.awt.event.*;

class SimpleCalculator {

    public static void main(String[] args) {

        JFrame f = new JFrame("Calculator");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField result = new JTextField();

        JButton add = new JButton("+");

        // positions
        t1.setBounds(50, 50, 100, 30);
        t2.setBounds(50, 100, 100, 30);
        add.setBounds(50, 150, 50, 30);
        result.setBounds(50, 200, 100, 30);

        // event handling
        add.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText()); // get input
            int b = Integer.parseInt(t2.getText());
            result.setText(String.valueOf(a + b)); // display result
        });

        f.add(t1); f.add(t2); f.add(add); f.add(result);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}