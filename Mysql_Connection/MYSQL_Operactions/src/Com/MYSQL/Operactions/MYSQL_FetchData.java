package Com.MYSQL.Operactions;
import java.sql.*;
public class MYSQL_FetchData {

	public static void main(String[] args) {
       Connection connect;
       
       try {
    	   Class.forName("com.mysql.cj.jdbc.Driver");
    	   connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?","root","");
           PreparedStatement pst=connect.prepareStatement("select * from user");
           ResultSet rs=pst.executeQuery();
    	   int id;
    	   String name;
    	   String city;
    	   int age;
           while(rs.next()) {
        	    id =rs.getInt("id");
        	    name=rs.getString("name");
        	    city=rs.getString("city");
        	    age=rs.getInt("age");
        	   System.out.println("ID     :"+id);
        	   System.out.println("Name   :"+name);
        	   System.out.println("Age    :"+age);
        	   System.out.println("City   :"+city);
        	   System.out.println("--------------------------------------------");
        	   
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
