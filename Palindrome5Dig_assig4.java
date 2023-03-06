/*4.Write a C programming Write a program that reads in a five-digit integer and determines whether or not it’s a palindrome.*/


import java.util.Scanner;

class Palindrome5Dig_assig4
{

 public static void main(String [] args)
 {

 Scanner sc=new Scanner(System.in);
 System.out.println("Enter five digit Number");
 int n=sc.nextInt();
  int y=0;
  if(n>9999 && n<100000)
  {

	  int a=n;
      while(n>0)
      {
	    int x=n%10;
	        y=y*10+x;
	        n=n/10;
      }
      if(y==a)
		System.out.println(y+" is palindrome Number ");
	  else
	    System.out.println(y+" is not palindrome Number ");
   }
   else
      System.out.println("Please enter the Five digit Number ");
 }
}