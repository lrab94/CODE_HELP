/*Escriba una aplicación que lea una frase en código Morse y que la convierta a su equivalencia en su Español y viceversa. 
Use espacios en blanco entre cada letra de la clave Morse */

import javax.swing.*;

public class ECadena5{

   public static void main(String a1[]){
   
      String c1=new String();
      String c2=new String();
      String c3=new String();
      String c5=new String();
      String c6=new String();
      String mrs[] = {" ",".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",".----", "..---", "... --", "....-", ".....","_....", "_ _...", "- - -..", "----.", "-----", ".-", "-...","!"};
      String lyn = " ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!";   
      int a;
      
      c1=JOptionPane.showInputDialog(null,"Palabra a convertir a morse: ","Convertir palabra a morse",JOptionPane.INFORMATION_MESSAGE);
      c1=c1.toUpperCase();
      
      for (int i=0;i<c1.length();i++){ 
         a=lyn.indexOf(c1.charAt(i));
         c2+=mrs[a]; 
      }

      JOptionPane.showMessageDialog(null,"La palabra en morse es: "+c2,"Convertir palabra a morse",JOptionPane.INFORMATION_MESSAGE);

      c3=JOptionPane.showInputDialog(null,"Palabra en morse a convertir a español(separada en espacios): ","Convertir morse a español",JOptionPane.INFORMATION_MESSAGE);
      String[] c4 = c3.split(" ");

       for(String c3c4 : c4 ){   
          for(int j=0;j<36;j++){
             c5=String.format(c3c4);
             if(c5.equals(mrs[j]))
                  c6+=lyn.charAt(j);
          }
      }
              
      JOptionPane.showMessageDialog(null,"La palabra es: "+c6,"Convertir morse a español",JOptionPane.INFORMATION_MESSAGE);      
      
   }


}