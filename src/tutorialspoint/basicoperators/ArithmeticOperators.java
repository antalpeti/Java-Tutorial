package tutorialspoint.basicoperators;

public class ArithmeticOperators {

  /**
   * Adds values on either side of the operator
   *
   * @param a
   * @param b
   */
  void doAddition(int a, int b) {
    System.out.println(a + b);
  }

  /**
   * Subtracts right hand operand from left hand operand
   *
   * @param a
   * @param b
   */
  void doSubtraction(int a, int b) {
    System.out.println(a - b);
  }

  /**
   * Multiplies values on either side of the operator
   *
   * @param a
   * @param b
   */
  void doMultiplication(int a, int b) {
    System.out.println(a * b);
  }

  /**
   * Divides left hand operand by right hand operand
   *
   * @param a
   * @param b
   */
  void doDivision(int a, int b) {
    System.out.println(a / b);
  }

  /**
   * Divides left hand operand by right hand operand and returns remainder
   *
   * @param a
   * @param b
   */
  void doModulus(int b, int a) {
    System.out.println(b % a);
  }

  /**
   * Increases the value of operand by 1
   *
   * @param a
   */
  void doIncrement(int a) {
    a++;
    System.out.println(a);
  }

  /**
   * Decreases the value of operand by 1
   *
   * @param b
   */
  void doDecrement(int b) {
    b--;
    System.out.println(b);
  }

  public static void main(String[] args) {
    ArithmeticOperators aop = new ArithmeticOperators();
    int a = 10, b = 20;
    aop.doAddition(a, b);
    aop.doSubtraction(a, b);
    aop.doMultiplication(a, b);
    aop.doDivision(a, b);
    aop.doModulus(b, a);
    aop.doIncrement(a);
    aop.doDecrement(b);
  }
}
