package tutorialspoint.datastructures;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropDemo {

  @SuppressWarnings("rawtypes")
  public static void main(String args[]) {
    Properties capitals = new Properties();
    Set states;
    String str;

    capitals.put("Illinois", "Springfield");
    capitals.put("Missouri", "Jefferson City");
    capitals.put("Washington", "Olympia");
    capitals.put("California", "Sacramento");
    capitals.put("Indiana", "Indianapolis");

    // Show all states and capitals in hashtable.
    states = capitals.keySet(); // get set-view of keys
    Iterator itr = states.iterator();
    while (itr.hasNext()) {
      str = (String) itr.next();
      System.out.println("The capital of " + str + " is " + capitals.getProperty(str) + ".");
    }
    System.out.println();

    // look for state not in list -- specify default
    str = capitals.getProperty("Florida", "Not Found");
    System.out.println("The capital of Florida is " + str + ".");

    System.out.println("list");
    capitals.list(System.out);
    System.out.println("\npropertyNames");
    Enumeration<?> enumeration = capitals.propertyNames();
    while (enumeration.hasMoreElements()) {
      Object object = enumeration.nextElement();
      System.out.println(object);
    }

    System.out.println("\n--Add new property--");
    capitals.put("Hungary", "NoName");
    System.out.println("\n>> After put <<");
    capitals.list(System.out);
    capitals.putIfAbsent("Hungary", "Budapest");
    System.out.println("\n>> After putIfAbsent <<");
    capitals.list(System.out);
    capitals.setProperty("Hungary", "Budapest");
    System.out.println("\n>> After setProperty <<");
    capitals.list(System.out);
  }
}
