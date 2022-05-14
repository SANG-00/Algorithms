#include <stdio.h>
#include <string.h>

int Euclid ( int M, int N )
{
	int R;
	while ( N != 0)
	{
		R = ( M % N );
		M = N;
		N = R;
	}
	return M;
}

/*
void main ()
{
	int SM;
	int SN;
	int GCD;
	printf("Write down the first integer:\n");
	scanf("%d",&SM);
	printf("Write down the second integer:\n");
	scanf("%d",&SN);
	GCD = Euclid(SM, SN);
	strcat("The GCD of " , SM , " and " , SN , " is: " , GCD );
}
*/
