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

  private static void executeIndexOf() {
    String Str = new String("Welcome to Tutorialspoint.com");
    String SubStr1 = new String("Tutorials");
    String SubStr2 = new String("Sutorials");

    System.out.print("Found Index :");
    System.out.println(Str.indexOf('o'));
    System.out.print("Found Index :");
    System.out.println(Str.indexOf('o', 5));
    System.out.print("Found Index :");
    System.out.println(Str.indexOf(SubStr1));
    System.out.print("Found Index :");
    System.out.println(Str.indexOf(SubStr1, 15));
    System.out.print("Found Index :");
    System.out.println(Str.indexOf(SubStr2));
  }

  private static void executeIntern() {
    String Str1 = new String("Welcome to Tutorialspoint.com");
    String Str2 = new String("WELCOME TO SUTORIALSPOINT.COM");

    System.out.print("Canonical representation:");
    System.out.println(Str1.intern());

    System.out.print("Canonical representation:");
    System.out.println(Str2.intern());
  }

  private static void executeLastIndexOf() {
    String Str = new String("Welcome to Tutorialspoint.com");
    String SubStr1 = new String("Tutorials");
    String SubStr2 = new String("Sutorials");

    System.out.print("Found Last Index :");
    System.out.println(Str.lastIndexOf('o'));
    System.out.print("Found Last Index :");
    System.out.println(Str.lastIndexOf('o', 5));
    System.out.print("Found Last Index :");
    System.out.println(Str.lastIndexOf(SubStr1));
    System.out.print("Found Last Index :");
    System.out.println(Str.lastIndexOf(SubStr1, 11));
    System.out.print("Found Last Index :");
    System.out.println(Str.lastIndexOf(SubStr2));
  }

  private static void executeLength() {
    String Str1 = new String("Welcome to Tutorialspoint.com");
    String Str2 = new String("Tutorials");

    System.out.print("String Length :");
    System.out.println(Str1.length());

    System.out.print("String Length :");
    System.out.println(Str2.length());
  }

  private static void executeMatches() {
    String Str = new String("Welcome to Tutorialspoint.com");

    System.out.print("Return Value :");
    System.out.println(Str.matches("(.*)Tutorials(.*)"));

    System.out.print("Return Value :");
    System.out.println(Str.matches("Tutorials"));

    System.out.print("Return Value :");
    System.out.println(Str.matches("Welcome(.*)"));
  }

  private static void executeRegionMatches() {
    String Str1 = new String("Welcome to Tutorialspoint.com");
    String Str2 = new String("Tutorials");
    String Str3 = new String("TUTORIALS");

    System.out.print("Return Value :");
    System.out.println(Str1.regionMatches(11, Str2, 0, 9));

    System.out.print("Return Value :");
    System.out.println(Str1.regionMatches(11, Str3, 0, 9));

    System.out.print("Return Value :");
    System.out.println(Str1.regionMatches(true, 11, Str3, 0, 9));
  }

  private static void executeReplace() {
    String Str = new String("Welcome to Tutorialspoint.com");

    System.out.print("Return Value :");
    System.out.println(Str.replace('o', 'T'));

    System.out.print("Return Value :");
    System.out.println(Str.replace('l', 'D'));

    System.out.print("Original Value: ");
    System.out.println(Str);
  }

  private static void executeReplaceAll() {
    String Str = new String("Welcome to Tutorialspoint.com");

    System.out.print("Return Value :");
    System.out.println(Str.replaceAll("(.*)Tutorials(.*)", "AMROOD"));
  }

  private static void executeReplaceFirst() {
    String Str = new String("Welcome to Tutorialspoint.com");

    System.out.print("Return Value :");
    System.out.println(Str.replaceFirst("(.*)Tutorials(.*)", "AMROOD"));

    System.out.print("Return Value :");
    System.out.println(Str.replaceFirst("Tutorials", "AMROOD"));
  }

  private static void executeSplit() {
    String Str = new String("Welcome-to-Tutorialspoint.com");

    System.out.println("Return Value :");
    for (String retval : Str.split("-", 2)) {
      System.out.println(retval);
    }
    System.out.println("");
    System.out.println("Return Value :");
    for (String retval : Str.split("-", 3)) {
      System.out.println(retval);
    }
    System.out.println("");
    System.out.println("Return Value :");
    for (String retval : Str.split("-", 0)) {
      System.out.println(retval);
    }
    System.out.println("");
    System.out.println("Return Value :");
    for (String retval : Str.split("-")) {
      System.out.println(retval);
    }
  }

  private static void executeStartsWith() {
    String Str = new String("Welcome to Tutorialspoint.com");

    System.out.print("Return Value :");
    System.out.println(Str.startsWith("Welcome"));

    System.out.print("Return Value :");
    System.out.println(Str.startsWith("Tutorials"));

    System.out.print("Return Value :");
    System.out.println(Str.startsWith("Tutorials", 11));
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

    System.out.println("\nindexOf(int ch), indexOf(int ch, int fromIndex),"
        + " indexOf(String str) and indexOf(String str, int fromIndex)");
    executeIndexOf();

    System.out.println("\nintern()");
    executeIntern();

    System.out.println("\nlastIndexOf(int ch), lastIndexOf(int ch, int fromIndex),"
        + " lastIndexOf(String str) and lastIndexOf(String str, int fromIndex)");
    executeLastIndexOf();

    System.out.println("\nlength()");
    executeLength();

    System.out.println("\nmatches(String regex)");
    executeMatches();

    System.out
    .println("\nregionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) "
        + "and regionMatches(int toffset, String other, int ooffset, int len)");
    executeRegionMatches();

    System.out.println("\nreplace(char oldChar, char newChar)");
    executeReplace();

    System.out.println("\nreplaceAll(String regex, String replacement)");
    executeReplaceAll();

    System.out.println("\nreplaceFirst(String regex, String replacement)");
    executeReplaceFirst();

    System.out.println("\nsplit(String regex) and split(String regex, int limit)");
    executeSplit();

    System.out.println("\nstartsWith(String prefix) and startsWith(String prefix, int toffset)");
    executeStartsWith();

  }
}
