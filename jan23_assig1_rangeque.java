// Write a C program to compute the sum of the two given integers. If the sum is in the range 10..20 inclusive return 30.

import java.util.Scanner;
class return30
{
int n1,n2,sum;
void set()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st number");
n1=sc.nextInt();
System.out.println("Enter 2nd number");
n2=sc.nextInt();


int sum=n1+n2;

//condition
if(sum>10 && sum<20)
{

System.out.println("It is in the range");

}

else
{

System.out.println("It is not in the range");
}
}
}

 class jan23_assig1_rangeque
{
public static void main(String[] args){

return30 ob = new return30();

ob.set();
}

}