#include <iostream>
using namespace std;
int main(){
  cout<<"---------------------------------"<<endl;
  int a[50];
    int limit;
   cout<<"Enter Total Length :";
   cin>>limit;
   for(int i=0;i<limit;i++){
    cout<<"Enter "<<i<<" Index Value :";
    cin>>a[i];
   }
     int max_value=a[0];
      for(int i=1;i<limit;i++){
       if(max_value<a[i]){
       max_value=a[i];
       }
   }
  cout<<"---------------------------------"<<endl;
  cout<<"Greatest Number in Your Array is :"<<max_value<<endl;
  cout<<""<<endl;
  cout<<"---------------------------------"<<endl;
  return 0;
}
