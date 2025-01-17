package Java_Questions;

import java.util.Scanner;

public class Reverse_number {
public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
        System.out.print("Enter Your Number  :");
        int n= in.nextInt();
        int reverse=0;
        int rem;
        while(n!=0){
            rem=n%10;
            reverse=reverse*10+rem;
            n=n/10;
        }
        System.out.println("Your Reverse Value :"+reverse);
    }
}    
}
