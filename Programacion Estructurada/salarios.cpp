//Aguilar Bernal

#include "stdio.h"
#include "stdlib.h"

main(){
	
	float st,a;
	
	printf("Ingrese su salario");
	scanf("%f",&a);
	
	if(a<5000)
		st=a+(a*0.05);
	else
			if(a<10000) 
				st=a+(a*0.04);
			else
				 st=a+(a*0.03);
	
	printf("El nuevo salario es: %f",st);
	
}
