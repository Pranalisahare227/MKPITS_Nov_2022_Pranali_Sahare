import java.util.HashSet;

public class hashset {
    public static void main(String[] args){
        HashSet al=new HashSet();
        System.out.println(al.size());

        al.add(2);
        al.add(2);
        al.add(4.5f);
        //al.add(2);
        al.add("Deep");
        al.add('a');
        //al.add(2,"new");
        System.out.println(al.size());
        System.out.println(al);

        System.out.println(al.contains(23));


    }
}


