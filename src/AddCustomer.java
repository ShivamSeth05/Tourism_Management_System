
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class AddCustomer extends JFrame implements ActionListener {
    JTextField t1, t2, t3, t4, t5, t6, t7;
    JComboBox<String> c1;
    JRadioButton r1, r2;
    JButton b1, b2;
    ImageIcon male;
    ImageIcon female;

    AddCustomer(String username) {

        setTitle("Add Customer Details . . .");
        setLayout(null);// by default border Layout
        getContentPane().setBackground(Color.black);
        setBounds(570, 220, 720, 560);

        JLabel l1 = new JLabel("Username :");
        l1.setBounds(30, 50, 160, 25);
        l1.setForeground(Color.PINK);
        l1.setFont(new Font("Tamoha", Font.BOLD, 15));
        add(l1);

        t1 = new JTextField();
        t1.setBounds(170, 50, 200, 25);
        t1.setFont(new Font("Tamoha", Font.BOLD, 15));
        add(t1);

        JLabel l2 = new JLabel("ID :");
        l2.setFont(new Font("Tamoha", Font.BOLD, 15));
        l2.setForeground(Color.PINK);
        l2.setBounds(30, 95, 100, 25);
        add(l2);

        // String[] s = {"Passport","Aadhar Card","Rasan Card","Pan Card"};
        c1 = new JComboBox<String>(new String[] { "Passport", "Aadhar Card", "Rasan Card", "Pan Card" });
        c1.setBounds(170, 95, 200, 25);
        add(c1);

        JLabel l3 = new JLabel("Number :");
        l3.setBounds(30, 140, 100, 25);
        l3.setFont(new Font("Tamoha", Font.BOLD, 15));
        l3.setForeground(Color.PINK);
        add(l3);

        t2 = new JTextField();
        t2.setBounds(170, 140, 200, 25);
        t2.setFont(new Font("Tamoha", Font.BOLD, 15));
        add(t2);

        JLabel l4 = new JLabel("Name :");
        l4.setBounds(30, 185, 100, 25);
        l4.setFont(new Font("Tamoha", Font.BOLD, 15));
        l4.setForeground(Color.PINK);
        add(l4);

        t3 = new JTextField();
        t3.setBounds(170, 185, 200, 25);
        t3.setFont(new Font("Tamoha", Font.BOLD, 15));
        add(t3);

        JLabel l5 = new JLabel("Gender :");
        l5.setBounds(30, 225, 100, 25);
        l5.setFont(new Font("Tamoha", Font.BOLD, 15));
        l5.setForeground(Color.PINK);
        add(l5);

        r1 = new JRadioButton("Male");
        r1.setBounds(170, 225, 100, 30);
        r1.setBackground(Color.WHITE);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBounds(270, 225, 100, 30);
        r2.setBackground(Color.WHITE);
        add(r2);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        male = new ImageIcon(ClassLoader.getSystemResource("ICONS/male.png"));
        Image m2 = male.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon m3 = new ImageIcon(m2);
        r1.setIcon(m3);
        female = new ImageIcon(ClassLoader.getSystemResource("ICONS/female.png"));
        Image m4 = female.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon m5 = new ImageIcon(m4);
        r2.setIcon(m5);

        JLabel l6 = new JLabel("Country :");
        l6.setBounds(30, 270, 100, 25);
        l6.setFont(new Font("Tamoha", Font.BOLD, 15));
        l6.setForeground(Color.PINK);
        add(l6);

        t4 = new JTextField();
        t4.setBounds(170, 270, 200, 25);
        t4.setFont(new Font("Tamoha", Font.BOLD, 15));
        add(t4);

        JLabel l7 = new JLabel("Address :");
        l7.setBounds(30, 315, 100, 25);
        l7.setFont(new Font("Tamoha", Font.BOLD, 15));
        l7.setForeground(Color.PINK);
        add(l7);

        t5 = new JTextField();
        t5.setBounds(170, 315, 200, 25);
        t5.setFont(new Font("Tamoha", Font.BOLD, 15));
        add(t5);

        JLabel l8 = new JLabel("Phone :");
        l8.setBounds(30, 365, 100, 25);
        l8.setFont(new Font("Tamoha", Font.BOLD, 15));
        l8.setForeground(Color.PINK);
        add(l8);

        t6 = new JTextField();
        t6.setBounds(170, 365, 200, 25);
        t6.setFont(new Font("Tamoha", Font.BOLD, 15));
        add(t6);

        JLabel l9 = new JLabel("Email :");
        l9.setBounds(30, 410, 100, 25);
        l9.setFont(new Font("Tamoha", Font.BOLD, 15));
        l9.setForeground(Color.PINK);
        add(l9);

        t7 = new JTextField();
        t7.setBounds(170, 410, 200, 25);
        t7.setFont(new Font("Tamoha", Font.BOLD, 15));
        add(t7);

        b1 = new JButton("Add");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.setBounds(70, 475, 100, 25);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.setBounds(200, 475, 100, 25);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(350, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(370, 30, 350, 500);
        add(l10);

        try {
            Conns c = new Conns();
            ResultSet rs = c.stmt.executeQuery("select * from account where username = '" + username + "' ");
            while (rs.next()) {
                t1.setText(rs.getString("username"));
                t3.setText(rs.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            Conns c = new Conns();
            String username = t1.getText();
            String id = (String) c1.getSelectedItem();// return object(type casting) because obj can't be converted into
                                                      // String
            String number = t2.getText();

            String name = t3.getText();
            String radio = null;
            if (r1.isSelected()) {
                radio = "Male";
            } else if (r2.isSelected()) {
                radio = "Female";
            }

            String country = t4.getText();
            String address = t5.getText();
            String phone = t6.getText();
            String email = t7.getText();

            String q = "insert into customer values ('" +username+ "','" +id+ "','" +number+ "','" + name + "','"
                    + radio + "','" + country + "','" + address + "','" + phone + "','" + email + "')";
            try {
                
                c.stmt.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
                this.setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == b2) {
            this.setVisible(false);

        }

    }

   
}
