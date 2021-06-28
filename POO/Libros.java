//Crea una clase llamada Libro que guarde la información de cada uno de los libros de una biblioteca. La clase debe guardar el título del libro, autor, número de ejemplares del libro y número de ejemplares prestados. 

import java.util.*;

public class Libros{
   
   String titulo;
   String autor;
   int numejempres, numejemlibr;

   public Libros(){
   
       numejempres = 2;
       numejemlibr = 5;
       titulo=null;
       autor=null;
   
   }
   
   public void setTitulo(String t){
   
      titulo=t;
   
   }
   
   public void setAutor(String aut){
   
      autor=aut;
   
   }
   
   public String getTitulo(){
   
      return titulo;
   
   }
   
   public String getAutor(){
   
      return autor;
      
   }
   
   public int getNumEjemPrestados(){
  
      return(numejempres);
      
   }
   
      
   public int getNumEjemLibros(){
   
      return(numejemlibr);
      
   }
   
   
   public boolean prestamo(){
   
      if(numejempres<numejemlibr){
         numejempres++;
         return(true);
      }else{
         System.out.println("No hay libros disponibles");
         System.out.println("Presione una tecla para continuar...");
         new Scanner(System.in).nextLine();
         return(false);
         }
   }
   
   public boolean devolucion(){
   
      if(numejempres>0){
         numejempres--;
         return(true);
      }else{
         System.out.println("Ya estan todos los libros disponibles");
         System.out.println("Presione una tecla para continuar...");
         new Scanner(System.in).nextLine();
         return(false);
      }
   
   }
   
   public void imprimeDatos(){
   
      System.out.println("El autor es: "+autor);
      System.out.println("El titulo es: "+titulo);
      System.out.println("La cantidad de libros prestados es: "+numejempres);
      System.out.println("La cantidad de libros disponibles es: "+(numejemlibr-numejempres));
      System.out.println("La cantidad de libros en total es: "+(numejemlibr));
      System.out.println("Presione una tecla para continuar...");
      new Scanner(System.in).nextLine();
   }
   
   public static void main(String a1[]){
      
      int op;
      boolean dev,pre,b;
      Libros obj= new Libros();
      String tit=new String();
      String aut=new String();
      Scanner lr=new Scanner(System.in);
      b=true;
      System.out.println("Nombre del autor: ");
      aut=lr.nextLine();      
      System.out.println("Titulo del libro: ");      
      tit=lr.nextLine();
      obj.setTitulo(tit);
      obj.setAutor(aut);
      op=0;
      do{
         do{
            System.out.println("Seleccione una opcion: ");
            System.out.println("1.- Prestamo ");
            System.out.println("2.- Devolucion ");
            System.out.println("3.- Consulta Datos ");
            System.out.println("4.- Salir ");
      
            try{
            op=lr.nextInt();
            b=true;
            }catch(InputMismatchException e){
             System.out.println("Solo puede ingresar numeros.");
             System.out.println("Presione una tecla para continuar...");
             new Scanner(System.in).nextLine();
             b=false;
             lr= new Scanner (System.in);
             }
         }while(!b);
         switch(op){
      
            case(1):
               pre=obj.prestamo();
               if(pre){
                  System.out.println("Libro prestado");
                  System.out.println("Presione una tecla para continuar...");
                  new Scanner(System.in).nextLine();
                  obj.imprimeDatos();
                  }
               break;
            case(2):
               dev=obj.devolucion();
               if(dev){
                  System.out.println("Devolucion exitosa");
                  System.out.println("Presione una tecla para continuar...");
                  new Scanner(System.in).nextLine();
                  obj.imprimeDatos();
                  }
               break;
            case(3):
               obj.imprimeDatos();
               break;
            case(4):
               System.out.println("Saliendo...");
               System.exit(0);
         
         }
      
      }while(op!=4);
      
   }

}