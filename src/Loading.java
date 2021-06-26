
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Loading extends JFrame implements Runnable {
    // public static void main(String[] args) {
    //     new Loading("").setVisible(true);
    // }

    Thread t;
    JProgressBar p;
    String username;
    // String username = "";

    public void run() {
        try {
            for (int i = 1; i <= 101; i++) {

                int highValue = p.getMaximum();
                int currentValue = p.getValue();
                if (currentValue < highValue) {

                    if (currentValue < 30) {
                        p.setForeground(Color.red);
                    } else if (currentValue < 70) {
                        p.setForeground(Color.blue);
                    } else {
                        p.setForeground(Color.green);

                    }

                    p.setValue(p.getValue() + 1);
                } else {
                    i = 101;

                    setVisible(false);
                    new Dashboard(username).setVisible(true);
                }
                Thread.sleep(50);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    Loading(String user) {

        username = user;
        t = new Thread(this);
        
        setBounds(500, 280, 560, 400);
        setLayout(null);// by default border Layout
        getContentPane().setBackground(Color.white);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/bookedhotelDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(545, 360, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 545, 360);
        add(l1);
        

        JLabel l01 = new JLabel("Travel And Tourism Application ");
        l01.setBounds(40, 15, 500, 30);
        l01.setFont(new Font("MV Boli", Font.BOLD, 30));
        l01.setForeground(Color.BLUE);
        l1.add(l01);

        p = new JProgressBar();
        p.setBounds(120, 315, 300, 20);
        p.setStringPainted(true);
        // p.setForeground(Color.BLUE);
        p.setBackground(Color.BLACK);
        l1.add(p);

        JLabel l2 = new JLabel("Please Wait...");
        l2.setBounds(220, 340, 120, 15);
        l2.setFont(new Font("MV Boli", Font.BOLD, 15));
        l2.setForeground(Color.blue);
        l1.add(l2);

        JLabel l3 = new JLabel("Welcome " +username+"...");
        l3.setBounds(10, 335, 200, 20);
        l3.setFont(new Font("Serif", Font.BOLD, 15));
        l3.setForeground(Color.black);
        l1.add(l3);

        t.start();

        setVisible(true);
    }

   
}