
//4.	Write a C program to create a new array swapping the first and last elements of a given array of integers and length will be least 1.


class AssignQ4_25jan
{
public static void main(String[] args)
{
int a[]={1,2,3,4,5,6};
int temp;
 temp=a[0];
a[0]=a[5];
a[5]=temp;
for(int i=0;i<a.length;i++)
{
System.out.print(" "+a[i]);
}
}
}
