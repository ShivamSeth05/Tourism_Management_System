
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Signup extends JFrame implements ActionListener {
    JButton b1, b2;
    JTextField t1, t2, t3, t4;
    Choice c1;

    Signup() {
        
        setLayout(null);
        setBounds(370, 250, 800, 400);
        getContentPane().setBackground(Color.white);
        setTitle("Signup Form . . .");

        JPanel p1 = new JPanel();
        p1.setBackground(Color.cyan);
        p1.setBounds(0, 0, 450, 450);
        p1.setLayout(null);
        add(p1);

        JLabel l1 = new JLabel("Username");
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        l1.setBounds(40, 30, 130, 25);
        p1.add(l1);

        t1 = new JTextField();
        t1.setBounds(185, 30, 190, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);

        JLabel l2 = new JLabel("Name");
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setBounds(40, 70, 130, 25);
        p1.add(l2);

        t2 = new JTextField();
        t2.setBounds(185, 70, 190, 25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);

        JLabel l3 = new JLabel("Password");
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3.setBounds(40, 110, 130, 25);
        p1.add(l3);

        t3 = new JTextField();
        t3.setBounds(185, 110, 190, 25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t3);

        JLabel l4 = new JLabel("Security Question");
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setBounds(40, 150, 130, 25);
        p1.add(l4);

        c1 = new Choice();
        c1.add("Your fav Cartoon charactor ?");
        c1.add("Your fav Books ?");
        c1.add("Your Lucky Number?");
        c1.add("Your Childhood Name ?");
        c1.setBounds(185, 150, 237, 35);
        p1.add(c1);

        JLabel l5 = new JLabel("Answer");
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setBounds(40, 190, 130, 25);
        p1.add(l5);

        t4 = new JTextField();
        t4.setBounds(185, 190, 190, 25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t4);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l6 = new JLabel(i3);
        l6.setBounds(490, 40, 250, 250);
        add(l6);

        JLabel l7 = new JLabel("Let's get you set up ");
        l7.setBounds(510, 290, 220, 25);
        l7.setFont(new Font("MV Boli", Font.BOLD, 20));
        add(l7);

        JLabel l8 = new JLabel("It should only take you a minute to connect");
        l8.setBounds(460, 325, 300, 20);
        l8.setFont(new Font("Tahoma", Font.PLAIN, 15));
        l8.setForeground(Color.red);
        add(l8);

        b1 = new JButton("Create");
        b1.setBounds(45, 270, 125, 25);
        b1.setFont(new Font("Tahoma", Font.BOLD, 14));
        b1.setBackground(Color.red);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        p1.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(245, 270, 125, 25);
        b2.setBackground(Color.WHITE);
        b2.setFont(new Font("Tahoma", Font.BOLD, 14));
        b2.setForeground(Color.RED);
        b2.addActionListener(this);
        p1.add(b2);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String username = t1.getText();
            String name = t2.getText();
            String password = t3.getText();
            String security = c1.getSelectedItem();
            String answer = t4.getText();
            if (username.isEmpty() || password.isEmpty() || answer.isEmpty() || name.isEmpty()) {
                JFrame f1=new JFrame();
                JOptionPane.showMessageDialog(f1,"Please make sure all fields are filled in","Warning", JOptionPane.WARNING_MESSAGE);

            } else {
                String query = "insert into account values ('" + username + "', '" + name + "','" + password + "','"
                        + security + "','" + answer + "')";
                // System.out.println(username);
                try {
                    Conns c = new Conns();
                    c.stmt.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Account Created Successfully");
                    this.setVisible(false);
                    new Login().setVisible(true);

                } catch (Exception e) {

                }
            }

        } else if (ae.getSource() == b2) {
            new Login().setVisible(true);
            this.setVisible(false);

        }

    }

   

}
