/**
 * Contains some examples about Interfaces topic.
 *
 * <p>
 * An <b>interface</b> is a collection of abstract methods. A class implements an interface, thereby
 * inheriting the abstract methods of the interface.
 * </p>
 *
 * <p>
 * An interface is not a class. Writing an interface is similar to writing a class, but they are two
 * different concepts. A class describes the attributes and behaviors of an object. An interface
 * contains behaviors that a class implements.
 * </p>
 *
 * <p>
 * Unless the class that implements the interface is abstract, all the methods of the interface need
 * to be defined in the class.
 * </p>
 *
 * <p>
 * An interface is similar to a class in the following ways:
 * </p>
 *
 * <ul>
 * <li>
 * <p>
 * An interface can contain any number of methods.
 * </p>
 * </li>
 * <li>
 * <p>
 * An interface is written in a file with a <b>.java</b> extension, with the name of the interface
 * matching the name of the file.
 * </p>
 * </li>
 * <li>
 * <p>
 * The bytecode of an interface appears in a <b>.class</b> file.
 * </p>
 * </li>
 * <li>
 * <p>
 * Interfaces appear in packages, and their corresponding bytecode file must be in a directory
 * structure that matches the package name.
 * </p>
 * </li>
 * </ul>
 *
 * <p>
 * However, an interface is different from a class in several ways, including:
 * </p>
 *
 * <ul>
 * <li>
 * <p>
 * You cannot instantiate an interface.
 * </p>
 * </li>
 * <li>
 * <p>
 * An interface does not contain any constructors.
 * </p>
 * </li>
 * <li>
 * <p>
 * All of the methods in an interface are abstract.
 * </p>
 * </li>
 * <li>
 * <p>
 * An interface cannot contain instance fields. The only fields that can appear in an interface must
 * be declared both static and final.
 * </p>
 * </li>
 * <li>
 * <p>
 * An interface is not extended by a class; it is implemented by a class.
 * </p>
 * </li>
 * <li>
 * <p>
 * An interface can extend multiple interfaces.
 * </p>
 * </li>
 * </ul>
 *
 * <p>
 * Interfaces have the following properties:
 * </p>
 *
 * <ul>
 * <li>
 * <p>
 * An interface is implicitly abstract. You do not need to use the <b>abstract</b> keyword when
 * declaring an interface.
 * </p>
 * </li>
 * <li>
 * <p>
 * Each method in an interface is also implicitly abstract, so the abstract keyword is not needed.
 * </p>
 * </li>
 * <li>
 * <p>
 * Methods in an interface are implicitly public.
 * </p>
 * </li>
 * </ul>
 *
 * <p>
 * When a class <b>implements an interface</b>, you can think of the class as signing a contract,
 * agreeing to perform the specific behaviors of the interface. If a class does not perform all the
 * behaviors of the interface, the class must declare itself as abstract.
 * </p>
 * <p>
 * A class uses the <b>implements</b> keyword to implement an interface. The implements keyword
 * appears in the class declaration following the extends portion of the declaration.
 * </p>
 *
 * <p>
 * When overriding methods defined in interfaces there are several rules to be followed:
 * </p>
 *
 * <ul>
 * <li>
 * <p>
 * Checked exceptions should not be declared on implementation methods other than the ones declared
 * by the interface method or subclasses of those declared by the interface method.
 * </p>
 * </li>
 * <li>
 * <p>
 * The signature of the interface method and the same return type or subtype should be maintained
 * when overriding the methods.
 * </p>
 * </li>
 * <li>
 * <p>
 * An implementation class itself can be abstract and if so interface methods need not be
 * implemented.
 * </p>
 * </li>
 * </ul>
 *
 * <p>
 * When implementation interfaces there are several rules:
 * </p>
 *
 * <ul>
 * <li>
 * <p>
 * A class can implement more than one interface at a time.
 * </p>
 * </li>
 * <li>
 * <p>
 * A class can extend only one class, but implement many interfaces.
 * </p>
 * </li>
 * <li>
 * <p>
 * An interface can extend another interface, similarly to the way that a class can extend another
 * class.
 * </p>
 * </li>
 * </ul>
 *
 * <p>
 * Extending Multiple Interfaces:
 * </p>
 *
 * <p>
 * A Java class can only extend one parent class. Multiple inheritance is not allowed. Interfaces
 * are not classes, however, and an interface can extend more than one parent interface.
 * </p>
 * <p>
 * The extends keyword is used once, and the parent interfaces are declared in a comma-separated
 * list.
 * </p>
 *
 * <p>
 * Tagging Interfaces:
 * </p>
 *
 * <p>
 * An interface with no methods in it is referred to as a <b>tagging</b> interface. There are two
 * basic design purposes of tagging interfaces:
 * </p>
 * <p>
 * <b>Creates a common parent:</b> As with the EventListener interface, which is extended by dozens
 * of other interfaces in the Java API, you can use a tagging interface to create a common parent
 * among a group of interfaces. For example, when an interface extends EventListener, the JVM knows
 * that this particular interface is going to be used in an event delegation scenario.
 * </p>
 * <p>
 * <b>Adds a data type to a class:</b> This situation is where the term tagging comes from. A class
 * that implements a tagging interface does not need to define any methods (since the interface does
 * not have any), but the class becomes an interface type through polymorphism.
 * </p>
 */
package tutorialspoint.interfaces;