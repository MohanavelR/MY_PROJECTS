#include <stdio.h>
int main(){

    printf("\tMenu Card :");
    printf("\n\t\t1.COFFEE        Rs.15$ :");
    printf("\n\t\t2.TEA           Rs.10$ :");
    printf("\n\t\t3.GOLD COFFEE   RS.25$ :");
    printf("\n\t\t4.MILK SHAKE    RS.50$ :");
    
    int choise,equatity,amount ;
    printf("\nEnter Your Number :");
    scanf("%d",&choise);
    switch (choise){
     case 1:   
        printf("Enter Equantity :");
        scanf("%d",&equatity);
        amount=equatity*15; 
        printf("\nYou Have Selected COFFEE");
        printf("\nYour Equatity      :%d",equatity);
        printf("\nYour pay Amount is :%d",amount);
        break;
    case 2:
        printf("Enter Equantity :");
        scanf("%d",&equatity);
        amount=equatity*10;
        printf("\nYou Have Selected TEA"); 
        printf("\nYour Equatity      :%d",equatity);
        printf("\nYour pay Amount is :%d",amount);
        break;
    
     case 3:
        printf("Enter Equantity :");
        scanf("%d",&equatity);
        amount=equatity*25; 
        printf("\nYou Have Selected GOLD COFFEE");
        printf("\nYour Equatity      :%d",equatity);
        printf("\nYour pay Amount is :%d",amount);
        break;
    case 4 :
        printf("Enter Equantity :");
        scanf("%d",&equatity);
        amount=equatity*50; 
        printf("\nYou Have Selected MILK SHAKE");
        printf("\nYour Equatity      :%d",equatity);
        printf("\nYour pay Amount is :%d",amount);
        break;
    default :
        printf("\nInvailed Choice."); 
        break;
    }


    printf("\n-----------------------------------------\n"); 
}