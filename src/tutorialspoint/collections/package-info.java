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
 * <h3>The Collection Interface</h3>
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
 * <h3>The List Interface</h3>
 *
 * <p>
 * The List interface extends <b>Collection</b> and declares the behavior of a collection that
 * stores a sequence of elements.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Elements can be inserted or accessed by their position in the list, using a zero-based index.
 * </p>
 * </li>
 * <li>
 * <p>
 * A list may contain duplicate elements.
 * </p>
 * </li>
 * <li>
 * <p>
 * In addition to the methods defined by <b>Collection</b>, List defines some of its own, which are
 * summarized in the following below Table.
 * </p>
 * </li>
 * <li>
 * <p>
 * Several of the list methods will throw an UnsupportedOperationException if the collection cannot
 * be modified, and a ClassCastException is generated when one object is incompatible with another.
 * </p>
 * </li>
 * </ul>
 *
 * <table>
 * <tbody>
 * <tr>
 * <th>SN</th>
 * <th>Methods with Description</th>
 * </tr>
 * <tr>
 * <td>1</td>
 * <td><b>void add(int index, Object obj)</b><br>
 * Inserts obj into the invoking list at the index passed in index. Any pre-existing elements at or
 * beyond the point of insertion are shifted up. Thus, no elements are overwritten.</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>boolean addAll(int index, Collection c)</b><br>
 * Inserts all elements of c into the invoking list at the index passed in index. Any pre-existing
 * elements at or beyond the point of insertion are shifted up. Thus, no elements are overwritten.
 * Returns true if the invoking list changes and returns false otherwise.</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>Object get(int index)</b><br>
 * Returns the object stored at the specified index within the invoking collection.</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>int indexOf(Object obj)</b><br>
 * Returns the index of the first instance of obj in the invoking list. If obj is not an element of
 * the list, .1 is returned.</td>
 * </tr>
 * <tr>
 * <td>5</td>
 * <td><b>int lastIndexOf(Object obj)</b><br>
 * Returns the index of the last instance of obj in the invoking list. If obj is not an element of
 * the list, .1 is returned.</td>
 * </tr>
 * <tr>
 * <td>6</td>
 * <td><b>ListIterator listIterator( )</b><br>
 * Returns an iterator to the start of the invoking list.</td>
 * </tr>
 * <tr>
 * <td>7</td>
 * <td><b>ListIterator listIterator(int index)</b><br>
 * Returns an iterator to the invoking list that begins at the specified index.</td>
 * </tr>
 * <tr>
 * <td>8</td>
 * <td><b>Object remove(int index)</b><br>
 * Removes the element at position index from the invoking list and returns the deleted element. The
 * resulting list is compacted. That is, the indexes of subsequent elements are decremented by one</td>
 * </tr>
 * <tr>
 * <td>9</td>
 * <td><b>Object set(int index, Object obj)</b><br>
 * Assigns obj to the location specified by index within the invoking list.</td>
 * </tr>
 * <tr>
 * <td>10</td>
 * <td><b>List subList(int start, int end)</b><br>
 * Returns a list that includes elements from start to end.1 in the invoking list. Elements in the
 * returned list are also referenced by the invoking object.</td>
 * </tr>
 * </tbody>
 * </table>
 *
 * <h3>The Set Interface</h3>
 *
 * <p>
 * A Set is a Collection that cannot contain duplicate elements. It models the mathematical set
 * abstraction.
 * </p>
 * <p>
 * The Set interface contains only methods inherited from Collection and adds the restriction that
 * duplicate elements are prohibited.
 * </p>
 * <p>
 * Set also adds a stronger contract on the behavior of the equals and hashCode operations, allowing
 * Set instances to be compared meaningfully even if their implementation types differ.
 * </p>
 * <p>
 * The methods declared by Set are summarized in the following table:
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
 * <td><b>add( )</b><br>
 * Adds an object to the collection</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>clear( )</b><br>
 * Removes all objects from the collection</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>contains( )</b><br>
 * Returns true if a specified object is an element within the collection</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>isEmpty( )</b><br>
 * Returns true if the collection has no elements</td>
 * </tr>
 * <tr>
 * <td>5</td>
 * <td><b>iterator( )</b><br>
 * Returns an Iterator object for the collection which may be used to retrieve an object</td>
 * </tr>
 * <tr>
 * <td>6</td>
 * <td><b>remove( )</b><br>
 * Removes a specified object from the collection</td>
 * </tr>
 * <tr>
 * <td>7</td>
 * <td><b> size( )</b><br>
 * Returns the number of elements in the collection</td>
 * </tr>
 * </tbody>
 * </table>
 *
 * <h3>The SortedSet Interface</h3>
 *
 * <p>
 * The SortedSet interface extends Set and declares the behavior of a set sorted in ascending order.
 * In addition to those methods defined by Set, the SortedSet interface declares the methods
 * summarized in below Table:
 * </p>
 * <p>
 * Several methods throw a NoSuchElementException when no items are contained in the invoking set. A
 * ClassCastException is thrown when an object is incompatible with the elements in a set.
 * </p>
 * <p>
 * A NullPointerException is thrown if an attempt is made to use a null object and null is not
 * allowed in the set.
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
 * <td><b>Comparator comparator( )</b><br>
 * Returns the invoking sorted set's comparator. If the natural ordering is used for this set, null
 * is returned.</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>Object first( )</b><br>
 * Returns the first element in the invoking sorted set.</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>SortedSet headSet(Object end)</b><br>
 * Returns a SortedSet containing those elements less than end that are contained in the invoking
 * sorted set. Elements in the returned sorted set are also referenced by the invoking sorted set.</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>Object last( )</b><br>
 * Returns the last element in the invoking sorted set.</td>
 * </tr>
 * <tr>
 * <td>5</td>
 * <td><b>SortedSet subSet(Object start, Object end)</b><br>
 * Returns a SortedSet that includes those elements between start and end.1. Elements in the
 * returned collection are also referenced by the invoking object.</td>
 * </tr>
 * <tr>
 * <td>6</td>
 * <td><b>SortedSet tailSet(Object start)</b><br>
 * Returns a SortedSet that contains those elements greater than or equal to start that are
 * contained in the sorted set. Elements in the returned set are also referenced by the invoking
 * object.</td>
 * </tr>
 * </tbody>
 * </table>
 *
 * <h3>The Map Interface</h3>
 *
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
 * <table>
 * <tbody>
 * <tr>
 * <th>SN</th>
 * <th>Methods with Description</th>
 * </tr>
 * <tr>
 * <td>1</td>
 * <td><b>void clear( )</b><br>
 * Removes all key/value pairs from the invoking map.</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>boolean containsKey(Object k)</b><br>
 * Returns true if the invoking map contains k as a key. Otherwise, returns false.</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>boolean containsValue(Object v)</b><br>
 * Returns true if the map contains v as a value. Otherwise, returns false.</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>Set entrySet( )</b><br>
 * Returns a Set that contains the entries in the map. The set contains objects of type Map.Entry.
 * This method provides a set-view of the invoking map.</td>
 * </tr>
 * <tr>
 * <td>5</td>
 * <td><b>boolean equals(Object obj)</b><br>
 * Returns true if obj is a Map and contains the same entries. Otherwise, returns false.</td>
 * </tr>
 * <tr>
 * <td>6</td>
 * <td><b>Object get(Object k)</b><br>
 * Returns the value associated with the key k.</td>
 * </tr>
 * <tr>
 * <td>7</td>
 * <td><b>int hashCode( )</b><br>
 * Returns the hash code for the invoking map.</td>
 * </tr>
 * <tr>
 * <td>8</td>
 * <td><b>boolean isEmpty( )</b><br>
 * Returns true if the invoking map is empty. Otherwise, returns false.</td>
 * </tr>
 * <tr>
 * <td>9</td>
 * <td><b>Set keySet( )</b><br>
 * Returns a Set that contains the keys in the invoking map. This method provides a set-view of the
 * keys in the invoking map.</td>
 * </tr>
 * <tr>
 * <td>10</td>
 * <td><b>Object put(Object k, Object v)</b><br>
 * Puts an entry in the invoking map, overwriting any previous value associated with the key. The
 * key and value are k and v, respectively. Returns null if the key did not already exist.
 * Otherwise, the previous value linked to the key is returned.</td>
 * </tr>
 * <tr>
 * <td>11</td>
 * <td><b>void putAll(Map m)</b><br>
 * Puts all the entries from m into this map.</td>
 * </tr>
 * <tr>
 * <td>12</td>
 * <td><b>Object remove(Object k)</b><br>
 * Removes the entry whose key equals k.</td>
 * </tr>
 * <tr>
 * <td>13</td>
 * <td><b>int size( )</b><br>
 * Returns the number of key/value pairs in the map.</td>
 * </tr>
 * <tr>
 * <td>14</td>
 * <td><b>Collection values( )</b><br>
 * Returns a collection containing the values in the map. This method provides a collection-view of
 * the values in the map.</td>
 * </tr>
 * </tbody>
 * </table>
 *
 * <h3>The Map.Entry Interface</h3>
 *
 * <p>
 * The Map.Entry interface enables you to work with a map entry.
 * </p>
 * <p>
 * The <b>entrySet( )</b> method declared by the Map interface returns a Set containing the map
 * entries. Each of these set elements is a Map.Entry object.
 * </p>
 * <p>
 * Following table summarizes the methods declared by this interface:
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
 * <td><b>boolean equals(Object obj)</b><br>
 * Returns true if obj is a Map.Entry whose key and value are equal to that of the invoking object.</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>Object getKey( )</b><br>
 * Returns the key for this map entry.</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>Object getValue( )</b><br>
 * Returns the value for this map entry.</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>int hashCode( )</b><br>
 * Returns the hash code for this map entry.</td>
 * </tr>
 * <tr>
 * <td>5</td>
 * <td><b>Object setValue(Object v)</b><br>
 * Sets the value for this map entry to v. A ClassCastException is thrown if v is not the correct
 * type for the map. A NullPointerException is thrown if v is null and the map does not permit null
 * keys. An UnsupportedOperationException is thrown if the map cannot be changed.</td>
 * </tr>
 * </tbody>
 * </table>
 *
 * <h3>The SortedMap Interface</h3>
 *
 * <p>
 * The SortedMap interface extends Map. It ensures that the entries are maintained in ascending key
 * order
 * </p>
 * <p>
 * Several methods throw a NoSuchElementException when no items are in the invoking map. A
 * ClassCastException is thrown when an object is incompatible with the elements in a map. A
 * NullPointerException is thrown if an attempt is made to use a null object when null is not
 * allowed in the map.
 * </p>
 * <p>
 * The methods declared by SortedMap are summarized in the following table:
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
 * <td><b>Comparator comparator( )</b><br>
 * Returns the invoking sorted map's comparator. If the natural ordering is used for the invoking
 * map, null is returned.</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>Object firstKey( )</b><br>
 * Returns the first key in the invoking map.</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>SortedMap headMap(Object end)</b><br>
 * Returns a sorted map for those map entries with keys that are less than end.</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>Object lastKey( )</b><br>
 * Returns the last key in the invoking map.</td>
 * </tr>
 * <tr>
 * <td>5</td>
 * <td><b>SortedMap subMap(Object start, Object end)</b><br>
 * Returns a map containing those entries with keys that are greater than or equal to start and less
 * than end</td>
 * </tr>
 * <tr>
 * <td>6</td>
 * <td><b>SortedMap tailMap(Object start)</b><br>
 * Returns a map containing those entries with keys that are greater than or equal to start.</td>
 * </tr>
 * </tbody>
 * </table>
 *
 * <h3>The Enumeration Interface</h3>
 *
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
 * <p>
 * The methods declared by Enumeration are summarized in the following table:
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
 * <td><b>boolean hasMoreElements( )</b><br>
 * When implemented, it must return true while there are still more elements to extract, and false
 * when all the elements have been enumerated.</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>Object nextElement( )</b><br>
 * This returns the next object in the enumeration as a generic Object reference.</td>
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
 * <h3>The LinkedList Class</h3>
 *
 * <p>
 * The LinkedList class extends AbstractSequentialList and implements the List interface. It
 * provides a linked-list data structure.
 * </p>
 * <p>
 * The LinkedList class supports two constructors. The first constructor builds an empty linked
 * list:
 * </p>
 *
 * <pre>
 * <span class="typ">LinkedList</span><span class="pun">(</span><span class="pln"> </span><span class="pun">)</span>
 * </pre>
 * <p>
 * The following constructor builds a linked list that is initialized with the elements of the
 * collection c.
 * </p>
 *
 * <pre>
 * <span class="typ">LinkedList</span><span class="pun">(</span><span class="typ">Collection</span><span class="pln"> c</span><span class="pun">)</span>
 * </pre>
 * <p>
 * Apart from the methods inherited from its parent classes, LinkedList defines following methods:
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
 * <td><b>void add(int index, Object element)</b><br>
 * Inserts the specified element at the specified position index in this list. Throws
 * IndexOutOfBoundsException if the specified index is is out of range (index &lt; 0 || index &gt;
 * size()).</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>boolean add(Object o) </b><br>
 * Appends the specified element to the end of this list.</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>boolean addAll(Collection c)</b><br>
 * Appends all of the elements in the specified collection to the end of this list, in the order
 * that they are returned by the specified collection's iterator. Throws NullPointerException if the
 * specified collection is null.</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>boolean addAll(int index, Collection c) </b><br>
 * Inserts all of the elements in the specified collection into this list, starting at the specified
 * position. Throws NullPointerException if the specified collection is null.</td>
 * </tr>
 * <tr>
 * <td>5</td>
 * <td><b>void addFirst(Object o)</b><br>
 * Inserts the given element at the beginning of this list.</td>
 * </tr>
 * <tr>
 * <td>6</td>
 * <td><b>void addLast(Object o) </b><br>
 * Appends the given element to the end of this list.</td>
 * </tr>
 * <tr>
 * <td>7</td>
 * <td><b>void clear() </b><br>
 * Removes all of the elements from this list.</td>
 * </tr>
 * <tr>
 * <td>8</td>
 * <td><b>Object clone() </b><br>
 * Returns a shallow copy of this LinkedList.</td>
 * </tr>
 * <tr>
 * <td>9</td>
 * <td><b>boolean contains(Object o) </b><br>
 * Returns true if this list contains the specified element. More formally, returns true if and only
 * if this list contains at least one element e such that (o==null ? e==null : o.equals(e)).</td>
 * </tr>
 * <tr>
 * <td>10</td>
 * <td><b>Object get(int index) </b><br>
 * Returns the element at the specified position in this list. Throws IndexOutOfBoundsException if
 * the specified index is is out of range (index &lt; 0 || index &gt;= size()).</td>
 * </tr>
 * <tr>
 * <td>11</td>
 * <td><b>Object getFirst() </b><br>
 * Returns the first element in this list. Throws NoSuchElementException if this list is empty.</td>
 * </tr>
 * <tr>
 * <td>12</td>
 * <td><b>Object getLast() </b><br>
 * Returns the last element in this list. Throws NoSuchElementException if this list is empty.</td>
 * </tr>
 * <tr>
 * <td>13</td>
 * <td><b>int indexOf(Object o) </b><br>
 * Returns the index in this list of the first occurrence of the specified element, or -1 if the
 * List does not contain this element.</td>
 * </tr>
 * <tr>
 * <td>14</td>
 * <td><b>int lastIndexOf(Object o)</b><br>
 * Returns the index in this list of the last occurrence of the specified element, or -1 if the list
 * does not contain this element.</td>
 * </tr>
 * <tr>
 * <td>15</td>
 * <td><b>ListIterator listIterator(int index)</b><br>
 * Returns a list-iterator of the elements in this list (in proper sequence), starting at the
 * specified position in the list. Throws IndexOutOfBoundsException if the specified index is is out
 * of range (index &lt; 0 || index &gt;= size()).</td>
 * </tr>
 * <tr>
 * <td>16</td>
 * <td><b>Object remove(int index) </b><br>
 * Removes the element at the specified position in this list. Throws NoSuchElementException if this
 * list is empty.</td>
 * </tr>
 * <tr>
 * <td>17</td>
 * <td><b>boolean remove(Object o) </b><br>
 * Removes the first occurrence of the specified element in this list. Throws NoSuchElementException
 * if this list is empty. Throws IndexOutOfBoundsException if the specified index is is out of range
 * (index &lt; 0 || index &gt;= size()).</td>
 * </tr>
 * <tr>
 * <td>18</td>
 * <td><b>Object removeFirst() </b><br>
 * Removes and returns the first element from this list. Throws NoSuchElementException if this list
 * is empty.</td>
 * </tr>
 * <tr>
 * <td>19</td>
 * <td><b>Object removeLast() </b><br>
 * Removes and returns the last element from this list. Throws NoSuchElementException if this list
 * is empty.</td>
 * </tr>
 * <tr>
 * <td>20</td>
 * <td><b>Object set(int index, Object element) </b><br>
 * Replaces the element at the specified position in this list with the specified element. Throws
 * IndexOutOfBoundsException if the specified index is is out of range (index &lt; 0 || index &gt;=
 * size()).</td>
 * </tr>
 * <tr>
 * <td>21</td>
 * <td><b>int size() </b><br>
 * Returns the number of elements in this list.</td>
 * </tr>
 * <tr>
 * <td>22</td>
 * <td><b>Object[] toArray() </b><br>
 * Returns an array containing all of the elements in this list in the correct order. Throws
 * NullPointerException if the specified array is null.</td>
 * </tr>
 * <tr>
 * <td>23</td>
 * <td><b>Object[] toArray(Object[] a) </b><br>
 * Returns an array containing all of the elements in this list in the correct order; the runtime
 * type of the returned array is that of the specified array.</td>
 * </tr>
 * </tbody>
 * </table>
 *
 * <h3>The ArrayList Class</h3>
 *
 * <p>
 * The ArrayList class extends AbstractList and implements the List interface. ArrayList supports
 * dynamic arrays that can grow as needed.
 * </p>
 * <p>
 * Standard Java arrays are of a fixed length. After arrays are created, they cannot grow or shrink,
 * which means that you must know in advance how many elements an array will hold.
 * </p>
 * <p>
 * Array lists are created with an initial size. When this size is exceeded, the collection is
 * automatically enlarged. When objects are removed, the array may be shrunk.
 * </p>
 * <p>
 * The ArrayList class supports three constructors. The first constructor builds an empty array
 * list.
 * </p>
 *
 * <pre>
 * <span class="typ">ArrayList</span><span class="pun">(</span><span class="pln"> </span><span class="pun">)</span>
 * </pre>
 * <p>
 * The following constructor builds an array list that is initialized with the elements of the
 * collection c.
 * </p>
 *
 * <pre>
 * <span class="typ">ArrayList</span><span class="pun">(</span><span class="typ">Collection</span><span class="pln"> c</span><span class="pun">)</span>
 * </pre>
 * <p>
 * The following constructor builds an array list that has the specified initial capacity. The
 * capacity is the size of the underlying array that is used to store the elements.
 * </p>
 * <p>
 * The capacity grows automatically as elements are added to an array list.
 * </p>
 *
 * <pre>
 * <span class="typ">ArrayList</span><span class="pun">(</span><span class="kwd">int</span><span class="pln"> capacity</span><span class="pun">)</span>
 * </pre>
 * <p>
 * Apart from the methods inherited from its parent classes, ArrayList defines following methods:
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
 * <td><b>void add(int index, Object element)</b><br>
 * Inserts the specified element at the specified position index in this list. Throws
 * IndexOutOfBoundsException if the specified index is is out of range (index &lt; 0 || index &gt;
 * size()).</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>boolean add(Object o) </b><br>
 * Appends the specified element to the end of this list.</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>boolean addAll(Collection c)</b><br>
 * Appends all of the elements in the specified collection to the end of this list, in the order
 * that they are returned by the specified collection's iterator. Throws NullPointerException if the
 * specified collection is null.</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>boolean addAll(int index, Collection c) </b><br>
 * Inserts all of the elements in the specified collection into this list, starting at the specified
 * position. Throws NullPointerException if the specified collection is null.</td>
 * </tr>
 * <tr>
 * <td>5</td>
 * <td><b>void clear() </b><br>
 * Removes all of the elements from this list.</td>
 * </tr>
 * <tr>
 * <td>6</td>
 * <td><b>Object clone() </b><br>
 * Returns a shallow copy of this ArrayList.</td>
 * </tr>
 * <tr>
 * <td>7</td>
 * <td><b>boolean contains(Object o) </b><br>
 * Returns true if this list contains the specified element. More formally, returns true if and only
 * if this list contains at least one element e such that (o==null ? e==null : o.equals(e)).</td>
 * </tr>
 * <tr>
 * <td>8</td>
 * <td><b>void ensureCapacity(int minCapacity) </b><br>
 * Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at
 * least the number of elements specified by the minimum capacity argument.</td>
 * </tr>
 * <tr>
 * <td>9</td>
 * <td><b>Object get(int index) </b><br>
 * Returns the element at the specified position in this list. Throws IndexOutOfBoundsException if
 * the specified index is is out of range (index &lt; 0 || index &gt;= size()).</td>
 * </tr>
 * <tr>
 * <td>10</td>
 * <td><b>int indexOf(Object o) </b><br>
 * Returns the index in this list of the first occurrence of the specified element, or -1 if the
 * List does not contain this element.</td>
 * </tr>
 * <tr>
 * <td>11</td>
 * <td><b>int lastIndexOf(Object o)</b><br>
 * Returns the index in this list of the last occurrence of the specified element, or -1 if the list
 * does not contain this element.</td>
 * </tr>
 * <tr>
 * <td>12</td>
 * <td><b>Object remove(int index) </b><br>
 * Removes the element at the specified position in this list. Throws IndexOutOfBoundsException if
 * index out of range (index &lt; 0 || index &gt;= size()).</td>
 * </tr>
 * <tr>
 * <td>13</td>
 * <td><b>protected void removeRange(int fromIndex, int toIndex) </b><br>
 * Removes from this List all of the elements whose index is between fromIndex, inclusive and
 * toIndex, exclusive.</td>
 * </tr>
 * <tr>
 * <td>14</td>
 * <td><b>Object set(int index, Object element) </b><br>
 * Replaces the element at the specified position in this list with the specified element. Throws
 * IndexOutOfBoundsException if the specified index is is out of range (index &lt; 0 || index &gt;=
 * size()).</td>
 * </tr>
 * <tr>
 * <td>15</td>
 * <td><b>int size() </b><br>
 * Returns the number of elements in this list.</td>
 * </tr>
 * <tr>
 * <td>16</td>
 * <td><b>Object[] toArray() </b><br>
 * Returns an array containing all of the elements in this list in the correct order. Throws
 * NullPointerException if the specified array is null.</td>
 * </tr>
 * <tr>
 * <td>17</td>
 * <td><b>Object[] toArray(Object[] a) </b><br>
 * Returns an array containing all of the elements in this list in the correct order; the runtime
 * type of the returned array is that of the specified array.</td>
 * </tr>
 * <tr>
 * <td>18</td>
 * <td><b>void trimToSize() </b><br>
 * Trims the capacity of this ArrayList instance to be the list's current size.</td>
 * </tr>
 * </tbody>
 * </table>
 *
 * <h3>The HashSet Class</h3>
 *
 * <p>
 * HashSet extends AbstractSet and implements the Set interface. It creates a collection that uses a
 * hash table for storage.
 * </p>
 * <p>
 * A hash table stores information by using a mechanism called hashing. In hashing, the
 * informational content of a key is used to determine a unique value, called its hash code.
 * </p>
 * <p>
 * The hash code is then used as the index at which the data associated with the key is stored. The
 * transformation of the key into its hash code is performed automatically.
 * </p>
 * <p>
 * The HashSet class supports four constructors. The first form constructs a default hash set:
 * </p>
 *
 * <pre>
 * <span class="typ">HashSet</span><span class="pun">(</span><span class="pln"> </span><span class="pun">)</span>
 * </pre>
 * <p>
 * The following constructor form initializes the hash set by using the elements of c.
 * </p>
 *
 * <pre>
 * <span class="typ">HashSet</span><span class="pun">(</span><span class="typ">Collection</span><span class="pln"> c</span><span class="pun">)</span>
 * </pre>
 * <p>
 * The following constructor form initializes the capacity of the hash set to capacity.
 * </p>
 * <p>
 * The capacity grows automatically as elements are added to the Hash.
 * </p>
 *
 * <pre>
 * <span class="typ">HashSet</span><span class="pun">(</span><span class="kwd">int</span><span class="pln"> capacity</span><span class="pun">)</span>
 * </pre>
 * <p>
 * The fourth form initializes both the capacity and the fill ratio (also called load capacity) of
 * the hash set from its arguments:
 * </p>
 *
 * <pre>
 * <span class="typ">HashSet</span><span class="pun">(</span><span class="kwd">int</span><span class="pln"> capacity</span><span class="pun">,</span><span class="pln"> </span><span class="kwd">float</span><span class="pln"> fillRatio</span><span class="pun">)</span>
 * </pre>
 * <p>
 * Here the fill ratio must be between 0.0 and 1.0, and it determines how full the hash set can be
 * before it is resized upward. Specifically, when the number of elements is greater than the
 * capacity of the hash set multiplied by its fill ratio, the hash set is expanded.
 * </p>
 * <p>
 * Apart from the methods inherited from its parent classes, HashSet defines following methods:
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
 * <td><b>boolean add(Object o) </b><br>
 * Adds the specified element to this set if it is not already present.</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>void clear() </b><br>
 * Removes all of the elements from this set.</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>Object clone() </b><br>
 * Returns a shallow copy of this HashSet instance: the elements themselves are not cloned.</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>boolean contains(Object o)</b><br>
 * Returns true if this set contains the specified element</td>
 * </tr>
 * <tr>
 * <td>5</td>
 * <td><b>boolean isEmpty() </b><br>
 * Returns true if this set contains no elements.</td>
 * </tr>
 * <tr>
 * <td>6</td>
 * <td><b>Iterator iterator() </b><br>
 * Returns an iterator over the elements in this set.</td>
 * </tr>
 * <tr>
 * <td>7</td>
 * <td><b>boolean remove(Object o) </b><br>
 * Removes the specified element from this set if it is present.</td>
 * </tr>
 * <tr>
 * <td>8</td>
 * <td><b>int size() </b><br>
 * Returns the number of elements in this set (its cardinality).</td>
 * </tr>
 * </tbody>
 * </table>
 *
 * <h3>The LinkedHashSet Class</h3>
 *
 * <p>
 * This class extends HashSet, but adds no members of its own.
 * </p>
 * <p>
 * LinkedHashSet maintains a linked list of the entries in the set, in the order in which they were
 * inserted. This allows insertion-order iteration over the set.
 * </p>
 * <p>
 * That is, when cycling through a LinkedHashSet using an iterator, the elements will be returned in
 * the order in which they were inserted.
 * </p>
 * <p>
 * The hash code is then used as the index at which the data associated with the key is stored. The
 * transformation of the key into its hash code is performed automatically.
 * </p>
 * <p>
 * The LinkedHashSet class supports four constructors. The first form constructs a default hash set:
 * </p>
 *
 * <pre>
 * <span class="typ">LinkedHashSet</span><span class="pun">(</span><span class="pln"> </span><span class="pun">)</span>
 * </pre>
 * <p>
 * The following constructor form initializes the hash set by using the elements of c.
 * </p>
 *
 * <pre>
 * <span class="typ">LinkedHashSet</span><span class="pun">(</span><span class="typ">Collection</span><span class="pln"> c</span><span class="pun">)</span>
 * </pre>
 * <p>
 * The following constructor form initializes the capacity of the hash set to capacity.
 * </p>
 * <p>
 * The capacity grows automatically as elements are added to the Hash.
 * </p>
 *
 * <pre>
 * <span class="typ">LinkedHashSet</span><span class="pun">(</span><span class="kwd">int</span><span class="pln"> capacity</span><span class="pun">)</span>
 * </pre>
 * <p>
 * The fourth form initializes both the capacity and the fill ratio (also called load capacity) of
 * the hash set from its arguments:
 * </p>
 *
 * <h3>The TreeSet Class</h3>
 *
 * <p>
 * TreeSet provides an implementation of the Set interface that uses a tree for storage. Objects are
 * stored in sorted, ascending order.
 * </p>
 * <p>
 * Access and retrieval times are quite fast, which makes TreeSet an excellent choice when storing
 * large amounts of sorted information that must be found quickly.
 * </p>
 * <p>
 * The TreeSet class supports four constructors. The first form constructs an empty tree set that
 * will be sorted in ascending order according to the natural order of its elements:
 * </p>
 *
 * <pre>
 * <span class="typ">TreeSet</span><span class="pun">(</span><span class="pln"> </span><span class="pun">)</span>
 * </pre>
 * <p>
 * The second form builds a tree set that contains the elements of c.
 * </p>
 *
 * <pre>
 * <span class="typ">TreeSet</span><span class="pun">(</span><span class="typ">Collection</span><span class="pln"> c</span><span class="pun">)</span>
 * </pre>
 * <p>
 * The third form constructs an empty tree set that will be sorted according to the comparator
 * specified by comp.
 * </p>
 *
 * <pre>
 * <span class="typ">TreeSet</span><span class="pun">(</span><span class="typ">Comparator</span><span class="pln"> comp</span><span class="pun">)</span>
 * </pre>
 * <p>
 * The fourth form builds a tree set that contains the elements of ss:
 * </p>
 *
 * <pre>
 * <span class="typ">TreeSet</span><span class="pun">(</span><span class="typ">SortedSet</span><span class="pln"> ss</span><span class="pun">)</span>
 * </pre>
 * <p>
 * Apart from the methods inherited from its parent classes, TreeSet defines the following methods:
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
 * <td><b>void add(Object o)</b><br>
 * Adds the specified element to this set if it is not already present.</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>boolean addAll(Collection c) </b><br>
 * Adds all of the elements in the specified collection to this set.</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>void clear() </b><br>
 * Removes all of the elements from this set.</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>Object clone()</b><br>
 * Returns a shallow copy of this TreeSet instance.</td>
 * </tr>
 * <tr>
 * <td>5</td>
 * <td><b>Comparator comparator()</b><br>
 * Returns the comparator used to order this sorted set, or null if this tree set uses its elements
 * natural ordering.</td>
 * </tr>
 * <tr>
 * <td>6</td>
 * <td><b>boolean contains(Object o) </b><br>
 * Returns true if this set contains the specified element.</td>
 * </tr>
 * <tr>
 * <td>7</td>
 * <td><b>Object first() </b><br>
 * Returns the first (lowest) element currently in this sorted set.</td>
 * </tr>
 * <tr>
 * <td>8</td>
 * <td><b>SortedSet headSet(Object toElement)</b><br>
 * Returns a view of the portion of this set whose elements are strictly less than toElement.</td>
 * </tr>
 * <tr>
 * <td>9</td>
 * <td><b>boolean isEmpty() </b><br>
 * Returns true if this set contains no elements.</td>
 * </tr>
 * <tr>
 * <td>10</td>
 * <td><b>Iterator iterator() </b><br>
 * Returns an iterator over the elements in this set.</td>
 * </tr>
 * <tr>
 * <td>11</td>
 * <td><b>Object last() </b><br>
 * Returns the last (highest) element currently in this sorted set.</td>
 * </tr>
 * <tr>
 * <td>12</td>
 * <td><b>boolean remove(Object o) </b><br>
 * Removes the specified element from this set if it is present.</td>
 * </tr>
 * <tr>
 * <td>13</td>
 * <td><b>int size() </b><br>
 * Returns the number of elements in this set (its cardinality).</td>
 * </tr>
 * <tr>
 * <td>14</td>
 * <td><b>SortedSet subSet(Object fromElement, Object toElement) </b><br>
 * Returns a view of the portion of this set whose elements range from fromElement, inclusive, to
 * toElement, exclusive.</td>
 * </tr>
 * <tr>
 * <td>15</td>
 * <td><b>SortedSet tailSet(Object fromElement) </b><br>
 * Returns a view of the portion of this set whose elements are greater than or equal to
 * fromElement.</td>
 * </tr>
 * </tbody>
 * </table>
 *
 * <h3>The HashMap Class</h3>
 *
 * <p>
 * The HashMap class uses a hashtable to implement the Map interface. This allows the execution time
 * of basic operations, such as get( ) and put( ), to remain constant even for large sets.
 * </p>
 * <p>
 * The HashMap class supports four constructors. The first form constructs a default hash map:
 * </p>
 *
 * <pre>
 * <span class="typ">HashMap</span><span class="pun">(</span><span class="pln"> </span><span class="pun">)</span>
 * </pre>
 * <p>
 * The second form initializes the hash map by using the elements of m:
 * </p>
 *
 * <pre>
 * <span class="typ">HashMap</span><span class="pun">(</span><span class="typ">Map</span><span class="pln"> m</span><span class="pun">)</span>
 * </pre>
 * <p>
 * The third form initializes the capacity of the hash map to capacity:
 * </p>
 *
 * <pre>
 * <span class="typ">HashMap</span><span class="pun">(</span><span class="kwd">int</span><span class="pln"> capacity</span><span class="pun">)</span>
 * </pre>
 * <p>
 * The fourth form initializes both the capacity and fill ratio of the hash map by using its
 * arguments:
 * </p>
 *
 * <pre>
 * <span class="typ">HashMap</span><span class="pun">(</span><span class="kwd">int</span><span class="pln"> capacity</span><span class="pun">,</span><span class="pln"> </span><span class="kwd">float</span><span class="pln"> fillRatio</span><span class="pun">)</span>
 * </pre>
 * <p>
 * Apart from the methods inherited from its parent classes, HashMap defines the following methods:
 * </p>
 * <table>
 * <tbody>
 * <tr>
 * <th>SN</th>
 * <th>Methods with Description</th>
 * </tr>
 * <tr>
 * <td>1</td>
 * <td><b>void clear() </b><br>
 * Removes all mappings from this map.</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>Object clone() </b><br>
 * Returns a shallow copy of this HashMap instance: the keys and values themselves are not cloned.</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>boolean containsKey(Object key) </b><br>
 * Returns true if this map contains a mapping for the specified key.</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>boolean containsValue(Object value) </b><br>
 * Returns true if this map maps one or more keys to the specified value.</td>
 * </tr>
 * <tr>
 * <td>5</td>
 * <td><b>Set entrySet() </b><br>
 * Returns a collection view of the mappings contained in this map.</td>
 * </tr>
 * <tr>
 * <td>6</td>
 * <td><b>Object get(Object key) </b><br>
 * Returns the value to which the specified key is mapped in this identity hash map, or null if the
 * map contains no mapping for this key.</td>
 * </tr>
 * <tr>
 * <td>7</td>
 * <td><b>boolean isEmpty()</b><br>
 * Returns true if this map contains no key-value mappings.</td>
 * </tr>
 * <tr>
 * <td>8</td>
 * <td><b>Set keySet() </b><br>
 * Returns a set view of the keys contained in this map.</td>
 * </tr>
 * <tr>
 * <td>9</td>
 * <td><b>Object put(Object key, Object value)</b><br>
 * Associates the specified value with the specified key in this map.</td>
 * </tr>
 * <tr>
 * <td>10</td>
 * <td><b>putAll(Map m) </b><br>
 * Copies all of the mappings from the specified map to this map These mappings will replace any
 * mappings that this map had for any of the keys currently in the specified map.</td>
 * </tr>
 * <tr>
 * <td>11</td>
 * <td><b>Object remove(Object key) </b><br>
 * Removes the mapping for this key from this map if present.</td>
 * </tr>
 * <tr>
 * <td>12</td>
 * <td><b>int size() </b><br>
 * Returns the number of key-value mappings in this map.</td>
 * </tr>
 * <tr>
 * <td>13</td>
 * <td><b>Collection values() </b><br>
 * Returns a collection view of the values contained in this map.</td>
 * </tr>
 * </tbody>
 * </table>
 *
 * <h3>The TreeMap Class</h3>
 *
 * <p>
 * The TreeMap class implements the Map interface by using a tree. A TreeMap provides an efficient
 * means of storing key/value pairs in sorted order, and allows rapid retrieval.
 * </p>
 * <p>
 * You should note that, unlike a hash map, a tree map guarantees that its elements will be sorted
 * in ascending key order.
 * </p>
 * <p>
 * The TreeMap class supports four constructors. The first form constructs an empty tree map that
 * will be sorted by using the natural order of its keys:
 * </p>
 *
 * <pre>
 * <span class="typ">TreeMap</span><span class="pun">(</span><span class="pln"> </span><span class="pun">)</span>
 * </pre>
 *
 * <p>
 * The second form constructs an empty tree-based map that will be sorted by using the Comparator
 * comp:
 * </p>
 *
 * <pre>
 * <span class="typ">TreeMap</span><span class="pun">(</span><span class="typ">Comparator</span><span class="pln"> comp</span><span class="pun">)</span>
 * </pre>
 *
 * <p>
 * The third form initializes a tree map with the entries from m, which will be sorted by using the
 * natural order of the keys:
 * </p>
 *
 * <pre>
 * <span class="typ">TreeMap</span><span class="pun">(</span><span class="typ">Map</span><span class="pln"> m</span><span class="pun">)</span>
 * </pre>
 *
 * <p>
 * The fourth form initializes a tree map with the entries from sm, which will be sorted in the same
 * order as sm:
 * </p>
 *
 * <pre>
 * <span class="typ">TreeMap</span><span class="pun">(</span><span class="typ">SortedMap</span><span class="pln"> sm</span><span class="pun">)</span>
 * </pre>
 *
 * <p>
 * Apart from the methods inherited from its parent classes, TreeMap defines following methods:
 * </p>
 * <table>
 * <tbody>
 * <tr>
 * <th>SN</th>
 * <th>Methods with Description</th>
 * </tr>
 * <tr>
 * <td>1</td>
 * <td><b>void clear()</b><br>
 * Removes all mappings from this TreeMap.</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>Object clone()</b><br>
 * Returns a shallow copy of this TreeMap instance.</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>Comparator comparator()</b><br>
 * Returns the comparator used to order this map, or null if this map uses its keys' natural order.</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>boolean containsKey(Object key)</b><br>
 * Returns true if this map contains a mapping for the specified key.</td>
 * </tr>
 * <tr>
 * <td>5</td>
 * <td><b>boolean containsValue(Object value) </b><br>
 * Returns true if this map maps one or more keys to the specified value.</td>
 * </tr>
 * <tr>
 * <td>6</td>
 * <td><b>Set entrySet() </b><br>
 * Returns a set view of the mappings contained in this map.</td>
 * </tr>
 * <tr>
 * <td>7</td>
 * <td><b>Object firstKey() </b><br>
 * Returns the first (lowest) key currently in this sorted map.</td>
 * </tr>
 * <tr>
 * <td>8</td>
 * <td><b>Object get(Object key) </b><br>
 * Returns the value to which this map maps the specified key.</td>
 * </tr>
 * <tr>
 * <td>9</td>
 * <td><b>SortedMap headMap(Object toKey) </b><br>
 * Returns a view of the portion of this map whose keys are strictly less than toKey.</td>
 * </tr>
 * <tr>
 * <td>10</td>
 * <td><b>Set keySet()</b><br>
 * Returns a Set view of the keys contained in this map.</td>
 * </tr>
 * <tr>
 * <td>11</td>
 * <td><b>Object lastKey() </b><br>
 * Returns the last (highest) key currently in this sorted map.</td>
 * </tr>
 * <tr>
 * <td>12</td>
 * <td><b>Object put(Object key, Object value) </b><br>
 * Associates the specified value with the specified key in this map.</td>
 * </tr>
 * <tr>
 * <td>13</td>
 * <td><b>void putAll(Map map) </b><br>
 * Copies all of the mappings from the specified map to this map.</td>
 * </tr>
 * <tr>
 * <td>14</td>
 * <td><b>Object remove(Object key) </b><br>
 * Removes the mapping for this key from this TreeMap if present.</td>
 * </tr>
 * <tr>
 * <td>15</td>
 * <td><b>int size() </b><br>
 * Returns the number of key-value mappings in this map.</td>
 * </tr>
 * <tr>
 * <td>16</td>
 * <td><b>SortedMap subMap(Object fromKey, Object toKey) </b><br>
 * Returns a view of the portion of this map whose keys range from fromKey, inclusive, to toKey,
 * exclusive.</td>
 * </tr>
 * <tr>
 * <td>17</td>
 * <td><b>SortedMap tailMap(Object fromKey) </b><br>
 * Returns a view of the portion of this map whose keys are greater than or equal to fromKey.</td>
 * </tr>
 * <tr>
 * <td>18</td>
 * <td><b>Collection values() </b><br>
 * Returns a collection view of the values contained in this map.</td>
 * </tr>
 * </tbody>
 * </table>
 */
package tutorialspoint.collections;