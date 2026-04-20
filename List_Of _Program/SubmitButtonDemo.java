// Q58: Create a Swing app with button "Submit". On click show message using JLabel

import javax.swing.*;
import java.awt.event.*;

class SubmitButtonDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("Submit Demo"); // frame
        JButton btn = new JButton("Submit"); // button
        JLabel label = new JLabel(); // label to display message

        // set positions
        btn.setBounds(100, 50, 100, 30);
        label.setBounds(100, 100, 200, 30);

        // action listener handles button click
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!"); // display message
            }
        });

        f.add(btn);
        f.add(label);

        f.setSize(300, 200);
        f.setLayout(null); // manual layout
        f.setVisible(true);
    }
}