/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstGUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author werner.burkard
 */
public class FirstGUI_Tests implements ActionListener {

    /**
     * @param args the command line arguments
     */
    int numberOfClicks = 0;

    public static void main(String[] args) {
        new FirstGUI_Tests().los();
    }

    private void los() {
        System.out.print("starting the app ...");
        JFrame ourFrame = new JFrame("Experiments with our first GUI");
        JButton clicky = new JButton("click me, my friend!");
        JButton toppy = new JButton("top");
        JButton botty = new JButton("bottom");
        JButton righty = new JButton("right");
        JButton lefty = new JButton("left");
        ourFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        doNiceShutdown(ourFrame);
        clicky.addActionListener(this);
        ourFrame.getContentPane().add(BorderLayout.CENTER, clicky);
        ourFrame.getContentPane().add(BorderLayout.NORTH, toppy);
        ourFrame.getContentPane().add(BorderLayout.SOUTH, botty);
        ourFrame.getContentPane().add(BorderLayout.WEST, lefty);
        ourFrame.getContentPane().add(BorderLayout.EAST, righty);
        ourFrame.setSize(600, 300);
        ourFrame.setLocationRelativeTo(null);  // centers the window on the screen
        ourFrame.setVisible(true);
        JOptionPane.showMessageDialog(ourFrame,
                "...App is now running...",
                "do you see it?",
                JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton theThrower;  // we must know, who throwed the event to change its banner text
        String howOften = " ";

        theThrower = (JButton) e.getSource(); // who was it that has thrown the event?
        switch (++numberOfClicks) {
            case 0:
                howOften = "never";
                break;
            case 1:
                howOften = "once";
                break;
            case 2:
                howOften = "twice";
                break;
            default:
                howOften = numberOfClicks + " times";
                break;
        }
        theThrower.setText("you clicked me " + howOften);
    }

    public void doNiceShutdown(JFrame theAppWindow) {
        theAppWindow.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(theAppWindow,
                        "Are you sure you want to close this great app?", "Really close Window?",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    System.out.println(" finished!");
                    System.exit(0);
                }
            }
        });
    }
}
