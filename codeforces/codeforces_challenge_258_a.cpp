#include <iostream>
using namespace std;
#include <math.h>
int main()
{
	int n,m,count=0;
	cin >> n;
	cin >> m;
	if (n<m)
	{
		count=n;
	} else {
		count=m;
	}
	if (count%2==0)
	{
		cout << "Malvika";
	} else {
		cout << "Akshat";
			}
return 0;
}