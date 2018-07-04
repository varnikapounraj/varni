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
		if (str[i] == '.')
		c++;
	printf("%d",c);
	return 0;
}
