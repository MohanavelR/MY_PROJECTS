#include <iostream>
using namespace std;
int main(){
  cout<<"---------------------------------"<<endl;
    int n,sum=0;
    cout<<"Enter The Sum Of Numbers:";
    cin>>n;
    for(int i =0;i<=n;i++){
        sum+=i;
    }
    cout<<"Sum Of "<<n<<" Value is :"<<sum<<endl;
  cout<<""<<endl;
  cout<<"---------------------------------"<<endl;
  return 0;
}
