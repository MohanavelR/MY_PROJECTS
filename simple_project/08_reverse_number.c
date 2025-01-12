#include <stdio.h>
int main(){
    int value,temp,reverse=0;
    printf("Enter Your  value :");
    scanf("%d",&value);
    temp=value%10;
    reverse=(reverse*10+temp);
    value=value/10;

    temp=value%10;
     reverse=(reverse*10+temp);
    value=value/10;

    temp=value%10;
    reverse=(reverse*10+temp);
    value=value/10;

    temp=value%10;
    reverse=(reverse*10+temp);
    value=value/10;

    temp=value%10;
    reverse=(reverse*10+temp);
    value=value/10;
    printf("-----------------------------------------"); 
    printf("\nReverse Of five digit :%d",reverse);
    printf("\n-----------------------------------------\n"); 
    return 0;    
}