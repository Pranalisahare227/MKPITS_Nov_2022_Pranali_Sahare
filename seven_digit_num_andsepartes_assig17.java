/*17.Write a Java programming that accepts one seven-digit number and separates the number into its individual digits, and prints the digits separated from one another by two spaces each.*/

import java.util.*;

class seven_digit_num_andsepartes_assig17{

public static void main(String [] argu){

Scanner sc = new Scanner(System.in);

System.out.println("Enter The first num");
int a = sc.nextInt();

int temp,b,c,d,e,f,g;

temp = a;
//      1 2 3 4 5 6 7
//      a b c d e f g

g = a%10;
a = a/10;

f = a%10;
a = a/10;

e = a%10;
a = a/10;


d = a%10;
a = a/10;


c = a%10;
a = a/10;

b = a%10;
a = a/10;

System.out.println(+a+"  "+b+"  "+c+"  "+d+"  "+e+"  "+f+"  "+g+"  ");
}

}