/*String Builder*/

class string_builder_basic1{
  public static void main(String[] args){

    StringBuilder sb = new StringBuilder("Pranu");
    System.out.println(sb);

    //charAt index 0

    System.out.println(sb.charAt(0));

    //set char at index 0
    sb.setCharAt(0, 'T');
    System.out.println(sb);

    //insert
    sb.insert(2,'a');
    System.out.println(sb);

  // delete the extra 'a'
     sb.delete(2, 3);
     System.out.println(sb);






  }

}