package com.tutorialspoint.characters;

public class Test {

  private static Character unbox(char ch) {
    return new Character(ch);
  }

  private static void executeIsLetter() {
    System.out.println(Character.isLetter('c'));
    System.out.println(Character.isLetter('5'));
  }

  private static void executeIsDigit() {
    System.out.println(Character.isDigit('c'));
    System.out.println(Character.isDigit('5'));
  }

  private static void executeIsWhitespace() {
    System.out.println(Character.isWhitespace('c'));
    System.out.println(Character.isWhitespace(' '));
    System.out.println(Character.isWhitespace('\n'));
    System.out.println(Character.isWhitespace('\t'));
    System.out.println(Character.isWhitespace('\b'));
    System.out.println(Character.isWhitespace('\r'));
  }

  private static void executeIsUpperCase() {
    System.out.println(Character.isUpperCase('c'));
    System.out.println(Character.isUpperCase('C'));
    System.out.println(Character.isUpperCase('\n'));
    System.out.println(Character.isUpperCase('\t'));
  }

  private static void executeIsLowerCase() {
    System.out.println(Character.isLowerCase('c'));
    System.out.println(Character.isLowerCase('C'));
    System.out.println(Character.isLowerCase('\n'));
    System.out.println(Character.isLowerCase('\t'));
  }

  private static void executeToUpperCase() {
    System.out.println(Character.toUpperCase('c'));
    System.out.println(Character.toUpperCase('C'));
  }

  private static void executeToLowerCase() {
    System.out.println(Character.toLowerCase('c'));
    System.out.println(Character.toLowerCase('C'));
  }

  private static void executeToString() {
    System.out.println(Character.toString('c'));
    System.out.println(Character.toString('C'));
  }

  public static void main(String[] args) {

    // Unicode for uppercase Greek omega character
    char uniChar = '\u039A';
    System.out.println(uniChar);

    // an array of chars
    char[] charArray = {'a', 'b', 'c', 'd', 'e'};
    for (char c : charArray) {
      System.out.print(c);
    }

    // Here following primitive char 'a'
    // is boxed into the Character object ch
    Character ch = 'a';
    System.out.println();
    System.out.println(ch);

    // Here primitive 'x' is boxed for method test,
    // return is unboxed to char 'c'
    char c = unbox('x');
    System.out.println(c);

    char[] escapeArray = {'\t', '\b', '\n', '\r', '\f', '\'', '\"', '\\'};
    for (char d : escapeArray) {
      System.out.print(d);
    }

    System.out.println("\nShe said \"Hello!\" to me.");

    System.out.println("\nisLetter()");
    executeIsLetter();
    System.out.println("\nisDigit()");
    executeIsDigit();
    System.out.println("\nisWhitespace()");
    executeIsWhitespace();
    System.out.println("\nisUpperCase()");
    executeIsUpperCase();
    System.out.println("\nisLowerCase()");
    executeIsLowerCase();
    System.out.println("\ntoUpperCase()");
    executeToUpperCase();
    System.out.println("\ntoLowerCase()");
    executeToLowerCase();
    System.out.println("\ntoString()");
    executeToString();
  }

}
