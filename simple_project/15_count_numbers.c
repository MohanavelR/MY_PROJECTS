#include <stdio.h>
int main(){
    printf("-----------------------------------------");
    int a[100],even=0,odd=0,n;
    printf("\nEnter the Limit : ");
    scanf("%d",&n);
    for (int i = 0; i < n; i++)
    { 
        printf("Enter the Number :");
        scanf("%d",&a[i]);
        a[i]%2==0?even++:odd++;
    }
    //  for (int i = 0; i < n; i++)
    // { 
    //   if(a[i]%2==0){
    //     even++;
    //   }
    //   else{
    //     odd++;
    //   }
    // }  
    printf("\nCount of even Numbers :%d",even);
    printf("\nCount of Odd Numbers  :%d",odd);
    printf("\n-----------------------------------------\n");
} 