/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author werner
 */

public class SimpleGui1 extends JFrame implements ActionListener{
   JButton yuan;
   public static void main (String[] args) {
       
      SimpleGui1 serap = new SimpleGui1();
      serap.go();
   } // end of main
   
   public void go() {
      yuan = new JButton("click me");
      yuan.addActionListener(this);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.getContentPane().add(yuan);
      this.setSize(300,300);
      this.setVisible(true);
   } // end of main

    @Override
    public void actionPerformed(ActionEvent e) {
        yuan.setText("Hi, Yuan was clicked!");
    }
} // end of SimpleGui1
    
