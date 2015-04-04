/**
 * Contains some examples about Collections topic.
 *
 * <p>
 * Prior to Java 2, Java provided ad hoc classes such as <b>Dictionary, Vector, Stack</b>, and
 * <b>Properties</b> to store and manipulate groups of objects. Although these classes were quite
 * useful, they lacked a central, unifying theme. Thus, the way that you used Vector was different
 * from the way that you used Properties.
 * </p>
 *
 * <p>
 * The collections framework was designed to meet several goals.
 * </p>
 * <ul>
 * <li>
 * <p>
 * The framework had to be high-performance. The implementations for the fundamental collections
 * (dynamic arrays, linked lists, trees, and hashtables) are highly efficient.
 * </p>
 * </li>
 * <li>
 * <p>
 * The framework had to allow different types of collections to work in a similar manner and with a
 * high degree of interoperability.
 * </p>
 * </li>
 * <li>
 * <p>
 * Extending and/or adapting a collection had to be easy.
 * </p>
 * </li>
 * </ul>
 *
 * <p>
 * Towards this end, the entire collections framework is designed around a set of standard
 * interfaces. Several standard implementations such as <b>LinkedList, HashSet,</b> and
 * <b>TreeSet</b>, of these interfaces are provided that you may use as-is and you may also
 * implement your own collection, if you choose.
 * </p>
 *
 * <p>
 * A collections framework is a unified architecture for representing and manipulating collections.
 * All collections frameworks contain the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Interfaces:</b> These are abstract data types that represent collections. Interfaces allow
 * collections to be manipulated independently of the details of their representation. In
 * object-oriented languages, interfaces generally form a hierarchy.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Implementations, i.e., Classes:</b> These are the concrete implementations of the collection
 * interfaces. In essence, they are reusable data structures.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Algorithms:</b> These are the methods that perform useful computations, such as searching and
 * sorting, on objects that implement collection interfaces. The algorithms are said to be
 * polymorphic: that is, the same method can be used on many different implementations of the
 * appropriate collection interface.
 * </p>
 * </li>
 * </ul>
 *
 * <p>
 * In addition to collections, the framework defines several map interfaces and classes. Maps store
 * key/value pairs. Although maps are not <i>collections</i> in the proper use of the term, but they
 * are fully integrated with collections.
 * </p>
 *
 * <h2>The Collection Interfaces:</h2>
 *
 * <p>
 * The collections framework defines several interfaces. This section provides an overview of each
 * interface:
 * </p>
 *
 * <head> <link rel="stylesheet" type="text/css" href="../../../files/mystyle.css"></head>
 * <table>
 * <tbody>
 * <tr>
 * <th>SN</th>
 * <th>Interfaces with Description</th>
 * </tr>
 * <tr>
 * <td>1</td>
 * <td><b>The Collection Interface</b><br>
 * This enables you to work with groups of objects; it is at the top of the collections hierarchy.</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>The List Interface</b><br>
 * This extends <b>Collection</b> and an instance of List stores an ordered collection of elements.</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>The Set</b><br>
 * This extends Collection to handle sets, which must contain unique elements</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>The SortedSet</b><br>
 * This extends Set to handle sorted sets</td>
 * </tr>
 * <tr>
 * <td>5</td>
 * <td><b>The Map</b><br>
 * This maps unique keys to values.</td>
 * </tr>
 * <tr>
 * <td>6</td>
 * <td><b>The Map.Entry</b><br>
 * This describes an element (a key/value pair) in a map. This is an inner class of Map.</td>
 * </tr>
 * <tr>
 * <td>7</td>
 * <td><b>The SortedMap</b><br>
 * This extends Map so that the keys are maintained in ascending order.</td>
 * </tr>
 * <tr>
 * <td>8</td>
 * <td><b>The Enumeration</b><br>
 * This is legacy interface and defines the methods by which you can enumerate (obtain one at a
 * time) the elements in a collection of objects. This legacy interface has been superceded by
 * Iterator.</td>
 * </tr>
 * </tbody>
 * </table>
 *
 * <h3>Java - The Collection Interface</h3>
 *
 * <p>
 * The Collection interface is the foundation upon which the collections framework is built. It
 * declares the core methods that all collections will have. These methods are summarized in the
 * following table.
 * </p>
 * <p>
 * Because all collections implement Collection, familiarity with its methods is necessary for a
 * clear understanding of the framework. Several of these methods can throw an
 * <b>UnsupportedOperationException</b>.
 * </p>
 *
 * <table>
 * <tbody>
 * <tr>
 * <th>SN</th>
 * <th>Methods with Description</th>
 * </tr>
 * <tr>
 * <td>1</td>
 * <td><b>boolean add(Object obj)</b><br>
 * Adds obj to the invoking collection. Returns true if obj was added to the collection. Returns
 * false if obj is already a member of the collection, or if the collection does not allow
 * duplicates.</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>boolean addAll(Collection c)</b><br>
 * Adds all the elements of c to the invoking collection. Returns true if the operation succeeded
 * (i.e., the elements were added). Otherwise, returns false.</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>void clear( )</b><br>
 * Removes all elements from the invoking collection.</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>boolean contains(Object obj)</b><br>
 * Returns true if obj is an element of the invoking collection. Otherwise, returns false.</td>
 * </tr>
 * <tr>
 * <td>5</td>
 * <td><b>boolean containsAll(Collection c)</b><br>
 * Returns true if the invoking collection contains all elements of c. Otherwise, returns false.</td>
 * </tr>
 * <tr>
 * <td>6</td>
 * <td><b>boolean equals(Object obj)</b><br>
 * Returns true if the invoking collection and obj are equal. Otherwise, returns false.</td>
 * </tr>
 * <tr>
 * <td>7</td>
 * <td><b>int hashCode( )</b><br>
 * Returns the hash code for the invoking collection.</td>
 * </tr>
 * <tr>
 * <td>8</td>
 * <td><b>boolean isEmpty( )</b><br>
 * Returns true if the invoking collection is empty. Otherwise, returns false.</td>
 * </tr>
 * <tr>
 * <td>9</td>
 * <td><b>Iterator iterator( )</b><br>
 * Returns an iterator for the invoking collection.</td>
 * </tr>
 * <tr>
 * <td>10</td>
 * <td><b>boolean remove(Object obj)</b><br>
 * Removes one instance of obj from the invoking collection. Returns true if the element was
 * removed. Otherwise, returns false.</td>
 * </tr>
 * <tr>
 * <td>11</td>
 * <td><b>boolean removeAll(Collection c)</b><br>
 * Removes all elements of c from the invoking collection. Returns true if the collection changed
 * (i.e., elements were removed). Otherwise, returns false.</td>
 * </tr>
 * <tr>
 * <td>12</td>
 * <td><b>boolean retainAll(Collection c)</b><br>
 * Removes all elements from the invoking collection except those in c. Returns true if the
 * collection changed (i.e., elements were removed). Otherwise, returns false</td>
 * </tr>
 * <tr>
 * <td>13</td>
 * <td><b>int size( )</b><br>
 * Returns the number of elements held in the invoking collection.</td>
 * </tr>
 * <tr>
 * <td>14</td>
 * <td><b>Object[ ] toArray( )</b><br>
 * Returns an array that contains all the elements stored in the invoking collection. The array
 * elements are copies of the collection elements.</td>
 * </tr>
 * <tr>
 * <td>15</td>
 * <td><b>Object[ ] toArray(Object array[ ])</b><br>
 * Returns an array containing only those collection elements whose type matches that of array.</td>
 * </tr>
 * </tbody>
 * </table>
 *
 * <h2>The Collection Classes:</h2>
 * <p>
 * Java provides a set of standard collection classes that implement Collection interfaces. Some of
 * the classes provide full implementations that can be used as-is and others are abstract class,
 * providing skeletal implementations that are used as starting points for creating concrete
 * collections.
 * </p>
 * <p>
 * The standard collection classes are summarized in the following table:
 * </p>
 * <table>
 * <tbody>
 * <tr>
 * <th>SN</th>
 * <th>Classes with Description</th>
 * </tr>
 * <tr>
 * <td>1</td>
 * <td><b>AbstractCollection</b><br>
 * Implements most of the Collection interface.</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>AbstractList</b><br>
 * Extends AbstractCollection and implements most of the List interface.</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>AbstractSequentialList</b><br>
 * Extends AbstractList for use by a collection that uses sequential rather than random access of
 * its elements.</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>LinkedList</b><br>
 * Implements a linked list by extending AbstractSequentialList.</td>
 * </tr>
 * <tr>
 * <td>5</td>
 * <td><b>ArrayList</b><br>
 * Implements a dynamic array by extending AbstractList.</td>
 * </tr>
 * <tr>
 * <td>6</td>
 * <td><b>AbstractSet </b><br>
 * Extends AbstractCollection and implements most of the Set interface.</td>
 * </tr>
 * <tr>
 * <td>7</td>
 * <td><b>HashSet</b><br>
 * Extends AbstractSet for use with a hash table.</td>
 * </tr>
 * <tr>
 * <td>8</td>
 * <td><b>LinkedHashSet</b><br>
 * Extends HashSet to allow insertion-order iterations.</td>
 * </tr>
 * <tr>
 * <td>9</td>
 * <td><b>TreeSet</b><br>
 * Implements a set stored in a tree. Extends AbstractSet.</td>
 * </tr>
 * <tr>
 * <td>10</td>
 * <td><b>AbstractMap</b><br>
 * Implements most of the Map interface.</td>
 * </tr>
 * <tr>
 * <td>11</td>
 * <td><b>HashMap</b><br>
 * Extends AbstractMap to use a hash table.</td>
 * </tr>
 * <tr>
 * <td>12</td>
 * <td><b>TreeMap</b><br>
 * Extends AbstractMap to use a tree.</td>
 * </tr>
 * <tr>
 * <td>13</td>
 * <td><b>WeakHashMap</b><br>
 * Extends AbstractMap to use a hash table with weak keys.</td>
 * </tr>
 * <tr>
 * <td>14</td>
 * <td><b>LinkedHashMap</b><br>
 * Extends HashMap to allow insertion-order iterations.</td>
 * </tr>
 * <tr>
 * <td>15</td>
 * <td><b>IdentityHashMap</b><br>
 * Extends AbstractMap and uses reference equality when comparing documents.</td>
 * </tr>
 * </tbody>
 * </table>
 *
 */
package tutorialspoint.collections;