#include <stdio.h>
int main(){
int population=80000,mens,womens,study_pop,study_mens,study_womens;
mens=(52*population)/100;
womens=population-mens;
study_pop=(48*population)/100;
study_mens=(35*study_pop)/100;
study_womens=study_pop-study_mens;
printf("-----------------------------------------"); 
printf("\nTotal Population      :%d",population);
printf("\nTotal mens            :%d",mens);
printf("\nTotal Womans          :%d",womens);
printf("\nTotal Studyed peoples :%d",study_pop);
printf("\nTotal Studyed mens    :%d",study_mens);
printf("\nTotal Studyed womens  :%d",study_womens);
printf("\n-----------------------------------------\n"); 
return 0;

}