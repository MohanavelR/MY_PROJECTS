package Java_Questions;


import java.util.Scanner;

public class Decimal_To_binary {
 public static void main(String[] args) {
     @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Number  :");
        int n=in.nextInt();
 System.out.println("Your Number "+n+" in Binary form is : "+DEC_TO_BIN(n));
 }       
 static String Reverse(String str){
    String reverse_string="";
     for(int i=str.length()-1;i>=0;i--){
        reverse_string+=str.charAt(i);
     }
      return  reverse_string;
 }
 static String DEC_TO_BIN(int n){
      int rem;
      String binary="";
      while (n>0) { 
        rem=n%2;
          binary+=String.valueOf(rem);
         n=n/2;
    }
      return Reverse(binary);
 }
}
