public class Exception1{

   public static void main(String args[]){
   
   try{
      System.out.println("Mensaje try");
      Exception ex = new Exception("Mensaje excepcion nueva");
      throw ex;
      
   }catch(Exception e){
   
      System.out.println("Mensaje catch "+e.getMessage());
   
   }//end catch
         
   
   }//end main
}//end class