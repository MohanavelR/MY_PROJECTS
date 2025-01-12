package Java_Questions;

import java.util.Scanner;

public class Amstrong {
 public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
        System.out.print("Enter Your Number  :");
        int n= in.nextInt();
        int check=n;
        int rem;
        int ams=0;
        while(n!=0){
            rem=n%10;
            ams+=rem*rem*rem;
            n=n/10;
        }
  if (ams==check){
    System.out.println("Your Number is Amstrong");
  }
  else{
    System.out.println("Your Number is not Amstrong");
  }
     
    }   
}
}
