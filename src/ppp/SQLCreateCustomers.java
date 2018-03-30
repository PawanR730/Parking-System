/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppp;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import ppp.SQLCONNECTION_NEW;
import ppp.SQLCONNECTION_NEW;

/**
 *
 * @author Ramya B
 */
public class SQLCreateCustomers {
    
     public SQLCreateCustomers(String tname,String a,String b,String f,String d) {
    
    Connection c;    SQLCONNECTION_NEW MyCon;
    Statement stmt;  String SQL="";
    ResultSet rs;    DatabaseMetaData md;
    boolean found=false; String msg="";
    try {
      MyCon = new  SQLCONNECTION_NEW(a,b,f,d);
      c = MyCon.getConnection("Software_Parking_Project");
      md = c.getMetaData();
      rs = md.getTables(null, null, "%", null);
      while (rs.next()) {
        if (rs.getString(3).equals(tname)) {
          found = true;
          break;
        }
      }
      stmt = c.createStatement();
      if (!found) {
        if (tname.equals("Customers")) {
              SQL = "create table Customers (id INTEGER NOT NULL AUTO_INCREMENT, primary key(id),Total_Customers integer not NULL,"
                  + "Regular_Customers INTEGER not NULL,Guest_Customers INTEGER not NULL)"+"";
        }
        stmt.executeUpdate(SQL);
        md = c.getMetaData();
        rs = md.getTables(null, null, "%", null);
        msg = "Table Customer >>> ";
        while (rs.next()) {
          if (rs.getString(3).equals(tname)) {
              msg = msg+rs.getString(3).toUpperCase();
              break;
          }
        }
        msg = msg+" is Created";
        JOptionPane.showMessageDialog(null, msg);
      }
    }
    catch (SQLException ex) {
      JOptionPane.showMessageDialog(null,ex);
    }
  }
    
}
