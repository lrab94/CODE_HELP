import java.util.*;

public class Exception2{

   public static void main(String args[]){
   Random rndm=new Random();
   Scanner lr= new Scanner (System.in);
   int cont=0,num=0;
   int numadiv=rndm.nextInt(500)+1;
   boolean leido,fnd=false;
   System.out.println("Adivine el numero aleatorio[1-500]");
   do{
      leido=true;
      cont++;
      try{
      
         System.out.println("Intento "+cont+": ");
         num=lr.nextInt();
      
      }catch(InputMismatchException e){
   
         System.out.println("El numero ingresado no es valido. ");
         num=0;
         leido=false;
         lr= new Scanner (System.in);
      }//end catch
      finally{

         if(leido==true){
            System.out.println("El numero fue leido.");
            if(num>numadiv)
               System.out.println("El numero ingresado es mayor al numero a adivinar");
               else
                  if(num<numadiv)
                     System.out.println("El numero ingresado es menor al numero a adivinar");
                     else{
                        System.out.println("El numero es correcto!");
                        fnd=true;
                        }//end else
            }//end iftrue

      }//endfinally
   
   }while(!fnd);
   System.out.println("Total de intentos: "+cont); 
   
   }//end main
}//end class