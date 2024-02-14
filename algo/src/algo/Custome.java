/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algo;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author boica
 */
public class Custome extends JFrame implements ActionListener {

    JPanel m1, p2, p3, p4;
    JLabel l1, l2, l4, l5;
    JTextField tf1, tf2, tf3, tf4;
    JButton b2, b1, b3;
    int inte = 0;
    int size;
    ArrayList<String> numbers = new ArrayList<>();
    String arr[];

    public Custome() {

        m1 = new JPanel(new GridLayout(3, 1));
        p2 = new JPanel(new FlowLayout());
        l2 = new JLabel("the key");
        tf2 = new JTextField();
        tf2.setPreferredSize(new Dimension(100, 30));
        p3 = new JPanel(new FlowLayout());
        l4 = new JLabel("The array");
        tf3 = new JTextField();
        tf3.setPreferredSize(new Dimension(300, 50));

        p4 = new JPanel(new FlowLayout());
        b1 = new JButton("Next");
        b2 = new JButton("Reset");
        b1.setPreferredSize(new Dimension(250, 40));
        b2.setPreferredSize(new Dimension(250, 40));
        b3 = new JButton("Submit");
        b3.setPreferredSize(new Dimension(200, 20));

        tf4 = new JTextField();
        tf4.setPreferredSize(new Dimension(300, 50));
        tf4.setEditable(false);
        l5 = new JLabel("                  ");

        p3.add(l4);
        p3.add(tf3);
        p3.add(l5);
        p3.add(tf4);
        p2.add(p3);
        p2.add(l2);
        p2.add(tf2);
        p2.add(b3);
        m1.add(p3);
        m1.add(p2);
        p4.add(b1);
        p4.add(b2);
        m1.add(p4);

        this.setLocationRelativeTo(null);

        this.add(m1);
        this.setVisible(true);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        b1.addActionListener(this);
        b1.setActionCommand("n");
        b2.addActionListener(this);
        b2.setActionCommand("R");
        b3.setActionCommand("S");
        b3.addActionListener(this);
        arr = new String[size];

    }

    public void Next() {

        String key = tf2.getText();
        String s2 = "";
        if (inte != -1) {

            if (key.equals(arr[inte])) {
                System.out.println(" found");
                s2 += arr[inte] + "✓";
                tf4.setText(tf4.getText() + s2);
                inte = -1;

            } else {
                s2 += arr[inte] + "✗";
                tf4.setText(tf4.getText() + s2);
                inte++;

            }
        }
    }

    public void takeInput() {
        String s1 = "";
        arr = tf3.getText().split(" ");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("S")) {
            takeInput();
        } else if (e.getActionCommand().equals("n")) {
            Next();

        }

    }

}
