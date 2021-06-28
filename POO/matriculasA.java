import java.util.*;
import javax.swing.*;

public class matriculasA{
   
   double calif[]=new double[20];
   String nombre[]=new String[20];
   int matricula[]=new int[20];
   boolean ab[]=new boolean[20];
   int n;
   
   matriculasA(){
      for(int i=0;i<20;i++){
         calif[i]=0;
         matricula[i]=0;
         nombre[i]="";
         ab[i]=true;
         n=0;
      }//end for
   }//end constructor
   
   void setlimit(int limit){
      n=limit;
   }//end setlimit
   
   int getlimit(){
      return(n);
   }//end getlimit

   void setcalif(int indice, double valor){
      calif[indice]=valor;
   }//end setcalif
   
   double getcalif(int indice){
      return(calif[indice]);
   
   }//end getcalif
   
   void setnombre(int indice, String cadena){
      nombre[indice]=cadena;
   }//end setnombre
   
   String getnombre(int indice){
      return(nombre[indice]);
   
   }//end getnombre
   
   void setmatricula(int indice, int valor){
      matricula[indice]=valor;
   }//end setmatricula
      
   int getmatricula(int indice){
      return(matricula[indice]);
   
   }//end getmatricula
   
   void setab(int indice, boolean b){
      ab[indice]=b;
   }//end setab
   
   boolean getab(int indice){
      return(ab[indice]);
   }//end getab
   
   void capturarDatos(){
      double aux1=0.0;
      String aux2=null;
      int aux3=0;
      boolean aux4,b1=true;
      for(int i=1;i<=getlimit();i++){
         
         do{
            try{
               aux1=Double.parseDouble(JOptionPane.showInputDialog(" Ingrese la calificacion del alumno:"));
               b1=true;
               }catch(NumberFormatException e){
                  JOptionPane.showMessageDialog(null,"La calificacion solo puede contener numeros, intentelo otra vez...");
                  b1=false;
               }//end catch
         }while(!b1);
         setcalif(i,aux1);
         
         aux2=JOptionPane.showInputDialog(" Ingrese el nombre del alumno:");
         setnombre(i,aux2);
         
         do{
            try{
               aux3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la matricula del alumno:"));
               b1=true;
               }catch(NumberFormatException e){
                  JOptionPane.showMessageDialog(null,"La matricula solo puede contener numeros, intentelo otra vez...");
                  b1=false;
               }//end catch
         }while(!b1);

         setmatricula(i,aux3);
         aux4=true;
         setab(i,aux4);
         JOptionPane.showMessageDialog(null," Alumno registrado...");
      }//end for i
   }//end capturarDatos
   
   void imprimirDatos(boolean b){  
      boolean b1=false;
      for(int i=1;i<=getlimit();i++){
         if(ab[i]==b){
            b=true;
            JOptionPane.showMessageDialog(null," Numero de Matricula: "+getmatricula(i)+"\n Nombre del Alumno: "+getnombre(i)+"\n Calificacion: "+getcalif(i)+"\n Presione OK para continuar...");
            }//end if ab
      }//end for i
      if(!b1)
         JOptionPane.showMessageDialog(null," No se encontro ningun alumno.");
   }//end imprimir
   
   void ordenarDatos(){
      int aux1;
      String aux2=null;
      double aux3;
      boolean aux4;
      
      for(int i=0;i<=getlimit();i++){
         for(int j=1;j<=(getlimit()-i);j++){
            if(matricula[j-1] > matricula[j]){
               
               aux1 = matricula[j-1];
               setmatricula(j-1,matricula[j]);  
               setmatricula(j,aux1);
               
               aux2=nombre[j];
               setnombre(j-1,getnombre(j));
               
               aux3=calif[j-1];
               setcalif(j-1,getcalif(j));
               setcalif(j,aux3);

               aux4=ab[j];
               setab(j-1,getab(j));
               setab(j,aux4);

            }//end if
         }//end for j
      }//end for i
      JOptionPane.showMessageDialog(null,"Ordenamiento exitoso!");
   }//end ordenar   
   
   void altas(){
      boolean b1=true,b=false;
      int a=-5;
      do{
         try{
            a=Integer.parseInt(JOptionPane.showInputDialog("Matricula del alumno a dar de alta: "));
            b1=true;
            }catch(NumberFormatException e){
               JOptionPane.showMessageDialog(null,"La matricula debe ser numerica, intentelo otra vez...");
               b1=false;
            }//end catch
      }while(!b1);
      
      for(int i=0;i<getlimit();i++){
         if(matricula[i]==a){
            ab[i]=true;
            b=true;
         }//end if
      }//end for i
      
      if(!b)
         JOptionPane.showMessageDialog(null,"Numero de matricula no encontrado, intentelo de nuevo...");
         else
            JOptionPane.showMessageDialog(null,"Alumno dado de alta...");
   
   }//end altas
   
   void bajas(){
      boolean b=false,b1=true;
      int a=-5;
      do{
         try{
            a=Integer.parseInt(JOptionPane.showInputDialog("Matricula del alumno a dar de baja: "));
            b1=true;
            }catch(NumberFormatException e){
               JOptionPane.showMessageDialog(null,"La matricula debe ser numerica, intentelo otra vez...");
               b1=false;
            }//end catch
      }while(!b1);
      
      for(int i=0;i<getlimit();i++){
         if(matricula[i]==a){
            ab[i]=false;
            b=true;
         }//end if         
      }//end for i
      if(!b)
         JOptionPane.showMessageDialog(null,"Numero de matricula no encontrado, intentelo de nuevo...");
         else
            JOptionPane.showMessageDialog(null,"Alumno dado de baja...");
   }//end bajas
   
   public static void main(String a1[]){
      boolean b=true,b2;
      int op=1,op2=0,limit=0;
      matriculasA obj = new matriculasA();
      
      do{
         try{
            limit=Integer.parseInt(JOptionPane.showInputDialog(" Cantidad de alumnos:"));
            b=true;
            }catch(NumberFormatException e2){
               JOptionPane.showMessageDialog(null,"La cantidad de alumnos debe ser un numero, intentelo otra vez.");
               b=false;
            }//end catch
      }while(!b);
      
      obj.setlimit(limit);
      
      do{
         do{
            try{
               op=Integer.parseInt(JOptionPane.showInputDialog("     Menu\n\n 1- Capturar\n\n 2-Imprimir\n\n 3-Dar de baja a alumno\n\n 4-Dar de alta a alumno\n\n 5-Ordenar por Matricula\n\n 6-Salir \n\n"));
               b=true;
            }catch(NumberFormatException e){
               JOptionPane.showMessageDialog(null,"Debe ingresar una opcion valida");
               b=false;
               }//end catch e
         }while(!b);
         
         switch(op){
            case 1: obj.capturarDatos();
               break;
            case 2: do{
                        try{
                           op2=Integer.parseInt(JOptionPane.showInputDialog(" 1-Imprimir alumnos dados de alta \n\n 2-Imprimir alumnos dados de baja \n\n"));
                           if((op2<1) || (op>2))
                              b=false;
                              else
                                 b=true;
                           }catch(NumberFormatException e1){
                              JOptionPane.showMessageDialog(null,"Opcion incorrecta, intentelo otra vez...");
                              b=false;
                           }//end catch
                        }while(!b);
                    b2=(op2==1)?true:false;
                    obj.imprimirDatos(b2);
               break;
            case 3: obj.bajas();
               break;
            case 4: obj.altas();
               break;
            case 5: obj.ordenarDatos();
               break;
            case 6: JOptionPane.showMessageDialog(null,"Saliendo...");
               break;
            default: JOptionPane.showMessageDialog(null,"Debe ingresar una opcion valida.");
               
               
               
         }//end switch op
         
      }while(op!=6);
   }//end main

}//end matriculasA