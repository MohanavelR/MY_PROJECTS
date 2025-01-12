package Java_Questions;
import java.util.Scanner;
public class Factorial {
        public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in =new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int input_value=in.nextInt();
        int factorial=1;
        for(int i=1;i<=input_value;i++){
            factorial*=i;
        }
        System.err.println("Factorial of " +input_value+ " is "+factorial);
   }    
}   
