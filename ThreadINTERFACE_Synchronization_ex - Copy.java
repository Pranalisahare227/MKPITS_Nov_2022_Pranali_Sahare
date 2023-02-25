class one1 {

  synchronized void dis(String m)  {
    System.out.println("["+m);
    try{Thread.sleep(1000);} catch(InterruptedException e) {}
    System.out.println("]");


  }
}

class two implements Runnable
{
Thread t;
String s;
one1 dob1;

     two(one1 obref,String me)

     {
      t=new Thread(this);
      dob1=obref;
      s=me;
      t.start();

     }

     @Override
     public void run(){
        dob1.dis(s);

     }
}

public class ThreadINTERFACE_Synchronization_ex{
	public static void main(String[] args) {
		 one1 ob=new one1();
		 two ob1=new two(ob, "Hellow");
		 two ob2=new two(ob, "My");
		 two ob3=new two(ob, "Problem");




		}



}