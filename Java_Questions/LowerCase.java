package Java_Questions;

import java.util.Scanner;

public class LowerCase {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Number  :");
        String n=in.next();
        String lower="";
        for(int i =0;i<n.length();i++){
            if(n.charAt(i)>64 && n.charAt(i)<91){
              lower+=(char)(n.charAt(i)+32);
            }
            else{
                lower+=n.charAt(i);
            }
        }
        System.out.println("lowerCase : "+lower);
 }   
 }   
