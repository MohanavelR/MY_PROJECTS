package Java_Questions;
import  java.util.Scanner;
public class Factors {
 public static void main(String[] args) {
    @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Number  :");
        int n= in.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i +" is "+n+" in Factor");
            }
        }
 }   
}
