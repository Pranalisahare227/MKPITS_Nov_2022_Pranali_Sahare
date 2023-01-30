public class wrapped_demo1
    {
     public static void main(String[] args){

     int a=7;
     Integer ob = new Integer(a);  // Primitive int to Integer object using constructor

     System.out.println(ob);
     Integer ob2 = Integer.valueOf(a);  //Primitive int to INTEGER object using method

     System.out.println(ob2);

     int x=ob.intValue();
     System.out.println(x);  //object to primitive

/////////////////////////////////////////

    String iob = ob.toString();  //integer object to string
    String iob2 = Integer.toString(a);  //primitive int to string object

    System.out.println(iob2);

    int y =  Integer.parseInt(iob); //String object to primitive int

    Integer z = Integer.valueOf(iob2);  //String object to integer object

    System.out.println(z);



     }






    }