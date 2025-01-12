package Java_Questions;

public class PrimeNumber_1_100 {
    public static void main(String[] args) {
for (int n=1;n<=999;n++){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
               count++;
            }

        }
        if (count<=2){
            System.out.println(n +" is a Prime number ");
        }
        // else{
        //     System.out.println("Your is not a Prime number ");
        // }
    }
    }
    
}
