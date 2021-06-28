// Aguilar Bernal

#include "stdio.h"

main(){
	
	int a,b,c,mayor;
	
	printf("Escriba el primer numero: ");
	scanf("%d",&a);
	
	printf("Escriba el segundo numero: ");
	scanf("%d",&b);
	
	printf("Escriba el tercer numero: ");
	scanf("%d",&c);
	
	if(a>b)
		mayor=(a>c)?a:c;
		else
			mayor=(b>c)?b:c;

	
	printf("El mayor es: %d",mayor);	
	
}
