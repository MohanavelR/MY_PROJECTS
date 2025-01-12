#include <iostream>
using namespace std;
int main()
{
    cout << "---------------------------------" << endl;
    int check, temp;
    for (int i = 1; i <= 999; i++)
    {
        int count = 0;
        for (int j = 1; j <= i; j++)
        {
            if (i % j == 0)
            {
                count++;
            }
        }

        if (count <= 2)
        {
            cout << i << " is a Prime Number ." << endl;
        }
    }
    cout << "" << endl;
    cout << "---------------------------------" << endl;
    return 0;
}
