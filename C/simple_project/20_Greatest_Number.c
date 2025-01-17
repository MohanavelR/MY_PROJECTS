#include <stdio.h>
int main(){
    printf("-----------------------------------------");
    int a[100],n;
    printf("\nEnter the Limit : ");
    scanf("%d",&n);
    for (int i = 0; i < n; i++)
    { 
        printf("Enter the Number :");
        scanf("%d",&a[i]);
    }
    int max=a[0];
    for(int i=1;i<n;i++){
        if(max<a[i]){
            max=a[i];
        }
    }
    printf("\nMax Value :%d",max);
      printf("\n-----------------------------------------\n");
}    