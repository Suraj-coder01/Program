// Q61: Login form with validation

import javax.swing.*;
import java.awt.event.*;

class LoginForm {

    public static void main(String[] args) {

        JFrame f = new JFrame("Login");

        JTextField user = new JTextField();
        JPasswordField pass = new JPasswordField();
        JButton login = new JButton("Login");

        user.setBounds(50, 50, 150, 30);
        pass.setBounds(50, 100, 150, 30);
        login.setBounds(50, 150, 100, 30);

        login.addActionListener(e -> {
            String u = user.getText();
            String p = new String(pass.getPassword());

            // validation
            if (u.equals("admin") && p.equals("1234")) {
                JOptionPane.showMessageDialog(f, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(f, "Invalid Credentials");
            }
        });

        f.add(user); f.add(pass); f.add(login);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
