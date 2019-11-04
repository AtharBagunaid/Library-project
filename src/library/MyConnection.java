/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author HanaKod
 */
import java.sql.*;

public class MyConnection // This is the class name
{
    public Connection con = null;      // I create an object of Connection outside the method inside the class MyConnection and I make it public to be reachable from any other classes
                                       
    // The following method has data type of connection (data type is object) so this method will return an object which is con, so I can use it whenever I need it in other classes.
    public Connection connect() throws SQLException, ClassNotFoundException  // Both acts like try catch if I don't want to use try catch just write the throws ones.
    {
      final String con_string = "jdbc:mysql://localhost:3306/library";
      final String user_name = "root";
      final String Pwd = "";
      Class.forName("com.mysql.jdbc.Driver");    // For this to work I need to add (throws ClassNotFoundException) beside the method name
      con = DriverManager.getConnection(con_string, user_name, Pwd);  // For this to work I need to add (throws SQLException) beside the method name
      //Statement st = con.createStatement();
      return con;
    }
    
 }


/*
   // 1. Now to use con object I need to create an object of MyConnection class.
      MyConnection conn=new MyConnection();
   
   // 2. I need to call the method, related to its class for identification purpose, to execute the code of method and returning the con object.
      conn.connect();
  
   // 3. Now I need to create statement (for queries) using my connection conn.con:
   Statement st = conn.con.createStatement();
   
  // Just to check if returning con is sucessfull I print on screen. 
  // Note I must relate con object to its class object for identification purposes, so the compiler will know which con of which class.
  // Also note in OOP we cannot relte an object or method directly to class name, we relate things to objects of that classes, becuase the class can have so many objects and each object is 
  // different even if they are in the same class. For example I can create another object of MyConnection class that connects me to another database and I name that object conn1....
  // try to understand oop deeper and you will be fine.
    System.out.println(conn.con);

==============================================================================================================================================================================================
** If I want to make connection with another database I will make another method inside MyConnection class, this method is connection data type that return an object:
   public connection sqlConnect() throws SQLException, ClassNotFoundException
    {
      final String con_string = "Connection path to sql server ";
      final String user_name = "root";
      final String Pwd = "";
      Class.forName("sql server driver");    // For this to work I need to add (throws ClassNotFoundException) beside the method name
      con1 = DriverManager.getConnection(con_string, user_name, Pwd);
      return con1;
    }
   
** I couldnt use the con object because I declare from ouside the method to be reachable every where so I cannot use the same name for another connection 
     also this con1 should be declared from outside to be reachable.
    but the idea of making the connection in separate class is that if I need to change the data base I just delete the current connection path and driver of the same method, so it will
    be one change that takes place in all classes. so creating another method that I should change the object of it in every class is meaningless.

*/
