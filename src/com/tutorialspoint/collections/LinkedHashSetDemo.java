package com.tutorialspoint.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
  public static void main(String args[]) {
    // create a hash set
    LinkedHashSet<String> lhs = new LinkedHashSet<String>();
    // add elements to the hash set
    lhs.add("B");
    lhs.add("A");
    lhs.add("D");
    lhs.add("E");
    lhs.add("C");
    lhs.add("F");
    System.out.println(lhs);
  }
}
