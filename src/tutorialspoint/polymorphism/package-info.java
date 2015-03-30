/**
 * Contains some examples about Polymorphism topic.
 *
 * <p>
 * Any Java object that can pass more than one IS-A test is considered to be polymorphic. In Java,
 * all Java objects are polymorphic since any object will pass the IS-A test for their own type and
 * for the class Object.
 * </p>
 *
 * <p>
 * When at compile time, the compiler used a method() in superclass to validate a statement but run
 * time, the JVM invokes this method() from the subclass. This behavior is referred to as virtual
 * method invocation, and the methods are referred to as virtual methods. All methods in Java behave
 * in this manner, whereby an overridden method is invoked at run time, no matter what data type the
 * reference is that was used in the source code at compile time.
 * </p>
 */
package tutorialspoint.polymorphism;