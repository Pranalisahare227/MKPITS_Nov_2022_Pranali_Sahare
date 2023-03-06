/* Program to Check Given year is leap or not*/

import java.util.Scanner;
public class check_leapyear{
  public static void main(String[] args){

  int y;
  System.out.println("Enter any Year");
  Scanner sc=new Scanner(System.in);
  y=sc.nextInt();  //2016

  if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
  {

  System.out.println("Leap Year");

  }else{

  System.out.println("Not Leap Year");

  }

  }

}
