/*find the Factorial of a given number*/

import java.util.Scanner;
class factorial{
public static  void main(String[] args){

int n, fact=1;
System.out.println("Enter any number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();

for(int i=1;i<=n;i++){

fact=fact*i;
}
System.out.println(fact);

}
}

