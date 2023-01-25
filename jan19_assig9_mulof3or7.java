// 9.Write a JAVA program to check if a given positive number is a multiple of 3 or a multiple of 7.

import java.util.Scanner;
class assig
{
int num;
void set()
{
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
System.out.println("num:"+num);
}
void fun()
{
if(num%3==0) //condn 1
{
System.out.println("num is multiple of 3");
}
else
if(num%7==0)  //condn 2
{
System.out.println("num is multiple of 7");
}
else
{
System.out.println("num is not multiple of 3or7");
}
}
}


class jan19_assig9_mulof3or7
{
public static void main(String[] args)
{
assig ob=new assig();
ob.set();
ob.fun();
}

}