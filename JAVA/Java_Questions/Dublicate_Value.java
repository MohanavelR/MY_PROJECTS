package Java_Questions;

public class Dublicate_Value {
    public static void main(String[] args) {
        int[] arr={1,3,2,2,4,4,5,6};
        for (int i = 0; i < arr.length; i++) {
             for (int j = i+1; j < arr.length; j++) {
                if((arr[i]==arr[j]) && i!=j){
                    System.out.println("Dublicate Element :"+arr[i]);
                }   
             }
        }

    }
}
