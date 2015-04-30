package com.tutorialspoint.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Vector;

public class AlgorithmsDemo {

  public static void main(String args[]) {
    // Create and initialize linked list
    LinkedList<Integer> ll = new LinkedList<Integer>();
    ll.add(new Integer(-8));
    ll.add(new Integer(20));
    ll.add(new Integer(-20));
    ll.add(new Integer(8));

    // Create a reverse order comparator
    Comparator<Integer> r = Collections.reverseOrder();
    // Sort list by using the comparator
    Collections.sort(ll, r);
    // Get iterator
    Iterator<Integer> li = ll.iterator();
    System.out.print("List sorted in reverse: ");
    while (li.hasNext()) {
      System.out.print(li.next() + " ");
    }
    System.out.println("\nList sorted in reverse: " + ll);
    System.out.println();
    Collections.shuffle(ll);
    // display randomized list
    li = ll.iterator();
    System.out.print("List shuffled: ");
    while (li.hasNext()) {
      System.out.print(li.next() + " ");
    }
    System.out.println("\nList shuffled: " + ll);
    System.out.println();
    System.out.println("Minimum: " + Collections.min(ll));
    System.out.println("Maximum: " + Collections.max(ll));

    LinkedList<Integer> cll = new LinkedList<Integer>();
    for (int i = 0; i < 4; i++) {
      cll.add(0);
    }
    Collections.copy(cll, ll);
    System.out.println("Collections.copy: " + cll);
    Collections.fill(cll, new Integer(1));
    System.out.println("Collections.fill: " + cll);
    Vector<Double> v = new Vector<Double>();
    v.addElement(1.0);
    v.add(2.0);
    ArrayList<Double> al = Collections.list(v.elements());
    System.out.println("list: " + al);
    System.out.println("nCopies: " + Collections.nCopies(3, Boolean.TRUE));
    Collections.reverse(al);
    System.out.println("reverse: " + al);
    al.add(3.0);
    Collections.sort(al);
    System.out.println("sort: " + al);
    Collections.rotate(al, 1);
    System.out.println("rotate 1: " + al);
    Collections.rotate(al, -2);
    System.out.println("rotate -2: " + al);
    Collections.swap(al, 0, 2);
    System.out.println("swap: " + al);
    al.add(2.0);
    al.add(2.0);
    ArrayList<Double> sub = new ArrayList<>();
    sub.add(2.0);
    System.out.println("list: " + al);
    System.out.println("sublist: " + sub);
    System.out.println("lastIndexOfSubList: " + Collections.lastIndexOfSubList(al, sub));
    System.out.println("indexOfSubList: " + Collections.indexOfSubList(al, sub));

    Set<ArrayList<Double>> nl = Collections.singleton(al);
    System.out.println("singleton:" + nl);
    System.out.println("EMPTY_LIST: " + Collections.EMPTY_LIST);
    System.out.println("EMPTY_MAP: " + Collections.EMPTY_MAP);
    System.out.println("EMPTY_SET: " + Collections.EMPTY_SET);

    // create arraylist
    ArrayList<String> arlst = new ArrayList<String>();

    // populate the list
    arlst.add("TP");
    arlst.add("PROVIDES");
    arlst.add("QUALITY");
    arlst.add("TUTORIALS");

    // search the list for key 'QUALITY'
    int index = Collections.binarySearch(arlst, "QUALITY");

    System.out.println("'QUALITY' is available at index: " + index);
  }
}
