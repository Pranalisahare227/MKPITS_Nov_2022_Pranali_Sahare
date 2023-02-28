/*Different ways to print array elements*/

class print_array{
     public static void main(String[] args){


     int a[]=new int[5];

     a[0]=10;
     a[1]=20;
     a[2]=30;
     a[3]=40;
     a[4]=50;

     /*for(int i=0;i<5;i++){

     System.out.print(a[i]+ " ");

     }*/

   for(int b:a){

	   System.out.print(b+ " ");

	   }

     }

}