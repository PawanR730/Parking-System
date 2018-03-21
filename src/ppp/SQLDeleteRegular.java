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
      
    public SQLDeleteRegular(String n,String n1,String n2,String n3,String n4)
    {
      Connection theConn = null; String SQL;
    try {
      SQLCONNECTION_NEW  MyCon = new SQLCONNECTION_NEW(n1,n2,n3,n4);
      theConn = MyCon.getConnection("Software_Parking_Project");
      Statement stmt = theConn.createStatement();      
      SQL = "delete from Regular where Vehicle='" + n + "'";
      stmt.executeUpdate(SQL);
        JOptionPane.showMessageDialog(null,"Customer with Vehicle Number "+n+ " is Deleted Successful");
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
