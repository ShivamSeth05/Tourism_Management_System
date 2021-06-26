
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.ResultSet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ViewPackage extends JFrame implements ActionListener{
    
    JButton b1;
    ViewPackage(String username){ 
        setBounds(500, 200, 850, 460);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/bookedDetails.jpg"));
        Image i2=i1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel il = new JLabel(i3);
        il.setBounds(360, 40, 450, 320);
        add(il);

        
        JLabel l1 = new JLabel("VIEW PACKAGE DETAILS");
        l1.setBounds(80, 10, 300, 30);
        l1.setFont(new Font("Yu Mincho", Font.BOLD, 20));
        add(l1);

        JLabel l2 = new JLabel("Username :");
        l2.setBounds(30, 70, 100, 30);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l2);

        JLabel l11 = new JLabel();
        l11.setBounds(180, 70, 100, 30);
        l11.setForeground(Color.BLACK);
        l11.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l11);

        JLabel l3 = new JLabel("Package :");
        l3.setBounds(30, 110, 100, 30);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l3);

        JLabel l12 = new JLabel();
        l12.setBounds(180, 110, 150, 30);
        l12.setForeground(Color.BLACK);
        l12.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l12);

        JLabel l4 = new JLabel("Total persons :");
        l4.setBounds(30, 150, 150, 30);
        l4.setBounds(30, 150, 150, 30);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l4);

        JLabel l13 = new JLabel();
        l13.setBounds(180, 150, 100, 30);
        l13.setForeground(Color.BLACK);
        l13.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l13);

        JLabel l5 = new JLabel("ID :");
        l5.setBounds(30, 190, 100, 30);
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l5);

        JLabel l14 = new JLabel();
        l14.setBounds(180, 190, 100, 30);
        l14.setForeground(Color.BLACK);
        l14.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l14);

        JLabel l6 = new JLabel("Number :");
        l6.setBounds(30, 230, 100, 30);
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l6);

        JLabel l15 = new JLabel();
        l15.setBounds(180, 230, 100, 30);
        l15.setForeground(Color.BLACK);
        l15.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l15);

        JLabel l7 = new JLabel("Phone :");
        l7.setBounds(30, 270, 100, 30);
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l7);

        JLabel l16 = new JLabel();
        l16.setBounds(180, 270, 100, 30);
        l16.setForeground(Color.BLACK);
        l16.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l16);

        JLabel l8 = new JLabel("Price :");
        l8.setBounds(30, 310, 100, 30);
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(l8);

        JLabel l17 = new JLabel();
        l17.setBounds(180, 310, 150, 30);
        l17.setForeground(Color.RED);
        l17.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(l17);

        b1 = new JButton("Back");
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.setBounds(150, 380, 100, 25);
        b1.addActionListener(this);
        add(b1);

        try {
            Conns c = new Conns();
            ResultSet rs=c.stmt.executeQuery("select * from bookpackage where username = '"+username+"'");
            while(rs.next()){
                l11.setText(rs.getString("username"));
                l12.setText(rs.getString("package"));
                l13.setText(rs.getString("persons"));
                l14.setText(rs.getString("id"));
                l15.setText(rs.getString("number"));
                l16.setText(rs.getString("phone"));
                l17.setText(rs.getString("price"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void actionPerformed(ActionEvent ae){
      
            this.setVisible(false);


    }

    
}
