// Q67: Design form using BorderLayout, FlowLayout, GridLayout
// Also explain differences

import javax.swing.*;
import java.awt.*;

class LayoutDemo {

    public static void main(String[] args) {

        JFrame f = new JFrame("Layout Demo");

        // BorderLayout (default for JFrame)
        f.setLayout(new BorderLayout());

        // Top (FlowLayout - default for JPanel)
        JPanel topPanel = new JPanel(); // FlowLayout used here
        topPanel.add(new JButton("Top 1"));
        topPanel.add(new JButton("Top 2"));

        // Center (GridLayout)
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 2)); // 2x2 grid

        centerPanel.add(new JButton("C1"));
        centerPanel.add(new JButton("C2"));
        centerPanel.add(new JButton("C3"));
        centerPanel.add(new JButton("C4"));

        // adding to frame
        f.add(topPanel, BorderLayout.NORTH);
        f.add(centerPanel, BorderLayout.CENTER);
        f.add(new JButton("Bottom"), BorderLayout.SOUTH);

        f.setSize(400, 300);
        f.setVisible(true);
    }
}
