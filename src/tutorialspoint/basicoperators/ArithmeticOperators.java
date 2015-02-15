package tutorialspoint.basicoperators;

public class ArithmeticOperators {

  /**
   * Adds values on either side of the operator
   *
   * @param a
   * @param b
   */
  void addition(int a, int b) {
    System.out.println(a + b);
  }

  /**
   * Subtracts right hand operand from left hand operand
   *
   * @param a
   * @param b
   */
  void subtraction(int a, int b) {
    System.out.println(a - b);
  }

  /**
   * Multiplies values on either side of the operator
   *
   * @param a
   * @param b
   */
  void multiplication(int a, int b) {
    System.out.println(a * b);
  }

  /**
   * Divides left hand operand by right hand operand
   *
   * @param a
   * @param b
   */
  void division(int a, int b) {
    System.out.println(a / b);
  }

  /**
   * Divides left hand operand by right hand operand and returns remainder
   *
   * @param a
   * @param b
   */
  void modulus(int b, int a) {
    System.out.println(b % a);
  }

  /**
   * Increases the value of operand by 1
   *
   * @param a
   */
  void increment(int a) {
    a++;
    System.out.println(a);
  }

  /**
   * Decreases the value of operand by 1
   *
   * @param b
   */
  void decrement(int b) {
    b--;
    System.out.println(b);
  }

  public static void main(String[] args) {
    ArithmeticOperators aop = new ArithmeticOperators();
    int a = 10, b = 20;
    aop.addition(a, b);
    aop.subtraction(a, b);
    aop.multiplication(a, b);
    aop.division(a, b);
    aop.modulus(b, a);
    aop.increment(a);
    aop.decrement(b);
  }
}
