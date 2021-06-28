/* Escribe un programa que lea varias líneas de texto del teclado e imprima una tabla que indique el número de ocurrencia de las vocales (a,e,i,u y u) y las consonantes*/

import javax.swing.*;

public class ECadena8{

   public static void main(String a1[]){
      
      int cn1=0, cn2=0,cn3=0,n;
      String[] c1=new String[30];
      char op;
      n=Integer.parseInt(JOptionPane.showInputDialog("Cuantas lineas desea leer? "));
      
      for(int h=0;h<n;h++){
      c1[h]=JOptionPane.showInputDialog("Introduzca la cadena #"+(h+1)+": ");
      c1[h]=c1[h].toLowerCase();
      
      for(int i=0;i<c1[h].length();i++){
      
         op=c1[h].charAt(i);
         
         if((op=='a')||(op=='e')||(op=='i')||(op=='o')||(op=='u'))
            cn1++;
            else
            if(op==' ')
               cn3++;
               else
               cn2++;                      
      }//end for i
      }//end for h
      JOptionPane.showMessageDialog(null,"La cantidad de vocales es: "+cn1+"\nLa cantidad de consonantes es: "+cn2);
   
   }//End main

}//End class