/*Aguilar Bernal Luis Raul*/

# include "stdio.h"
#include "stdlib.h"

main(){
	
	int n;
	float tn=0,s;
	
	printf("Numero de trabajadores: ");
	scanf("%d",&n);
	
	for (int i=0;i<n;i++){
		
	printf("\nSalario: ");
	scanf("%f",&s);
	tn=tn+s;
	system("pause"); system("cls");
		
	}
	
	printf("Total de la nomina es: %0.3f",tn);
	
	}
