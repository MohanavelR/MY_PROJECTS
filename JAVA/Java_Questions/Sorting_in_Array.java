package Java_Questions;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting_in_Array {
    public static void main(String[] args) {
               try (Scanner in = new Scanner(System.in)) {
                System.out.print("Enter Your Array Length :");
                 int arr[]=new int[in.nextInt()];
                 for(int i=0;i<arr.length;i++){
                    System.out.print("Enter "+ i+" index Value :");
                    arr[i]=in.nextInt();
                 }
      //=================================
   System.out.println("Before Array :"+Arrays.toString(arr));
     int first;
      for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]>arr[j]){
                         first=arr[i];
                         arr[i]=arr[j];             
                         arr[j]=first;
                    }
                }
      }
      System.out.println("After AscendingOrder Array :"+Arrays.toString(arr));
      
      for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]<arr[j]){
                         first=arr[i];
                         arr[i]=arr[j];             
                         arr[j]=first;
                    }
                }
      }
      System.out.println("After discendingOrder Array :"+Arrays.toString(arr));
            }
 
    }
}
