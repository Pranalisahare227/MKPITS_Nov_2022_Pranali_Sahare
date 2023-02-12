public class throw_demo_02
{
   public static void main(String[] args)
  {
   int bal=3000;
   int width=500;

   if(bal>width)
   {
   System.out.println("Ruapy le lo");
   }
  else
  {
  ArithmeticException ob = new ArithmeticException();
  throw ob;

  }

}
}