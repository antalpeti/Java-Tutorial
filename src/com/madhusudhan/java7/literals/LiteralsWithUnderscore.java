package com.madhusudhan.java7.literals;

public class LiteralsWithUnderscore {
  public static void main(String[] args) {
    int thousand = 1_000;
    int million = 1_000_000;
    int billion = 1_000_000_000;

    int _16 = 0b1_0000;
    int _144 = 0b1001_0000;
    int _256 = 0b1_0000_0000;

    int[] array = new int[] {thousand, million, billion, _16, _144, _256};
    for (int i : array) {
      System.out.println(i);
    }
  }
}
