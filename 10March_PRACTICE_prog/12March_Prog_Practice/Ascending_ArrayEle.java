/*Sort array Elements in Ascending ORDER*/

/*Sort Array elements in Asceneding Order*/

import java.util.*;
class Ascending_ArrayEle{

    public static void main(String[] args){

    int a[]=new int[5];

    int temp=0;

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Elements in array	");

    for(int i=0;i<5;i++)
    {

    a[i]=sc.nextInt();

    }

        for(int i=0;i<5;i++)
        {
         for(int j=i+1;j<5;j++)
         {
          if(a[i]>a[j])
          {
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
          }
        }
    }

 System.out.println("Ascending Order: ");
    for(int i=0;i<5;i++)
    {

    System.out.print(a[i]+ " ");

    }

    }

}