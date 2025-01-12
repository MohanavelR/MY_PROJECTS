package Java_Questions;

import java.util.Scanner;

public class Multiplication_Tables {
public static void main(String[] args) {
    @SuppressWarnings("resource")
        Scanner in =new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int table=in.nextInt();
        System.out.print("Enter Your Limit : ");
        int count=in.nextInt();
        for(int i=1;i<=count;i++){
            System.out.println(i+" X "+table+" = "+(i*table));
        }
}    
}
