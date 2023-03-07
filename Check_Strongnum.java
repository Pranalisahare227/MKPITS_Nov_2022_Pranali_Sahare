/*check the given number is STRONG or not*/

import java.util.*;
class Check_Strongnum
{
static int fact(int n)
{
int fact=1;
while (n>0)
{
fact= fact*n;
n--;
}
return fact;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n =sc.nextInt();
int num=n;
int sum=0;
int t=num;
while (num!=0)
{
int r=num%10;
sum=sum + fact(r);
num=num/10;
}
if (sum==t)
System.out.println(t+" is a strong number");
else
System.out.println(t+" not a strong number");
}
}