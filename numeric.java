#include<stdio.h>
#include<string.h>
int main()
{
	char str[50];
	int c=0,i;
    scanf("%[^\n]s",str);
    int l;
    l=strlen(str);
	for (i = 0; i<l; i++)
		if ((str[i]>='0' && str[i]<='9') || ((str[i]>='a' && str[i]<='z') || (str[i]>='A' && str[i]<='Z')))
		{
		}
		else
		c++;
	printf("%d",c);
	return 0;
}
