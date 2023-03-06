
/*8. Write a Java program to check a given integer and return true if it is within 10 of 100 or 200. */

//19jan assign8

import java.util.Scanner;

class integer_return_assign8
{
  public static void main(String [] args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int x=sc.nextInt();

    boolean b=trueValue(x);

     System.out.println("The solution is: "+b);
  }

  public static boolean trueValue(int p)
  {
	int a=Math.abs(100-p);
	int b=Math.abs(200-p);

	if(a<=10 || b<=10)
	{
      return true;
	}
	else
	return false;
  }
}
