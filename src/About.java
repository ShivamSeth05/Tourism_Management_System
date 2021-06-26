// package travel.Management.System;

import java.awt.Color;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame implements ActionListener{
    String s;
    JButton b1;
    // public static void main(String[] args) {
    //     new About().setVisible(true);
    // }

    About() {
        setTitle("About_Project");
        setBounds(540, 200, 600, 550);
        setLayout(null);
        getContentPane().setBackground(Color.white);

        JLabel l1 = new JLabel("Toursim Management system - `TWS` ");
        l1.setBounds(60, 10, 400, 60);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 20));

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/Logo.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(470, 20, 100, 50);
        add(l10);

        add(l1);
        s = "                                                        -About Projects-          \n  "
        + "\nThe objective of the Travel and Tourism Management System"
        + "project is to develop a system that automates the processes "
        + "and activities of a travel and the purpose is to design a "
        + "system using which one can perform all operations related to "
        + "traveling.\n\n"
        + "This application will help in accessing the information related "
        + "to the travel to the particular destination with great ease. "
        + "The users can track the information related to their tours with "
        + "great ease through this application. The travel agency information "
        + "can also be obtained through this application.\n\n"
        + "Advantages of Project:-\n"
        + "````````````````````````````"
        + "\nGives accurate information"
        + "\nSimplifies the manual work"
        + "\nIt minimizes the documentation related work"
        + "\nProvides up to date information"
        + "\nFriendly Environment by providing warning messages."
        + "\ntravelers details can be provided"
        + "\nbooking confirmation notification"
        ;


        TextArea t1 = new TextArea(s, 10,40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20,100,550,300);
        add(t1);

        b1 = new JButton ("Back");
        b1.setBounds(245,420,100,25);
        b1.addActionListener(this);
        add(b1);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }

    
}
