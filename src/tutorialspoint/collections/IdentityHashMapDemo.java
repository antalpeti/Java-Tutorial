package tutorialspoint.collections;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class IdentityHashMapDemo {

  public static void main(String args[]) {
    // Create a hash map
    IdentityHashMap<String, Double> ihm = new IdentityHashMap<String, Double>();
    // Put elements to the map
    ihm.put("Zara", new Double(3434.34));
    ihm.put("Mahnaz", new Double(123.22));
    ihm.put("Ayan", new Double(1378.00));
    ihm.put("Daisy", new Double(99.22));
    ihm.put("Qadir", new Double(-19.08));

    // Get a set of the entries
    Set<Entry<String, Double>> set = ihm.entrySet();
    // Get an iterator
    Iterator<Entry<String, Double>> i = set.iterator();
    // Display elements
    while (i.hasNext()) {
      Entry<String, Double> me = i.next();
      System.out.print(me.getKey() + ": ");
      System.out.println(me.getValue());
    }
    System.out.println();
    // Deposit 1000 into Zara's account
    double balance = ihm.get("Zara").doubleValue();
    System.out.println("Zara's previous balance: " + ihm.put("Zara", new Double(balance + 1000)));
    System.out.println("Zara's new balance: " + ihm.get("Zara"));
  }
}
