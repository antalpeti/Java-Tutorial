package tutorialspoint.strings;

import java.io.UnsupportedEncodingException;

public class StringDemo {

  private static void executeCharAt() {
    String s = "Strings are immutable";
    char result = s.charAt(8);
    System.out.println(result);
  }

  private static void executeCompareTo() {
    String str1 = "Strings are immutable";
    String str2 = "Strings are immutable";
    String str3 = "Integers are not immutable";

    int result = str1.compareTo(str2);
    System.out.println(result);

    result = str2.compareTo(str3);
    System.out.println(result);

    result = str3.compareTo(str1);
    System.out.println(result);
  }

  private static void executeCompareToIgnoreCase() {
    String str1 = "Strings are immutable";
    String str2 = "Strings are Immutable";
    String str3 = "Integers are not immutable";

    int result = str1.compareToIgnoreCase(str2);
    System.out.println(result);

    result = str2.compareToIgnoreCase(str3);
    System.out.println(result);

    result = str3.compareToIgnoreCase(str1);
    System.out.println(result);
  }


  private static void executeConcat() {
    String s = "Strings are immutable";
    s = s.concat(" all the time");
    System.out.println(s);
  }

  private static void executeContentEquals() {
    String str1 = "Not immutable";
    String str2 = "Strings are immutable";
    StringBuffer str3 = new StringBuffer("Not immutable");

    boolean result = str1.contentEquals(str3);
    System.out.println(result);

    result = str2.contentEquals(str3);
    System.out.println(result);
  }

  private static void executeCopyValueOf() {
    char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
    String Str2 = "";

    Str2 = String.copyValueOf(Str1);
    System.out.println("Returned String: " + Str2);

    Str2 = String.copyValueOf(Str1, 2, 6);
    System.out.println("Returned String: " + Str2);
  }

  private static void executeEndsWith() {
    String Str = new String("This is really not immutable!!");
    boolean retVal;

    retVal = Str.endsWith("immutable!!");
    System.out.println("Returned Value = " + retVal);

    retVal = Str.endsWith("immu");
    System.out.println("Returned Value = " + retVal);
  }

  private static void executeEquals() {
    String Str1 = new String("This is really not immutable!!");
    String Str2 = Str1;
    String Str3 = new String("This is really not immutable!!");
    String Str4 = new String("This is immutable!!");
    boolean retVal;

    retVal = Str1.equals(Str2);
    System.out.println("Returned Value = " + retVal);

    retVal = Str1.equals(Str3);
    System.out.println("Returned Value = " + retVal);

    retVal = Str1.equals(Str4);
    System.out.println("Returned Value = " + retVal);
  }

  private static void executeEqualsIgnoreCase() {
    String Str1 = new String("This is really not immutable!!");
    String Str2 = Str1;
    String Str3 = new String("This is really not immutable!!");
    String Str4 = new String("This IS REALLY NOT IMMUTABLE!!");
    boolean retVal;

    retVal = Str1.equals(Str2);
    System.out.println("Returned Value = " + retVal);

    retVal = Str1.equals(Str3);
    System.out.println("Returned Value = " + retVal);

    retVal = Str1.equalsIgnoreCase(Str4);
    System.out.println("Returned Value = " + retVal);
  }

  private static void executeGetBytes() {
    String Str1 = new String("Welcome to Tutorialspoint.com");

    try {
      byte[] Str2 = Str1.getBytes();
      System.out.println("Returned  Value " + Str2);

      Str2 = Str1.getBytes("UTF-8");
      System.out.println("Returned  Value " + Str2);

      Str2 = Str1.getBytes("ISO-8859-1");
      System.out.println("Returned  Value " + Str2);
      for (byte b : Str2) {
        System.out.print(b);
      }
      System.out.println();
    } catch (UnsupportedEncodingException e) {
      System.out.println("Unsupported character set");
    }
  }

  private static void executeGetChars() {
    String Str1 = new String("Welcome to Tutorialspoint.com");
    char[] Str2 = new char[7];

    try {
      Str1.getChars(2, 9, Str2, 0);
      System.out.print("Copied Value = ");
      System.out.println(Str2);

    } catch (Exception ex) {
      System.out.println("Raised exception...");
    }
  }

  private static void executeHashCode() {
    String Str = new String("Welcome to Tutorialspoint.com");
    System.out.println("Hashcode for Str :" + Str.hashCode());
  }

  public static void main(String args[]) {
    char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
    String helloString = new String(helloArray);
    System.out.println(helloString);

    String palindrome = "Dot saw I was Tod";
    int len = palindrome.length();
    System.out.println("String Length is : " + len);

    String string1 = "saw I was ";
    System.out.println("Dot " + string1 + "Tod");

    float floatVar = 10f;
    int intVar = 11;
    String stringVar = "twelve";
    System.out.printf("The value of the float variable is "
        + "%.3f, while the value of the integer " + "variable is %d, and the string " + "is %s",
        floatVar, intVar, stringVar);

    String fs;
    fs =
        String.format("The value of the float variable is " + "%f, while the value of the integer "
            + "variable is %d, and the string " + "is %s", floatVar, intVar, stringVar);
    System.out.println(fs);

    System.out.println("\ncharAt(int index)");
    executeCharAt();
    System.out.println("\ncompareTo(String anotherString)");
    executeCompareTo();
    System.out.println("\ncompareToIgnoreCase(String str)");
    executeCompareToIgnoreCase();
    System.out.println("\nconcat(String s)");
    executeConcat();
    System.out.println("\ncontentEquals(StringBuffer sb)");
    executeContentEquals();
    System.out.println("\ncopyValueOf(cahr[] data) "
        + "and copyValueOf(char[] data, int offset, int count)");
    executeCopyValueOf();
    System.out.println("\nendsWith(String suffix)");
    executeEndsWith();
    System.out.println("\nequals(Object anObject)");
    executeEquals();
    System.out.println("\nequalsIngoreCase(String anotherString)");
    executeEqualsIgnoreCase();
    System.out.println("\ngetBytes() and getBytes(String charsetName)");
    executeGetBytes();
    System.out.println("\ngetChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)");
    executeGetChars();
    System.out.println("\nhashCode()");
    executeHashCode();
  }
}
