/*print the Fibonacci series using recursion*/

class Fibonacci_recursion{

	static int a=0,b=1,c;
  public static void main(String[] args ){

  System.out.print(a+" "+b);
  Fibonacci_recursion ob = new Fibonacci_recursion();
  ob.Fib(6);

  }

  void Fib(int i)
  {
     if(i>=1)
     {
       c=a+b;
       System.out.print(" "+c);
       a=b;
       b=c;
       Fib(i-1);


     }

  }

}