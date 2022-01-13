/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystart;

import javax.swing.JOptionPane;

/**
 *
 * @author The Prince
 */
public class Mystart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start fr =  new start();
        fr.setVisible(true);
        firstfrm f = new firstfrm();
       try{
            for (int i = 0; i < 102; i+=2) {    
               Thread.sleep(40);
               start.jpb1.setValue(i);
               start.lblcount.setText(start.jpb1.getValue()+"%");
               if(i==100)
                {
                    fr.setVisible(false);
                    f.setVisible(true);
                    help.setIcon(f);
                }
           }
            }
       catch(Exception ex)
       { JOptionPane.showConfirmDialog(null, ex);}
    }
}
