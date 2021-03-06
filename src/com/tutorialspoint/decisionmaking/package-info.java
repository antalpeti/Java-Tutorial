/**
 * Contains some examples about Decision Making topic.
 *
 *
 * <head> <link rel="stylesheet" type="text/css" href="../../../../files/mystyle.css"> </head>
 * <p>
 * The if Statement::
 *
 * <pre style="" class="prettyprint prettyprinted">
 * <span class="kwd">if</span><span class="pun">(</span><span class="typ">Boolean_expression</span><span class="pun">)</span><span class="pln">
 * </span><span class="pun">{</span><span class="pln">
 *    </span><span class="com">//Statements will execute if the Boolean expression is true</span><span class="pln">
 * </span><span class="pun">}</span>
 * </pre>
 *
 * <p>
 * The if...else Statement:
 *
 * <pre style="" class="prettyprint prettyprinted">
 * <span class="kwd">if</span><span class="pun">(</span><span class="typ">Boolean_expression</span><span class="pun">){</span><span class="pln">
 *    </span><span class="com">//Executes when the Boolean expression is true</span><span class="pln">
 * </span><span class="pun">}</span><span class="kwd">else</span><span class="pun">{</span><span class="pln">
 *    </span><span class="com">//Executes when the Boolean expression is false</span><span class="pln">
 * </span><span class="pun">}</span>
 * </pre>
 *
 * </p>
 *
 * <p>
 * The if...else if...else Statement:
 *
 * <pre style="" class="prettyprint prettyprinted">
 * <span class="kwd">if</span><span class="pun">(</span><span class="typ">Boolean_expression</span><span class="pln"> </span><span class="lit">1</span><span class="pun">){</span><span class="pln">
 *    </span><span class="com">//Executes when the Boolean expression 1 is true</span><span class="pln">
 * </span><span class="pun">}</span><span class="kwd">else</span><span class="pln"> </span><span class="kwd">if</span><span class="pun">(</span><span class="typ">Boolean_expression</span><span class="pln"> </span><span class="lit">2</span><span class="pun">){</span><span class="pln">
 *    </span><span class="com">//Executes when the Boolean expression 2 is true</span><span class="pln">
 * </span><span class="pun">}</span><span class="kwd">else</span><span class="pln"> </span><span class="kwd">if</span><span class="pun">(</span><span class="typ">Boolean_expression</span><span class="pln"> </span><span class="lit">3</span><span class="pun">){</span><span class="pln">
 *    </span><span class="com">//Executes when the Boolean expression 3 is true</span><span class="pln">
 * </span><span class="pun">}</span><span class="kwd">else</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
 *    </span><span class="com">//Executes when the none of the above condition is true.</span><span class="pln">
 * </span><span class="pun">}</span>
 * </pre>
 *
 * </p>
 *
 * <p>
 * Nested if...else Statement:
 *
 * <pre style="" class="prettyprint prettyprinted">
 * <span class="kwd">if</span><span class="pun">(</span><span class="typ">Boolean_expression</span><span class="pln"> </span><span class="lit">1</span><span class="pun">){</span><span class="pln">
 *    </span><span class="com">//Executes when the Boolean expression 1 is true</span><span class="pln">
 *    </span><span class="kwd">if</span><span class="pun">(</span><span class="typ">Boolean_expression</span><span class="pln"> </span><span class="lit">2</span><span class="pun">){</span><span class="pln">
 *       </span><span class="com">//Executes when the Boolean expression 2 is true</span><span class="pln">
 *    </span><span class="pun">}</span><span class="pln">
 * </span><span class="pun">}</span>
 * </pre>
 *
 * </p>
 *
 * <p>
 * The switch Statement:
 *
 * <pre style="" class="prettyprint prettyprinted">
 * <span class="kwd">switch</span><span class="pun">(</span><span class="pln">expression</span><span class="pun">){</span><span class="pln">
 *     </span><span class="kwd">case</span><span class="pln"> value </span><span class="pun">:</span><span class="pln">
 *        </span><span class="com">//Statements</span><span class="pln">
 *        </span><span class="kwd">break</span><span class="pun">;</span><span class="pln"> </span><span class="com">//optional</span><span class="pln">
 *     </span><span class="kwd">case</span><span class="pln"> value </span><span class="pun">:</span><span class="pln">
 *        </span><span class="com">//Statements</span><span class="pln">
 *        </span><span class="kwd">break</span><span class="pun">;</span><span class="pln"> </span><span class="com">//optional</span><span class="pln">
 *     </span><span class="com">//You can have any number of case statements.</span><span class="pln">
 *     </span><span class="kwd">default</span><span class="pln"> </span><span class="pun">:</span><span class="pln"> </span><span class="com">//Optional</span><span class="pln">
 *        </span><span class="com">//Statements</span><span class="pln">
 * </span><span class="pun">}</span>
 * </pre>
 *
 * </p>
 */
package com.tutorialspoint.decisionmaking;