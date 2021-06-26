// package travel.Management.System;

import java.awt.event.*;
import java.awt.*;
import java.awt.Choice;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BookHotel extends JFrame implements ActionListener {
    
    // public static void main(String[] args) {
    //     new BookHotel("").setVisible(true);
    // }
    Choice c1, c2, c3;
    JTextField t1, t2;
    JLabel l21, l22, l23, l24, l25;
    JButton b1, b2, b3;

    BookHotel(String username) {

        setBounds(500, 220, 830, 600);
        setLayout(null);// by default border Layout
        getContentPane().setBackground(Color.black);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(340, 480, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l0 = new JLabel(i3);
        l0.setBounds(440, 40, 340, 480);
        add(l0);

        JLabel l1 = new JLabel("BOOK HOTEL");
        l1.setBounds(130, 10, 300, 30);
        l1.setForeground(Color.white);
        l1.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(l1);

        JLabel l2 = new JLabel("Username");
        l2.setForeground(Color.white);
        l2.setBounds(20, 70, 100, 30);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(l2);

        l21 = new JLabel();
        l21.setBounds(250, 70, 100, 30);
        l21.setForeground(Color.white);
        l21.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(l21);

        JLabel l3 = new JLabel("Select Hotel");
        l3.setForeground(Color.white);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l3.setBounds(20, 110, 100, 30);
        add(l3);

        c1 = new Choice();

        try {
            Conns c = new Conns();
            ResultSet rs = c.stmt.executeQuery("Select * from hotel");
            while (rs.next()) {
                c1.add(rs.getString("name"));

            }
        } catch (Exception e) {

        }
        c1.setBounds(250, 110, 180, 30);
        add(c1);

        JLabel l4 = new JLabel("Total Persons");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l4.setForeground(Color.white);
        l4.setBounds(20, 150, 100, 30);
        add(l4);

        t1 = new JTextField("1");
        t1.setBounds(250, 150, 147, 20);
        t1.setForeground(Color.black);
        t1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(t1);

        JLabel l5 = new JLabel("Number of Days");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l5.setForeground(Color.white);
        l5.setBounds(20, 190, 130, 30);
        add(l5);

        t2 = new JTextField("1");
        t2.setBounds(250, 190, 147, 20);
        t2.setForeground(Color.black);
        t2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(t2);

        JLabel l6 = new JLabel("AC / Non-AC");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l6.setForeground(Color.white);
        l6.setBounds(20, 230, 110, 30);
        add(l6);

        c2 = new Choice();
        c2.setForeground(Color.black);
        c2.add("YES");
        c2.add("NO");
        c2.setBounds(250, 230, 180, 30);
        add(c2);

        JLabel l7 = new JLabel("Food Included ");
        l7.setForeground(Color.white);
        l7.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l7.setBounds(20, 270, 130, 30);
        add(l7);

        c3 = new Choice();
        c3.setForeground(Color.black);
        c3.add("YES");
        c3.add("NO");
        c3.setBounds(250, 270, 180, 30);
        add(c3);

        JLabel l8 = new JLabel("ID");
        l8.setForeground(Color.white);
        l8.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l8.setBounds(20, 310, 100, 30);
        add(l8);

        l22 = new JLabel();
        l22.setForeground(Color.white);
        l22.setBounds(250, 310, 147, 30);
        l22.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(l22);

        JLabel l9 = new JLabel("Number");
        l9.setForeground(Color.white);
        l9.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l9.setBounds(20, 350, 100, 30);
        add(l9);

        l23 = new JLabel();
        l23.setForeground(Color.white);
        l23.setBounds(250, 350, 147, 30);
        l23.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(l23);

        JLabel l10 = new JLabel("Phone");
        l10.setForeground(Color.white);
        l10.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l10.setBounds(20, 390, 100, 30);
        add(l10);

        l24 = new JLabel();
        l24.setForeground(Color.white);
        l24.setBounds(250, 390, 140, 30);
        l24.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(l24);

        JLabel l11 = new JLabel("Total Price");
        l11.setForeground(Color.white);
        l11.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l11.setBounds(20, 430, 100, 30);
        add(l11);

        l25 = new JLabel();
        l25.setForeground(Color.red);
        l25.setBounds(250, 430, 190, 30);
        l25.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(l25);

        b1 = new JButton("Check Price");
        b1.setBackground(Color.blue);
        b1.setForeground(Color.white);
        b1.setBounds(30, 490, 105, 20);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Book");
        b2.setBackground(Color.RED);
        b2.setForeground(Color.white);
        b2.setBounds(165, 490, 100, 20);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Back");
        b3.setBackground(Color.blue);
        b3.setForeground(Color.white);
        b3.setBounds(295, 490, 100, 20);
        b3.addActionListener(this);
        add(b3);

        try {
            Conns c = new Conns();
            ResultSet rs = c.stmt.executeQuery("select * from customer where username = '"+username+"'");
            while (rs.next()) {
                l21.setText(rs.getString("username"));
                l22.setText(rs.getString("id"));
                l23.setText(rs.getString("number"));
                l24.setText(rs.getString("phone"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                Conns c = new Conns();
                ResultSet rs = c.stmt.executeQuery("select * from hotel where name = '" + c1.getSelectedItem() + "'");
                while (rs.next()) {
                    int cost = Integer.parseInt(rs.getString("cost_per_day"));
                    int food = Integer.parseInt(rs.getString("food_charges"));
                    int ac = Integer.parseInt(rs.getString("ac_charges"));

                    int person = Integer.parseInt(t1.getText());
                    int days = Integer.parseInt(t2.getText());

                    String acprice = c2.getSelectedItem();

                    String foodprice = c3.getSelectedItem();

                    if (person * days > 0) {
                        int total = 0;
                        total += acprice.equals("YES") ? ac : 0;

                        total += foodprice.equals("YES") ? food : 0;

                        total += cost;

                        total += total * person * days;

                        l25.setText("" + total);

                    } else {
                        l25.setText("Please enter a valid number");
                    }

                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == b2) {
            try {
                Conns c = new Conns();
                c.stmt.executeUpdate("insert into bookhotel values('"+l21.getText()+"','"+c1.getSelectedItem()+"','"+t1.getText()+"','"+t2.getText()+"','"+c2.getSelectedItem()+"','"+c3.getSelectedItem()+"','"+l22.getText()+"','"+l23.getText()+"','"+l24.getText()+"','"+l25.getText()+"')");

                JOptionPane.showMessageDialog(null, "Hotel booked Successfully");
                this.setVisible(false);
            } catch (Exception e) {
            
                e.printStackTrace();
            }
        } else if (ae.getSource() == b3) {
            this.setVisible(false);

        }
    }

    

}
