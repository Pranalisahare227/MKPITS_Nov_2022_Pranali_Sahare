
/* Write a Java program that accepts 4 real numbers from the keyboard and print out the
difference of the maximum and minimum values of these four numbers.*/

import java.util.*;
class DIFF_max_min_assig4{

public static void main(String [] argus){

Scanner sc = new Scanner(System.in);

System.out.println();

System.out.println("Enter the 1 num:"); // a b c d
int a = sc.nextInt();

System.out.println("Enter the 2 num:");
int b = sc.nextInt();

System.out.println("Enter the 3 num:");
int c = sc.nextInt();

System.out.println("Enter the 4 num:");
int d = sc.nextInt();

// greater num
int num1 , num2, diff;

if(a>b && a>c && a>d)
{
	num1 = a;
}

else if(b>a && b>c && b>d)
{
	num1= b;
}

else if(c>a && c>b && c>d)
{
	num1 = c;
}

else{
	num1 = d;
	}

// smaller num


if(a<b && a<c && a<d)
{
	num2 = a;
}

else if(b<a && b<c && b<d)
{
	num2 = b;
}

else if(c<a && c<b && c<d)
{
	num2 = c;
}

else{
	num2 = d;
	}

	diff = num1 - num2;

	System.out.println("Greater Num :"+num1+" Smaller Num " +num2);

System.out.println("Difrencer is : "+diff);

}

}
