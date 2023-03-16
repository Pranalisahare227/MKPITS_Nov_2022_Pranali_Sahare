/*Binary Search Algorithm*/

import java.util.*;
    class Binary_Search{
   public static void main(String[] args){

   int a[]={2,8,12,16,18,24,26,30,32};

   int beg=0;
   int end=a.length-1;
   int i=0;

   System.out.println("Enter Search Elements ");
   Scanner sc=new Scanner(System.in);
   int srch=sc.nextInt();

   while(i<=a.length-1)
   {

   int mid=(beg+end)/2;

   if(srch==a[mid])
   {
   System.out.println("True");
   System.out.println("Element is at "+mid+" index position ");
   break;
   }
  else if(srch<a[mid])
  {
  end=mid-1;
  }
 else if(srch>a[mid])
 {
	 beg=mid+1;
	 }
	i++;
 }
}
}









