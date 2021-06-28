/* Aguilar Bernal Luis Raul*/

#include "stdio.h"

main(){
	
	int x, y;
	
	printf("Valor de x: ");
	scanf("%d",&x);
	
	if(x>0 && x<=11) y=(x*x*x)+(x*x)-1;
		else
			if(x>11 && x<=33) y=(x*x) - 10;
				else
							y=(x<0 || x>64)?0:0;
							
	printf("\n Y= %d",y);
	
}
