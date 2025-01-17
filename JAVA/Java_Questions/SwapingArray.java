package Java_Questions;
import java.util.Arrays;
import java.util.Scanner;
public class SwapingArray {
 public static void main(String[] args) {
    int[] arr={12,34,56,78,90,12,34,56};
    @SuppressWarnings("resource")
    Scanner in=new Scanner(System.in);
    System.out.println("Enter Value :");
    int value=in.nextInt();
    System.out.println("Enter Index Value :");
    int index=in.nextInt();
    System.out.println("Before Array :"+Arrays.toString(arr));
    for(int i=arr.length-1;i>=index;i--){
         arr[i]=arr[i-1] ;
    }
    arr[index]=value;
    System.out.println("After Array :"+Arrays.toString(arr));
 }   

}
