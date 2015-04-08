package tutorialspoint.collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

  public static void main(String[] args) {

    // Create the sorted set
    SortedSet<String> set = new TreeSet<String>();

    // Add elements to the set
    set.add("b");
    set.add("c");
    set.add("a");
    set.add("d");
    set.add("e");
    set.add("1");

    // Iterating over the elements in the set
    Iterator<String> it = set.iterator();
    while (it.hasNext()) {
      // Get element
      Object element = it.next();
      System.out.println(element.toString());
    }
    System.out.println("first: " + set.first());
    System.out.println("last: " + set.last());
    System.out.println("headSet: " + set.headSet("d"));
    System.out.println("subSet: " + set.subSet("b", "e"));
    System.out.println("tailSet: " + set.tailSet("c"));
  }
}
