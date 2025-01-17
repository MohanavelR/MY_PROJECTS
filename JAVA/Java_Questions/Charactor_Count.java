package Java_Questions;

public class Charactor_Count {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("Mohan R@-12");
        System.out.println("Value is :"+str);
        int upper=0,lower=0,spaces=0,number=0,vowels=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A' ||str.charAt(i)=='E' ||str.charAt(i)=='I' ||str.charAt(i)=='O' ||str.charAt(i)=='U' ||str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' || str.charAt(i)=='u' ){
                vowels++;
            }
            if(str.charAt(i)>=97 && str.charAt(i)<=122){
                lower++;
            }
            else if (str.charAt(i)>=65 && str.charAt(i)<=90) {
                upper++;
            }
            else if(str.charAt(i)==32){
                spaces++;
            }
            else if(str.charAt(i)>=48 && str.charAt(i)<=57){
                number++;
            }

        
        }
    System.out.println("Upper Value count :"+upper); 
    System.out.println("Lower Value count :"+lower); 
    System.out.println("Vowels count      :"+vowels); 
    System.out.println("spaces count      :"+spaces);    
    System.out.println("numbers count     :"+number); 
    }
}
