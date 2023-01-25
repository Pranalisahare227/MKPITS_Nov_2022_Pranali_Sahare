class thisdemo
{
  int a;
  thisdemo(int x)
  {

  a=x;

  }


void dis()
{

System.out.println("a= "+a);

}
}

public class Parametersedconstr{
     public static void main(String[] args){
     thisdemo ob1=new thisdemo(7);
     thisdemo ob2=new thisdemo(9);


     ob1.dis();
     ob2.dis();

     }
}
