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
 * @author pawan
 */
public class SQLCreateGuest {
     public SQLCreateGuest(String tname,String a,String b,String f,String d) {
    
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
        if (tname.equals("Guest")) {
              SQL = "create table Guest (id INTEGER not null auto_increment,name varchar(30),gender varchar(10),phone varchar(20),Address varchar(80),Rank varchar(20),Vehicle varchar(10),License varchar(80),primary key (id),Time_in timestamp not null,Time_out timestamp null)";
  
        }//name,gender,phone,address,rank,Vehicle,drvlic,Time_in,Date
        stmt.executeUpdate(SQL);
        md = c.getMetaData();
        rs = md.getTables(null, null, "%", null);
        msg = "Table >>> ";
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
