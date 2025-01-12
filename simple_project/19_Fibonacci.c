#include <stdio.h>
int main(){
    int a,old=-1,new=1,cur;
     printf("\nEnter The Number : ");
     scanf("%d",&a);
     int i=1;
     while(i<=a){
        cur=old+new;
        printf("\nValue :%d",cur);
        old=new;
        new=cur;
        i++;
        
     }

}    