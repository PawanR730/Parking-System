
package ppp;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
public class SQLCONNECTION_NEW {
    String address,port,user,pass;
  Connection c;  SQLCONNECTION_NEW MyCon;
  Statement stmt; String SQL;
  DatabaseMetaData md; ResultSet rs;
  boolean found=false; String msg="";
   public SQLCONNECTION_NEW(String a,String b,String c,String d)
   {
       address=a;
       port=b;
       user=c;
       pass=d;
       
   }
    public Connection getConnection(String fn) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      String url ="jdbc:mysql://"+ address +":"+ port +"/"+fn;
      c = DriverManager.getConnection(url,user, pass);
    }
    catch (ClassNotFoundException | SQLException e) {
      JOptionPane.showMessageDialog(null, "Could not connect to Database!\nPlease check the information that you entered");
    }
    return c;
  }
    public void CreateDB(String fn) {
    try {
      MyCon = new SQLCONNECTION_NEW(address,port,user,pass);
      c = MyCon.getConnection("");
     stmt = c.createStatement();
      SQL = "show databases";
      rs = stmt.executeQuery(SQL);
      while (rs.next()) {
        if (rs.getString(1).toUpperCase().equals(fn)){
          found = true;
          break;
        }
      }
      if (!found) {
        SQL = "create database " + fn;
        stmt.executeUpdate(SQL);
        SQL = "show databases";
        rs = stmt.executeQuery(SQL);
      
        msg = "DataBase >>> ";
        while (rs.next()) {
          if (rs.getString(1).toUpperCase().equals(fn)){
            msg = msg+rs.getString(1).toUpperCase();
            break;
          }
        }
        msg = msg+" is Created";
        JOptionPane.showMessageDialog(null, msg);
      }
      
    }
    catch (SQLException | HeadlessException e) {
       System.out.println(e);
    }
  }
  
}
    

