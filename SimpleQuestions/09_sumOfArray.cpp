#include <iostream>
using namespace std;
int main(){
    int a[50];
    int limit,sum=0;
   cout<<"Enter Total Length :";
   cin>>limit;
   for(int i=0;i<limit;i++){
    cout<<"Enter "<<i<<" Index Value :";
    cin>>a[i];
    sum+=a[i];
   }  
  cout<<"---------------------------------"<<endl;
  cout<<"Your Value is :"<<sum<<endl;
  cout<<"---------------------------------"<<endl;
  return 0;
}
