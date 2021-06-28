package Herencia;
import javax.swing.*;
 
public class Hijos extends HerenciaPapas{


   String nombre;
   int edad;
   char sexo;
   
   public Hijos(){
      nombre=null;
      char sexo='m';
   }
   
   public Hijos(String nombre,int edad,char sexo){
      this.nombre=nombre;
      this.edad=edad;
      this.sexo=sexo;
   }
   
   public void setNombre(String nombre){
      this.nombre=nombre;
   }
   
   public void setSexo(char sexo){
      this.sexo=sexo;
   }
   
   public void setEdad(int edad){
      this.edad=edad;
   }
   
   public String getNombre(){
      return(this.nombre);
   }
   
   public int getEdad(){
      return(this.edad);
   }
   
   public char getSexo(){
      return(this.sexo);
   }
   
   public static void main(String a1[]){
      int age=0;
      boolean b=true;
      String app=JOptionPane.showInputDialog("Ingrese el apellido paterno:");
      String apm=JOptionPane.showInputDialog("Ingrese el apellido materno:");
      String name=JOptionPane.showInputDialog("Ingrese el nombre:");
      do{
         try{
            age=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad:"));
            b=true;
         }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"La edad debe ser un numero");
            b=false;
         }//end catch
      }while(!b);
      
      char sx='m';
      do{
      String sex=JOptionPane.showInputDialog("Ingrese el sexo[M-F]:");      
      sx=sex.charAt(0);
      sx=Character.toLowerCase(sx);
      b=true;
            
      if(sx!='m' && sx!='f'){
         JOptionPane.showMessageDialog(null,"El sexo debe ser M o F, intentelo otra vez");
         b=false;
         }
      }while(!b);
      
      HerenciaPapas Padres=new HerenciaPapas(app,apm);
      Hijos Hijos1 = new Hijos(name,age,sx);
      String x="Apellido paterno: "+Padres.getPrimerApellido();
      x+="\n Apellido Materno: "+Padres.getSegundoApellido()+"\n Nombre: "+Hijos1.getNombre();
      if(Hijos1.getSexo()=='m'){
         x+="\n Sexo: Masculino";
      }else
         x+="\n Sexo: Femenino";
      x+="\n Edad: "+Hijos1.getEdad();
      
      JOptionPane.showMessageDialog(null,x);
      

   }
   

}