/*Escriba un programa que utilice el metodo regionMatches de la clase String para comparar dos cadenas introducidas por el usuario. 
El programa deber� recibir tambien como entrada el n�mero de caracteres a comparar y el �ndice inicial de la comparaci�n. 
El programa deber� indicar si las cadenas son iguales. Ignore si los caracteres est�n en may�sculas o en min�sculas al momento de 
realizar la comparaci�n*/

import javax.swing.*;

public class ECadena2{

   public static void main(String a1[]){
   
      String c1;
      String c2;
      int cc,ic,ic2;
      
      c1=JOptionPane.showInputDialog("Primera cadena: ");
      c2=JOptionPane.showInputDialog("Segunda cadena: ");
      cc=Integer.parseInt(JOptionPane.showInputDialog("Caracteres a comparar:"));
      ic=Integer.parseInt(JOptionPane.showInputDialog("Indice inicial de la comparacion primera cadena:"));
      ic2=Integer.parseInt(JOptionPane.showInputDialog("Indice inicial de la comparacion segunda cadena:"));      
      if (c1.regionMatches (true,ic,c2,ic,cc))
           JOptionPane.showMessageDialog(null,"Los caracteres comparados son iguales");
           else
            JOptionPane.showMessageDialog(null,"Los caracteres comparados son diferentes");
      
      
   }


}