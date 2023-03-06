
/*14.Write a Java program to remove any negative sign in front of a number.Input a value (negative)*/

import java.util.*;
class remove_negative_sign_assig14{


public static void main(String [] argus){

int num;
Scanner sc = new Scanner(System.in);

System.out.println("Enter The negative Num: ");
float numm = sc.nextFloat();

if(numm<0){

numm = -numm;
	//System.out.println("Num is :"+a);
	System.out.println("Num is :"+numm);

	}

else{

	System.out.println("NO neeed of change");

	}
}

}


