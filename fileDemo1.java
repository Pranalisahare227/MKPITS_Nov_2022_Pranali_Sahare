

import java.io.*;



public class  fileDemo1 {
  public static void main(String[] args){

  File f=new File("C:\\Users\\Pranali\\Desktop\\Gn Soft\\rq.txt");
  try{

  f.createNewFile();

  } catch (IOException e)  {

      throw new RuntimeException(e);

  }




  }


}