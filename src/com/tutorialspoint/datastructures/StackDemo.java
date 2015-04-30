package com.tutorialspoint.datastructures;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {

  static void showPush(Stack<Integer> st, int a) {
    st.push(new Integer(a));
    System.out.println("push(" + a + ")");
    System.out.println("stack: " + st);
  }

  static void showPop(Stack<Integer> st) {
    System.out.print("pop -> ");
    Integer a = st.pop();
    System.out.println(a);
    System.out.println("stack: " + st);
  }

  static void showPeek(Stack<Integer> st) {
    System.out.print("peek -> ");
    Integer a = st.peek();
    System.out.println(a);
    System.out.println("stack: " + st);
  }

  static void showEmpty(Stack<Integer> st) {
    System.out.print("empty(): ");
    boolean e = st.empty();
    System.out.println(e);
    System.out.println("stack: " + st);
  }

  static void showSearch(Stack<Integer> st, int a) {
    System.out.print("search(" + a + "): ");
    int s = st.search(a);
    System.out.println(s);
    System.out.println("stack: " + st);
  }

  public static void main(String args[]) {
    Stack<Integer> st = new Stack<Integer>();
    System.out.println("stack: " + st);
    showEmpty(st);
    showPush(st, 42);
    showPush(st, 66);
    showPush(st, 99);
    showPeek(st);
    showEmpty(st);
    showSearch(st, 42);
    showPop(st);
    showPop(st);
    showPop(st);
    try {
      showPop(st);
    } catch (EmptyStackException e) {
      System.out.println("empty stack");
    }
  }
}
