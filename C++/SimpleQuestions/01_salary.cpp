#include <iostream>
using namespace std;
int main()
{
    int salary, gs, da, hra;
    cout << "Enter Your Basic Salary :";
    cin >> salary;

    cout << "---------------------------------" << endl;
    if (salary < 1500)
    {
        hra = salary * 10 / 100;
        da = salary * 90 / 100;

    }
    else
    {
       hra=500;
       da=salary*98/100;
    }
    gs=salary+hra+da;
    cout << "Your Salary is    :"<<salary << endl;
    cout << "Your HRA is       :"<<hra << endl;
    cout << "Your DA is        :"<<da << endl;
    cout << "---------------------------------" << endl;
    cout << "Your Gross Salary :"<<gs<< endl;
    cout << "---------------------------------" << endl;
    return 0;
}