package mystart;

import java.awt.Image;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class help {
    //////////////Message Box
    public static void msgBox(String Message)
    {
        JOptionPane.showMessageDialog(null, Message);
    }
    /////////////Set Icon TO The Form
    public static void setIcon(JFrame form)
    {
        Image img;
        try {
            img = ImageIO.read(help.class.getResource("Hotel_icon.png"));
            form.setIconImage(img);
        } catch (IOException ex) {
            Logger.getLogger(help.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    /////////////set scal image 
    public static ImageIcon setScalImage(int width,int hight,String ImageName)
    {
         Image m,i = null;
         try {
            m = ImageIO.read(help.class.getResource(ImageName));
            i = m.getScaledInstance(width , hight, Image.SCALE_AREA_AVERAGING);      
        } catch (IOException ex) {
            Logger.getLogger(Passward.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImageIcon ic = new ImageIcon(i);
        return ic;
    }
    ////////////////// variable in room
    public static Object roomNum;
    public static Date din;
    public static Date dout;
    public static int days;
    public static String Rec_ID;
    public static String Cust_ID;
    public static String Cust_Name;
    public static String bill_ID;
    
    public static Connection getConnected()
    {
        Connection c =null;
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/golden_hotel","root","123456789");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
        }
        return c ;
    }
    
}
