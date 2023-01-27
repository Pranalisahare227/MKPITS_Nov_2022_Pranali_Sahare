import java.util.Scanner;
class palindrome03
{
public static void main(String[] args)
{

int num,n1,n2,n3,n4,n5,ori,rev;

//collecting data from user
System.out.println("Enter 5 digit number");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();

//separate logic
ori=num;
n1=num%10;
num=num/10;
n2=num%10;
num=num/10;
n3=num%10;
num=num/10;
n4=num%10;
num=num/10;
n5=num%10;
num=num/10;

//reverse logic
rev=n1*10000+n2*1000+n3*100+n4*10+n5*1;

//loop
if(rev==ori)
{
System.out.println("Palindrome");
}else{
System.out.println("not Palindrome");
}
}

}









