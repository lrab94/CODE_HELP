 //Escriba un programa que utilice el metodo compareTo de la clase String para comparar dos cadenas introducidas por el usuario. 
 //Muestre si la primer cadena es menor, igual o mayor que la segunda.
 
 import javax.swing.*;
 
 public class ECadena1{
   
   public int c;
   
   public void Compara(String c1, String c2){
   
      c=c1.compareTo(c2);
   
   }
   
   public void Mayorque(String c1, String c2){
      int a,b;
      ECadena1 x=new ECadena1();
      a=c1.length();
      b=c2.length();
      if(a > b)
         JOptionPane.showMessageDialog(null,"La primera cadena tiene longitud mayor");
          else
            if(a < b)
               JOptionPane.showMessageDialog(null,"La segunda cadena tiene longitud mayor");
               else
                  JOptionPane.showMessageDialog(null,"Son de igual longitud");
      System.exit(0);
      
   }
   
   public static void main(String a1[]){
      
      String c1;
      String c2;      
        
      ECadena1 a=new ECadena1();
      
      c1=JOptionPane.showInputDialog("Primera cadea:");
      c2=JOptionPane.showInputDialog("Segunda cadea:");      
      a.Compara(c1,c2);
      if(a.c==0)
         JOptionPane.showMessageDialog(null,"Son iguales");
         else
            if(a.c>0)
               JOptionPane.showMessageDialog(null,"La primera es mayor");
               else
                  JOptionPane.showMessageDialog(null,"La segunda es mayor");
      a.Mayorque(c1,c2);
   
   }


}