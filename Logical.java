//Logical Operator AND,OR,NOT

class Logical{
     public static void main(String[] args){

         System.out.println("Logical AND");
         System.out.println((3<4) && (6<9));  //true
         System.out.println((3>4) && (6<9));  //false
	     System.out.println((3>4) && (6<9));  //false


	  System.out.println("Logical OR");
	   System.out.println((3<4) || (6<9));  //true
	   System.out.println((3>4) || (6<9));  //true
	   System.out.println((3>4) || (6>9));  //false


	   System.out.println("Logical NOT");
	   System.out.println(!(3<4));   //false
	    System.out.println(!(9<4));  //true
	   System.out.println(!(3>4));   //true


     }


}