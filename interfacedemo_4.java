interface one{
   void fun();

}

interface two extends one{
 void fun();
}

class three implements two
{
public void fun() {

System.out.println("three implements two extends");

}

}

public class interfacedemo_4{

  public static void main(String[] args){

  three ob=new three();
  ob.fun();


  }

}