package tutorialspoint.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

  public static void main(String args[]) {
    // Create a hash map
    HashMap<String, Double> hm = new HashMap<String, Double>();
    // Put elements to the map
    hm.put("Zara", new Double(3434.34));
    hm.put("Mahnaz", new Double(123.22));
    hm.put("Ayan", new Double(1378.00));
    hm.put("Daisy", new Double(99.22));
    hm.put("Qadir", new Double(-19.08));

    // Get a set of the entries
    Set<Entry<String, Double>> set = hm.entrySet();
    // Get an iterator
    Iterator<Entry<String, Double>> i = set.iterator();
    // Display elements
    while (i.hasNext()) {
      Entry<String, Double> me = i.next();
      System.out.print(me.getKey() + ": ");
      System.out.println(me.getValue());
      if (me.getKey().equals("Ayan")) {
        me.setValue(new Double(1400));
      }
    }
    System.out.println();
    // Deposit 1000 into Zara's account
    double balance = hm.get("Zara").doubleValue();
    hm.put("Zara", new Double(balance + 1000));
    System.out.println("Zara's new balance: " + hm.get("Zara"));
    System.out.println("Ayan's new balance: " + hm.get("Ayan"));
  }
}
