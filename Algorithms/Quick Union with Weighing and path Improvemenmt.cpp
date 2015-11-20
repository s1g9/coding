#include <iostream>
using namespace std;
#define no_of_unions 6
#define no_of_queries 3
#define weigh_for_path_improve 3
void constructor(int n, int a[],int weigh[])
{
	for (int i = 0; i < n; ++i)
	{
		a[i]=i;
		weigh[i]=1;
	}
}
int root(int p, int a[]) 
{
while (a[p]!=p)
	{
		p=a[p];
	}
return p;
}
int connected(int p, int q, int a[])
{
if (root(p,a)==root(q,a))
	{
	return 1;
	}
return 0;
}
// weighing assigns parent and child for union
void weighing(int p, int q,int a[], int weigh[],int parent, int child)
{
if ( weigh[root(p,a)] >= weigh[root(q,a)] )
{
	parent=p;
	child=q;
	return;
}
parent=q;
child=p;
return;
}

void union(int parent, int child, int a[], int weigh[])
{
int rootchild,rootparent;
rootparent=root(parent,a);
rootchild=root(child,a);
a[rootchild]=a[rootparent];
weigh[rootparent]=weigh[rootparent]+weigh[rootchild];
return;
}

void path_improvement(int n,int a[],int weigh[])
{
for (int i = 0; i < n; ++i)
{
	if ( weigh[i] > weigh_for_path_improve )
	{
		a[i]=root(i,a);
	}
	
}

return;
}



int main()
{
	int n;
	cin >> n;
	int a[n];
	int weigh[n];
	constructor(n,a,weigh);
/// now take union inputs
	int p,q,parent,child;
	for (int i = 0; i < no_of_unions ; ++i)
	{
		cin >> p;
		cin >> q;
		if (connected(p,q,a)==0)
		{
			weighing(p,q,a,weigh,parent,child);
			union(parent,child,a,weigh);
		}
	}
	path_improvement(n,a,weigh);
	for (int i = 0; i < no_of_queries; ++i)
	{
		cin >> p;
		cin >> q;
		if (connected(p,q,a)==1)
		{
			cout << "YES";
		} else {cout << "No";}
	}
	return 0;
}