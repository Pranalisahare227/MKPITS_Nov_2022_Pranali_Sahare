//7.Write a JAVA program to find the largest value from first, last, and middle elements of a given array of integers of odd length (atleast 1).


class AssigQ7_25jan
{
public static void main(String[] args)
{
int a[]={4,6,9};
if(a[0]>a[1] && a[0]>a[2])
{
System.out.println("the largest array is" +a[0]);
}
if(a[1]>a[0] && a[1]>a[2])
{
System.out.println("the largest array is" +a[1]);
}
if(a[2]>a[0] && a[2]>a[1])
{
System.out.println("the largest array is" +a[2]);
}
}
}