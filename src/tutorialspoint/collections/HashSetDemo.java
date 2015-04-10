package tutorialspoint.collections;

import java.util.HashSet;

public class HashSetDemo {

  public static void main(String args[]) {
    // create a hash set
    HashSet<String> hs = new HashSet<String>();
    // add elements to the hash set
    hs.add("B");
    hs.add("A");
    hs.add("D");
    hs.add("E");
    hs.add("C");
    hs.add("F");
    hs.add("A");
    System.out.println(hs);
  }
}
