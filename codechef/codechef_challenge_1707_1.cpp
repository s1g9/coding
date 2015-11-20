#include <stdio.h>
#include <math.h>
int main()
{
	int a1,a2,a3,n,b1,b2,b3,cupsspace,medalsspace,total;
	scanf("%d %d %d",&a1,&a2,&a3);

	scanf("%d %d %d",&b1,&b2,&b3);

	cupsspace=(a1+a2+a3)/5;
	if ((a1+a2+a3)%5 != 0)
	{
	cupsspace=floor((a1+a2+a3)/5)+1;
	}

	if ((b1+b2+b3)%10 != 0)
	{
	medalsspace=floor((b1+b2+b3)/10)+1;
	}

	scanf("%d",&n);
	total = (cupsspace + medalsspace);

	if ( total <= n)
	{
		printf("YES");
	}
	if ( total > n)
	{
		printf("NO");
	}
return 0;
}
