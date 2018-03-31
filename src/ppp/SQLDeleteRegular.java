/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppp;

/**
 *
 * @author pawan
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class SQLDeleteRegular {
      
    public SQLDeleteRegular(String n,String n1,String n2,String n3,String n4,int n5,int n6)
    {
      Connection theConn = null; String SQL;
    try {
      SQLCONNECTION_NEW  MyCon = new SQLCONNECTION_NEW(n1,n2,n3,n4);
      theConn = MyCon.getConnection("Software_Parking_Project");
      Statement stmt = theConn.createStatement();      
      SQL = "delete from Regular where Vehicle='" + n + "'";
      stmt.executeUpdate(SQL);
        JOptionPane.showMessageDialog(null,"Customer with Vehicle Number "+n+ " is Deleted Successful");n6=n6-1;int guest=n5-n6;
        SQL = "INSERT INTO Customers(Total_Customers,Regular_Customers,Guest_Customers) VALUES ('"+n5+"','"+n6+"','"+guest+"')";  
                stmt.executeUpdate(SQL); 
                JOptionPane.showMessageDialog(null, "Regular Customers updated");
    }
    catch (SQLException ex) {
      System.out.println(ex);
    }
    finally {
      try {
        if (theConn != null) theConn.close();
      }
      catch (Exception e) {
      }
    }
    }
    
}
