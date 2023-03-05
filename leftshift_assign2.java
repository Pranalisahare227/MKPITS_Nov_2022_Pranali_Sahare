/*Shift given data by two bits to the left*/

import java.util.*;

class leftshift_assign2{

public static void main(String [] argus){

Scanner sc = new Scanner(System.in);

System.out.println("Enter first num: ");
int a = sc.nextInt();

int b;

b = a<<2;

System.out.println("Left shift " +b);
}

}