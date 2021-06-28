/*Aguilar Bernal Luis Raul*/

# include "stdio.h"

main(){
	
	int m,op;
	float tp=0.0;
	
	printf("Minutos de llamada: ");
	scanf("%d",&m);	
	printf("\nClave            Zona\n");
	printf("  1        America del Norte\n");
	printf("  2         America Central\n");
	printf("  3         America del Sur\n");
	printf("  4             Europa\n");
	printf("  5              Asia\n");
	printf("  6             Africa\n");
	printf("  7             Oceania\n");
	printf("\nIngrese la Clave de la Zona geofrafica de la llamada: ");
	scanf("%d",&op);
	
	switch(op){
		case(1): tp=2*m;
				 break;
		case(2): tp=2.5*m;
				 break;
		case(3): tp=4.5*m;
				 break;
		case(4): tp=3.5*m;
				 break;
		case(5): tp=6*m;
				 break;
		case(6): tp=6*m;
				 break; 
		case(7): tp=5*m;				
	}
	
	printf("El total a pagar por la llamada es: $%0.2f",tp);
	
	
}
