#include <stdio.h>
int main(){
    char *str;
     printf("\nEnter The String : ");
     gets(str);
             for(int i=0;str[i]!='\0';i++){
                 if (str[i]>=65 && str[i]<=90) {
                str[i]=str[i]+32;
                   }
             }
           puts(str);  
}    