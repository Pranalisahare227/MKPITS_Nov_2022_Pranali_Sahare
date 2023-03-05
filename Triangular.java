class tri{
 int i, sum=0;
 void set(){
  for(int i=1;i<30;i++)
  {

  sum=sum+i;
  System.out.println(sum);

  }

 }

}

public class Triangular{
  public static void main(String[] args){

  tri ob = new tri();
  ob.set();


  }
}