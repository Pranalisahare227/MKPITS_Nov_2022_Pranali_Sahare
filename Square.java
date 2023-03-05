class sq{

     int i,sum=0;

     void set()
     {

     for(int i=1;i<=10;i++)
     {

     sum=i*i;
     System.out.println(sum);

     }
 }
}

class Square{
  public static void main(String[] args){
  sq ob = new sq();
  ob.set();

}
}