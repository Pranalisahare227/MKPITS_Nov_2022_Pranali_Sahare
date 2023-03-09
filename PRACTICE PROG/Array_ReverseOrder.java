import java.util.Scanner;

class Array_ReverseOrder{

	public static void main(String[] args){
// int n;

  System.out.println("Enter the size  of the array: ");
  Scanner sc=new Scanner(System.in);

  int[] a = new int[5];

  for(int i=0;i<5;i++){

  a[i]=sc.nextInt();

  System.out.print("Give value for index "+i+" : ");


  }

  System.out.println("Orrignal Array is ");

  for(int i=0;i<a.length;i++){

  System.out.println(a[i]);

  }

  System.out.println();

    System.out.println("Array after Reverse ");
     for(int i=a.length-1;i>=0;i--){

       System.out.println(a[i]);


     }

  }

}