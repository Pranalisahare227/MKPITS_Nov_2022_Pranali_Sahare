/*11.	Write a Java program to check two given integers whether either of them is in the range 100..200 inclusive.*/

//19 jan Assign
import java.util.Scanner;
public class integers_range_assign11
{
	public static boolean value()
	{
		Scanner sc=new Scanner(System.in);
		boolean check = false;
		System.out.println("Enter the two integer numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a<=200 && b>=100 || a>=100 && b<=200)
		{
			check=true;
		}
		return check;
	}

	public static void main(String[] args)
	{
		System.out.println(value());
	}
}
