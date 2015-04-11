package tutorialspoint.collections;

import java.util.TreeSet;

public class TreeSetDemo {

  public static void main(String args[]) {
    // Create a tree set
    TreeSet<String> ts = new TreeSet<String>();
    // Add elements to the tree set
    ts.add("C");
    ts.add("A");
    ts.add("B");
    ts.add("E");
    ts.add("F");
    ts.add("D");
    System.out.println(ts);
    System.out.println("first: " + ts.first());
    System.out.println("last: " + ts.last());
    System.out.println("isEmpty: " + ts.isEmpty());
    System.out.println("size: " + ts.size());
    System.out.println("pollFirst: " + ts.pollFirst());
    System.out.println(ts);
    System.out.println("pollLast: " + ts.pollLast());
    System.out.println(ts);
    System.out.println("subSet(\"B\",\"D\"): " + ts.subSet("B", "D"));
    System.out.println("subSet(\"B\", false, \"D\", true): " + ts.subSet("B", false, "D", true));
    System.out.println("tailSet(\"D\"): " + ts.tailSet("D"));
    System.out.println("tailSet(\"D\", false): " + ts.tailSet("D", false));
    System.out.println("headSet(\"D\"): " + ts.headSet("D"));
    System.out.println("headSet(\"D\",true): " + ts.headSet("D", true));
  }
}
