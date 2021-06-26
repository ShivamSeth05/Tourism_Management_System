
import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Payment extends JFrame implements ActionListener {
    

    JButton b1, b2, b3, b4, b5;

    Payment() {

        setTitle("Payment");
        setBounds(500, 200, 800, 500);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/paytm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 800, 500);
        add(l1);

        // b1 =new JButton("Pay");
        // b1.setBounds(300,0,80,40);
        // b1.addActionListener(this);
        // l1.add(b1);

        b1 = new JButton("Paytm");
        b1.setForeground(Color.black);
        b1.setBackground(Color.white);
        b1.setBounds(100, 100, 100, 40);
        b1.addActionListener(this);
        l1.add(b1);
        
        b2 = new JButton("Back");
        b2.addActionListener(this);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setBounds(185, 300, 80, 40);
        l1.add(b2);

        b3 = new JButton("Google pay");
        b3.setForeground(Color.black);
        b3.setBackground(Color.white);
        b3.setBounds(250, 100, 100, 40);
        b3.addActionListener(this);
        l1.add(b3);

        b4 = new JButton("Amazon pay");
        b4.setForeground(Color.black);
        b4.setBackground(Color.white);
        b4.setBounds(100, 200, 100, 40);
        b4.addActionListener(this);
        l1.add(b4);

        b5 = new JButton("Amazon pay");
        b5.setForeground(Color.black);
        b5.setBackground(Color.white);
        b5.setBounds(250, 200, 100, 40);
        b5.addActionListener(this);
        l1.add(b5);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            this.setVisible(false);
            new Paytm().setVisible(true);

        } else if (ae.getSource() == b2) {
            setVisible(false);

        }
    }

}
