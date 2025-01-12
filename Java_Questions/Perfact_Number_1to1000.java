package Java_Questions;

public class Perfact_Number_1to1000 {
    public static void main(String[] args) {
        for(int n=1;n<=1000;n++){
            int sum=0;
            for(int i=1;i<n;i++){
                if(n%i==0){
                   sum+=i;
                }
            }
            if(sum==n){
                System.out.println(n +" is a perfact Number");
            }
            // else{
            //     System.out.println(n +" is not a perfact Number");
            // }
        }
    }
    
}
