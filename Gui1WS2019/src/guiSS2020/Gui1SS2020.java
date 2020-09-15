/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiSS2020;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author werner.burkard
 */
public class Gui1SS2020 {

    JLabel hanna, hasan;
    int leftCounter;
    int rightCounter;
    JButton cem, florian;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gui1SS2020 annika = new Gui1SS2020();
        annika.go();
    } // end of main

    // kernel method of our Gui1SS2020- Object
    public void go() {
        JFrame batuhan = new JFrame();
        
        int test = Integer.parseInt("hallo");

        batuhan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cem = new JButton("Clickcounter left");
        florian = new JButton("Clickcounter right");
        hanna = new JLabel("Clicks left side: 0");
        hasan = new JLabel("Clicks right side: 0");
        batuhan.getContentPane().add(BorderLayout.SOUTH, cem);
        batuhan.getContentPane().add(BorderLayout.NORTH, florian);
        batuhan.getContentPane().add(BorderLayout.WEST, hanna);
        batuhan.getContentPane().add(BorderLayout.EAST, hasan);
        batuhan.setSize(400, 400);
        cem.addActionListener(new SouthListener());
        NorthListener yuan = new NorthListener();
        florian.addActionListener(yuan);
        batuhan.setVisible(true);
    }

    // Building of the inner classes for the listeners
    class SouthListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String updatedText;
            updatedText = "Clicks left side: " + ++leftCounter;
            hanna.setText(updatedText);
        }
    } // end of SouthListener

    class NorthListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String updatedText;
            updatedText = "Clicks right side: " + ++rightCounter;
            hasan.setText(updatedText);
        }
    } // end of NorthListener

} // end of SimpleGui1    

