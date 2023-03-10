import java.util.LinkedList;
public class linkedlist {
    public static void main(String[] args){
        LinkedList al=new LinkedList();
        System.out.println(al.size());

        al.add(2);
        al.add(4.5);
        al.add("Deep");
        al.add('a');
        al.add(2,"new");
        System.out.println(al.size());
        System.out.println(al);

        System.out.println(al.contains(23));


    }
}
