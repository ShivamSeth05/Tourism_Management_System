
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {

    JButton b1, b2, b3;
    JTextField t1;
    JPasswordField t2;

    Login() {
        setTitle("Login Form . . .");
        setLayout(null);// z by default border Layout
        getContentPane().setBackground(Color.white);
        setBounds(410, 270, 700, 350);

        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 350, 315);
        p1.setBackground(Color.WHITE);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/login.png"));
        Image i2 = i1.getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        p1.setLayout(null);
        l1.setBounds(15, 10, 350, 350);
        p1.add(l1);

        // Second Pannel
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(360, 10, 315, 300);

        add(p2);

        JLabel l2 = new JLabel("Username");
        l2.setBounds(35, 20, 100, 25);
        l2.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        p2.add(l2);

        t1 = new JTextField();
        t1.setBounds(30, 60, 250, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t1);

        JLabel l3 = new JLabel("Password");
        l3.setBounds(35, 100, 100, 25);
        l3.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        p2.add(l3);

        t2 = new JPasswordField();
        t2.setBounds(30, 140, 250, 25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t2);

        b1 = new JButton("LogIn");
        b1.setBounds(30, 185, 110, 25);
        b1.setBackground(Color.RED);
        b1.setFont(new Font("Tahoma", Font.BOLD, 14));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        p2.add(b1);

        b2 = new JButton("SinUp");
        b2.setBounds(170, 185, 110, 25);
        b2.setFont(new Font("Tahoma", Font.BOLD, 14));
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.RED);
        b2.addActionListener(this);
        p2.add(b2);

        b3 = new JButton("Forget Password");
        b3.setBounds(85, 230, 150, 25);
        p2.add(b3);
        b2.setFont(new Font("Tahoma", Font.BOLD, 14));
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.RED);
        b3.addActionListener(this);
        p2.add(b3);

        JLabel l4 = new JLabel("Are_You_Troubling_in_Login.");
        l4.setBounds(40, 250, 220, 40);
        l4.setFont(new Font("MV Boli", Font.BOLD, 15));
        l4.setForeground(Color.red);
        p2.add(l4);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {

            try {
                String username = t1.getText();
                String password = String.valueOf(t2.getPassword());

                if(username.equals("admin") && password.equals("admin")){
                    this.setVisible(false);
                    new security(username);
                    JOptionPane.showMessageDialog(null, "Admin Login!");
                }
                Conns c = new Conns();
                String sql = "select * from account where username = '" + username + "' AND password = '" + password
                        + "'";
                ResultSet rs = c.stmt.executeQuery(sql);

                if (rs.next()) {

                    System.out.println(rs.next());
                    this.setVisible(false);
                    new security(username);
                    // new Loading(username).setVisible(false);
                }
                
                 else {
                    JOptionPane.showMessageDialog(null, "invalid Login!");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == b2) {
            this.setVisible(false);
            new Signup().setVisible(true);

        } else if (ae.getSource() == b3) {
            this.setVisible(false);
            new Forgotpassword().setVisible(true);

        }

    }

   

}
