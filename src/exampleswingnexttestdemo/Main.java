package exampleswingnexttestdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener{
    JLabel jLabel;

    Main(){
        JFrame jFrame = new JFrame("Example button");

        jFrame.setLayout(new FlowLayout());

        jFrame.setSize(220, 90);

        jFrame.setDefaultCloseOperation(3);

        JButton jButtonUp = new JButton("Up");
        JButton jButtonDown = new JButton("Down");

        jButtonUp.addActionListener(this);
        jButtonDown.addActionListener(this);

        jFrame.add(jButtonUp);
        jFrame.add(jButtonDown);

        jLabel = new JLabel("Putt the button");

        jFrame.add(jLabel);

        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand().equals("Up"))
        jLabel.setText("Putt button Up");
    else jLabel.setText("Putt button Down");
    }

    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}
