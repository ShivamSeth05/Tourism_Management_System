
import java.awt.Color;
import java.awt.Font;
import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BookPackage extends JFrame implements ActionListener {
    Choice c1;
    JLabel l11, l12, l13, l14, l15;
    JTextField t1;
    JButton b1, b2, b3;

   
    BookPackage(String user) {
        String username = user;
        setBounds(500, 200, 840, 450);
        setLayout(null);
        getContentPane().setBackground(Color.black);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l16 = new JLabel(i3);
        l16.setBounds(400, 20, 400, 320);
        add(l16);

        JLabel l1 = new JLabel("BOOK PACKAGE");
        l1.setBounds(100, 10, 200, 30);
        l1.setForeground(Color.white);
        l1.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        add(l1);

        JLabel l2 = new JLabel("Username :");
        l2.setBounds(30, 70, 100, 30);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l2);

        l11 = new JLabel(username);
        l11.setForeground(Color.white);
        l11.setBounds(180, 70, 100, 30);
        l11.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l11);

        JLabel l3 = new JLabel("Select Package :");
        l3.setBounds(30, 110, 150, 20);
        l3.setForeground(Color.white);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l3);

        c1 = new Choice();
        c1.add("Gold Package");
        c1.add("Silver Package");
        c1.add("Bronze Package");
        c1.setBounds(180, 110, 200, 30);
        // l3.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(c1);

        JLabel l4 = new JLabel("Total Persons:");
        l4.setBounds(30, 150, 150, 20);
        
        l4.setForeground(Color.white);
        l4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l4);

        t1 = new JTextField("1");
        t1.setForeground(Color.black);
        t1.setBounds(180, 150, 162, 25);
        add(t1);

        JLabel l5 = new JLabel("ID :");
        l5.setBounds(30, 190, 200, 30);
        l5.setForeground(Color.white);
        l5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l5);

        l12 = new JLabel();
        l12.setForeground(Color.white);
        l12.setBounds(180, 190, 100, 30);
        l12.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l12);

        JLabel l6 = new JLabel("Number :");
        l6.setBounds(30, 230, 200, 30);
        l6.setForeground(Color.white);
        l6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l6);

        l13 = new JLabel();
        l13.setForeground(Color.white);
        l13.setBounds(180, 230, 100, 30);
        l13.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l13);

        JLabel l7 = new JLabel("Phone :");
        l7.setBounds(30, 270, 200, 30);
        l7.setForeground(Color.white);
        l7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l7);

        l14 = new JLabel();
        l14.setForeground(Color.white);
        l14.setBounds(180, 270, 100, 30);
        l14.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l14);

        JLabel l8 = new JLabel("Total Price :");
        l8.setBounds(30, 310, 200, 30);
        l8.setForeground(Color.white);
        l8.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l8);

        l15 = new JLabel();
        l15.setBounds(180, 310, 100, 30);
        l15.setForeground(Color.white);
        l15.setForeground(Color.RED);
        l15.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(l15);

        b1 = new JButton("Check Price");
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.setBounds(30, 360, 110, 25);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Book Package");
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setBounds(160, 360, 115, 25);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Back");
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        b3.setBounds(290, 360, 100, 25);
        b3.addActionListener(this);
        add(b3);

        try {
            Conns c = new Conns();
            // sql = ;
            ResultSet rs = c.stmt.executeQuery("select * from customer where username = '" + username + "'");
            while (rs.next()) {
                l12.setText(rs.getString("id"));
                l13.setText(rs.getString("number"));
                l14.setText(rs.getString("phone"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String pck = c1.getSelectedItem();
            int cost = 0;
            int person = Integer.parseInt(t1.getText());
            if (pck.equals("Gold Package")) {
                cost += 12000;

            } else if (pck.equals("Silver Package")) {

                cost += 25000;
            } else if (pck.equals("Bronze Package")) {
                cost += 32000;
            }

            cost *= person;
            l15.setText("Rs. " + cost + "-/");

        } else if (ae.getSource() == b2) {

            try {
                Conns c = new Conns();
                c.stmt.executeUpdate("insert into bookpackage Values('" + l11.getText() + "', '" + c1.getSelectedItem()
                        + "', '" + t1.getText() + "', '" + l12.getText() + "', '" + l13.getText() + "', '"
                        + l14.getText() + "', '" + l15.getText() + "')");
                JOptionPane.showMessageDialog(null, "Package Booked Successfully");
                this.setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == b3) {
            this.setVisible(false);

        }

    }

    
}
