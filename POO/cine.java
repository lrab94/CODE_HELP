import java.util.*;
import javax.swing.*;

public class cine{
   
   int aforo;
   int ocupados;
   String pelicula;
   double entrada;
   
   cine(){
   
      aforo=100;
      ocupados=0;
      pelicula=null;
      entrada=5;
   
   }//end constructor
   
   void setaforo(int cant){
      aforo=cant;
   }//end setaforo
   
   void setocupados(int no){
      ocupados=ocupados+no;
   }//end setaforo
   
   void setpelicula(String nombre){
      pelicula=nombre;
   }//end setaforo
   
   void setentrada(double ev){
      entrada=entrada+ev;
   }//end setaforo
   
   int getaforo(){
      return(aforo);   
   }//end getaforo
   
   int getocupados(){
      return(ocupados);
   }//end getocupados
   
   String getpelicula(){
      return(pelicula);
   }//end getpelicula
   
   double getentrada(){
      return(entrada);
   }//end getentrada
   
   void libres(int lib){
      aforo=aforo-lib;
   }//end libres
   
   double porcentaje(){
      double a=((double)ocupados/((double)(aforo+ocupados))*100);
      return(a);
   }//end ocupados
   
   double ingresos(){
      return(entrada*ocupados);
   }
   
   public void vacios(){
      aforo=0;
      ocupados=0;
      entrada=0;
      pelicula=null;
   }
   
   public static void main(String a1[]){
   
      int op=0,cant=0;
      double ing=0,por;
      boolean b,b1;
      cine pollo = new cine();
      String nombre=JOptionPane.showInputDialog("Nombre de la pelicula");
      pollo.setpelicula(nombre);
      do{
         do{
         try{
            op=Integer.parseInt(JOptionPane.showInputDialog("               MENU\n\n 1.-Venta entradas \n\n 2.-Porcentaje asientos ocupados \n\n 3.-Control de entradas \n\n 4.-Ocupados \n\n 5.-Informacion \n\n 6.-Vaciar \n\n 7.-Salir \n\n"));
            b=true;
            }catch(NumberFormatException e){
               JOptionPane.showMessageDialog(null,"La opcion ingresada no es valida");
               b=false;
            }//end catch
            }while(!b);
         switch(op){
            
            case(1): do{
               try{
               cant=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de boletos: "));
               b1=true;
               }catch(NumberFormatException e1){
                  JOptionPane.showMessageDialog(null,"La opcion ingresada no es valida");
                  b1=false;
               }//end catch
               }while(!b1);
               pollo.libres(cant);
               pollo.setocupados(cant);
               ing=pollo.ingresos();
               JOptionPane.showMessageDialog(null,"Venta exitosa...");
               break;
            case(2): por=pollo.porcentaje();
               JOptionPane.showMessageDialog(null," El porcentaje de asientos ocupados es "+por);
               break;
            case(3): JOptionPane.showMessageDialog(null," La cantidad de entradas vendidas es: "+pollo.ocupados+"\n\n Quedando "+pollo.aforo+" asientos libres \n\n Ingresos de: $"+ing);
               break;
            case(4): JOptionPane.showMessageDialog(null," El numero de asientos ocupados es "+pollo.ocupados+" y "+pollo.aforo+" asientos libres.");
               break;
            case(5): JOptionPane.showMessageDialog(null," Aforo: "+pollo.aforo+"\n\n Entradas vendidas : "+pollo.entrada+"\n\n Asientos ocupados: "+pollo.ocupados+"\n\n Nombre de la pelicula: "+pollo.pelicula);
               break;
            case(6): pollo.vacios();
               nombre=JOptionPane.showInputDialog(" Nuevo nombre de la pelicula");
               pollo.setpelicula(nombre);
               pollo.setaforo(Integer.parseInt(JOptionPane.showInputDialog(" Aforo para la nueva pelicula: ")));
               pollo.setentrada(Double.parseDouble(JOptionPane.showInputDialog(" Costo de entradas para nueva pelicula: ")));
               break;
            case(7):
               JOptionPane.showMessageDialog(null," Saliendo...");
               break;
            default:
               JOptionPane.showMessageDialog(null,"La opcion ingresada no es valida");
         
         }//end switch
            
            
      }while(op!=7);
   
   }//end main
   

}//end class