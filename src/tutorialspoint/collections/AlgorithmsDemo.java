package tutorialspoint.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class AlgorithmsDemo {

  public static void main(String args[]) {
    // Create and initialize linked list
    LinkedList<Integer> ll = new LinkedList<Integer>();
    ll.add(new Integer(-8));
    ll.add(new Integer(20));
    ll.add(new Integer(-20));
    ll.add(new Integer(8));

    // Create a reverse order comparator
    Comparator<Integer> r = Collections.reverseOrder();
    // Sort list by using the comparator
    Collections.sort(ll, r);
    // Get iterator
    Iterator<Integer> li = ll.iterator();
    System.out.print("List sorted in reverse: ");
    while (li.hasNext()) {
      System.out.print(li.next() + " ");
    }
    System.out.println("\nList sorted in reverse: " + ll);
    System.out.println();
    Collections.shuffle(ll);
    // display randomized list
    li = ll.iterator();
    System.out.print("List shuffled: ");
    while (li.hasNext()) {
      System.out.print(li.next() + " ");
    }
    System.out.println("\nList shuffled: " + ll);
    System.out.println();
    System.out.println("Minimum: " + Collections.min(ll));
    System.out.println("Maximum: " + Collections.max(ll));
    LinkedList<Integer> cll = new LinkedList<Integer>();
    for (int i = 0; i < 4; i++) {
      cll.add(0);
    }
    Collections.copy(cll, ll);
    System.out.println("Collections.copy: " + cll);
  }
}
