class cube{
  int i, sum=0;
  void set(){

  for(int i=1;i<300;i++)

 {

 sum=i*i*i;
 System.out.println(sum);

 }

  }

}

public class cube_series{

  public static void main(String[] args){

  cube ob=new cube();
  ob.set();

  }


}