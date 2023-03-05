/*Check given number is Palindrome or not*/

import java.util.Scanner;
class check_Palindrome{
	public static void main(String[] args){
		int n,c,r,s=0;
      System.out.println("Enter any number");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();

      c=n;
      while(n>0){

		      r=n%10;
		      s=(s*10)+r;
		      n=n/10;

		  }


if(c==s){
	 System.out.println("Number is Palindrome");
	   }
else{
	System.out.println("Number is not Palindrome");
	}

  }
}



































