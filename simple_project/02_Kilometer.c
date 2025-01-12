#include <stdio.h>
int main(){   
    float km;
    printf("\nEnter Your kM :");
    scanf("%f",&km);
    float m=km*1000;
    float cm=m*100;
    float inch=cm/2.54;
    float ft=inch/12;
    printf("\n-----------------------------------");
    printf("\n Your km  is           :%0.2f ",km);
    printf("\n Your %0.2fkm  in M    :%0.2f ",km,m);
    printf("\n Your %0.2fkm  in CM   :%0.2f ",km,cm);
    printf("\n Your %0.2fkm  in Inch :%0.2f ",km,inch);
    printf("\n Your %0.2fkm  in ft   :%0.2f ",km,ft);
    printf("\n-----------------------------------\n");
    return 0;
}