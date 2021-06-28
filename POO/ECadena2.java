/*Escriba un programa que utilice el metodo regionMatches de la clase String para comparar dos cadenas introducidas por el usuario. 
El programa deberá recibir tambien como entrada el número de caracteres a comparar y el índice inicial de la comparación. 
El programa deberá indicar si las cadenas son iguales. Ignore si los caracteres están en mayúsculas o en minúsculas al momento de 
realizar la comparación*/

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