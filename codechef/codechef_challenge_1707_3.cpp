#include <iostream>
using namespace std;
#include <math.h>
#include <algorithm>

void input (int arr[],int n, int store[]) {
	for (int i = 0; i < n; ++i)
	{
		cin >> arr[i];
		store[i]=arr[i];
	}
}


void print (int arr[], int n) {
     for(int i=0; i<n; i++) 
     {
             cout << arr[i];
             
     }
}
int main()
{
	int n,j=0,i=0,temp;
	cin >> n;
	int arr[n];
	int store[n];
	int indices[2]={-1,-1};
    input(arr,n,store);
    print(arr,n);
    system("pause");
return 0;
}
