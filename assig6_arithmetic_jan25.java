// 6. Write a Java  program to print on screen the output of adding, subtracting, multiplying and dividing of two numbers which will be entered by the user.

//25 jan assign
import java.util.Scanner;
class assig6
{
int n1,n2,add,sub,mul,div;
void set()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st number");
n1=sc.nextInt();
System.out.println("Enter 2nd number");
n2=sc.nextInt();

int add=n1+n2;
int sub=n1-n2;
int mul=n1*n2;
int div=n1/n2;


System.out.println("Addition is: "+add);
System.out.println("Subtraction is: "+sub);
System.out.println("Multiplication is: "+mul);
System.out.println("Division is: "+div);

}
}

 public class assig6_arithmetic_jan25
{
public static void main(String[] args){

assig6 ob = new assig6();

ob.set();
}

}






