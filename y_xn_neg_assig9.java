
/*9.Write a Java program to evaluate the equation y=xn when n is a non-negative integer. */

import java.util.*;

class y_xn_neg_assig9{

public static void main(String [] argus){

	// y = xn

	int res;
	Scanner sc = new Scanner(System.in);

System.out.println("Enter value of y ");
int y = sc.nextInt();

System.out.println("Enter value of x ");
int x = sc.nextInt();

System.out.println("Enter value of n ");
int n = sc.nextInt();

res = x*n;

if(y == res){

	System.out.println(+res+" Satisfy the condition of y=xn");

	}
	else{
	System.out.println(" Does not Satisfy the condition of y=xn");
         }
}
}