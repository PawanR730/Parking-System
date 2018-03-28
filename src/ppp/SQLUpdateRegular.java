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
public class SQLUpdateRegular {
     
    public SQLUpdateRegular(String n1,String n2,String n3,String n4,String name,String password,String username,String address,String Vehicle,String phone)
    {
         Connection theConn = null; String SQL;
    try {
      SQLCONNECTION_NEW  MyCon = new SQLCONNECTION_NEW(n1,n2,n3,n4);
      theConn = MyCon.getConnection("Software_Parking_Project");
      Statement stmt = theConn.createStatement();      
      SQL = "update Regular set address='"+ address + "',  " + "user='" + username +"', " + "password='" + password +"', " + "phone='" + phone +"'," + "Vehicle='" + Vehicle +"'"+" where name='"+ name +"'";
      stmt.executeUpdate(SQL);
        JOptionPane.showMessageDialog(null, "Update Successful");
    }
    catch (SQLException ex) {
      System.out.println(ex);
    }
    finally {
      try {
        if (theConn != null) theConn.close();
      }
      catch (SQLException e) {
      }
    }
  }
    }
            
    
    

