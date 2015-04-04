package tutorialspoint.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {

  public static void main(String[] args) {
    List<String> a1 = new ArrayList<String>();
    a1.add("Zara");
    a1.add("Mahnaz");
    a1.add("Ayan");
    System.out.println(" ArrayList Elements");
    System.out.print("\t" + a1);
    List<String> a2 = new ArrayList<String>();
    a2.add("Tom");
    a2.add("Anna");
    System.out.println("\ncontainsAll(a1): " + a1.containsAll(a1));
    System.out.println("containsAll(a2): " + a1.containsAll(a2));
    System.out.println("addAll(a2): " + a1.addAll(a2));
    System.out.println("containsAll(a2): " + a1.containsAll(a2));
    System.out.println(" ArrayList Elements");
    System.out.print("\t" + a1);
    System.out.println("\nremoveAll(a2): " + a1.removeAll(a2));
    System.out.println(" ArrayList Elements");
    System.out.print("\t" + a1);
    Object[] array = a1.toArray();
    System.out.println("\ntoArray: " + Arrays.toString(array));

    List<String> l1 = new LinkedList<String>();
    l1.add("Zara");
    l1.add("Mahnaz");
    l1.add("Ayan");
    System.out.println();
    System.out.println(" LinkedList Elements");
    System.out.print("\t" + l1);
    System.out.println("\ncontainsAll(l1): " + l1.containsAll(l1));
    System.out.println("size: " + l1.size());
    System.out.println("isEmpty: " + l1.isEmpty());
    l1.clear();
    System.out.println("size after clear: " + l1.size());
    System.out.println("isEmpty after clear: " + l1.isEmpty());

    Set<String> s1 = new HashSet<String>();
    s1.add("Zara");
    s1.add("Mahnaz");
    s1.add("Ayan");
    System.out.println();
    System.out.println(" Set Elements");
    System.out.print("\t" + s1);
    System.out.println("\ncontainsAll(s1): " + s1.containsAll(s1));
    Iterator<String> iterator = s1.iterator();
    System.out.println("Iterate through the collection:");
    while (iterator.hasNext()) {
      String string = iterator.next();
      if (string.equals("Ayan")) {
        iterator.remove();
      } else {
        System.out.println(string);
      }
    }
    System.out.println(" Set Elements");
    System.out.print("\t" + s1);

    Map<String, String> m1 = new HashMap<String, String>();
    m1.put("Zara", "8");
    m1.put("Mahnaz", "31");
    m1.put("Ayan", "12");
    m1.put("Daisy", "14");
    System.out.println();
    System.out.println("\n Map Elements");
    System.out.print("\t" + m1);
  }
}
