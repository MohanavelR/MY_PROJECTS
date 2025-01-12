package Com.MYSQL.Operactions;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MYSQL_UpdateData {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		  Connection connect;
	       
	       try {
	    	   Class.forName("com.mysql.cj.jdbc.Driver");
	    	   connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?","root","");
	           PreparedStatement pst=connect.prepareStatement("update  user set name=?,age=?,city=? where id=?");
	           System.out.print("Enter Your ID :"); 
	           int id=in.nextInt();
	           System.out.print("Enter Your Name :"); 
	           String name=in.next();
	    	   System.out.print("Enter Your Age  :"); 
	    	   int age=in.nextInt();
	    	   System.out.print("Enter Your City :"); 
	    	   String city=in.next();
	    	   pst.setString(1, name);
	    	   pst.setInt(2, age);
	    	   pst.setString(3, city);
	    	   pst.setInt(4, id);
           boolean rs=  pst.execute();
           
            if (!rs) {
         	  System.out.print("Sucessfully Updated..."); 
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
