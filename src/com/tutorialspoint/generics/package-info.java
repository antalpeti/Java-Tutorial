/**
 * Contains some examples about Generics topic.
 *
 * <h2>Generic Methods:</h2>
 * <p>
 * You can write a single generic method declaration that can be called with arguments of different
 * types. Based on the types of the arguments passed to the generic method, the compiler handles
 * each method call appropriately. Following are the rules to define Generic Methods:
 * </p>
 * <ul>
 * <li>
 * <p>
 * All generic method declarations have a type parameter section delimited by angle brackets (&lt;
 * and &gt;) that precedes the method's return type ( &lt; E &gt; in the next example).
 * </p>
 * </li>
 * <li>
 * <p>
 * Each type parameter section contains one or more type parameters separated by commas. A type
 * parameter, also known as a type variable, is an identifier that specifies a generic type name.
 * </p>
 * </li>
 * <li>
 * <p>
 * The type parameters can be used to declare the return type and act as placeholders for the types
 * of the arguments passed to the generic method, which are known as actual type arguments.
 * </p>
 * </li>
 * <li>
 * <p>
 * A generic method's body is declared like that of any other method. Note that type parameters can
 * represent only reference types, not primitive types (like int, double and char).
 * </p>
 * </li>
 * </ul>
 *
 * <h2>Bounded Type Parameters:</h2>
 * <p>
 * To declare a bounded type parameter, list the type parameter's name, followed by the extends
 * keyword, followed by its upper bound.
 * </p>
 *
 * <h2>Generic Classes:</h2>
 * <p>
 * A generic class declaration looks like a non-generic class declaration, except that the class
 * name is followed by a type parameter section.
 * </p>
 * <p>
 * As with generic methods, the type parameter section of a generic class can have one or more type
 * parameters separated by commas. These classes are known as parameterized classes or parameterized
 * types because they accept one or more parameters.
 * </p>
 */
package com.tutorialspoint.generics;