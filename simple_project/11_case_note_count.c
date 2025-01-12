#include <stdio.h>
int main(){
    int amount,count_100,count_50,count_10;
    printf("Enter Your  value :");
    scanf("%d",&amount);
    count_100=amount/100;
    amount%=100;

    count_50=amount/50;
    amount%=50;
    count_10=amount/10;
    amount%=10;
    printf("-----------------------------------------"); 
    printf("\n100 of count    : %d",count_100);
    printf("\n50 of count     : %d",count_50);
    printf("\n10 of count     : %d",count_10);
    printf("\nremain of count : %d",amount);
    printf("\n-----------------------------------------\n"); 

}