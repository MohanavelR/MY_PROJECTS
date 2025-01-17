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
   cout<<"---------------------------------"<<endl;
    cout<<"Before Sorted Arrays: ";
    for(int i=0;i<limit;i++){
       cout<<a[i]<<",";
    }
    cout<<""<<endl;
   int temp;
   for(int i=0;i<limit;i++){
    for(int j=i+1;j<limit;j++){
       if(a[i]>a[j]){
           temp=a[i];
           a[i]=a[j];
           a[j]=temp;
       }
    }
   }
       cout<<"After Sorted Arrays : ";
    for(int i=0;i<limit;i++){
       cout<<a[i]<<",";
    }
  cout<<""<<endl;
  cout<<"---------------------------------"<<endl;
  return 0;
}