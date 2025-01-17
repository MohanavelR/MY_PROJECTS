package Java_Questions;

import java.util.Scanner;

public class Strong_number {
      public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Number  :");
        int n=in.nextInt();
        int rem;
        int sum = 0;
        int check=n;
        while(check!=0){
           rem=check%10;
           sum+=Factorial(rem);
           check=check/10;
        }
        if(sum==n){
            System.out.println(n+" is a strong number ");
            System.out.println(sum);
        }
        else{
            System.out.println(n+" is a not strong number ");  
            System.out.println(sum);
        }
      }   
     static int Factorial(int n){
        int sum=1;
            for(int i=1;i<=n;i++){
                sum*=i;
            }
          return sum;  
      }
}
