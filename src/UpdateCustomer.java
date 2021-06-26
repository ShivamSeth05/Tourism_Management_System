
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class UpdateCustomer extends JFrame implements ActionListener {
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9;

    JButton b1, b2;

    UpdateCustomer(String username) {

        setLayout(null);// by default border Layoutudr
        getContentPane().setBackground(Color.white);
        setBounds(570, 220, 720, 550);

        JLabel l0 = new JLabel("UPDATE CUSTOMER DETAILS");
        l0.setBounds(60, 10, 350, 25);
        l0.setFont(new Font("Tahoma", Font.PLAIN, 25));
        add(l0);

        JLabel l1 = new JLabel("Username :");
        l1.setBounds(30, 50, 100, 25);
        l1.setFont(new Font("Tamoha",Font.BOLD,15));
        add(l1);

        t1 = new JTextField();
        t1.setBounds(170, 50, 200, 25);
        t1.setFont(new Font("Tamoha",Font.BOLD,15));
        add(t1);

        JLabel l2 = new JLabel("ID :");
        l2.setBounds(30, 95, 100, 25);
        l2.setFont(new Font("Tamoha",Font.BOLD,15));
        add(l2);

        t8 = new JTextField();
        t8.setBounds(170, 95, 200, 25);
        t8.setFont(new Font("Tamoha",Font.BOLD,15));
        add(t8);

        JLabel l3 = new JLabel("Number :");
        l3.setBounds(30, 140, 100, 25);
        l3.setFont(new Font("Tamoha",Font.BOLD,15));
        add(l3);

        t2 = new JTextField();
        t2.setBounds(170, 140, 200, 25);
        t2.setFont(new Font("Tamoha",Font.BOLD,15));
        add(t2);

        JLabel l4 = new JLabel("Name :");
        l4.setFont(new Font("Tamoha",Font.BOLD,15));
        l4.setBounds(30, 185, 100, 25);
        add(l4);

        t3 = new JTextField();
        t3.setBounds(170, 185, 200, 25);
        t3.setFont(new Font("Tamoha",Font.BOLD,15));
        add(t3);

        JLabel l5 = new JLabel("Gender :");
        l5.setBounds(30, 225, 100, 25);
        l5.setFont(new Font("Tamoha",Font.BOLD,15));
        add(l5);

        t9 = new JTextField();
        t9.setBounds(170, 225, 200, 25);
        t9.setFont(new Font("Tamoha",Font.BOLD,15));
        add(t9);

        JLabel l6 = new JLabel("Country :");
        l6.setBounds(30, 270, 100, 25);
        l6.setFont(new Font("Tamoha",Font.BOLD,15));
        add(l6);

        t4 = new JTextField();
        t4.setBounds(170, 270, 200, 25);
        t4.setFont(new Font("Tamoha",Font.BOLD,15));
        add(t4);

        JLabel l7 = new JLabel("Address :");
        l7.setBounds(30, 315, 100, 25);
        l7.setFont(new Font("Tamoha",Font.BOLD,15));
        add(l7);

        t5 = new JTextField();
        t5.setBounds(170, 315, 200, 25);
        t5.setFont(new Font("Tamoha",Font.BOLD,15));
        add(t5);

        JLabel l8 = new JLabel("Phone :");
        l8.setBounds(30, 365, 100, 25);
        l8.setFont(new Font("Tamoha",Font.BOLD,15));
        add(l8);

        t6 = new JTextField();
        t6.setBounds(170, 365, 200, 25);
        t6.setFont(new Font("Tamoha",Font.BOLD,15));
        add(t6);

        JLabel l9 = new JLabel("Email :");
        l9.setBounds(30, 410, 100, 25);
        l9.setFont(new Font("Tamoha",Font.BOLD,15));
        add(l9);

        t7 = new JTextField();
        t7.setBounds(170, 410, 200, 25);
        t7.setFont(new Font("Tamoha",Font.BOLD,15));
        add(t7);

        b1 = new JButton("Update");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.setBounds(70, 460, 100, 25);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.setBounds(200, 460, 100, 25);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/update.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(380, 50, 300, 400);
        add(l10);

        try {
            Conns c = new Conns();
            ResultSet rs = c.stmt.executeQuery("select * from Customer where username = '" + username + "' ");
            while (rs.next()) {
                t1.setText(rs.getString("username"));
                t2.setText(rs.getString("number"));
                t3.setText(rs.getString("name"));
                t4.setText(rs.getString("country"));
                t5.setText(rs.getString("address"));
                t6.setText(rs.getString("phone"));
                t7.setText(rs.getString("email"));
                t8.setText(rs.getString("id"));
                t9.setText(rs.getString("gender"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String username = t1.getText();
            String id = t8.getText();// return object(type casting) because obj can't be converted into String
            String number = t2.getText();
            String name = t3.getText();
            String radio = t9.getText();
            String country = t4.getText();
            String address = t5.getText();
            String phone = t6.getText();
            String email = t7.getText();

            String q = "update customer set username ='" + username + "',id= '" + id + "',number= '" + number
                    + "',name='" + name + "',gender= '" + radio + "',country= '" + country + "',address ='" + address
                    + "',phone ='" + phone + "',email= '" + email + "' where username ='" + username + "' ";
            try {
                Conns c = new Conns();
                c.stmt.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully");
                this.setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == b2) {
            this.setVisible(false);

        }

    }

   
}
