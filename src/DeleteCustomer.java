
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class DeleteCustomer extends JFrame implements ActionListener{
    
    JButton b1,b2;
    String username;
    DeleteCustomer(String user){
        this.username = user;

        setBounds(570,220,750,570);
        setLayout(null);
        getContentPane().setBackground(Color.black);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/delete.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(380, 50, 300, 400);
        add(l10);
        
        
        JLabel heading = new JLabel("DELETE CUSTOMER DETAILS");
        heading.setFont(new Font("Tahoma",Font.PLAIN,20));
        heading.setForeground(Color.WHITE);
        heading.setBounds(100,10,300,30);
        add(heading);
        
        JLabel l1 = new JLabel("Username :");
        l1.setBounds(30, 50, 100, 25);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Tamoha", Font.BOLD, 15));
        add(l1);
        
        JLabel l11 = new JLabel();
        l11.setBounds(170, 50, 200, 25);
        l11.setForeground(Color.WHITE);
        l11.setFont(new Font("Tamoha", Font.BOLD, 15));
        add(l11);
        
        JLabel l2 = new JLabel("Name");
        l2.setBounds(30, 95, 100, 25);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Tamoha", Font.BOLD, 15));
        add(l2);
        
        JLabel l12 = new JLabel();
        l12.setForeground(Color.WHITE);
        l12.setFont(new Font("Tamoha", Font.BOLD, 15));
        l12.setBounds(170, 95, 200, 25);
        add(l12);
        
        JLabel l3 = new JLabel("ID :");
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Tamoha", Font.BOLD, 15));
        l3.setBounds(30, 140, 100, 25);
        add(l3);
        
        JLabel l13 = new JLabel();
        l13.setForeground(Color.WHITE);
        l13.setFont(new Font("Tamoha", Font.BOLD, 15));
        l13.setBounds(170, 140, 200, 25);
        add(l13);
        
        JLabel l4 = new JLabel("Number :");
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Tamoha", Font.BOLD, 15));
        l4.setBounds(30, 185, 100, 25);
        add(l4);
        
        JLabel l14 = new JLabel();
        l14.setForeground(Color.WHITE);
        l14.setBounds(170, 185, 200, 25);
        l14.setFont(new Font("Tamoha", Font.BOLD, 15));
        add(l14);
        
        JLabel l5 = new JLabel("Gender :");
        l5.setForeground(Color.WHITE);
        l5.setFont(new Font("Tamoha", Font.BOLD, 15));
        l5.setBounds(30, 225, 100, 25);
        add(l5);
        
        JLabel l15 = new JLabel();
        l15.setForeground(Color.WHITE);
        l15.setBounds(170, 225, 200, 25);
        l15.setFont(new Font("Tamoha", Font.BOLD, 15));
        add(l15);
        
        JLabel l6 = new JLabel("Country :");
        l6.setForeground(Color.WHITE);
        l6.setFont(new Font("Tamoha", Font.BOLD, 15));
        l6.setBounds(30, 270, 100, 25);
        add(l6);
        
        JLabel l16 = new JLabel();
        l16.setForeground(Color.WHITE);
        l16.setFont(new Font("Tamoha", Font.BOLD, 15));
        l16.setBounds(170, 270, 200, 25);
        add(l16);

        JLabel l7 = new JLabel("Address :");
        l7.setForeground(Color.WHITE);
        l7.setFont(new Font("Tamoha", Font.BOLD, 15));
        l7.setBounds(30, 315, 100, 25);
        add(l7);

        JLabel l17 = new JLabel();
        l17.setForeground(Color.WHITE);
        l17.setFont(new Font("Tamoha", Font.BOLD, 15));
        l17.setBounds(170, 315, 200, 25);
        add(l17);
        
        JLabel l8 = new JLabel("Phone :");
        l8.setForeground(Color.WHITE);
        l8.setFont(new Font("Tamoha", Font.BOLD, 15));
        l8.setBounds(30, 365, 100, 25);
        add(l8);
        
        JLabel l18 = new JLabel();
        l18.setForeground(Color.WHITE);
        l18.setBounds(170, 365, 200, 25);
        l18.setFont(new Font("Tamoha", Font.BOLD, 15));
        add(l18);
        
        JLabel l9 = new JLabel("Email :");
        l9.setForeground(Color.WHITE);
        l9.setFont(new Font("Tamoha", Font.BOLD, 15));
        l9.setBounds(30, 410, 100, 25);
        add(l9);
        
        JLabel l19 = new JLabel();
        l19.setForeground(Color.WHITE);
        l19.setBounds(170, 410, 200, 25);
        l19.setFont(new Font("Tamoha", Font.BOLD, 15));
        add(l19);

        try {
            Conns c =new Conns();
            ResultSet rs = c.stmt.executeQuery("select * from customer where username = '"+username+"' ");
            while (rs.next()) {
                l11.setText(rs.getString("username"));
                l12.setText(rs.getString("name"));
                l13.setText(rs.getString("id"));
                l14.setText(rs.getString("number"));
                l15.setText(rs.getString("gender"));
                l16.setText(rs.getString("country"));
                l17.setText(rs.getString("address"));
                l18.setText(rs.getString("phone"));
                l19.setText(rs.getString("email"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        b1 = new JButton("Delete");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.setBounds(50, 470,100, 30);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.setBounds(220, 470,100, 30);
        b2.addActionListener(this);
        add(b2);
        
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==b1){
            // JOptionPane.showMessageDialog(null, "Are You ");
            // JOptionPane.showConfirmDialog(null, "Are You Sure !");
            int input = JOptionPane.showConfirmDialog(null, 
            "Are You Sure ?", "Select an Option...",JOptionPane.YES_NO_CANCEL_OPTION);
            if (input==0) {
                
                try {
                        Conns c = new Conns();
                        c.stmt.executeUpdate("delete from account where username = '"+username+"'");
                        c.stmt.executeUpdate("delete from bookhotel where username = '"+username+"'");
                        c.stmt.executeUpdate("delete from bookpackage where username = '"+username+"'");
                        c.stmt.executeUpdate("delete from customer where username = '"+username+"'");
                        
                        JOptionPane.showMessageDialog(null, "Customer Details Deleted Successfully");
                        
                        // System.exit(0);
                        new Feedback(username);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                
                
                
        }
        else if (ae.getSource()==b2){
            this.setVisible(false);
            
            
        }
    }
    
   
}
