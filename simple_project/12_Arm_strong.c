#include <stdio.h>
int main(){
    int value,sum=0,temp,check;
    printf("Enter Your  value :");
    scanf("%d",&value);
    check=value;
    temp=value%10;
    sum=sum+(temp*temp*temp);
    value=value/10;
    temp=value%10;
    sum=sum+(temp*temp*temp);
    value=value/10;
    temp=value%10;
    sum=sum+(temp*temp*temp);
     printf("-----------------------------------------"); 
    value=value/10;
    if(check==sum){
        printf("\nYour 3 digit numbers %d is a Arm Strong Number. ",check);
    }
    else{
        printf("\nYour 3 digit numbers %d isn't a Arm Strong Number. ",check);
    }
 printf("\n-----------------------------------------\n");
 return 0; 
}    