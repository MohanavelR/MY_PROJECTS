package Java_Questions;


import java.util.Scanner;

public class Even_Number_In_Arrays {
    public static void main(String[] args) {
      @SuppressWarnings("resource")
        Scanner in=new Scanner(System.in);
         System.out.print("Enter Your Array Length :");
         int arr[]=new int[in.nextInt()];
         for(int i=0;i<arr.length;i++){
            System.out.print("Enter "+ i+" index Value :");
            arr[i]=in.nextInt();
         }
      int even=0;
      int odd=0;
       for(int i:arr){
          if(i%2==0){
  
            even++;
          }
          else{
               odd++;
          }
       }
       System.out.println("Even Numbers Count is : "+even);
       System.out.println("Odd Numbers Count is  :"+odd);
          
    }   
}
