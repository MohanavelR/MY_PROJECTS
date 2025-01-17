package Com.MYSQL.Operactions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MYSQL_DeleteData {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner in=new Scanner(System.in);
	  Connection connect;
     
     try {
  	   Class.forName("com.mysql.cj.jdbc.Driver");
  	   connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?","root","");
         PreparedStatement pst=connect.prepareStatement("delete from user where id=?");
         System.out.print("Enter Your ID :"); 
         int id=in.nextInt();
  	     pst.setInt(1,id);
     boolean rs=  pst.execute();     
      if (!rs) {
   	  System.out.print("Sucessfully Deleted..."); 
      }
      else {
    	  System.out.print("UnSucessfully Added..."); 
      }
       
      	
      	   
         
     }
     catch(Exception e) {
  	   e.printStackTrace();
     }
     finally {
  	   try {
  		   
  	   }
  	   catch(Exception e) {
  		   e.printStackTrace();
  	   }
     }

}
}
