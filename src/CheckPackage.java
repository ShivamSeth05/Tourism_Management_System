
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class CheckPackage extends JFrame {
    CheckPackage() {

        String [] package1 = new String[] {"GOLD PACKAGE","6 days and 7 Nights ","Airport Assistance","Half Day City Tour"," Daily Buffet"," Welcome Drinks on Arrival "," Full Day 3 Island Cruise"," English Speaking Guide"," BOOK NOW"," SUMMER SPECIAL"," Rs 32000/-","package1.jpg"};
        String [] package2 = new String[] {"SILVER PACKAGE","5 days and 6 Nights ","Toll Free and Entrace Free Tickets ","Meet and Greet at Airport"," Welcome Drinks at Arrival"," Night Safari "," Full Day 3 Island Cruise"," Cruise with Dinner"," BOOK NOW"," WINTER SPECIAL"," Rs 24000/-","package2.jpg"};
        String [] package3 = new String[] {"BRONZE PACKAGE","6 days and 5 Nights ","Return Airfare ","Free Horse Riding & other Games"," Welcome Drinks at Arrival "," Daily Buffet"," Stay in Five Star Hotel","BBQ Dinner"," BOOK NOW"," WINTER SPECIAL"," Rs 12000/-","package3.jpg"};


        setBounds(500, 200, 800, 600);

        JTabbedPane pane = new JTabbedPane();
        JPanel p1 =createpackage(package1);
        pane.addTab("package1",null, p1);//title ,compnent

       
        JPanel p2 =createpackage(package2);
        pane.addTab("package2",null, p2);//title ,compnent
        
        JPanel p3 =createpackage(package3);
        pane.addTab("package3",null, p3);//title ,compnent
        
        add(pane,BorderLayout.CENTER);


    }

    public JPanel createpackage(String[] pack){
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);

        JLabel l1 =new JLabel(pack[0]);
        l1.setBounds(40, 10, 300, 25);
        l1.setFont(new Font("Tahoma",Font.PLAIN,25));
        p1.add(l1);

        JLabel l2 =new JLabel(pack[1]);
        l2.setBounds(40, 60, 300, 25);
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Tahoma",Font.PLAIN,15));
        p1.add(l2);

        JLabel l3 =new JLabel(pack[2]);
        l3.setBounds(40, 110, 300, 25);
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("Tahoma",Font.PLAIN,15));
        p1.add(l3);

        JLabel l4 =new JLabel(pack[3]);
        l4.setBounds(40, 160, 300, 25);
        l4.setForeground(Color.RED);
        l4.setFont(new Font("Tahoma",Font.PLAIN,15));
        p1.add(l4);

        JLabel l5 =new JLabel(pack[4]);
        l5.setBounds(40, 210, 300, 25);
        l5.setForeground(Color.BLUE);
        l5.setFont(new Font("Tahoma",Font.PLAIN,15));
        p1.add(l5);

        JLabel l6 =new JLabel(pack[5]);
        l6.setBounds(40, 260, 300, 25);
        l6.setForeground(Color.RED);
        l6.setFont(new Font("Tahoma",Font.PLAIN,15));
        p1.add(l6);

        JLabel l7 =new JLabel(pack[6]);
        l7.setBounds(40, 310, 300, 25);
        l7.setForeground(Color.BLUE);
        l7.setFont(new Font("Tahoma",Font.PLAIN,15));
        p1.add(l7);

        JLabel l8 =new JLabel(pack[7]);
        l8.setBounds(40, 360, 300, 25);
        l8.setForeground(Color.RED);
        l8.setFont(new Font("Tahoma",Font.PLAIN,15));
        p1.add(l8);

        JLabel l9 =new JLabel(pack[8]);
        l9.setBounds(40, 430, 300, 32);
        l9.setForeground(Color.BLUE);
        l9.setFont(new Font("Tahoma",Font.PLAIN,32));
        p1.add(l9);

        JLabel l10 =new JLabel(pack[9]);
        l10.setBounds(280, 490, 300, 32);
        l10.setForeground(Color.RED);
        l10.setFont(new Font("Tahoma",Font.PLAIN,32));
        p1.add(l10);

        JLabel l11 =new JLabel(pack[10]);
        l11.setBounds(600, 490, 300, 32);
        l11.setForeground(Color.RED);
        l11.setFont(new Font("Tahoma",Font.BOLD,32));
        p1.add(l11);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/"+pack[11]+""));
        Image i2=i1.getImage().getScaledInstance(450, 400, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel l12 =new JLabel(i3);
        l12.setBounds(300,30,450,400);
        p1.add(l12);


        return p1;

    }

    

}
