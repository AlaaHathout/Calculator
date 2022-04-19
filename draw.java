package calculator_task;

import javax.swing.*;
import java.awt.*;

public class draw extends JPanel{
    public draw(){
        this.setLayout(null);
        JTextField t1 = new JTextField();
        t1.setForeground(Color.RED);
        t1.setBounds(30, 10, 341, 40);
        this.add(t1);
        
        JButton b1 = new JButton("C");
        b1.setForeground(Color.RED);
        b1.setBackground(Color.WHITE);
        b1.setBounds(30, 70, 70, 50);
        this.add(b1);
        
        JButton b2 = new JButton("%");
        b2.setForeground(Color.RED);
        b2.setBackground(Color.WHITE);
        b2.setBounds(120, 70, 70, 50);
        this.add(b2);
        
        JButton b3 = new JButton("Delete");
        b3.setForeground(Color.RED);
        b3.setBackground(Color.WHITE);
        b3.setBounds(210, 70, 70, 50);
        this.add(b3);
        
        JButton b4 = new JButton("/");
        b4.setForeground(Color.RED);
        b4.setBackground(Color.WHITE);
        b4.setBounds(300, 70, 70, 50);
        this.add(b4);
        
        JButton b5 = new JButton("7");
        b5.setForeground(Color.BLACK);
        b5.setBackground(Color.WHITE);
        b5.setBounds(30, 140, 70, 50);
        this.add(b5);
        
        JButton b6 = new JButton("8");
        b6.setForeground(Color.BLACK);
        b6.setBackground(Color.WHITE);
        b6.setBounds(120, 140, 70, 50);
        this.add(b6);
        
        JButton b7 = new JButton("9");
        b7.setForeground(Color.BLACK);
        b7.setBackground(Color.WHITE);
        b7.setBounds(210, 140, 70, 50);
        this.add(b7);
        
        JButton b8 = new JButton("*");
        b8.setForeground(Color.RED);
        b8.setBackground(Color.WHITE);
        b8.setBounds(300, 140, 70, 50);
        this.add(b8);
        
        
        JButton b9 = new JButton("4");
        b9.setForeground(Color.BLACK);
        b9.setBackground(Color.WHITE);
        b9.setBounds(30, 210, 70, 50);
        this.add(b9);
        
        JButton b10 = new JButton("5");
        b10.setForeground(Color.BLACK);
        b10.setBackground(Color.WHITE);
        b10.setBounds(120, 210, 70, 50);
        this.add(b10);
        
        JButton b11 = new JButton("6");
        b11.setForeground(Color.BLACK);
        b11.setBackground(Color.WHITE);
        b11.setBounds(210, 210, 70, 50);
        this.add(b11);
        
        JButton b12 = new JButton("-");
        b12.setForeground(Color.RED);
        b12.setBackground(Color.WHITE);
        b12.setBounds(300, 210, 70, 50);
        this.add(b12);
        
        
        JButton b13 = new JButton("1");
        b13.setForeground(Color.BLACK);
        b13.setBackground(Color.WHITE);
        b13.setBounds(30, 280, 70, 50);
        this.add(b13);
        
        JButton b14 = new JButton("2");
        b14.setForeground(Color.BLACK);
        b14.setBackground(Color.WHITE);
        b14.setBounds(120, 280, 70, 50);
        this.add(b14);
        
        JButton b15 = new JButton("3");
        b15.setForeground(Color.BLACK);
        b15.setBackground(Color.WHITE);
        b15.setBounds(210, 280, 70, 50);
        this.add(b15);
        
        JButton b16 = new JButton("+");
        b16.setForeground(Color.RED);
        b16.setBackground(Color.WHITE);
        b16.setBounds(300, 280, 70, 50);
        this.add(b16);
        
        JButton b17 = new JButton("00");
        b17.setForeground(Color.BLACK);
        b17.setBackground(Color.WHITE);
        b17.setBounds(30, 350, 70, 50);
        this.add(b17);
        
        JButton b18 = new JButton("0");
        b18.setForeground(Color.BLACK);
        b18.setBackground(Color.WHITE);
        b18.setBounds(120, 350, 70, 50);
        this.add(b18);
        
        JButton b19 = new JButton(".");
        b19.setForeground(Color.BLACK);
        b19.setBackground(Color.WHITE);
        b19.setBounds(210, 350, 70, 50);
        this.add(b19);
        
        JButton b20 = new JButton("=");
        b20.setForeground(Color.RED);
        b20.setBackground(Color.WHITE);
        b20.setBounds(300, 350, 70, 50);
        this.add(b20);
        
        
        JButton b21 = new JButton("Sin");
        b21.setForeground(Color.RED);
        b21.setBackground(Color.WHITE);
        b21.setBounds(30, 420, 70, 50);
        this.add(b21);
        
        JButton b22 = new JButton("Cos");
        b22.setForeground(Color.RED);
        b22.setBackground(Color.WHITE);
        b22.setBounds(120, 420, 70, 50);
        this.add(b22);
        
        JButton b23 = new JButton("Tan");
        b23.setForeground(Color.RED);
        b23.setBackground(Color.WHITE);
        b23.setBounds(210, 420, 70, 50);
        this.add(b23);
        
        JButton b24 = new JButton("^");
        b24.setForeground(Color.RED);
        b24.setBackground(Color.WHITE);
        b24.setBounds(300, 420, 70, 50);
        this.add(b24);
    }
}
