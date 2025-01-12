#include <stdio.h>
int main(){
    float l,b,p;
    printf("Enter Your length :");
    scanf("%f",&l);
    printf("Enter Your breath :");
    scanf("%f",&b);
    p=2*(l+b);
    printf("-----------------------------------------");
    printf("\nYour Area is      :%0.2f",(l*b));
    printf("\nYour Perimeter is :%0.2f",p);
    printf("\n-----------------------------------------\n");    
    return 0;
}