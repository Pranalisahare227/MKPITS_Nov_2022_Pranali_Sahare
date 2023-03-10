/*Write a Java program to print the following characters in a reverse way.
Test Characters: 'X', 'M', 'L'
Expected Output:
The reverse of XML is LMX.
*/

class char_reverse{
   public static void main(String[] args){

   StringBuffer sb=new StringBuffer("XML");
   System.out.println(sb);
   sb.reverse();
   System.out.println("The reverse of XML is " +sb);


  /* char data[]={'X', 'M', 'L'};

   String sb=new String(data);
   System.out.println(sb);

   ////////////////////
   sb.reverse();
   System.out.println(sb);*/







   }
}
