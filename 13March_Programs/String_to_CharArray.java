/*convert all the characters of a string into a Character Array.*/


 
public class String_to_CharArray {
 
    public static void main(String[] args) {
         
        String str = "Pranay";
        
        char[] chars = str.toCharArray();
        
        System.out.println(chars);
        
        for (int i= 0; i< chars.length; i++) {
        
            System.out.println(chars[i]);
        }
    }
 
}
