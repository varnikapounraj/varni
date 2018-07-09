#include<stdio.h>
void main()
{
char str[50],i,c=0;
printf("enter the word");
gets(str);
for(i=0;str[i]!='\0';i++)
{
if((str[i]>='0')&&(str[i]<='9'))
{
c++;
}
}
printf("%d",c);
}
