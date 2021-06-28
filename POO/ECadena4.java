/*Para formar frases en latín cerdo a partir de una frase en español, divida la frase en palabras con un objeto de la clase StringTokenizer. 
Para traducir cada palabra a una palabra en latín cerdo, coloque la primera letra de la palabra en español al final de la palabra y agregue la letras “ae”. 
De esta forma, la palabra “salta” se convierte “altasae”, la palabra “el” se convierte en “leae” y la palabra “computadora” se convierte en “omputadoracae”. 
Los espacios en blanco entre las palabras permanecen como espacios en blanco. */

import javax.swing.*;

public class ECadena4{

   public static void main(String a1[]){
   
          String c1= new String();
      String c2= new String();  
      c1=JOptionPane.showInputDialog(null,"Cadena 1:","Convertir a latin",JOptionPane.INFORMATION_MESSAGE);
      
      c2=c1.substring(1,c1.length());
      c2+=Character.toString(c1.charAt(0))+"ae";
      
      JOptionPane.showMessageDialog(null,"La cadena convertida es: "+c2,"Convertir a latin",JOptionPane.INFORMATION_MESSAGE);
      
   }

}