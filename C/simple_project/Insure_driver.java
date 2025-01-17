package simple_project;

import java.util.Scanner;

public class Insure_driver {
    @SuppressWarnings("ConvertToStringSwitch")
    public static void main(String[] args) {
        System.out.println("Welcome to Insure In Drivers ...");
        try(java.util.Scanner in =new Scanner(System.in)){
           System.out.print("Your are Married (Yes/No)(Y/N):"); 
           String married=(in.next()).toLowerCase();
           if( "y".equals(married) || "yes".equals(married)){
                 System.out.println("You are eligible for Insurence...");    
           }
           else if ("n".equals(married) || "no".equals(married)){
               System.out.print("Enter Your Gender (male/female)(M/f):"); 
               String gender=(in.next()).toLowerCase();
               int age;
                  if("m".equals(gender) || "male".equals(gender)){
                     System.out.print("Enter Your Age :");
                     age=in.nextInt();
                     if (age>30){
                       System.out.println("You are eligible for Insurence...");  
                     } 
                     else{
                       System.out.println("You are Not eligible for Insurence");
                       System.out.println("Male age above 30 only Available");  
                     }      
                  }
                  else if ("f".equals(gender) || "female".equals(gender)){
                   System.out.print("Enter Your Age :");
                   age=in.nextInt();
                   if (age>25){
                     System.out.println("You are eligible for Insurence...");  
                   } 
                   else{
                     System.out.println("You are Not eligible for Insurence");
                     System.out.println("Female age above 25 only Available");  
                   } 
                   
                  }
                  else{
                    System.out.println("Invalied Answer");
                  }
  
    
           }
        else{
            System.out.println("Invalied Answer");
        }   

        
        } 
    }
}
