#include <iostream>
using namespace std;
#include <math.h>
int main()
{
	int n,count=0,sum;
	cin >> n;
	int a[n];
	for (int i = 0; i < n; ++i)
	{
	cin >> a[i];
	sum = sum + a[i];
	}


		for (int i = 0; i < n; ++i)
		{
			while (a[i]!=0)
			{
				if (a[i+1]!=0)
				{
					count = count + 1;
					for (int i = 0; i < n; ++i)
					{
						if (a[i]!=0)
						{
							a[i]=a[i]-1;
							continue;
						}
						break;
					}
					continue;
				}
				count = count +1;
				a[i]=a[i]-1;
			}
		}


		if (count>n)
		{
			printf("%d\n",n );
			return 0;
		}
		printf("%d\n",count );
return 0;
}
