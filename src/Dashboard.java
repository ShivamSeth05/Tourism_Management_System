
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.plaf.ColorUIResource;

import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener, MouseListener, Runnable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    String username;
    JLabel l4;
    Thread t1;

    Dashboard(String username) {
        // Dashboard
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);// setSize 1540 , 810

        t1 = new Thread(this);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 1540, 60);
        p1.setBackground(new ColorUIResource(255, 219, 223));// rgb(255,219,223)
        p1.setBorder(BorderFactory.createLineBorder(Color.blue));
        add(p1);

        // Add Dashboard logo

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("ICONS/dashboard.png"));
        Image i5 = i4.getImage().getScaledInstance(160, 170, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(8, 8, 60, 42);
        p1.add(l2);

        // Add Dashboard titel

        JLabel l3 = new JLabel("DASHBOARD");
        l3.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 30));
        l3.setForeground(Color.BLACK);
        l3.setBounds(80, 10, 300, 40);
        p1.add(l3);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0, 60, 250, 810);
        p2.setBackground(Color.LIGHT_GRAY);
        add(p2);

        // copyright label

        JLabel copyright = new JLabel("© 2021 Shivam Seth");
        copyright.setBounds(10, 650, 160, 25);
        p2.add(copyright);

        // Add Dashboard Buttons

        b1 = new JButton("   Add Personal Details");
        b1.setBackground(Color.WHITE);
        b1.setHorizontalAlignment(SwingConstants.LEFT);
        b1.setBorder(BorderFactory.createLineBorder(Color.blue));
        b1.setFont(new Font("Tahoma", Font.BOLD, 17));
        b1.setForeground(Color.BLUE);
        b1.setBounds(1, 0, 249, 40);
        b1.setMargin(new Insets(0, 0, 0, 0));
        b1.addActionListener(this);
        b1.addMouseListener(this);
        p2.add(b1);

        b2 = new JButton("   Update Personal Details");
        b2.setBackground(Color.WHITE);
        b2.setHorizontalAlignment(SwingConstants.LEFT);
        b2.setBorder(BorderFactory.createLineBorder(Color.red));
        b2.setFont(new Font("Tahoma", Font.BOLD, 17));
        b2.setForeground(Color.blue);
        b2.setBounds(0, 40, 249, 40);
        b2.setMargin(new Insets(0, 0, 0, 53));
        b2.addActionListener(this);
        b2.addMouseListener(this);
        p2.add(b2);

        b3 = new JButton("   View Details");
        b3.setBackground(Color.WHITE);
        b3.setHorizontalAlignment(SwingConstants.LEFT);
        b3.setBorder(BorderFactory.createLineBorder(Color.blue));
        b3.setFont(new Font("Tahoma", Font.BOLD, 17));
        b3.setForeground(Color.blue);
        b3.setBounds(0, 80, 250, 40);
        b3.addActionListener(this);
        b3.addMouseListener(this);
        p2.add(b3);

        b4 = new JButton("   Delete Personal Details");
        b4.setBackground(Color.WHITE);
        b4.setHorizontalAlignment(SwingConstants.LEFT);
        b4.setFont(new Font("Tahoma", Font.BOLD, 17));
        b4.setBorder(BorderFactory.createLineBorder(Color.RED));
        b4.setForeground(Color.blue);
        b4.setBounds(0, 120, 250, 40);
        b4.setMargin(new Insets(0, 0, 0, 25));
        b4.addActionListener(this);
        b4.addMouseListener(this);
        p2.add(b4);

        b5 = new JButton("   Check Package");
        b5.setBackground(Color.WHITE);
        b5.setHorizontalAlignment(SwingConstants.LEFT);
        b5.setBorder(BorderFactory.createLineBorder(Color.blue));
        b5.setFont(new Font("Tahoma", Font.BOLD, 17));
        b5.setForeground(Color.blue);
        b5.setBounds(0, 160, 250, 40);
        b5.setMargin(new Insets(0, 0, 0, 81));
        b5.addActionListener(this);
        b5.addMouseListener(this);
        p2.add(b5);

        b6 = new JButton("   Book Package");
        b6.setBackground(Color.WHITE);
        b6.setHorizontalAlignment(SwingConstants.LEFT);
        b6.setBorder(BorderFactory.createLineBorder(Color.RED));
        b6.setFont(new Font("Tahoma", Font.BOLD, 17));
        b6.setForeground(Color.blue);
        b6.setBounds(0, 200, 250, 40);
        b6.setMargin(new Insets(0, 0, 0, 81));
        b6.addActionListener(this);
        b6.addMouseListener(this);
        p2.add(b6);

        b7 = new JButton("   View package");
        b7.setBackground(Color.WHITE);
        b7.setHorizontalAlignment(SwingConstants.LEFT);
        b7.setBorder(BorderFactory.createLineBorder(Color.blue));
        b7.setFont(new Font("Tahoma", Font.BOLD, 17));
        b7.setForeground(Color.blue);
        b7.setBounds(0, 240, 250, 40);
        b7.setMargin(new Insets(0, 0, 0, 81));
        b7.addActionListener(this);
        b7.addMouseListener(this);
        p2.add(b7);

        b8 = new JButton("   View Hotels");
        b8.setBackground(Color.WHITE);
        b8.setHorizontalAlignment(SwingConstants.LEFT);
        b8.setBorder(BorderFactory.createLineBorder(Color.RED));
        b8.setBackground(new Color(0, 0, 102));
        b8.setFont(new Font("Tahoma", Font.BOLD, 17));
        b8.setForeground(Color.blue);
        b8.setBounds(0, 280, 250, 40);
        b8.setMargin(new Insets(0, 0, 0, 95));
        b8.addActionListener(this);
        b8.addMouseListener(this);
        p2.add(b8);

        b9 = new JButton("   Book Hotel");
        b9.setBackground(new Color(0, 0, 102));
        b9.setHorizontalAlignment(SwingConstants.LEFT);
        b9.setBackground(Color.WHITE);
        b9.setFont(new Font("Tahoma", Font.BOLD, 17));
        b9.setForeground(Color.blue);
        b9.setBounds(0, 320, 250, 40);
        b9.setBorder(BorderFactory.createLineBorder(Color.blue));
        b9.setMargin(new Insets(0, 0, 0, 102));
        b9.addActionListener(this);
        b9.addMouseListener(this);
        p2.add(b9);

        b10 = new JButton("   View Book Hotel");
        b10.setBackground(new Color(0, 0, 102));
        b10.setHorizontalAlignment(SwingConstants.LEFT);
        b10.setBackground(Color.WHITE);
        b10.setFont(new Font("Tahoma", Font.BOLD, 17));
        b10.setForeground(Color.blue);
        b10.setBorder(BorderFactory.createLineBorder(Color.RED));
        b10.setBounds(0, 360, 250, 40);
        b10.setMargin(new Insets(0, 0, 0, 60));
        b10.addActionListener(this);
        b10.addMouseListener(this);
        p2.add(b10);

        b11 = new JButton("   Destinations");
        b11.setHorizontalAlignment(SwingConstants.LEFT);
        b11.setBackground(Color.WHITE);
        b11.setFont(new Font("Tahoma", Font.BOLD, 17));
        b11.setForeground(Color.blue);
        b11.setBorder(BorderFactory.createLineBorder(Color.blue));
        b11.setBounds(0, 400, 250, 40);
        b11.setMargin(new Insets(0, 0, 0, 80));
        b11.addActionListener(this);
        b11.addMouseListener(this);
        p2.add(b11);

        b12 = new JButton("   Payment");
        b12.setHorizontalAlignment(SwingConstants.LEFT);
        b12.setBackground(Color.WHITE);
        b12.setFont(new Font("Tahoma", Font.BOLD, 17));
        b12.setForeground(Color.blue);
        b12.setBorder(BorderFactory.createLineBorder(Color.red));
        b12.setBounds(0, 440, 250, 40);
        b12.setMargin(new Insets(0, 0, 0, 110));
        b12.addActionListener(this);
        b12.addMouseListener(this);
        p2.add(b12);

        b13 = new JButton("   Calculator");
        b13.setBackground(Color.white);
        b13.setHorizontalAlignment(SwingConstants.LEFT);
        b13.setFont(new Font("Tahoma", Font.BOLD, 17));
        b13.setBorder(BorderFactory.createLineBorder(Color.blue));
        b13.setForeground(Color.blue);
        b13.setBounds(0, 480, 250, 40);
        b13.addActionListener(this);
        b13.setMargin(new Insets(0, 0, 0, 100));
        b13.addMouseListener(this);
        p2.add(b13);

        b14 = new JButton("   Notepad");
        b14.setBackground(Color.WHITE);
        b14.setHorizontalAlignment(SwingConstants.LEFT);
        b14.setFont(new Font("Tahoma", Font.BOLD, 17));
        b14.setForeground(Color.blue);
        b14.setBorder(BorderFactory.createLineBorder(Color.RED));
        b14.setBounds(0, 520, 250, 40);
        b14.addActionListener(this);
        b14.setMargin(new Insets(0, 0, 0, 110));
        b14.addMouseListener(this);
        p2.add(b14);

        b15 = new JButton("   About");
        b15.setHorizontalAlignment(SwingConstants.LEFT);
        b15.setBackground(Color.white);
        b15.setFont(new Font("Tahoma", Font.BOLD, 17));
        b15.setForeground(Color.blue);
        b15.setBounds(0, 560, 250, 40);
        b15.setMargin(new Insets(0, 0, 0, 130));
        b15.addActionListener(this);
        b15.addMouseListener(this);
        b15.setBorder(BorderFactory.createLineBorder(Color.RED));
        p2.add(b15);

        b16 = new JButton("   Logout");
        b16.setHorizontalAlignment(SwingConstants.LEFT);
        b16.setBackground(Color.white);
        b16.setFont(new Font("Tahoma", Font.BOLD, 17));
        b16.setForeground(Color.blue);
        b16.setBounds(0, 600, 250, 40);
        b16.setMargin(new Insets(0, 0, 0, 130));
        b16.addActionListener(this);
        b16.addMouseListener(this);
        b16.setBorder(BorderFactory.createLineBorder(Color.blue));
        p2.add(b16);

        // Add Dashboard Image

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1540, 810, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1540, 810);
        add(l1);

        // Add label Title of Dashboard
        // l4 = new JLabel("Travel and Tourism Management System");
        l4 = new JLabel("  Tourism Management System - `TWS`  ");
        l4.setBounds(400, 100, 950, 70);
        l4.setForeground(Color.BLACK);
        l4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        l4.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 55));
        l1.add(l4);

        // add multi threading
        t1.start();
    }

    // Add action Event

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            new AddCustomer(username).setVisible(true);

        } else if (ae.getSource() == b2) {
            new UpdateCustomer(username).setVisible(true);

        } else if (ae.getSource() == b3) {
            new ViewCustomer(username).setVisible(true);
        } else if (ae.getSource() == b4) {
            new DeleteCustomer(username).setVisible(true);

        } else if (ae.getSource() == b5) {
            new CheckPackage().setVisible(true);

        } else if (ae.getSource() == b6) {
            new BookPackage(username).setVisible(true);

        } else if (ae.getSource() == b7) {
            new ViewPackage(username).setVisible(true);

        } else if (ae.getSource() == b8) {
            new CheckHotals().setVisible(true);

        } else if (ae.getSource() == b9) {
            new BookHotel(username).setVisible(true);

        } else if (ae.getSource() == b10) {
            new ViewBookedHotel(username).setVisible(true);

        } else if (ae.getSource() == b11) {
            new Destinations().setVisible(true);

        } else if (ae.getSource() == b12) {
            new Payment().setVisible(true);
            
        } else if (ae.getSource() == b13) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == b14) {

            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == b15) {
            new About().setVisible(true);

        } else if (ae.getSource() == b16) {
            // System.exit(0);
            new Feedback(username);

        }

    }

    // add Mouse Event

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == b1) {

            b1.setBackground(Color.black);
            b1.setForeground(Color.WHITE);
        } else if (e.getSource() == b2) {

            b2.setBackground(Color.black);
            b2.setForeground(Color.WHITE);
        } else if (e.getSource() == b3) {

            b3.setBackground(Color.black);
            b3.setForeground(Color.WHITE);
        } else if (e.getSource() == b4) {
            b4.setBackground(Color.black);
            b4.setForeground(Color.WHITE);

        } else if (e.getSource() == b5) {
            b5.setBackground(Color.black);
            b5.setForeground(Color.WHITE);

        } else if (e.getSource() == b6) {
            b6.setBackground(Color.black);
            b6.setForeground(Color.WHITE);

        } else if (e.getSource() == b7) {
            b7.setBackground(Color.black);
            b7.setForeground(Color.WHITE);

        } else if (e.getSource() == b8) {
            b8.setBackground(Color.black);
            b8.setForeground(Color.WHITE);

        } else if (e.getSource() == b9) {

            b9.setBackground(Color.black);
            b9.setForeground(Color.WHITE);
        } else if (e.getSource() == b10) {

            b10.setBackground(Color.black);
            b10.setForeground(Color.WHITE);
        } else if (e.getSource() == b11) {

            b11.setBackground(Color.black);
            b11.setForeground(Color.WHITE);
        } else if (e.getSource() == b12) {
            b12.setBackground(Color.black);
            b12.setForeground(Color.WHITE);

        } else if (e.getSource() == b13) {
            b13.setBackground(Color.black);
            b13.setForeground(Color.WHITE);

        } else if (e.getSource() == b14) {
            b14.setBackground(Color.black);
            b14.setForeground(Color.WHITE);

        } else if (e.getSource() == b15) {
            b15.setBackground(Color.black);
            b15.setForeground(Color.WHITE);

        } else if (e.getSource() == b16) {
            b16.setBackground(Color.black);
            b16.setForeground(Color.WHITE);

        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits a component

        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLUE);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLUE);
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLUE);
        b4.setBackground(Color.WHITE);
        b4.setForeground(Color.BLUE);
        b5.setBackground(Color.WHITE);
        b5.setForeground(Color.BLUE);
        b6.setBackground(Color.WHITE);
        b6.setForeground(Color.BLUE);
        b7.setBackground(Color.WHITE);
        b7.setForeground(Color.BLUE);
        b8.setBackground(Color.WHITE);
        b8.setForeground(Color.BLUE);
        b9.setBackground(Color.WHITE);
        b9.setForeground(Color.BLUE);
        b10.setBackground(Color.WHITE);
        b10.setForeground(Color.BLUE);
        b11.setBackground(Color.WHITE);
        b11.setForeground(Color.BLUE);
        b12.setBackground(Color.WHITE);
        b12.setForeground(Color.BLUE);
        b13.setBackground(Color.WHITE);
        b13.setForeground(Color.BLUE);
        b14.setBackground(Color.WHITE);
        b14.setForeground(Color.BLUE);
        b15.setBackground(Color.WHITE);
        b15.setForeground(Color.BLUE);
        b16.setBackground(Color.WHITE);
        b16.setForeground(Color.BLUE);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    // Multithreading
    @Override
    public void run() {

        int x = 400;
        int y = 100;
        boolean checked = true;
        while (true) {

            if (checked) {
                l4.setLocation(x, y);
                x += 5;

            } else {
                l4.setLocation(x, y);
                x -= 5;
            }
            if (x > 500) {
                checked = false;
                l4.setForeground(Color.red);
                l4.setBorder(BorderFactory.createLineBorder(Color.blue));
            } else if (x < 400) {
                checked = true;
                l4.setForeground(Color.black);
                l4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }

            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
