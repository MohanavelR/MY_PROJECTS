#include <stdio.h>
int main(){
    float salary;
    printf("Enter Your salary : ");
    scanf("%f",&salary);
    float DA=(float)salary*0.4;
    float hra=(float)salary*0.2;
    printf("\n--------------------------------------");
    printf("\n Basic salary      :%0.1f",salary);
    printf("\n Your DA is        :%0.1f",DA);
    printf("\n Your HRA is       :%0.1f",hra);
    printf("\n Your cross salary :%0.1f",((float)salary+DA+hra));
    printf("\n--------------------------------------\n");
    return 0;
}