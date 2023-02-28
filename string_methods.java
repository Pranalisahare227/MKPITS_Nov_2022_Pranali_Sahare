
//String methods in Java

public class string_methods{

   public static void main(String[] args){

   String a = "PRANALI";
   String b = "palak";

   System.out.println(a.toLowerCase());
   System.out.println(b.toUpperCase());

   System.out.println(b.concat(a));
   System.out.println(b.length());

   String p="    Vipul  ";
   String q="Dream";
   System.out.println(p.trim());
   System.out.println(q.isEmpty());

   System.out.println(b.charAt(3));
   System.out.println(a.indexOf('N'));

   System.out.println(b.equals(a));
   System.out.println(q.replace('r','e'));



   }


}