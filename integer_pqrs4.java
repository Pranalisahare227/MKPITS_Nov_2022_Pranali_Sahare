/*Assign que4 - write a program to accept 4  integer p,q,r,s from user where r&s are +ve and p is even if q>r and s>p and if sum
of r&s > the sum of p&q print current value otherwise print wrong  value*/

import java.util.*;

class integer_pqrs4{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("HELLLOOO");

System.out.println("Enter value of p");
int p = sc.nextInt();

System.out.println("Enter value of q");
int q = sc.nextInt();

System.out.println("Enter value of r");
int r = sc.nextInt();

System.out.println("Enter value of s");
int s = sc.nextInt();

int sum1 = r+s;
int sum2 = p+q;



if(r>0 && s>0 && p%2==0){

	if(q>r && s>p && sum1>sum2){

		System.out.println("Current value");

		}
         }
	else{
		System.out.println("Wrong value");
		}

}
}

