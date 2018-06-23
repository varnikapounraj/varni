#include<stdio.h>
void main()
{
int a[1000],max=0,i,n,j,temp,median;
scanf("%d",&n);
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
for(i=0;i<n;i++)
{
printf("%d %d\n",a[i],i);
}
}
