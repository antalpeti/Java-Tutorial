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

  private static void executeRound() {
    double d = 100.675;
    double e = 100.500;
    float f = 100;
    float g = 90f;

    System.out.println(Math.round(d));
    System.out.println(Math.round(e));
    System.out.println(Math.round(f));
    System.out.println(Math.round(g));
  }

  private static void executeMin() {
    System.out.println(Math.min(12.123, 12.456));
    System.out.println(Math.min(23.12, 23.0));
  }

  private static void executeMax() {
    System.out.println(Math.max(12.123, 12.456));
    System.out.println(Math.max(23.12, 23.0));
  }

  private static void executeExp() {
    double x = 11.635;

    System.out.printf("The value of e is %.4f%n", Math.E);
    System.out.printf("exp(%.3f) is %.3f%n", x, Math.exp(x));
  }

  private static void executeLog() {
    double x = 11.635;

    System.out.printf("The value of e is %.4f%n", Math.E);
    System.out.printf("log(%.3f) is %.3f%n", x, Math.log(x));
  }

  private static void executePow() {
    double x = 11.635;
    double y = 2.76;

    System.out.printf("The value of e is %.4f%n", Math.E);
    System.out.printf("pow(%.3f, %.3f) is %.3f%n", x, y, Math.pow(x, y));
  }

  private static void executeSqrt() {
    double x = 11.635;
    System.out.printf("The value of e is %.4f%n", Math.E);
    System.out.printf("sqrt(%.3f) is %.3f%n", x, Math.sqrt(x));
  }

  private static void executeSin() {
    double degrees = 45.0;
    double radians = Math.toRadians(degrees);

    System.out.format("The value of pi is %.4f%n", Math.PI);
    System.out.format("The sine of %.1f degrees is %.4f%n", degrees, Math.sin(radians));
  }

  private static void executeCos() {
    double degrees = 45.0;
    double radians = Math.toRadians(degrees);

    System.out.format("The value of pi is %.4f%n", Math.PI);
    System.out.format("The cosine of %.1f degrees is %.4f%n", degrees, Math.cos(radians));
  }

  private static void executeTan() {
    double degrees = 45.0;
    double radians = Math.toRadians(degrees);

    System.out.format("The value of pi is %.4f%n", Math.PI);
    System.out.format("The tangent of %.1f degrees is %.4f%n", degrees, Math.tan(radians));
  }

  private static void executeAsin() {
    double degrees = 45.0;
    double radians = Math.toRadians(degrees);

    System.out.format("The value of pi is %.4f%n", Math.PI);
    System.out.format("The arcsine of %.4f is %.4f degrees %n", Math.sin(radians),
        Math.toDegrees(Math.asin(Math.sin(radians))));
  }

  private static void executeAcos() {
    double degrees = 45.0;
    double radians = Math.toRadians(degrees);

    System.out.format("The value of pi is %.4f%n", Math.PI);
    System.out.format("The arccosine of %.4f is %.4f degrees %n", Math.cos(radians),
        Math.toDegrees(Math.acos(Math.sin(radians))));
  }

  private static void executeAtan() {
    double degrees = 45.0;
    double radians = Math.toRadians(degrees);

    System.out.format("The value of pi is %.4f%n", Math.PI);
    System.out.format("The arctangent of %.4f is %.4f degrees %n", Math.cos(radians),
        Math.toDegrees(Math.atan(Math.sin(radians))));
  }

  private static void executeAtan2() {
    double x = 45.0;
    double y = 30.0;

    System.out.println(Math.atan2(x, y));
  }

  private static void executeToDegrees() {
    double x = 45.0;
    double y = 30.0;

    System.out.println(Math.toDegrees(x));
    System.out.println(Math.toDegrees(y));
  }

  private static void executeToRadians() {
    double x = 45.0;
    double y = 30.0;

    System.out.println(Math.toRadians(x));
    System.out.println(Math.toRadians(y));
  }

  private static void executeRandom() {
    System.out.println(Math.random());
    System.out.println(Math.random());
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
    System.out.println("\nround()");
    executeRound();
    System.out.println("\nmin()");
    executeMin();
    System.out.println("\nmax()");
    executeMax();
    System.out.println("\nexp()");
    executeExp();
    System.out.println("\nlog()");
    executeLog();
    System.out.println("\npow()");
    executePow();
    System.out.println("\nsqrt()");
    executeSqrt();
    System.out.println("\nsin()");
    executeSin();
    System.out.println("\ncos()");
    executeCos();
    System.out.println("\ntan()");
    executeTan();
    System.out.println("\nasin()");
    executeAsin();
    System.out.println("\nacos()");
    executeAcos();
    System.out.println("\natan()");
    executeAtan();
    System.out.println("\natan2()");
    executeAtan2();
    System.out.println("\ntoDegrees()");
    executeToDegrees();
    System.out.println("\ntoRadians()");
    executeToRadians();
    System.out.println("\nrandom()");
    executeRandom();
  }
}
