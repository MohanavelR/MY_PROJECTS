package simple_project;
import java.util.Scanner;
public class Result {
    public static void main(String[] args) {
        try(java.util.Scanner in =new Scanner(System.in)){
        System.out.print("Enter Your Mark1 :");    
        int mark1=in.nextInt();
        System.out.print("Enter Your Mark2 :");    
        int mark2=in.nextInt();
        System.out.print("Enter Your Mark3 :");    
        int mark3=in.nextInt();
double avg;
int total;
if (mark1>=35 && mark2>=35 && mark3>=35){
    total= mark1+mark2+mark3;
    avg=((total)/3);
    System.out.println("Result : Pass");
    System.out.println("Your Total Mark:"+total);
    System.out.println("Your Avg       :"+avg);
    if(avg>=90 && avg<=100){
        System.out.println("Your Grade : 'A' ");
    }
    else if(avg>=80 && avg<90){
        System.out.println("Your Grade : 'B' ");
    }
    else if(avg>=70 && avg<80){
        System.out.println("Your Grade : 'c' ");
    }
    else if(avg>=60 && avg<70){
        System.out.println("Your Grade : 'D' ");
    }
    else{
        System.out.println("Your Grade : 'E' ");
    }
}
else{
    System.out.println("Result : Fail");
}
   }       
  }
}
