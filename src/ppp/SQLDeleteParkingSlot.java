/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppp;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author pawan
 */
public class SQLDeleteParkingSlot {
     public SQLDeleteParkingSlot(String n,String n1,String n2,String n3,String n4)
    {
      Connection theConn = null; String SQL;
    try {
      SQLCONNECTION_NEW  MyCon = new SQLCONNECTION_NEW(n1,n2,n3,n4);
      theConn = MyCon.getConnection("Software_Parking_Project");
      Statement stmt = theConn.createStatement();      
      SQL = "delete from ParkingSlot where Slots='" + n + "'";
      stmt.executeUpdate(SQL);
        JOptionPane.showMessageDialog(null,"Slot Number"+n+"is now Empty");
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
