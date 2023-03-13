/*11.Write a Java program to accept the height of a person in centimeter and categorize the person according to their height.*/


import java.util.Scanner;

class AssQ11_1Feb
{
public static void main(String[] args)
   {
   int hgt;
Scanner sc=new Scanner(System.in);
System.out.println("enter the height");
hgt=sc.nextInt();
if(hgt<100)
     {
      System.out.println("height is small");
     }
     else if(hgt>100)
     {
     System.out.println("height is tall");
     }
}
}