package tutorialspoint.numbers;

public class Test {
  private static void executeBoxing() {
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

  private static void executeEquals() {
    Integer x = 5;
    Integer y = 10;
    Integer z = 5;
    Short a = 5;

    System.out.println(x.equals(y));
    System.out.println(x.equals(z));
    System.out.println(x.equals(a));
  }

  private static void executeValueOf() {
    Integer x = Integer.valueOf(9);
    Double c = Double.valueOf(5);
    Float a = Float.valueOf("80");

    Integer b = Integer.valueOf("444", 16);

    System.out.println(x);
    System.out.println(c);
    System.out.println(a);
    System.out.println(b);
  }

  private static void executeToString() {
    Integer x = 5;

    System.out.println(x.toString());
    System.out.println(Integer.toString(12));
  }

  private static void executeParseXXX() {
    int x = Integer.parseInt("9");
    double c = Double.parseDouble("5");
    int b = Integer.parseInt("444", 16);

    System.out.println(x);
    System.out.println(c);
    System.out.println(b);
  }

  private static void executeAbs() {
    Integer a = -8;
    int b = 12;
    double d = -100;
    float f = -90;

    System.out.println(Math.abs(a));
    System.out.println(Math.abs(b));
    System.out.println(Math.abs(d));
    System.out.println(Math.abs(f));
  }

  private static void executeCeil() {
    double d = -100.675;
    float f = -90;

    System.out.println(Math.ceil(d));
    System.out.println(Math.ceil(f));
  }

  private static void executeFloor() {
    double d = -100.675;
    float f = -90;

    System.out.println(Math.floor(d));
    System.out.println(Math.floor(f));
  }

  private static void executeRint() {
    double d = 100.675;
    double e = 100.500;
    double f = 100.200;

    System.out.println(Math.rint(d));
    System.out.println(Math.rint(e));
    System.out.println(Math.rint(f));
  }


  public static void main(String args[]) {
    System.out.println("Boxing and Unboxing");
    executeBoxing();
    System.out.println("\nxxxValue()");
    executeXXXValue();
    System.out.println("\ncompareTo()");
    executeCompareTo();
    System.out.println("\nequals()");
    executeEquals();
    System.out.println("\nvalueOf()");
    executeValueOf();
    System.out.println("\ntoString()");
    executeToString();
    System.out.println("\nparseXXX()");
    executeParseXXX();
    System.out.println("\nabs()");
    executeAbs();
    System.out.println("\nceil()");
    executeCeil();
    System.out.println("\nfloor()");
    executeFloor();
    System.out.println("\nrint()");
    executeRint();
  }
}
