//3.	Write a JAVA program to create a new array from two give array of integers, each length 3.

class AssigQ3_25jan
{
public static void main(String[] args)
{
int a[]={1,2,3};
int b[]={4,5,6};

int c[]={a[0],a[1],a[2],b[0],b[1],b[2]};

for(int i=0; i<c.length ;i++)
{
  System.out.print(" "+c[i]);
}
System.out.println(" ");


}
}