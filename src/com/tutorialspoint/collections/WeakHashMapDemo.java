package com.tutorialspoint.collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
  private static Map<String, String> map;

  public static void main(String args[]) {
    map = new WeakHashMap<String, String>();
    map.put(new String("Maine"), "Augusta");
    map.put(new String("Tom"), "Hassel");
    map.put(new String("Marry"), "Popkins");
    System.out.println("Content of the WeakHashMap: " + map);
    for (Entry<String, String> entry : map.entrySet()) {
      System.out.println("key:" + entry.getKey() + " value: " + entry.getValue());
    }

    Runnable runner = new Runnable() {
      @Override
      public void run() {
        while (map.containsKey("Maine")) {
          try {
            Thread.sleep(500);
          } catch (InterruptedException ignored) {
          }
          System.out.println("Thread waiting");
          System.gc();
        }
      }
    };
    Thread t = new Thread(runner);
    t.start();
    System.out.println("Main waiting");
    try {
      t.join();
    } catch (InterruptedException ignored) {
    }
  }
}
