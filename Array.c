#include<stdio.h>
int main (void)
{
int i=0,n,s=0;
printf("Enter the value:");
scanf("%d",&n);
if(n>0)
{
sum:
s=s+i;
i++;
if(i<=5)
goto sum;
printf("%d",s);
  }     
 else
 printf("no")
     }
