class one{
  int a;

}

class two extends one
{
 void set()
 {

   a=9;
 }
 void dis()

 {

 System.out.println(a);

 }

}


public class Inheritancebasic{
	  public static void main(String[] args){
		  two ob=new two();
		  ob.set();
		  ob.dis();

		  }


	}