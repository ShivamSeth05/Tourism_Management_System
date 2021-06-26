
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


public class ViewBookedHotel extends JFrame implements ActionListener{
    // public static void main(String[] args) {
    //     new ViewBookedHotel("").setVisible(true);
    // }
    JButton b1;
    ViewBookedHotel(String username){
        setBounds(460, 200, 960, 600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/bookedhotelDetails.jpg"));
        Image i2=i1.getImage().getScaledInstance(480, 540, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel il = new JLabel(i3);
        il.setBounds(450, 10, 480, 540);
        add(il);

        
        JLabel l1 = new JLabel("VIEW BOOKED HOTEL DETAILS");
        l1.setBounds(70, 10, 320, 30);
        l1.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        add(l1);

        JLabel l2 = new JLabel("Username :");
        l2.setBounds(30, 70, 100, 30);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l2);

        JLabel l11 = new JLabel();
        l11.setBounds(180, 70, 100, 30);
        l11.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l11);

        JLabel l3 = new JLabel("Hotel Name :");
        l3.setBounds(30, 110, 100, 30);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l3);

        JLabel l12 = new JLabel();
        l12.setBounds(180, 110, 220, 30);
        l12.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l12);

        JLabel l4 = new JLabel("Total persons :");
        l4.setBounds(30, 150, 100, 30);
        l4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l4);

        JLabel l13 = new JLabel();
        l13.setBounds(180, 150, 100, 30);
        l13.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l13);

        JLabel l5 = new JLabel("Total Days :");
        l5.setBounds(30, 190, 100, 30);
        l5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l5);

        JLabel l14 = new JLabel();
        l14.setBounds(180, 190, 100, 30);
        l14.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l14);

        JLabel l6 = new JLabel("Ac Included?");
        l6.setBounds(30, 230, 100, 30);
        l6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l6);

        JLabel l15 = new JLabel();
        l15.setBounds(180, 230, 100, 30);
        l15.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l15);

        JLabel l7 = new JLabel("Food Included?");
        l7.setBounds(30, 270, 115, 30);
        l7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l7);

        JLabel l16 = new JLabel();
        l16.setBounds(180, 270, 100, 30);
        l16.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l16);

        
        JLabel l8 = new JLabel("ID :");
        l8.setBounds(30, 310, 100, 30);
        l8.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l8);

        JLabel l17 = new JLabel();
        l17.setBounds(180, 310, 100, 30);
        l17.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l17);

        JLabel l9 = new JLabel("Number :");
        l9.setBounds(30, 350, 100, 30);
        l9.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l9);

        JLabel l18 = new JLabel();
        l18.setBounds(180, 350, 100, 30);
        l18.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l18);

        JLabel l10 = new JLabel("Phone :");
        l10.setBounds(30, 390, 100, 30);
        l10.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l10);

        JLabel l19 = new JLabel();
        l19.setBounds(180, 390, 100, 30);
        l19.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l19);

        JLabel l011 = new JLabel("Total Cost :");
        l011.setBounds(30, 430, 100, 30);
        l011.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(l011);

        JLabel l20 = new JLabel();
        l20.setBounds(180, 430, 100, 30);
        l20.setForeground(Color.red);
        l20.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(l20);
        

        b1 = new JButton("Back");
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.setBounds(160, 500, 100, 25);
        b1.addActionListener(this);
        add(b1);

        try {
            Conns c = new Conns();
            ResultSet rs=c.stmt.executeQuery("select * from bookhotel where username = '"+username+"'");
            while(rs.next()){
                l11.setText(rs.getString(1));
                l12.setText(rs.getString(2));
                l13.setText(rs.getString(3));
                l14.setText(rs.getString(4));
                l15.setText(rs.getString(5));
                l16.setText(rs.getString(6));
                l17.setText(rs.getString(7));
                l18.setText(rs.getString(8));
                l19.setText(rs.getString(9));
                l20.setText(rs.getString(10));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void actionPerformed(ActionEvent ae){
      
            this.setVisible(false);


    }

    
}
