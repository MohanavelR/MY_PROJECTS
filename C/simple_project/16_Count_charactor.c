#include <stdio.h>
int main(){
    char *str;
     printf("\nEnter The String : ");
     gets(str);
            int upper=0,lower=0,spaces=0,number=0,vowels=0;
        for(int i=0;str[i]!='\0';i++){
            if(str[i]=='A' ||str[i]=='E' ||str[i]=='I' ||str[i]=='O' ||str[i]=='U' ||str[i]=='a' ||str[i]=='e' ||str[i]=='i' ||str[i]=='o' || str[i]=='u' ){
                vowels++;
            }
            if(str[i]>=97 && str[i]<=122){
                lower++;
            }
            else if (str[i]>=65 && str[i]<=90) {
                upper++;
            }
            else if(str[i]==32){
                spaces++;
            }
            else if(str[i]>=48 && str[i]<=57){
                number++;
            }

        
        }
    printf("\nUpper Value count :%d",upper); 
    printf("\nLower Value count :%d",lower); 
    printf("\nVowels count      :%d",vowels); 
    printf("\nspaces count      :%d",spaces);    
    printf("\nnumbers count     :%d",number); 
    }
