/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BbmsPack;

/**
 *
 * @author Yash
 */

public class Startspl {
     public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        splash Spl=new splash();
        FrontEnd fe=new FrontEnd();
    
        Spl.setVisible(true);
        try{
          for(int i=0;i<=100;i++)
          {
              Thread.sleep(40);
              splash.valtxt.setText(Integer.toString(i)+"%");
              splash.bartxt.setValue(i);
              if(i==100)
              {
                  Spl.setVisible(false);
                 
                  
              }
          }
          
          
        }
        catch(InterruptedException e)
        {
            
        }
        fe.setVisible(true);
    
}
}
