package Java_Questions;

import java.util.Scanner;

public class Binary_to_decimal {
  static int BIN_TO_DEC(long n){
     int decimal=0;
     long rem;
     int add=0;
     while (n>0) {     
         rem=n%10;
       
         decimal+=rem*(Math.pow(2, add));
         n=n/10;
  
         add++;
     }
     return decimal; 

   
 }   
 public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Number  :");
        int n=in.nextInt();
    System.out.println("Your Binary "+n+" in Number is : "+BIN_TO_DEC(n));
 }
}
