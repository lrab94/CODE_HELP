/*Escribe un programa que lea varias líneas de texto del teclado e imprima sólo las cadenas o palabras que comiencen con la letra “b”*/
import javax.swing.*;

public class ECadena9{

   public static void main(String a1[]){
   
      String[] c1=new String[30];
      String c2=new String();      
      int n,cn1=0;
      n=Integer.parseInt(JOptionPane.showInputDialog("Cuantas lineas desea leer? "));
      
      for(int i=0;i<n;i++){
      
         c1[i]=JOptionPane.showInputDialog("Introduzca la cadena #"+(i+1)+": ");

         if((c1[i].charAt(0)=='b')||c1[i].charAt(0)=='B')
            c2+=c1[i]+"\n";
      
      }//end for i
      
      JOptionPane.showMessageDialog(null,"Lineas leidas que empiezan com 'b':\n"+c2);
   
   }//End main
}//End class