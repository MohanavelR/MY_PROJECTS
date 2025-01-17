package Java_Questions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
          Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Number  :");
        int n= in.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
               count++;
            }

        }
        if (count==2){
            System.out.println("Your is a Prime number ");
        }
        else{
            System.out.println("Your is not a Prime number ");
        }
    }
}
