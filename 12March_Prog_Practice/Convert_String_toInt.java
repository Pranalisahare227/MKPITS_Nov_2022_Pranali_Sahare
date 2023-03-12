/*Convert String to Integer and Integer to String in java*/

public class Convert_String_toInt {  
    public static void main(String[] args) {  
    
        //1st way  
        String s1 = "2";  
        int res = Integer.parseInt(s1); // Using Integer.parsrInt()  
        System.out.println(res);  
   
        //2nd way  
        String s2 = "2";  
        Integer res2 = Integer.valueOf(s2); // Using Integer.valueOf()  
        System.out.println(res2);  
   
    }  
}  
