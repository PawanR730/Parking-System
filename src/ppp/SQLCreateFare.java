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
/**
 *
 * @author Ramya B
 */
public class SQLCreateFare {
    public SQLCreateFare(String tname,String a,String b,String f,String d) {
    
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
        if (tname.equals("Fares")) {
              SQL = "create table Fare (id INT AUTO_INCREMENT primary key NOT NULL,"
                  + "monthly_fare INT not NULL,daily_fare INT not NULL,mtax DECIMAL(9,3) not NULL,dtax DECIMAL(9,3)not NULL,Time TIMESTAMP DEFAULT CURRENT_TIMESTAMP)"+"";
  
        }
        stmt.executeUpdate(SQL);
        md = c.getMetaData();
        rs = md.getTables(null, null, "%", null);
        msg = "Table Fare>>> ";
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
