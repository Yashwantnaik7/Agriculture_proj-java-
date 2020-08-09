/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BbmsPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yash
 */
public class MyConnection {
    public static Connection getConnection()
    {
       Connection con=null;
       
           try {
               Class.forName("com.mysql.jdbc.Driver");
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbmsproj","root","mypass");
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
           } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
           return con;
       
    }
    
}
