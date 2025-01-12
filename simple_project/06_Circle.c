#include <stdio.h>
int main(){
    float r;
    printf("Enter Your R value :");
    scanf("%f",&r);    
    float area=3.14*(r*r);
    float cir=2*3.14*r;
    printf("-----------------------------------------");
    printf("\nYour Area is      :%0.2f",area);
    printf("\nYour Circum is    :%0.2f",cir);
    printf("\n-----------------------------------------\n"); 
    return 0;

}