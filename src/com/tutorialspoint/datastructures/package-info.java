/**
 * Contains some examples about Data Structures topic.
 *
 * <p>
 * The data structures provided by the Java utility package are very powerful and perform a wide
 * range of functions. These data structures consist of the following interface and classes:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Enumeration
 * </p>
 * </li>
 * <li>
 * <p>
 * BitSet
 * </p>
 * </li>
 * <li>
 * <p>
 * Vector
 * </p>
 * </li>
 * <li>
 * <p>
 * Stack
 * </p>
 * </li>
 * <li>
 * <p>
 * Dictionary
 * </p>
 * </li>
 * <li>
 * <p>
 * Hashtable
 * </p>
 * </li>
 * <li>
 * <p>
 * Properties
 * </p>
 * </li>
 * </ul>
 * <p>
 * All these classes are now legacy and Java-2 has introduced a new framework called Collections
 * Framework.
 * </p>
 *
 * <h2>The Enumeration:</h2>
 * <p>
 * The Enumeration interface isn't itself a data structure, but it is very important within the
 * context of other data structures. The Enumeration interface defines a means to retrieve
 * successive elements from a data structure.
 * </p>
 * <p>
 * For example, Enumeration defines a method called nextElement that is used to get the next element
 * in a data structure that contains multiple elements.
 * </p>
 * <p>
 * The Enumeration interface defines the methods by which you can enumerate (obtain one at a time)
 * the elements in a collection of objects.
 * </p>
 * <p>
 * This legacy interface has been superceded by Iterator. Although not deprecated, Enumeration is
 * considered obsolete for new code. However, it is used by several methods defined by the legacy
 * classes such as Vector and Properties, is used by several other API classes, and is currently in
 * widespread use in application code.
 * </p>
 *
 * <h2>The BitSet</h2>
 * <p>
 * The BitSet class implements a group of bits or flags that can be set and cleared individually.
 * </p>
 * <p>
 * This class is very useful in cases where you need to keep up with a set of Boolean values; you
 * just assign a bit to each value and set or clear it as appropriate.
 * </p>
 * <p>
 * A BitSet class creates a special type of array that holds bit values. The BitSet array can
 * increase in size as needed. This makes it similar to a vector of bits.
 * </p>
 * <p>
 * This is a legacy class but it has been completely re-engineered in Java 2, version 1.4.
 * </p>
 *
 * <h2>The Vector</h2>
 * <p>
 * The Vector class is similar to a traditional Java array, except that it can grow as necessary to
 * accommodate new elements.
 * </p>
 * <p>
 * Like an array, elements of a Vector object can be accessed via an index into the vector.
 * </p>
 * <p>
 * The nice thing about using the Vector class is that you don't have to worry about setting it to a
 * specific size upon creation; it shrinks and grows automatically when necessary.
 * </p>
 * <p>
 * Vector implements a dynamic array. It is similar to ArrayList, but with two differences:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Vector is synchronized.
 * </p>
 * </li>
 * <li>
 * <p>
 * Vector contains many legacy methods that are not part of the collections framework.
 * </p>
 * </li>
 * </ul>
 *
 * <h2>The Stack</h2>
 * <p>
 * The Stack class implements a last-in-first-out (LIFO) stack of elements.
 * </p>
 * <p>
 * You can think of a stack literally as a vertical stack of objects; when you add a new element, it
 * gets stacked on top of the others.
 * </p>
 * <p>
 * When you pull an element off the stack, it comes off the top. In other words, the last element
 * you added to the stack is the first one to come back off.
 * </p>
 * <p>
 * Stack is a subclass of Vector that implements a standard last-in, first-out stack.
 * </p>
 * <p>
 * Stack only defines the default constructor, which creates an empty stack. Stack includes all the
 * methods defined by Vector, and adds several of its own.
 * </p>
 *
 * <h2>The Dictionary</h2>
 * <p>
 * The Dictionary class is an abstract class that defines a data structure for mapping keys to
 * values.
 * </p>
 * <p>
 * This is useful in cases where you want to be able to access data via a particular key rather than
 * an integer index.
 * </p>
 * <p>
 * Since the Dictionary class is abstract, it provides only the framework for a key-mapped data
 * structure rather than a specific implementation.
 * </p>
 * <p>
 * Dictionary is an abstract class that represents a key/value storage repository and operates much
 * like Map.
 * </p>
 * <p>
 * Given a key and value, you can store the value in a Dictionary object. Once the value is stored,
 * you can retrieve it by using its key. Thus, like a map, a dictionary can be thought of as a list
 * of key/value pairs.
 * </p>
 * <p>
 * The Dictionary class is obsolete. You should implement the Map interface to obtain key/value
 * storage functionality.
 * </p>
 *
 * <h2>The Map Interface</h2>
 * <p>
 * The Map interface maps unique keys to values. A key is an object that you use to retrieve a value
 * at a later date.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Given a key and a value, you can store the value in a Map object. After the value is stored, you
 * can retrieve it by using its key.
 * </p>
 * </li>
 * <li>
 * <p>
 * Several methods throw a NoSuchElementException when no items exist in the invoking map.
 * </p>
 * </li>
 * <li>
 * <p>
 * A ClassCastException is thrown when an object is incompatible with the elements in a map.
 * </p>
 * </li>
 * <li>
 * <p>
 * A NullPointerException is thrown if an attempt is made to use a null object and null is not
 * allowed in the map.
 * </p>
 * </li>
 * <li>
 * <p>
 * An UnsupportedOperationException is thrown when an attempt is made to change an unmodifiable map.
 * </p>
 * </li>
 * </ul>
 *
 * <h2>The Hashtable</h2>
 * <p>
 * The Hashtable class provides a means of organizing data based on some user-defined key structure.
 * </p>
 * <p>
 * For example, in an address list hash table you could store and sort data based on a key such as
 * ZIP code rather than on a person's name.
 * </p>
 * <p>
 * The specific meaning of keys in regard to hash tables is totally dependent on the usage of the
 * hash table and the data it contains.
 * </p>
 * <p>
 * Hashtable was part of the original java.util and is a concrete implementation of a Dictionary.
 * </p>
 * <p>
 * However, Java 2 re-engineered Hashtable so that it also implements the Map interface. Thus,
 * Hashtable is now integrated into the collections framework. It is similar to HashMap, but is
 * synchronized.
 * </p>
 * <p>
 * Like HashMap, Hashtable stores key/value pairs in a hash table. When using a Hashtable, you
 * specify an object that is used as a key, and the value that you want linked to that key. The key
 * is then hashed, and the resulting hash code is used as the index at which the value is stored
 * within the table.
 * </p>
 * <p>
 * The Hashtable defines four constructors. The first version is the default constructor:
 * </p>
 *
 * <pre>
 * <code>Hashtable</code>
 * </pre>
 * <p>
 * The second version creates a hash table that has an initial size specified by size:
 * </p>
 *
 * <pre>
 * <code>Hashtable(int size)</code>
 * </pre>
 * <p>
 * The third version creates a hash table that has an initial size specified by size and a fill
 * ratio specified by fillRatio.
 * </p>
 * <p>
 * This ratio must be between 0.0 and 1.0, and it determines how full the hash table can be before
 * it is resized upward.
 * </p>
 *
 * <pre>
 * <code>Hashtable(int size, float fillRatio)</code>
 * </pre>
 * <p>
 * The fourth version creates a hash table that is initialized with the elements in m.
 * </p>
 * <p>
 * The capacity of the hash table is set to twice the number of elements in m. The default load
 * factor of 0.75 is used.
 * </p>
 *
 * <pre>
 * <code>Hashtable(Map m)</code>
 * </pre>
 *
 * <h2>The Properties</h2>
 * <p>
 * Properties is a subclass of Hashtable. It is used to maintain lists of values in which the key is
 * a String and the value is also a String.
 * </p>
 * <p>
 * The Properties class is used by many other Java classes. For example, it is the type of object
 * returned by System.getProperties( ) when obtaining environmental values.
 * </p>
 * <p>
 * Properties define the following instance variable. This variable holds a default property list
 * associated with a Properties object.
 * </p>
 *
 * <pre>
 * <code>Properties defaults;</code>
 * </pre>
 * <p>
 * The Properties define two constructors. The first version creates a Properties object that has no
 * default values:
 * </p>
 *
 * <pre>
 * <code>Properties( )</code>
 * </pre>
 * <p>
 * The second creates an object that uses propDefault for its default values. In both cases, the
 * property list is empty:
 * </p>
 *
 * <pre>
 * <code>Properties(Properties propDefault)</code>
 * </pre>
 */
package com.tutorialspoint.datastructures;