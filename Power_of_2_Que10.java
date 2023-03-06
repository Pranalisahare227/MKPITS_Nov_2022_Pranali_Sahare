/*10.	Write a C program to print the powers of 2 table for the power 0 to 10, both positive and negative.*/

//18 jan assigque
class Power_of_2_Que10
{
public static void main(String[] args){

 long p;
  int n;
  double q;
  System.out.println("n   2 to power n     2 to power -n");

  p=1;
  for(n=0 ; n<=10 ; n++){

	  if(n==0)
	   p=1;
	  else
	   p=p*2;

	   q=1.0/(double)p;
  System.out.println(n+"    "+p+"               "+q);
  }
 }
}