package Herencia;


public class HerenciaPapas{
    String apellidoP;
    String apellidoM;
   
   public HerenciaPapas(){
      apellidoP="";
      apellidoM="";
   }
   
   public HerenciaPapas(String apellidoP,String apellidoM){
      this.apellidoP=apellidoP;   
      this.apellidoM=apellidoM;
   }
   
   public void setPrimerApellido(String apellidoP){
      this.apellidoP=apellidoP;
   }

   public void setSegundoApellido(String apellidoM){
      this.apellidoM=apellidoM;
   }
   
   public String getPrimerApellido(){
      return(apellidoP);
   }
   
   public String getSegundoApellido(){
      return(apellidoM);
   }
   
   
   
}  