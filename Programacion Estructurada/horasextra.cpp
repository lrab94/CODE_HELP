/*Aguilar Bernal Luis Raul*/

# include "stdio.h"

main(){
	
	int s,cat,st,h;
	
	printf("\nIngrese su salario: ");
	scanf("%d",&s);
	printf("\nHoras extra trabajadas: ");
	scanf("%d",&h);
	printf("\nIngrese su categoria: ");
	scanf("%d",&cat);
	
	switch(cat){
		case(1): st=(h>30)?s+300:s+(h*10);
				 break;
		case(2): st=(h>30)?s+600:s+(h*20);
				 break;
		case(3): st=(h>30)?s+900:s+(h*30);
				 break;
		case(4): st=(h>30)?s+1200:s+(h*40);
				 break;
		default: st=s;
	}
	
	printf("\nEl salario total es:$%d",st);
	
}
