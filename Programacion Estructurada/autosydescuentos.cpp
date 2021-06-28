/*Aguilar Bernal Luis Raul*/

#include "stdio.h"

main(){
	
	float d,tp=0.0;
	int op,p;
	
	printf("Seleccione el modelo deseado:\n");
	printf("\nModelo     Precio   Opcion\n");
	printf("Durango   $580,000     1\n");
	printf("Journey   $450,000     2\n");
	printf("Neon      $320,000     3\n");
	printf("Attitude  $230,000     4\n");
	scanf("%d",&op);
	
	switch(op){
		case(1): p=580000;
				 d=0.09;
				break;
		case(2): p=450000;
				 d=0.07;
				break;
		case(3): p=320000;
				 d=0.06;
				break;
		case(4): p=230000;
				 d=0.05;
	}	
	tp=p-(p*d);
	printf("\nEl total a pagar por el modelo seleccionado es: $%0.2f",tp);
	
}
