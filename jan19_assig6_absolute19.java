//   6.	Write a C program to get the absolute difference between n and 51. If n is greater than 51 return triple the absolute difference

import java.util.Scanner;
class assig
{
int n,sub;
void set()
{
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
}

void fun()
{
sub=n-51;  //diff betn n & 51
if(n>51)
{
sub=sub*3;  //condn
System.out.println(sub);
}

else
{
System.out.println(sub);
}
}
}

class jan19_assig6_absolute19
{
   public static void main(String[] args){

   assig ob=new assig();
   ob.set();
   ob.fun();

   }

}