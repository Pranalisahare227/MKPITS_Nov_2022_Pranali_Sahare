/*15.Write a Java programming that reads in two integers and check whether the first integer is a multiple of the second integer*/

import java.util.*;

class multiple_second_int_15assig{

public static void main(String [] argu){

Scanner sc = new Scanner(System.in);
int res;

System.out.println("Enter The First Num");
int num1 = sc.nextInt();

System.out.println("enter second num");
int num2 = sc.nextInt();

if(num1>num2){/// if 1

	res = num1/num2;


if(num1%num2 == 0){// nesteed if

	System.out.println(+num1+" is multiple of "+num2);


	}/// ende of nested if
else{

	System.out.println(+num1+" is not multiple of "+num2);

	}


	}/// end of first if

else{

	if(num2>num1){

		if(num2%num1 == 0){

			System.out.println(+num1+" is multiple of "+num2);

			}// end of second if

			else{

				System.out.println(+num1+" is not multiple of "+num2);

				}

		}// of 1st if nested in else



	}// ende of else

}

}


