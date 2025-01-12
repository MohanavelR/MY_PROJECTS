package Java_Questions;


import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your String  :");
        String n= in.next();
        String reverse_string="";


        for(int i=(n.length())-1;i>0;i--){
             reverse_string+=n.charAt(i);
        }
        System.out.println("Your string is     :"+n);
        System.out.println("Reversed string is :"+reverse_string);
    }
}
