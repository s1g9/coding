#include <stdio.h>



decode ( int no ) {
char chararr[];
for (int i = 0; i < no; ++i)
{
	int a_i,b_i;
	scanf("%d %d",&a_i,&b_i);
}
scanf("%s",&chararr);
for (int i = 0; i < sizeof(chararr); ++i)
{
for (int j = 0; j < no; ++j)
{
if (chararr[i]==a_j)
 {
chararr[i]=b_j;
 }
}

}
return float(chararr);
}

int main()
{
int t,no;
float ans;
scanf("%d",&t);
for (int i = 0; i < t; ++i)
{
scanf("%d",&no);
ans = decode(no);
printf("%f\n",ans);
}






}