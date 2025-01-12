#include <iostream>
using namespace std;
int main(){
  cout<<"---------------------------------"<<endl;
  int check,temp;
  for(int i =1;i<=999;i++){
     check=i;
   
    int sum=0;
    while( check>0){
       temp=check%10;
       sum+=temp*temp*temp;
       check=check/10;
    }
    if(sum==i){
        cout<<i<< " is a Arm Strong Number ."<<endl;
    }
  }
  cout<<""<<endl;
  cout<<"---------------------------------"<<endl;
  return 0;
}
