/**
 * Contains some examples about Basic Operators topic.
 *
 *
 * <style> table { border-collapse: collapse; width: 100%; vertical-align: middle; text-align:
 * center;} table, td, th { border: 1px solid black; }</style>
 * <p>
 * <table>
 * <caption>The Arithmetic Operators</caption><tbody>
 * <tr>
 * <th>Operator</th>
 * <th>Description</th>
 * <th style="width:20%;">Example</th>
 * </tr>
 * <tr>
 * <td>+</td>
 * <td>Addition - Adds values on either side of the operator</td>
 * <td>A + B will give 30</td>
 * </tr>
 * <tr>
 * <td>-</td>
 * <td>Subtraction - Subtracts right hand operand from left hand operand</td>
 * <td>A - B will give -10</td>
 * </tr>
 * <tr>
 * <td></td>
 * <td>Multiplication - Multiplies values on either side of the operator</td>
 * <td>A * B will give 200</td>
 * </tr>
 * <tr>
 * <td>/</td>
 * <td>Division - Divides left hand operand by right hand operand</td>
 * <td>B / A will give 2</td>
 * </tr>
 * <tr>
 * <td>%</td>
 * <td>Modulus - Divides left hand operand by right hand operand and returns remainder</td>
 * <td>B % A will give 0</td>
 * </tr>
 * <tr>
 * <td>++</td>
 * <td>Increment - Increases the value of operand by 1</td>
 * <td>B++ gives 21</td>
 * </tr>
 * <tr>
 * <td>--</td>
 * <td>Decrement - Decreases the value of operand by 1</td>
 * <td>B-- gives 19</td>
 * </tr>
 * </tbody>
 * </table>
 * </p>
 *
 * <p>
 * <table>
 * <caption>The Relational Operators</caption><tbody>
 * <tr>
 * <th>Operator</th>
 * <th>Description</th>
 * <th style="width:20%;">Example</th>
 * </tr>
 * <tr>
 * <td>==</td>
 * <td>Checks if the values of two operands are equal or not, if yes then condition becomes true.</td>
 * <td>(A == B) is not true.</td>
 * </tr>
 * <tr>
 * <td>!=</td>
 * <td>Checks if the values of two operands are equal or not, if values are not equal then condition
 * becomes true.</td>
 * <td>(A != B) is true.</td>
 * </tr>
 * <tr>
 * <td>&gt;</td>
 * <td>Checks if the value of left operand is greater than the value of right operand, if yes then
 * condition becomes true.</td>
 * <td>(A &gt; B) is not true.</td>
 * </tr>
 * <tr>
 * <td>&lt;</td>
 * <td>Checks if the value of left operand is less than the value of right operand, if yes then
 * condition becomes true.</td>
 * <td>(A &lt; B) is true.</td>
 * </tr>
 * <tr>
 * <td>&gt;=</td>
 * <td>Checks if the value of left operand is greater than or equal to the value of right operand,
 * if yes then condition becomes true.</td>
 * <td>(A &gt;= B) is not true.</td>
 * </tr>
 * <tr>
 * <td>&lt;=</td>
 * <td>Checks if the value of left operand is less than or equal to the value of right operand, if
 * yes then condition becomes true.</td>
 * <td>(A &lt;= B) is true.</td>
 * </tr>
 * </tbody>
 * </table>
 * </p>
 *
 * <p>
 * <table>
 * <caption>The Bitwise Operators</caption><tbody>
 * <tr>
 * <th>Operator</th>
 * <th>Description</th>
 * <th style="width:20%;">Example</th>
 * </tr>
 * <tr>
 * <td>&amp;</td>
 * <td>Binary AND Operator copies a bit to the result if it exists in both operands.</td>
 * <td>(A &amp; B) will give 12 which is 0000 1100</td>
 * </tr>
 * <tr>
 * <td>|</td>
 * <td>Binary OR Operator copies a bit if it exists in either operand.</td>
 * <td>(A | B) will give 61 which is 0011 1101</td>
 * </tr>
 * <tr>
 * <td>^</td>
 * <td>Binary XOR Operator copies the bit if it is set in one operand but not both.</td>
 * <td>(A ^ B) will give 49 which is 0011 0001</td>
 * </tr>
 * <tr>
 * <td>~</td>
 * <td>Binary Ones Complement Operator is unary and has the effect of 'flipping' bits.</td>
 * <td>(~A ) will give -61 which is 1100 0011 in 2's complement form due to a signed binary number.</td>
 * </tr>
 * <tr>
 * <td>&lt;&lt;</td>
 * <td>Binary Left Shift Operator. The left operands value is moved left by the number of bits
 * specified by the right operand.</td>
 * <td>A &lt;&lt; 2 will give 240 which is 1111 0000</td>
 * </tr>
 * <tr>
 * <td>&gt;&gt;</td>
 * <td>Binary Right Shift Operator. The left operands value is moved right by the number of bits
 * specified by the right operand.</td>
 * <td>A &gt;&gt; 2 will give 15 which is 1111</td>
 * </tr>
 * <tr>
 * <td>&gt;&gt;&gt;</td>
 * <td>Shift right zero fill operator. The left operands value is moved right by the number of bits
 * specified by the right operand and shifted values are filled up with zeros.</td>
 * <td>A &gt;&gt;&gt;2 will give 15 which is 0000 1111</td>
 * </tr>
 * </tbody>
 * </table>
 * </p>
 *
 * <p>
 * <table>
 * <caption>The Logical Operators</caption><tbody>
 * <tr>
 * <th>Operator</th>
 * <th>Description</th>
 * <th style="width:20%;">Example</th>
 * </tr>
 * <tr>
 * <td>&amp;&amp;</td>
 * <td>Called Logical AND operator. If both the operands are non-zero, then the condition becomes
 * true.</td>
 * <td>(A &amp;&amp; B) is false.</td>
 * </tr>
 * <tr>
 * <td>||</td>
 * <td>Called Logical OR Operator. If any of the two operands are non-zero, then the condition
 * becomes true.</td>
 * <td>(A || B) is true.</td>
 * </tr>
 * <tr>
 * <td>!</td>
 * <td>Called Logical NOT Operator. Use to reverses the logical state of its operand. If a condition
 * is true then Logical NOT operator will make false.</td>
 * <td>!(A &amp;&amp; B) is true.</td>
 * </tr>
 * </tbody>
 * </table>
 * </p>
 *
 * <p>
 * <table>
 * <caption>The Assignment Operators</caption><tbody>
 * <tr>
 * <th>Operator</th>
 * <th>Description</th>
 * <th style="width:20%;">Example</th>
 * </tr>
 * <tr>
 * <td>=</td>
 * <td>Simple assignment operator, Assigns values from right side operands to left side operand</td>
 * <td>C = A + B will assign value of A + B into C</td>
 * </tr>
 * <tr>
 * <td>+=</td>
 * <td>Add AND assignment operator, It adds right operand to the left operand and assign the result
 * to left operand</td>
 * <td>C += A is equivalent to C = C + A</td>
 * </tr>
 * <tr>
 * <td>-=</td>
 * <td>Subtract AND assignment operator, It subtracts right operand from the left operand and assign
 * the result to left operand</td>
 * <td>C -= A is equivalent to C = C - A</td>
 * </tr>
 * <tr>
 * <td>=</td>
 * <td>Multiply AND assignment operator, It multiplies right operand with the left operand and
 * assign the result to left operand</td>
 * <td>C *= A is equivalent to C = C * A</td>
 * </tr>
 * <tr>
 * <td>/=</td>
 * <td>Divide AND assignment operator, It divides left operand with the right operand and assign the
 * result to left operand</td>
 * <td>C /= A is equivalent to C = C / A</td>
 * </tr>
 * <tr>
 * <td>%=</td>
 * <td>Modulus AND assignment operator, It takes modulus using two operands and assign the result to
 * left operand</td>
 * <td>C %= A is equivalent to C = C % A</td>
 * </tr>
 * <tr>
 * <td>&lt;&lt;=</td>
 * <td>Left shift AND assignment operator</td>
 * <td>C &lt;&lt;= 2 is same as C = C &lt;&lt; 2</td>
 * </tr>
 * <tr>
 * <td>&gt;&gt;=</td>
 * <td>Right shift AND assignment operator</td>
 * <td>C &gt;&gt;= 2 is same as C = C &gt;&gt; 2</td>
 * </tr>
 * <tr>
 * <td>&amp;=</td>
 * <td>Bitwise AND assignment operator</td>
 * <td>C &amp;= 2 is same as C = C &amp; 2</td>
 * </tr>
 * <tr>
 * <td>^=</td>
 * <td>bitwise exclusive OR and assignment operator</td>
 * <td>C ^= 2 is same as C = C ^ 2</td>
 * </tr>
 * <tr>
 * <td>|=</td>
 * <td>bitwise inclusive OR and assignment operator</td>
 * <td>C |= 2 is same as C = C | 2</td>
 * </tr>
 * </tbody>
 * </table>
 * </p>
 *
 * <p>
 * <table>
 * <caption>Precedence of Java Operators</caption><tbody>
 * <tr>
 * <th>Category&nbsp;</th>
 * <th>Operator&nbsp;</th>
 * <th style="width:20%;">Associativity&nbsp;</th>
 * </tr>
 * <tr>
 * <td>Postfix&nbsp;</td>
 * <td>() [] . (dot operator)</td>
 * <td>Left to right&nbsp;</td>
 * </tr>
 * <tr>
 * <td>Unary&nbsp;</td>
 * <td>++ - - ! ~</td>
 * <td>Right to left&nbsp;</td>
 * </tr>
 * <tr>
 * <td>Multiplicative &nbsp;</td>
 * <td>/ %&nbsp;</td>
 * <td>Left to right&nbsp;</td>
 * </tr>
 * <tr>
 * <td>Additive &nbsp;</td>
 * <td>+ -&nbsp;</td>
 * <td>Left to right&nbsp;</td>
 * </tr>
 * <tr>
 * <td>Shift &nbsp;</td>
 * <td>&gt;&gt; &gt;&gt;&gt; &lt;&lt; &nbsp;</td>
 * <td>Left to right&nbsp;</td>
 * </tr>
 * <tr>
 * <td>Relational &nbsp;</td>
 * <td>&gt; &gt;= &lt; &lt;= &nbsp;</td>
 * <td>Left to right&nbsp;</td>
 * </tr>
 * <tr>
 * <td>Equality &nbsp;</td>
 * <td>== !=&nbsp;</td>
 * <td>Left to right&nbsp;</td>
 * </tr>
 * <tr>
 * <td>Bitwise AND&nbsp;</td>
 * <td>&amp;&nbsp;</td>
 * <td>Left to right&nbsp;</td>
 * </tr>
 * <tr>
 * <td>Bitwise XOR&nbsp;</td>
 * <td>^&nbsp;</td>
 * <td>Left to right&nbsp;</td>
 * </tr>
 * <tr>
 * <td>Bitwise OR&nbsp;</td>
 * <td>|&nbsp;</td>
 * <td>Left to right&nbsp;</td>
 * </tr>
 * <tr>
 * <td>Logical AND&nbsp;</td>
 * <td>&amp;&amp;&nbsp;</td>
 * <td>Left to right&nbsp;</td>
 * </tr>
 * <tr>
 * <td>Logical OR&nbsp;</td>
 * <td>||&nbsp;</td>
 * <td>Left to right&nbsp;</td>
 * </tr>
 * <tr>
 * <td>Conditional&nbsp;</td>
 * <td>?:&nbsp;</td>
 * <td>Right to left&nbsp;</td>
 * </tr>
 * <tr>
 * <td>Assignment&nbsp;</td>
 * <td>=+= -= *= /= %= &gt;&gt;= &lt;&lt;= &amp;= ^= |=&nbsp;</td>
 * <td>Right to left&nbsp;</td>
 * </tr>
 * <tr>
 * <td>Comma&nbsp;</td>
 * <td>,&nbsp;</td>
 * <td>Left to right&nbsp;</td>
 * </tr>
 * </tbody>
 * </table>
 * </p>
 */
package tutorialspoint.basicoperators;