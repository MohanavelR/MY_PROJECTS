#include <iostream>
using namespace std;
int main(){
    int a[50];
    int limit,search;
  cout<<"---------------------------------"<<endl;
   cout<<"Enter Total Length :";
   cin>>limit;
   for(int i=0;i<limit;i++){
    cout<<"Enter "<<i<<" Index Value :";
    cin>>a[i];
   }
   cout<<"---------------------------------"<<endl;
   cout<<"Enter Search Value:";
   cin>>search;
   for(int i=0;i<limit;i++){
    if(a[i]==search){
        cout<<"Successfully Find The Number In Array."<<endl;
        cout<<"Your Value Index is :"<<i;
        cout<<"---------------------------------"<<endl;
        return 0;
    }
   
   
   }
      cout<<" Not Find The Number In Array."<<endl;

  cout<<""<<endl;
  cout<<"---------------------------------"<<endl;
  return 0;
}