public class Java_Basics_Prog10 {
    // swap number by using functions
public static void swap(int x , int y){
    int c;
    c = x;//c =5
    x = y;//a =4
    y = c;//b =5;
    System.out.println("value after swap is a= "+x+"and b="+y);
    System.out.println(x);
    System.out.println(y);



}

    public static void main(String[] args) {
        int a =5;
        int b =4;// also we can input the value
        swap(a,b);
    }
}