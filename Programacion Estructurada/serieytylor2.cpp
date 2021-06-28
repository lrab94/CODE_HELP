//nombre

#include "stdio.h"

main(){
	
	int n;
	float y=0;
	bool a=true;
	
	printf("Limite: ");
	scanf("%d",&n);
	
	for(int i=1;i<=n;i++){
		
		y = (a==true)? y + (1.0/i): y - (1.0/i);
		a = (a==true)? false : true ;
	
	}
	
	printf("\n\nY=%0.3f",y);
	
}
