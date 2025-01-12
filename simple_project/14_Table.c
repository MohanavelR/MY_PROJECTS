#include <stdio.h>

int main(){
    int t,n;
     printf("------------------------------\n");  
     printf("\nEnter Your Table :");
     scanf("%d",&t);
     printf("Enter The Limit  :");
     scanf("%d",&n);
     for(int i=1;i<=n;i++){
        printf("\n%d X %d = %d",i,t,(t*i));
     }
     printf("\n------------------------------\n"); 

}