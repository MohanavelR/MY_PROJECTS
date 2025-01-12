package Java_Questions;

import java.util.Scanner;

public class Perfect_number {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Number  :");
        int n=in.nextInt();
        int sum=0;

        for(int i=1;i<n;i++){
            if(n%i==0){
               sum+=i;
            }
        }
        if(sum==n){
            System.out.println(n +" is a perfact Number");
        }
        else{
            System.out.println(n +" is not a perfact Number");
        }
    }
}
