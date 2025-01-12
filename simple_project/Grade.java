package simple_project;

import java.util.Scanner;

public class Grade {
     public static void main(String[] args) {
        System.out.print("Enter Your Mark Avarage: ");
        try(java.util.Scanner in =new Scanner(System.in)){
        int mark=in.nextInt();
        if(mark>=90 && mark<=100){
           System.out.println("Your Grade : 'A' ");
}
    else if (mark>100) {
       System.out.println("Invailed Mark..");
   }
     else if(mark>=80 && mark<90){
       System.out.println("Your Grade : 'B' ");
}
else if(mark>=70 && mark<80){
    System.out.println("Your Grade : 'c' ");
}
   else if(mark>=60 && mark<70){
       System.out.println("Your Grade : 'D' ");
}
  else{
      System.out.println("Your Grade : 'E' ");
}
        }
     }   
}
