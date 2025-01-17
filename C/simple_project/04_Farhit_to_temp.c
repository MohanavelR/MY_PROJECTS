#include <stdio.h>
int main()
{
    float temp,deg;
    printf("Enter Your Temperature value :");
    scanf("%f",&temp);
    deg=(temp-32)*(5.0/9.0);
    printf("\n------------------------------------------");
    printf("\nYour temperature %.0f in Deg is %0.2f%c ",temp,deg,'c');
    printf("\n-----------------------------------------\n");
    return 0;
}