/*(Impresión de fecha). La facha se escribe en varios formatos comunes. De los más utilizados son: 07/ 21/ 55, 25 de Abril, 1955.
Escribe un programa que lea una fecha en el primer formato y la imprima en el segundo formato.*/

import javax.swing.*;

public class ECadena7{

   public static void main(String a1[]){
   
      String c1=new String();
      String c3=new String();
      c1=JOptionPane.showInputDialog("Ingrese una fecha en formato MM/DD/AA");
      String[] c2= c1.split("/");
      int a;
      c3+=c2[1]+" de ";
      switch(c2[0]){
         
         case("01"):
            c3+="Enero, ";
            break;
         case("02"):
            c3+="Febrero, ";
            break;            
         case("03"):
            c3+="Marzo, ";
            break;            
         case("04"):
            c3+="Abril, ";
            break;            
         case("05"):
            c3+="Mayo, ";
            break;            
         case("06"):
            c3+="Junio, ";
            break;      
         case("07"):
            c3+="Julio, ";
            break;
         case("08"):
            c3+="Agosto, ";
            break;
         case("09"):
            c3+="Septiembre, ";
            break;
         case("10"):
            c3+="Octubre, ";
            break;
         case("11"):
            c3+="Noviembre, ";
            break;
         case("12"):
            c3+="Diciembre, ";
            break;
      }//fin switch
      
      a=Integer.parseInt(c2[2]);
      
      if(a>40)
         c3+="19";
         else
         c3+="20";
         
      c3+=c2[2];
      
      JOptionPane.showMessageDialog(null,"Nuevo Formato: "+c3);
      
      
   
   
   }//Fin main

}//Fin class