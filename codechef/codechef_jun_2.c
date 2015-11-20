#include <stdio.h>
int main ()
{
  int t,n,m;
  scanf ("%d",&t);
for (int i = 0; i < t; ++i)
{ scanf ("%d %d",&n,&m);
int a,b,num,den;
a = n % 2;
if (a==0)
{
printf("1/2");
continue;
}
b = m % 2;
if (b==0)
{
printf("1/2");
continue;
}
num = (a*b-1)/2;
den = (a*b);
printf("%d/%d",num,den);
}
  return 0;
}
printf("%s\n", );