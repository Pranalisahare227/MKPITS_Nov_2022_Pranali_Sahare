//2 by 2 matrix array Multiplication

class matrix2_multi{

public static void main(String[] args){

   int a[][]={ {1,2},{6,5} };
   int b[][]={ {4,3},{9,1} };
   int c[][]=new int [2][2];

   for(int i=0;i<2;i++)

   {
      for(int j=0;j<2;j++)
      {
        c[i][j]=a[i][j]*b[i][j];

        System.out.println(" "+c[i][j]);

      }

      System.out.println();

   }

}

}