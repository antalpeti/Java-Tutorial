/**
 * Contains some examples about Abstraction topic.
 *
 * <p>
 * Abstraction refers to the ability to make a class abstract in OOP. An <b>abstract class</b> is
 * one that cannot be instantiated. All other functionality of the class still exists, and its
 * fields, methods, and constructors are all accessed in the same manner. You just cannot create an
 * instance of the abstract class.
 * </p>
 *
 * <p>
 * If you want a class to contain a particular method but you want the actual implementation of that
 * method to be determined by child classes, you can declare the method in the parent class as
 * abstract.
 * </p>
 *
 * <p>
 * The abstract keyword is also used to declare a method as abstract. An <b>abstract method</b>
 * consists of a method signature, but no method body.
 * </p>
 *
 * <p>
 * Declaring a method as abstract has two results:
 * </p>
 *
 * <ul>
 * <li>
 * <p>
 * The class must also be declared abstract. If a class contains an abstract method, the class must
 * be abstract as well.
 * </p>
 * </li>
 * <li>
 * <p>
 * Any child class must either override the abstract method or declare itself abstract.
 * </p>
 * </li>
 * </ul>
 */
package com.tutorialspoint.abstraction;