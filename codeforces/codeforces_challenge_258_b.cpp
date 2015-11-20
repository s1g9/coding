#include <iostream>
using namespace std;
#include <math.h>
#include <algorithm>
int main()
{
	int n,j=0,i=0,temp;
	cin >> n;
	int arr[n];
	int store[n];
	int indices[2]={-1,-1};
	for (int i = 0; i < n; ++i)
	{
		cin >> arr[i];
		store[i]=arr[i];
	}
	sort(arr, arr + n);
	for (int i = 0; i < n; ++i)
	{
		if (store[i]!=arr[i])
		{	
			if (j==1)
			{
				indices[j]=i;
			}
			if (j==0)
			{
				indices[j]=i;
				j++;
			}
			
		}
	}

	if (indices[0]>=0 && indices[1]>=0)
	{
	i = indices[0];
	j = indices[1];
	while(i<j)
	{
	temp = store[j];
	store[j] = store[i];
	store[i] = temp;
    i += 1;
    j -= 1;
	} 
	for (int i = 0; i < n; ++i)
	{
		if (store[i]!=arr[i])
		{
			cout << "no";
			break;
		}
		if (i==n-1)
		{
			cout << "yes" << "\n";
			if (store[indices[0]]>store[indices[1]])
			{
				cout << store[indices[1]] << " " << store[indices[0]];
			} else { cout << store[indices[0]] << " " << store[indices[1]]; }
		}
	}
	} else {
		if (indices[0]==-1)
		{
			cout << "yes" << "\n" << "1 1";
			return 0;
		}
		cout << "no";
	}

return 0;
}
