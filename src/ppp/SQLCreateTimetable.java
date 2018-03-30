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
public class SQLCreateTimetable {
    
    public SQLCreateTimetable(String tname,String a,String b,String f,String d) {
    
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
        if (tname.equals("Timetable")) {
            System.out.println("Entered");
              SQL = "create table Timetable"+ "(id INTEGER not null auto_increment ,primary key (id),"
                      + "Time_in timestamp not null DEFAULT CURRENT_TIMESTAMP,"
                      + "Time_out timestamp null ,"
                      + "Date VARCHAR(12),"
                      + "name VARCHAR(30),"
                      + "Slot VARCHAR(15),"
                      + "Vehicle VARCHAR(15))";
                      
              
             
              
              
  
        }
        stmt.executeUpdate(SQL);
        md = c.getMetaData();
        rs = md.getTables(null, null, "%", null);
        msg = "Table Timetable>>> ";
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
