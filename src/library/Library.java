/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.sql.*;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author HanaKod
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException  // Must use them every time I will use the connect method and I must write them beside the method name inwhich I will use the connect method.
    {
        // TODO code application logic here
         Login log=new Login();
         log.setVisible(true);
          
    }
    
}


/*
=============================================================================================================================================================================================
SUCESSFULLY WORKING CODE:
MyConnection conn=new MyConnection();
      conn.connect();
      Statement st = conn.con.createStatement();
      
      ResultSet rs = st.executeQuery("select * from login");  //ResultSet is what holds the data after execusion of the query
      rs.next();         
      /* Is what tells the compiler to go from column name down to the first row, or from current row to next row if we used loop. 
      Moves the cursor forward one row from its current position. A ResultSet cursor is initially positioned before the first row; 
      the first call to the method next makes the first row the current row; the second call makes the second row the current row, and so on.
      */

      /*
      // Remember column index start from 1, Row index start from 0. Don't confuse OK ^^.
      String Row = rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(4);  // I call specific colum by writing the colum number or I can use the column name 
      // I stored the whole row data in one string variable
      System.out.println(Row);
      
      //========================================================================
      // I want to execute another query
      ResultSet rs1 = st.executeQuery("select UserName from login where UID = 2");  
                // I used the same statement (st) becuase it is an object that used to call createStatement() method.
                // However the ResultSet is where I hold the query statement. I need to create (rs1) anoter object to hold different query statement.
      rs1.next();
      String name1 = rs1.getString(1);    // Here I write the column name = 1 although the UserName column no. is 2. It works here because the query retrieve only one value so it doesnt matter.
      System.out.println(name1  + " ");
      
      
      st.close();          // To close the statement and it is written one time for all different queries
      conn.con.close();    // To close connection and it is, also, written one time for all different queries

    ==============================================================================================================
     DATE TIME Codes:
     Date today = new Date();  // new Date() get the current date and I store it in date object.
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY"); // to set the desired date format. The format can incluse time also new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
     System.out.println("Today is " + sdf.format(today)); // to print the current date it must be string and to convert the date object to string we used the SimpleDateFormat class.
      
     Calendar cal = Calendar.getInstance();
     cal.setTime(today);  // here I put the object date, and it set the time of calendar to the current date (according the system date/time.
     cal.add(Calendar.DATE, 365);  // this will add 365 day to the current date in the calendar which we set it before to current date
     Date nextDate = cal.getTime();   // Date is like string can be declared as dataType or declared as an object.
     System.out.println("The date after one year is " + sdf.format(nextDate));


*/