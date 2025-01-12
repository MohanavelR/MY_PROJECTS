#include <iostream>
using namespace std;
int main()
{
    cout << "---------------------------------" << endl;
    int n, fac = 1;
    cout << "Enter The Factor Of Number:";
    cin >> n;
    for (int i = 1; i <= n; i++)
    {
        if (n % i == 0)
        {
            cout << i << " is  a " << n << " in Factor" << endl;
        }
    }
    cout << "" << endl;
    cout << "---------------------------------" << endl;
    return 0;
}
