/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author admin
 */
public class DbConnection {
    public static Connection c;
    public static Statement s;
    static{
        try{
           c = DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingdb"+"?useSSL=false","root","root");
           s = c.createStatement();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
