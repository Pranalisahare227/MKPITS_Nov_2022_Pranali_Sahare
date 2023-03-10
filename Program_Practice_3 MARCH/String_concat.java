/*String concatenation*/

class String_concat_charAt{
  public static void main(String[] args){

	  //concatenation
    String firstName = "Pranali";
    String lastName = "Sahare";

    String fullName = firstName + "@" + lastName;
    System.out.println(fullName.length());  //l=14

    //charAt
    for(int i=0; i<fullName.length(); i++)
    {
		System.out.println(fullName.charAt(i));


	}

  }

}