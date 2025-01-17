package simple_project;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        try(java.util.Scanner in=new Scanner(System.in)) {
              System.out.print("Enter Your Year :");
              int year=in.nextInt();  
              if (year%4==0 ||(year%100==0 && year%400==0)) {
                  System.out.println("This Is Leap Year..");
              }
              else{
                System.out.println("This Is Not Leap Year ...");
              }
        }    
}
}