package tutorialspoint.strings;

public class StringDemo {

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
  }
}
