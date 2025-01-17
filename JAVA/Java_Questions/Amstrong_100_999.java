package Java_Questions;

public class Amstrong_100_999 {
    public static void main(String[] args) {
   
    for(int i=100;i <= 999;i++){ 
        int rem;
        int ams=0;    
        int check=i;   
        while(check!=0) {
            rem=check%10;
            ams+=rem*rem*rem;
            check=check/10;
        }
         if (ams==i){
             System.out.println(i+" is an Amstrong");
          }
}
    }   
}


