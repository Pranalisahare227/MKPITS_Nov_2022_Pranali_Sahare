
/*Write a program in Java to separate the individual characters from a string.*/

public class Seprate_Individualchar  
{  
    public static void main(String[] args) {  
        String string = "Java";  
           
        System.out.println("Individual characters from given string:");  
          
        //Iterate through the string and display individual character  
        for(int i = 0; i < string.length(); i++){
        
        
            System.out.print(string.charAt(i) + "  ");  
        }  
    }  
}  
