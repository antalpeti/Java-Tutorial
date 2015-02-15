package tutorialspoint.basicoperators;

public class RelationalOperators {

  /**
   * Checks if the values of two operands are equal or not, if yes then condition becomes true.
   * 
   * @param a
   * @param b
   * @return
   */
  boolean checkEquality(int a, int b) {
    return a == b;
  }

  /**
   * Checks if the values of two operands are equal or not, if values are not equal then condition
   * becomes true.
   *
   * @param a
   * @param b
   * @return
   */
  boolean checkInequality(int a, int b) {
    return a != b;
  }

  /**
   * Checks if the value of left operand is greater than the value of right operand, if yes then
   * condition becomes true.
   *
   * @param a
   * @param b
   * @return
   */
  boolean checkGreaterThan(int a, int b) {
    return a > b;
  }

  /**
   * Checks if the value of left operand is less than the value of right operand, if yes then
   * condition becomes true.
   *
   * @param a
   * @param b
   * @return
   */
  boolean checkLessThan(int a, int b) {
    return a < b;
  }

  /**
   * Checks if the value of left operand is greater than or equal to the value of right operand, if
   * yes then condition becomes true.
   *
   * @param a
   * @param b
   * @return
   */
  boolean checkGreaterThanEqual(int a, int b) {
    return a >= b;
  }

  /**
   * Checks if the value of left operand is less than or equal to the value of right operand, if yes
   * then condition becomes true.
   *
   * @param a
   * @param b
   * @return
   */
  boolean checkLessThanEqual(int a, int b) {
    return a <= b;
  }

  public static void main(String[] args) {
    RelationalOperators rop = new RelationalOperators();
    int a = 10, b = 20;
    System.out.printf("%d == %d : %s", a, b, rop.checkEquality(a, b));
    System.out.printf("\n%d != %d : %s", a, b, rop.checkInequality(a, b));
    System.out.printf("\n%d > %d : %s", a, b, rop.checkGreaterThan(a, b));
    System.out.printf("\n%d < %d : %s", a, b, rop.checkLessThan(a, b));
    System.out.printf("\n%d >= %d : %s", a, b, rop.checkGreaterThanEqual(a, b));
    System.out.printf("\n%d <= %d : %s", a, b, rop.checkLessThanEqual(a, b));
  }
}
