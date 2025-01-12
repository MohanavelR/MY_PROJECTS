package Java_Questions;

import java.util.Scanner;

public class UpperCase {
 public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Number  :");
        String n=in.next();
        String upper="";
        for(int i =0;i<n.length();i++){
            if(n.charAt(i)>96 && n.charAt(i)<123){
              upper+=(char)(n.charAt(i)-32);
            }
            else{
                upper+=n.charAt(i);
            }
        }
        System.out.println("UpperCase : "+upper);
 }   
}
