#include <stdio.h>              
#include <conio.h>              

int main()                        
{
	int a[10] = { 3,4,7,6,5,1,2,8,10,9 };          
	int n = 10;                                     
	printf("\n\nArray Data : ");                    
	for (int i = 0; i < n; i++)                     
	{
		printf(" %d ", a[i]);                   
	}
	for (int i = 0; i < n; i++)                    
	{
		for (int j = 0; j < n; j++)           
		{
			if (a[j] > a[i])                
			{
				int tmp = a[i];         
				a[i] = a[j];          
				a[j] = tmp;            
			}  
		}
	}
	printf("\n\nAscending : ");                     
	for (int i = 0; i < n; i++)                     
	{
		printf(" %d ", a[i]);
	}
	for (int i = 0; i < n; i++)                     
	{
		for (int j = 0; j < n; j++)            
		{
			if (a[j] < a[i])                
			{
				int tmp = a[i];         
				a[i] = a[j];            
				a[j] = tmp;            
			}
		}
	}
	printf("\n\nDescending : ");                    
	for (int i = 0; i < n; i++)                    
	{
		printf(" %d ", a[i]);                   
	}
	_getch();                                       
	return 0;                                    
}
