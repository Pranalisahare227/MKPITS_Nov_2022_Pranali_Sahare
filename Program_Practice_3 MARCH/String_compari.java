/*String Comparison*/

class String_compari{
      public static void main(String[] args){
      //compare
      String name1 = "Tejas";
      String name2 = "Tejas";

      //1 s1 > s2 : +ve value
      //2 s1 == s2 : 0
      //3 s1 < s2 : -ve value

      if(name1.compareTo(name2)==0){  //Always use compareTo

      System.out.println("Strings are Equal");

      }else{

      System.out.println("Strings are not Equal");

      }

      ////////////////////////////

            if(name1 == name2){

	        System.out.println("Strings are Equal");

	        }else{

	        System.out.println("Strings are not Equal");

	        }

     ///////////////////////////////

     if(new String("Tejas") == new String("Tejas")){
		 System.out.println("Strings are Equal");

		 }else{

		 System.out.println("Strings are not Equal");

		 }

	}


      }

