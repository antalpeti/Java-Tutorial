package tutorialspoint.numbers;

public class Test {
  private static void execuetBoxing() {
    Integer x = 5; // boxes int to an Integer object
    x = x + 10; // unboxes the Integer to a int
    System.out.println(x);
  }

  private static void executeXXXValue() {
    Integer x = 5;
    // Returns byte primitive data type
    System.out.println(x.byteValue());

    // Returns double primitive data type
    System.out.println(x.doubleValue());

    // Returns long primitive data type
    System.out.println(x.longValue());
  }

  private static void executeCompareTo() {
    Integer x = 5;
    System.out.println(x.compareTo(3));
    System.out.println(x.compareTo(5));
    System.out.println(x.compareTo(8));
  }

  public static void main(String args[]) {
    System.out.println("Boxing and Unboxing");
    execuetBoxing();
    System.out.println("\nxxxValue()");
    executeXXXValue();
    System.out.println("\ncompareTo()");
    executeCompareTo();
  }
}
