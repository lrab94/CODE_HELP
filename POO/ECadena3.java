/* Escriba una aplicación que utiliza la generación de números aleatorios para crear enunciados. 
Use cuatro arreglos de cadenas llamados articulo, sustantivo, verbo y preposición. 
Cree una oración seleccionando una palabra al azar de cada uno de los arreglos, en el siguiente orden. 
Articulo, sustantivo, verbo,  preposición, articulo y sustantivo. A medida  que elija cada palabra, 
concatenela  con las palabras anteriores en el enunciado. La palabra deberá separarse mediante espacios. 
Cuando se muestre el enunciado final, deberá empezar con una letra mayúscula y terminar con un punto. 
El programa deberá generar 20 enunciados y mostrarlos.*/

import javax.swing.*;
import java.util.Random;

public class ECadena3{

   public static void main(String a1[]){
   
      Random a=new Random();
      int n=a.nextInt(7);
      int op;
      String enunciado[] = new String[20];
      String[] articulo={"el" , "un" , "algun" , "ningun"};
      String[] sustantivo={"niño", "señor" , "perro" , "ciudad" , "auto"};
      String[] verbo={"manejo", "salto" , "corrio" , "paso"};
      String[] preposicion={"a" , "desde" , "ensima" , "debajo de" , "sobre"};

      for(int i=0;i<20;i++){//Articulo, sustantivo, verbo,  preposición, articulo y sustantivo
         enunciado[i]="";
         op=a.nextInt(4);
         enunciado[i]+= Character.toString( articulo[op].charAt(0) ).toUpperCase() + articulo[op].substring(1) + " ";
         enunciado[i]+= sustantivo[a.nextInt(5)]+" ";
         enunciado[i]+= verbo[a.nextInt(4)]+" ";
         enunciado[i]+= preposicion[a.nextInt(5)]+" ";
         enunciado[i]+= articulo[a.nextInt(4)]+" ";
         enunciado[i]+= sustantivo[a.nextInt(5)]+".\n";
         JOptionPane.showMessageDialog(null,enunciado[i]);
      }
   
   }
}