import java.io.*;

 public class  fileDemo_exists {
 
   public static void main(String[] args){
 
   File f=new File("C:\\Users\\Pranali\\Desktop\\Gn Soft\\r.txt");
   try{
   
   System.out.println(f.exists());
 
   //f.createNewFile();
 
  // f.deleteOnExit();
 
   } catch (Exception e)  {
 
       throw new RuntimeException(e);
 
   }
 
 
 
 
   }
 
 
 }

