package com.tutorialspoint.datastructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CollectionsDemo {

  public static void main(String[] args) {
    Map<String, String> m1 = new HashMap<String, String>();
    m1.put("Zara", "8");
    m1.put("Mahnaz", "31");
    m1.put("Ayan", "12");
    m1.put("Daisy", "14");
    System.out.println(" Map Elements");
    System.out.print("\t" + m1);
    System.out.println();
    System.out.println("\ncontainsKey(\"Ayan\"): " + m1.containsKey("Ayan"));
    System.out.println("containsKey(\"Tim\"): " + m1.containsKey("Tim"));
    System.out.println("containsValue(\"31\"): " + m1.containsValue("31"));
    System.out.println("containsValue(\"44\"): " + m1.containsValue("44"));
    System.out.println("entrySet: " + Arrays.toString(m1.entrySet().toArray()));
    System.out.println("keySet: " + Arrays.toString(m1.keySet().toArray()));
    System.out.println("values: " + Arrays.toString(m1.values().toArray()));
    System.out.println("get(\"Daisy\"): " + m1.get("Daisy"));
    System.out.println("size(): " + m1.size());
    System.out.println("remove(\"Mahnaz\")");
    m1.remove("Mahnaz");
    System.out.println("size(): " + m1.size());
    System.out.print("\t" + m1);
  }
}
