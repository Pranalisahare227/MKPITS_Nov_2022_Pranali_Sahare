/* add two numbers without addition operator */


import java.util.Scanner;
public class addnum_without_opr {
     public static void main(String[] arg)
	 {
	   int x, y ;
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter first number: ");
	   x = sc.nextInt();
	   System.out.print("Enter second number: ");
	   y = sc.nextInt();
      while(y != 0){
            int temp = x & y;
            x = x ^ y;
            y = temp << 1;
        }
        System.out.print("Sum = " +x);

	}
}
