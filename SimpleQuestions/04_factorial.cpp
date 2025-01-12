#include <iostream>
using namespace std;
int main(){
  cout<<"---------------------------------"<<endl;
    int n,fac=1;
    cout<<"Enter The Factorial Of Number:";
    cin>>n;
    for(int i =1;i<=n;i++){
        fac*=i;
    }
    cout<<"Factorial Of "<<n<<" Value is :"<<fac<<endl;
  cout<<""<<endl;
  cout<<"---------------------------------"<<endl;
  return 0;
}
