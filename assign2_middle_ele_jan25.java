// 2.Write a C program to create an array taking two middle elements from a given array of integers of length even.

class assign2_middle_ele_jan25
{
public static void main(String[] args)
{
int a[]={1,2,3,4,5,6};
int x,y;
if(a.length%2==0)
{
System.out.print("lenght of the even number=" +a.length);
x=a[a.length/2-1];
System.out.println("the middle term is="+x);
y=a[a.length/2];
System.out.println("the middle term is="+y);
System.out.println("the middle term array is=" +x+" "+y);
}
else
{
System.out.println("the number is not even");

}
}
}