package Java_Questions;

import java.util.Scanner;

public class Fibanacci {
   public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner in =new Scanner(System.in);
    System.out.print("Enter Number Count : ");
    int n= in.nextInt(); 
    int pre=1;
    int add=-1;
    int curr;
     for(int i=1;i<=n;i++){
         curr=pre+add;
         System.out.println("Value "+i+" :"+curr);
         add=pre;  
         pre=curr;    

     }  
   }   
}
