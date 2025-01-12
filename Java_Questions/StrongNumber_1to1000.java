package Java_Questions;
public class StrongNumber_1to1000 {
    public static void main(String[] args) {
        for(int n=1;n<=1000;n++){
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
            }
            // else{
            //     System.out.println(n+" is a not strong number ");  
            //     System.out.println(sum);
            // }            
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
