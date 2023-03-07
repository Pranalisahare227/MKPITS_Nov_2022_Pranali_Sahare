
/*Display INVERTED TRIANGLE with stars*/

import java.util.Scanner;
public class Inverted_Triangle
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int n = sc.nextInt();
for(int i=0;i<n ;i++)
{
for (int j=0;j<i; j++)
{
System.out.print(" ");
}
for(int k=0;k<2*(n-i)-1;k++)
{
System.out.print("*");
}
System.out.println ( );
}
}
}