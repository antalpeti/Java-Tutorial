package tutorialspoint.strings;

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

    System.out.println("charAt(int index)");
    executeCharAt();
    System.out.println("compareTo(Object o) or compareTo(String anotherString)");
    executeCompareTo();
    System.out.println("compareToIgnoreCase(String str)");
    executeCompareToIgnoreCase();
    System.out.println("concat(String s)");
    executeConcat();
  }
}
