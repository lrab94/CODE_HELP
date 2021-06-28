/*Escribe un programa que lea varias líneas del teclado e imprima una tabla que indique el número de ocurrencias de cada letra del alfabeto. 
Por ejemplo, la frase: Ser o no ser: Ese es el dilema: Contiene una “a”, ninguna “b”, ninguna “c”, etc.*/

import javax.swing.*;

public class ECadena6{

   public static void main(String a1[]){
   
      String[] c1=new String[30];
      int contador[]=new int[26];
      int n;
      char op;
      
      n=Integer.parseInt(JOptionPane.showInputDialog("Cuantas lineas desea leer? "));
      
      for(int h=0;h<n;h++){
      c1[h]=JOptionPane.showInputDialog(null,"Texto #"+(h+1)+" a analizar: ","Analisis Texto",JOptionPane.INFORMATION_MESSAGE);
      c1[h]=c1[h].toUpperCase();
      for(int i=0;i<c1[h].length();i++){
      
         op=c1[h].charAt(i);
         switch(op){
         
            case('A'):
               contador[0]++;
               break;
            case('B'):
               contador[1]++;
               break;
            case('C'):
               contador[2]++;
               break;
            case('D'):
               contador[3]++;
               break;
            case('E'):
               contador[4]++;
               break;
            case('F'):
               contador[5]++;
               break;
            case('G'):
               contador[6]++;
               break;
            case('H'):
               contador[7]++;
               break;               
            case('I'):
               contador[8]++;
               break;         
            case('J'):
               contador[9]++;
               break;
            case('K'):
               contador[10]++;
               break;
            case('L'):
               contador[11]++;
               break;
            case('M'):
               contador[12]++;
               break;
            case('N'):
               contador[13]++;
               break;
            case('O'):
               contador[14]++;
               break;
            case('P'):
               contador[15]++;
               break;
            case('Q'):
               contador[16]++;
               break;
            case('R'):
               contador[17]++;
               break;
            case('S'):
               contador[18]++;
               break;
            case('T'):
               contador[19]++;
               break;
            case('U'):
               contador[20]++;
               break;
            case('V'):
               contador[21]++;
               break;
            case('W'):
               contador[22]++;
               break;
            case('X'):
               contador[23]++;
               break;
            case('Y'):
               contador[24]++;
               break;
            case('Z'):
               contador[25]++;
               break;
         }//fin switch
      
      }//fin for i
      }//fin for h
      
   JOptionPane.showMessageDialog(null," El texto ingresado contiene:\n"+"A: "+contador[0]+"\n"+"B: "+contador[1]+"\n"+"C: "+contador[2]+"\n"+"D: "+contador[3]+"\n"+"E: "+contador[4]+"\n"+"F: "+contador[5]+"\n"+"G: "+contador[6]+"\n"+"H: "+contador[7]+"\n"+"I: "+contador[8]+"\n"+"J: "+contador[9]+"\n"+"K: "+contador[10]+"\n"+"L: "+contador[11]+"\n"+"M: "+contador[12]+"\n"+"N: "+contador[13]+"\n"+"O: "+contador[14]+"\n"+"P: "+contador[15]+"\n"+"Q: "+contador[16]+"\n"+"R: "+contador[17]+"\n"+"S: "+contador[18]+"\n"+"T: "+contador[19]+"\n"+"U: "+contador[20]+"\n"+"V: "+contador[21]+"\n"+"W: "+contador[22]+"\n"+"X: "+contador[23]+"\n"+"Y: "+contador[24]+"\n"+"Z: "+contador[25]+"\n","Analisis Texto",JOptionPane.INFORMATION_MESSAGE);
   
   
   }//fin main
}//fin class