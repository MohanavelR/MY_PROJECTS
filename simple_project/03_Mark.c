#include <stdio.h>
int main(){
    int tamil,english,maths,science,s_science;
    printf("Enter Your Tamil Mark : ");
    scanf("%d",&tamil);
    printf("Enter Your English Mark : ");
    scanf("%d",&english);
    printf("Enter Your Maths Mark   : ");
    scanf("%d",&maths);
    printf("Enter Your Science Mark : ");
    scanf("%d",&science);
    printf("Enter Your Social science Mark : ");
    scanf("%d",&s_science); 
    int total=tamil+english+s_science+maths+science;
    float avg=(float)total/5;
    printf("\n--------------------------------------");
    printf("\n Total Mark is : %d",total);
    printf("\n Avarage  is   : %0.2f%c ",avg,'%'); 
    printf("\n--------------------------------------\n");  
 

    return 0;
}