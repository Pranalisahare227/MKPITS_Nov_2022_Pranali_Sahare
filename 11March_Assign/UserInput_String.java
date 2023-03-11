/*Write a program in Java to input a string and print it.*/

import java.util.*;  
class UserInput_String  
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in); 
System.out.println("Enter a string: ");  
String s= sc.nextLine();              //reads string   
System.out.print("You have entered: "+s);             
}  
}  


