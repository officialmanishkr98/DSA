#include <iostream>
using namespace std;

int main()
{
    int n, sum = 0, chk, dis, maxxx;
    cin >> n;
    int r[n];
    for (int i = 0; i < n; i++)
    {
        cin >> r[i];
    }
    for (int i = 0; i < n; i++)
    {
        sum = sum + r[i];
    }
    cout << "Your Total shopping was of Rs:" << sum << endl;

    for (int i = 1; i < sum; i++)
    {
        if (i * i * i == sum)
        {
            cout << "Yes, you will get a gift Hamper";
            chk = 1;
        }
    }

    int max = 0;
    for (int i = 1; i * i * i < sum; i++)
    {
        if (max < i * i * i)
        {
            max = i * i * i;
            maxxx = i + 1;
        }
    }
    dis = maxxx * maxxx * maxxx - sum;

    if (chk != 1)
    {
        cout << "For gift Hamper You Need to shop more product worth of Rs:" << dis << endl;
    }

    return 0;
}