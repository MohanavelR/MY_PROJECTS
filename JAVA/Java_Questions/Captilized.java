package Java_Questions;

import java.util.Scanner;

public class Captilized {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Number  :");
        String n=in.next().trim();
        String Captilize="";
           Captilize+=(n.charAt(0));
           Captilize=Captilize.toUpperCase();
        for(int i =1;i<n.length();i++){
           System.out.println("fvhrjbvngthb");       
            if(n.charAt(i)==32){
                Captilize+=n.charAt(i);  
                i++;
                if(n.charAt(i)>96 && n.charAt(i)<123){
                    Captilize+=(char)(n.charAt(i)-32);                  
                }   
                else{
                    Captilize+=(n.charAt(i));                    
                }
            }
            else{
                Captilize+=n.charAt(i);
                System.out.println(i);
            }
                 
        }
        System.out.println(Captilize);
    }
}
