import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {

            ArrayList al=new ArrayList();
            System.out.println(al.size());
            al.add(2);
            al.add(3.4f);
            al.add("Tejas");
            al.add('a');
            al.add(2,"new");

            System.out.println(al.size()); //count kiya arraylist ko
            System.out.println(al);//display kiya elements ko

           // al.add('a');
        al.remove("Tejas");
            System.out.println(al);


        }
    }


