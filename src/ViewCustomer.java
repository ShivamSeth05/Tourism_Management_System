
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewCustomer extends JFrame implements ActionListener ,Runnable {
    // public static void main(String[] args) {
    //     new ViewCustomer("").setVisible(true);
    // }
    JButton b1;
    Thread t1;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    JLabel[] label = new JLabel[] { l1, l2, l3, l4, l5, l6, l7, l8, l9, l10 };
    JLabel l12,l13,l14,l15,l16,l17,l18,l19,l110;

    ViewCustomer(String username) {

        
        setLayout(null);
        setBounds(570, 220, 720, 560);
        // getContentPane().setBackground(Color.black);
      

        
        
        
        ImageIcon i1 = null, i2 = null, i3 = null, i4 = null, i5 = null, i6 = null, i7 = null, i8 = null, i9 = null,
        i10 = null;
        ImageIcon[] image = new ImageIcon[] { i1, i2, i3, i4, i5, i6, i7, i8, i9, i10 };
        
        Image j1 = null, j2 = null, j3 = null, j4 = null, j5 = null, j6 = null, j7 = null, j8 = null, j9 = null,
        j10 = null;
        Image[] jimage = new Image[] { j1, j2, j3, j4, j5, j6, j7, j8, j9, j10 };
        
        ImageIcon i11 = null, i12 = null, i13 = null, i14 = null, i15 = null, i16 = null, i17 = null, i18 = null,
        i19 = null, i20 = null;
        ImageIcon[] iimage = new ImageIcon[] { i11, i12, i13, i14, i15, i16, i17, i18, i19, i20 };
        
        for (int i = 0; i <= 9; i++) {

            image[i] = new ImageIcon(
                ClassLoader.getSystemResource("ICONS/dest" + (i + 1) + ".jpg"));
                jimage[i] = image[i].getImage().getScaledInstance(720, 550, Image.SCALE_DEFAULT);
                iimage[i] = new ImageIcon(jimage[i]);
                this.label[i] = new JLabel(iimage[i]);
                this.label[i].setBounds(0, 370, 720, 150);
                add(this.label[i]);
                
                t1 = new Thread(this);
                t1.start();
            
                }
            // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/Management/System/ICONS/2714452.jpg"));
            // Image i2 = i1.getImage().getScaledInstance(720, 150, Image.SCALE_DEFAULT);
            // ImageIcon i3 = new ImageIcon(i2);
            // JLabel l1 = new JLabel(i3);
            // l1.setBounds(0, 370, 720, 150);
            // add(l1);
            
            JLabel l2 = new JLabel("Username :");
            l2.setBounds(30, 50, 100, 30);
            l2.setFont(new Font("Tahoma", Font.BOLD, 15));
            l2.setForeground(Color.black);
            add(l2);
            
            l12 = new JLabel();
            l12.setBounds(190, 50, 200, 30);
            l12.setForeground(Color.black);
            l12.setFont(new Font("Tahoma", Font.BOLD, 15));
            add(l12);
            
            JLabel l3 = new JLabel("Id :");
            l3.setBounds(30, 100, 100, 25);
            l3.setForeground(Color.black);
            l3.setFont(new Font("Tahoma", Font.BOLD, 15));
            add(l3);
            
             l13 = new JLabel();
            l13.setBounds(190, 100, 200, 25);
            l13.setForeground(Color.black);
            l13.setFont(new Font("Tahoma", Font.BOLD, 15));
            add(l13);
            
            JLabel l4 = new JLabel("Number :");
            l4.setBounds(30, 150, 100, 25);
            l4.setForeground(Color.black);
            l4.setFont(new Font("Tahoma", Font.BOLD, 15));
            add(l4);
            
             l14 = new JLabel();
            l14.setBounds(190, 150, 200, 25);
            l14.setForeground(Color.black);
            l14.setFont(new Font("Tahoma", Font.BOLD, 15));
            add(l14);
            JLabel l5 = new JLabel("name :");
            l5.setBounds(30, 200, 100, 25);
            l5.setForeground(Color.black);
            l5.setFont(new Font("Tahoma", Font.BOLD, 15));
            add(l5);
            
             l15 = new JLabel();
            l15.setForeground(Color.black);
            l15.setBounds(190, 200, 200, 25);
            l15.setFont(new Font("Tahoma", Font.BOLD, 15));
            add(l15);
            
            JLabel l6 = new JLabel("Gender :");
            l6.setBounds(30, 250, 100, 25);
            l6.setForeground(Color.black);
            l6.setFont(new Font("Tahoma", Font.BOLD, 15));
            add(l6);
            
             l16 = new JLabel();
            l16.setBounds(190, 250, 200, 25);
            l16.setForeground(Color.black);
            l16.setFont(new Font("Tahoma", Font.BOLD, 15));
            add(l16);
            
            JLabel l7 = new JLabel("Country :");
            l7.setBounds(360, 50, 100, 25);
            l7.setForeground(Color.black);
            l7.setFont(new Font("Tahoma", Font.BOLD, 15));
            add(l7);
            
             l17 = new JLabel();
            l17.setBounds(520, 50, 200, 25);
            l17.setForeground(Color.black);
            l17.setFont(new Font("Tahoma", Font.BOLD, 15));
            add(l17);
            
            JLabel l8 = new JLabel("Address :");
            l8.setBounds(360, 100, 100, 25);
            l8.setForeground(Color.black);
            l8.setFont(new Font("Tahoma", Font.BOLD, 15));
            add(l8);
            
             l18 = new JLabel();
            l18.setBounds(520, 100, 200, 25);
            l18.setForeground(Color.black);
            l18.setFont(new Font("Tahoma", Font.BOLD, 15));
            add(l18);
            
            JLabel l9 = new JLabel("Phone :");
            l9.setBounds(360, 150, 100, 25);
            l9.setForeground(Color.black);
            l9.setFont(new Font("Tahoma", Font.BOLD, 15));
            add(l9);
            
             l19 = new JLabel();
            l19.setBounds(520, 150, 200, 25);
            l19.setForeground(Color.black);
            l19.setFont(new Font("Tahoma", Font.BOLD, 15));
            add(l19);
            
            JLabel l10 = new JLabel("Email :");
            l10.setBounds(360, 200, 100, 25);
            l10.setForeground(Color.black);
            l10.setFont(new Font("Tahoma", Font.BOLD, 15));
            add(l10);

             l110 = new JLabel();
            l110.setBounds(520, 200, 200, 25);
            l110.setForeground(Color.black);
            l110.setFont(new Font("Tahoma", Font.BOLD, 15));
            add(l110);
            
         
        
        b1 = new JButton("Back");
        b1.setBounds(305, 340, 100, 25);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
        
            
            try {
                Conns c = new Conns();
            ResultSet rs = c.stmt.executeQuery("Select * from customer where username ='" + username + "'");
            while (rs.next()) {
                l12.setText(rs.getString("username"));
                l13.setText(rs.getString("id"));
                l14.setText(rs.getString("number"));
                l15.setText(rs.getString("name"));
                l16.setText(rs.getString("gender"));
                l17.setText(rs.getString("country"));
                l18.setText(rs.getString("address"));
                l19.setText(rs.getString("phone"));
                l110.setText(rs.getString("email"));

            }

        } catch (SQLException e1) {
            
            e1.printStackTrace();
        }
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            
            this.setVisible(false);
        }

    }

    

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 9; i++) {
                this.label[i].setVisible(true);
                Thread.sleep(2000);
                this.label[i].setVisible(false);

                if(i==9){
                    i=0;
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
