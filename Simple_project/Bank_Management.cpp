#include <iostream>
using namespace std;
class Account{
    private :
    string name;
    int acc_no;
    string aType;
    public :
       void Acc_Details(){
        cout<<"Enter Your Name :";
        cin>>name;
        cout<<"Enter Your Account Number :";
        cin>>acc_no;
        cout<<"Enter Your Account Type   :";
        cin>>aType;
        cout<<"successfully created Account.."<<endl;
       } 
       void Display_Details(){
        cout<<"Name           :"<<name<<endl;
        cout<<"Account Number :"<<acc_no<<endl;
        cout<<"Account Type   :"<<aType<<endl;
       }
};
class Current_Account :public Account{
        float balance=0;
        public:
         void c_Check_Balance(){
            cout<<"Your Account Balance :"<<balance<<endl;
         }
         void c_Withtrow_Amount(){
              int amount;
              cout<<"Enter The Amount :";
              cin>>amount;
              if(balance>=amount){
              balance-=amount;
              cout<<"successfully Withtraw The Amount"<<endl;
              }
              else{
                cout<<"Failed to Withtraw The Amount because Your Balance is  "<<balance<<endl;
              }
         }
         void c_Deposit_Amount(){
              int amount;
              cout<<"Enter The Amount :";
              cin>>amount;
              balance+=amount;  
              cout<<"successfully Deposit The Amount"<<endl;          
         }
};
class Sav_Account :public Account{
    float sav_balance=500;
    public:
             void s_Check_Balance(){
            cout<<"Your Account Balance :"<<sav_balance<<endl;
         }
     void s_Deposit_Amount(){
              int amount;
              float interest;
              cout<<"Enter The Amount :";
              cin>>amount;
              sav_balance+=amount;
              interest=(sav_balance*2)/100; 
              sav_balance+=interest; 
              cout<<"successfully Deposit The Amount"<<endl;          
         }
        void s_Withtrow_Amount(){
              int amount;
              cout<<"Enter The Amount :";
              cin>>amount;
            if (sav_balance<500)
              {
              cout<<"Failed to Withtraw The Amount .because Your Balance Minimum Maintained 500"<<endl;
              }
            else  if(sav_balance>=amount){
                int check;
                  check=sav_balance-amount;
                     if(check>=500){
                        sav_balance-=amount;
                        cout<<"successfully Withtraw The Amount"<<endl;
                     }
                     else{
                       cout<<"Failed to Withtraw The Amount .because Your Balance Minimum Maintained 500"<<endl;
                       cout<<"You WithRaw Only "<<sav_balance-500<<endl;
                     } 
               }
             else{
                cout<<"Failed to Withtraw The Amount. because Your Balance is  "<<sav_balance<<endl;
              }
         }  


};

int main(){
    cout<<"--------------------------------"<<endl;
    Sav_Account s_acc;
    Current_Account c_acc;
    char type;
    cout<<"What you Want Account Saving (s) Or Current(c) :";
    cin>>type;
    if (type=='s' || type=='S'){
         s_acc.Acc_Details();
         while (1){
           int choice;
            cout<<"\t1.Check Balance"<<endl;
            cout<<"\t2.Deposit Amount"<<endl;
            cout<<"\t3.Withtraw Amount"<<endl;
            cout<<"\t4.Show Details"<<endl;
            cout<<"\t5.Exit"<<endl;
            cout<<"Enter Your Choice :";
            cin>>choice;
            switch(choice){
               case 1:
                  s_acc.s_Check_Balance();
                  cout<<"--------------------------------"<<endl;
                  break;
               case 2:
                  s_acc.s_Deposit_Amount();
                  cout<<"--------------------------------"<<endl;
                  break;
               case 3:
                  s_acc.s_Withtrow_Amount();
                  cout<<"--------------------------------"<<endl;
                  break;
               case 4:
                  s_acc.Display_Details();
                  cout<<"--------------------------------"<<endl;
                  break;
               case 5:
                  exit(0);
               default:
                  cout<<"Invailed Choice.."<<endl; 
                  cout<<"--------------------------------"<<endl;     
            }

         }

    }
    else if(type=='C'|| type=='c'){
             c_acc.Acc_Details();
         while (1){
           int choice;
            cout<<"\t1.Check Balance"<<endl;
            cout<<"\t2.Deposit Amount"<<endl;
            cout<<"\t3.Withtraw Amount"<<endl;
            cout<<"\t4.Show Details"<<endl;
            cout<<"\t5.Exit"<<endl;
            cout<<"Enter Your Choice :";
            cin>>choice;
            switch(choice){
               case 1:
                  c_acc.c_Check_Balance();
                  cout<<"--------------------------------"<<endl;
                  break;
               case 2:
                  c_acc.c_Deposit_Amount();
                  cout<<"--------------------------------"<<endl;
                  break;
               case 3:
                  c_acc.c_Withtrow_Amount();
                  cout<<"--------------------------------"<<endl;
                  break;
               case 4:
                  c_acc.Display_Details();
                  cout<<"--------------------------------"<<endl;
                  break;
               case 5:
                  exit(0);
               default:
                  cout<<"Invailed Choice.."<<endl;      
            }

         }
    }
    else{
     cout<<"Invailed Choice Enter Correct Choice(s/c).."<<endl;
    }
}