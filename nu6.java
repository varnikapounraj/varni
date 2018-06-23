#include <stdio.h>

int main(void) {
int a,b,c,d,e,f,g,h,i,j;
scanf("%d %d",&a,&b);
e=(a*60)+b;
scanf("%d %d",&c,&d);
f=(c*60)+d;
if(e>f)
{
h=e-f;
i=h/60;
j=h%60;
printf("%d %d",i,j);
}
else
{
h=f-e;
i=h/60;
j=h%60;
printf("%d %d",i,j);
}
return 0;
}
