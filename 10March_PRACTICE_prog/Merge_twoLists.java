/*Merge two lists using addAll()*/

import java.util.ArrayList;
import java.util.List;

class Merge_twoLists {
  public static void main(String[] args) {

    // create first list
    List<Integer> prime = new ArrayList<>();
    prime.add(4);
    prime.add(5);
    prime.add(6);
    System.out.println("First List: " + prime);

    // create second list
    List<Integer> even = new ArrayList<>();
    even.add(7);
    even.add(8);
    System.out.println("Second List: " + even);

    // create merged list
    List<Integer> numbers = new ArrayList<>();
    numbers.addAll(prime);
    numbers.addAll(even);

    System.out.println("Merged List: " + numbers);

  }
}
