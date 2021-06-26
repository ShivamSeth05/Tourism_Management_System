
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;

class Forgotpassword extends JFrame implements  ActionListener {
    JTextField t1, t2, t3, t4, t5;
    JButton b1, b2, b3;

    Forgotpassword() {
        setLayout(null);
        setTitle("Forgot_Password Form . . .");
        setBounds(370, 230, 820, 400);
        getContentPane().setBackground(Color.darkGray);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(30, 30, 490, 300);
        p1.setBackground(Color.gray);
        add(p1);

        JLabel l1 = new JLabel("Username");
        l1.setBounds(15, 20, 100, 25);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(l1);

        t1 = new JTextField();
        t1.setBounds(190, 20, 180, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);

        b1 = new JButton("Search");
        b1.setBackground(Color.white);
        b1.setForeground(Color.blue);
        b1.setBounds(390, 20, 85, 25);
        b1.addActionListener(this);
        b1.setFont(new Font("Tahoma", Font.BOLD, 15));
        p1.add(b1);

        JLabel l2 = new JLabel("Name");
        l2.setBounds(15, 60, 100, 25);
        l2.setForeground(Color.WHITE);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(l2);

        t2 = new JTextField();
        t2.setBounds(190, 60, 180, 25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);

        JLabel l3 = new JLabel("Your Security Question ");
        l3.setBounds(15, 100, 170, 25);
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(l3);

        t3 = new JTextField();
        t3.setBounds(190, 100, 220, 25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t3);

        JLabel l4 = new JLabel("Answer");
        l4.setBounds(15, 140, 100, 25);
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(l4);

        t4 = new JTextField();
        t4.setBounds(190, 140, 180, 25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t4);

        b2 = new JButton("Retrieve");
        b2.setBackground(Color.white);
        b2.setForeground(Color.blue);
        b2.setBounds(390, 140, 90, 25);
        b2.setFont(new Font("Tahoma", Font.BOLD, 13));
        b2.addActionListener(this);
        p1.add(b2);

        JLabel l5 = new JLabel("Password");
        l5.setBounds(15, 180, 100, 25);
        l5.setForeground(Color.WHITE);
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(l5);

        b3 = new JButton("BACK");
        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.WHITE);
        b3.setBounds(150, 235, 85, 25);
        b3.setFont(new Font("Tahoma", Font.BOLD, 15));
        b3.addActionListener(this);
        p1.add(b3);

        t5 = new JTextField();
        t5.setBounds(190, 180, 180, 25);
        t5.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t5);

        ImageIcon i1 = new ImageIcon(
                ClassLoader.getSystemResource("ICONS/forgotpassword.png"));
        Image i2 = i1.getImage().getScaledInstance(390, 420, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l6 = new JLabel(i3);
        l6.setBounds(520, 30, 250, 300);
        add(l6);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        Conns c = new Conns();
        if (ae.getSource() == b1) {
            try {
                String sql = "select * from account where  username = '" + t1.getText() + "'";
                ResultSet rs = c.stmt.executeQuery(sql);
                while (rs.next()) {
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("security"));

                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == b2) {
            try {
                String sql = "select * from account where  answer = '" + t4.getText() + "' AND username = '"
                        + t1.getText() + "'";
                ResultSet rs = c.stmt.executeQuery(sql);
                while (rs.next()) {
                    t5.setText(rs.getString("password"));

                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == b3) {
            this.setVisible(false);
            new Login().setVisible(true);

        }

    }

   
}