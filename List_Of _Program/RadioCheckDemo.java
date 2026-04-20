// Q64: Gender (RadioButton) + Hobbies (CheckBox)

import javax.swing.*;
import java.awt.event.*;

class RadioCheckDemo {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup(); // only one select
        bg.add(male); bg.add(female);

        JCheckBox c1 = new JCheckBox("Reading");
        JCheckBox c2 = new JCheckBox("Gaming");

        JButton btn = new JButton("Show");

        male.setBounds(50, 50, 100, 30);
        female.setBounds(150, 50, 100, 30);
        c1.setBounds(50, 100, 100, 30);
        c2.setBounds(150, 100, 100, 30);
        btn.setBounds(100, 150, 100, 30);

        btn.addActionListener(e -> {
            String msg = "";

            if (male.isSelected()) msg += "Male ";
            if (female.isSelected()) msg += "Female ";
            if (c1.isSelected()) msg += "Reading ";
            if (c2.isSelected()) msg += "Gaming ";

            JOptionPane.showMessageDialog(f, msg);
        });

        f.add(male); f.add(female); f.add(c1); f.add(c2); f.add(btn);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}