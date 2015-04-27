package com.madhusudhan.java7.coin.diamond;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiamondOperator {

  private static final String ONE = "one";
  private Map<String, List<Object>> map;

  private void init() {
    map = new HashMap<>();
    // map = new HashMap();
    System.out.println("The compiler infer the type of the hashmap :) Cool!");
  }

  public static void main(String[] args) {
    DiamondOperator dOp = new DiamondOperator();
    dOp.init();

    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);

    dOp.map.put(DiamondOperator.ONE, arrayList);
    System.out.println(dOp.map.get(DiamondOperator.ONE));
  }
}
