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
 */
package tutorialspoint.collections;