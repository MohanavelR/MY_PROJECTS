#include <iostream>
using namespace std;
int main(){
       cout<<"---------------------------------"<<endl;
        cout<<"Welcome to Insure In Drivers ..."<<endl;      
           cout<<"Your are Married (Yes/No)(Y/N):"; 
           string married,gender;
            int age;
           cin>>married;
           if( married=="y" || married=="yes"){
                 cout<<"You are eligible for Insurence..."<<endl;    
           }
           else if (married=="n"||married=="no" ){
               cout<<"Enter Your Gender (male/female)(M/f):"; 
               cin>>gender;
              
                  if(gender=="m" || gender=="male"){
                     cout<<"Enter Your Age :";
                     cin>>age;
                     if (age>30){
                       cout<<"You are eligible for Insurence..."<<endl;  
                     } 
                     else{
                       cout<<"You are Not eligible for Insurence"<<endl;
                       cout<<"Male age above 30 only Available"<<endl;  
                     }      
                  }
                  else if (gender=="f" || gender=="female"){
                   cout<<"Enter Your Age :";
                   cin>>age;
                   if (age>25){
                     cout<<"You are eligible for Insurence..."<<endl;  
                   } 
                   else{
                     cout<<"You are Not eligible for Insurence"<<endl;
                     cout<<"Female age above 25 only Available"<<endl;  
                   } 
                   
                  }
                  else{
                    cout<<"Invalied Answer"<<endl;
                  }
  
    
           }
        else{
            cout<<"Invalied Answer"<<endl;
        }   

        
        

  cout<<""<<endl;
  cout<<"---------------------------------"<<endl;
  return 0;
}
