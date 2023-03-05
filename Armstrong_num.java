
/*Armstrong number Program*/

import java.util.Scanner;

class Armstrong_num{

	public static void main(String[] args){

		int n,r,c,arm=0;
		System.out.println("Enter any number");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();

		c=n;
		while(n>0)
		{
		 r=n%10;
		 arm=(r*r*r)+arm;
		 n=n/10;

		}


  if(c==arm){

	  System.out.println("Number is Armstrong");

	  }else{

		  System.out.println("Number is not Armstrong");

		  }

		}
	}
