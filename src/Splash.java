
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Splash {
    
}

class SplashFrame extends JFrame implements Runnable{
    Thread t1;
    SplashFrame() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        add(l1);
        setBounds(200, 180, 1200, 500);// location ,Size
        setUndecorated(true);
        t1 = new Thread(this);
        t1.start();
        
    }

    @Override
    public void run() {
        try{
            Thread.sleep(7000);
            this.setVisible(false);
            
            Login l = new Login();
            l.setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public static void main(String[] arg) {
    
        SplashFrame frame = new SplashFrame();
        // multithreading
    
        frame.setVisible(true);
        int x = 1;
        for (int i = 0; i <= 500; i += 4, x += 5) {
    
            frame.setLocation(762 - (x + i) / 2, 410 - (i / 2));
    
            frame.setSize(x + i, i);
    
            try {
                Thread.sleep(10);
    
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    
    }
}
