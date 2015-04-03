package tutorialspoint.datastructures;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableDemo {

  public static void main(String args[]) {
    // Create a hash map
    Hashtable<String, Double> balance = new Hashtable<String, Double>();
    Enumeration<String> names;
    String str;
    double bal;

    balance.put("Zara", new Double(3434.34));
    balance.put("Mahnaz", new Double(123.22));
    balance.put("Ayan", new Double(1378.00));
    balance.put("Daisy", new Double(99.22));
    balance.put("Qadir", new Double(-19.08));

    // Show all balances in hash table.
    names = balance.keys();
    while (names.hasMoreElements()) {
      str = names.nextElement();
      System.out.println(str + ": " + balance.get(str));
    }
    System.out.println();
    // Deposit 1,000 into Zara's account
    bal = balance.get("Zara").doubleValue();
    Double old = balance.put("Zara", new Double(bal + 1000));
    System.out.println("Zara's old balance: " + old);
    System.out.println("Zara's new balance: " + balance.get("Zara"));

    Object clone = balance.clone();
    if (clone instanceof Hashtable<?, ?>) {
      @SuppressWarnings("unchecked")
      Enumeration<Double> elements = ((Hashtable<String, Double>) clone).elements();
      while (elements.hasMoreElements()) {
        Double double1 = elements.nextElement();
        System.out.print(double1 + " ");
      }
    }

    System.out.println("\ncontains(123.22): " + balance.contains(123.22));
    System.out.println("contains(534): " + balance.contains(534));
    System.out.println("containsKey(\"Mahnaz\"): " + balance.containsKey("Mahnaz"));
    System.out.println("containsKey(\"Tom\"): " + balance.containsKey("Tom"));
    System.out.println("containsValue(123.22): " + balance.containsValue(123.22));
    System.out.println("containsValue(534): " + balance.containsValue(534));
    System.out.println("isEmpty: " + balance.isEmpty());

    Enumeration<String> keys = balance.keys();
    while (keys.hasMoreElements()) {
      String string = keys.nextElement();
      System.out.print(string + " ");
    }
    System.out.println("\nsize: " + balance.size());
    System.out.println("get(\"Daisy1\"): " + balance.get("Daisy1"));
    System.out.println("get(\"Daisy\"): " + balance.get("Daisy"));
    System.out.println("remove(\"Daisy1\"): " + balance.remove("Daisy1"));
    System.out.println("remove(\"Daisy\"): " + balance.remove("Daisy"));

    for (Entry<?, ?> entry : balance.entrySet()) {
      System.out.println("key: " + entry.getKey() + "    value: " + entry.getValue());
    }
  }
}
