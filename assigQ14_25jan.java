//14.	Write a C program to check if the number of 3's is greater than the number of 5's.

import java.util.Scanner;

class assigQ14_25jan
{
public static void main(String[] args)
{
System.out.print("Enter the number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num<=3)
{
System.out.println("the number is greater " +num);
}
else
{
System.out.println("the number is not greater" +num);

}
}
}