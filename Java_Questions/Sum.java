package Java_Questions;
import java.util.Scanner;
public class Sum {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner in =new Scanner(System.in);
    System.out.print("Enter Number Count : ");
    int n= in.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++){
        System.out.print("Enter Number "+i +" : ");
        int add=in.nextInt();
        sum+=add;
        
    }
    System.out.println("Sum of Your Values        :"+sum);
    System.out.println("Sum of Your Values in Avg :"+(sum/n));
  }    
}
