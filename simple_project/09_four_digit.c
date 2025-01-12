#include <stdio.h>
int main(){
    int value,sum=0,temp;
    printf("Enter Your  value :");
    scanf("%d",&value);
    temp=value%10;
    sum=sum+temp;
    value=value/10;

    temp=value%10;
    value=value/10;

    temp=value%10;
    value=value/10;

    temp=value%10;
    sum=sum+temp;
    value=value/10;


    printf("-----------------------------------------"); 
    printf("\n Sum Of five digit :%d",sum);
    printf("\n-----------------------------------------\n"); 
    return 0;    
}