/*// Write a C program to check if a given non-negative given number is a multiple of 3 or 7, but not both.*/

import java.util.*;

class non_neg_mul_of3or7_assign_4{

public static void main(String [] argu){

Scanner sc  = new Scanner(System.in);

System.out.println("eneter the num");
int a = sc.nextInt();

if(a>0){

if(a%3==0){

	System.out.println("It is a multiple of 3");

	}
if(a%7==0){

			System.out.println("It is a multiple of 7");

		}
else{

		System.out.println("Not a multiple of 3 nor 7");

	}

}
else {

	System.out.println("NUm should be greater that zero");

	}

System.out.println("HIIIIIIIIII");
}

}
