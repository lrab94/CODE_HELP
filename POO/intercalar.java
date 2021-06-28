//Crear una clase intercalar con un arreglo llamado Numeros.
import java.util.*;
import javax.swing.*;

public class intercalar{

   int numeros[] = new int[60000];
   
   intercalar(){
      
      for(int i=0;i<=49999;i++)
         numeros[i]=0;
   
   }//end constructor
   
   public void setnumeros(int indice, int valor){
      
      numeros[indice]=valor;
   
   }
   
   public int getnumeros(int indice){
      
      return(numeros[indice]);
         
   }
   
   void llenarArreglo(int r){

      for(int i=0;i<=49999;i++){
         setnumeros(i,r);
      }
   }//end llenar
   
   
   void imprimir(){
      String x="";
      for(int i=0;i<=49999;i++){
         x=x+" Numero #"+i+": "+numeros[i]+" ";
      }
      JOptionPane.showMessageDialog(null,x);
   
   }//end imprimir
   
   void ordenar(){
      
      int aux;
      
      long inicio = System.currentTimeMillis();
      for(int i=0; i <= 49999; i++){  
         for(int j=1; j < (49999-i); j++){  
            if(numeros[j-1] > numeros[j]){  
               aux = numeros[j-1];  
               numeros[j-1] = numeros[j];  
               numeros[j] = aux;  
            }//end if
                          
         }//end for j
       }//end for i
      long fin = System.currentTimeMillis();

      JOptionPane.showMessageDialog(null,"Tiempo en segundos: "+((fin-inicio)/1000));
      
   }//end ordenar
   

   public static void main(String a1[]){
         
      intercalar obj= new intercalar();
      Random rdm = new Random();
      int r=0;
      r = rdm.nextInt(9999) + 1;
      
      obj.llenarArreglo(r);

      obj.imprimir();
      
      obj.ordenar();
      
      obj.imprimir();
      
   }


}