//Aguilar Bernal Luis Raul

#include "stdio.h"
#include "stdlib.h"

main(){
	
	float vt,v;
	
	printf("Monto de venta: ");
	scanf("%f",&v);
	
	if(v<=20000) vt=v;
	else
		if(v>20000 && v<=40000) vt=v-v*0.05;
		else
			if(v>40000 && v<=60000) vt=v-v*0.1;
			else
				vt=(v>60000 && v<=80000)?v-v*0.15:v-v*0.2;
	
	printf("\n\nEl total de la compra es : $%0.2f",vt);
	
}
