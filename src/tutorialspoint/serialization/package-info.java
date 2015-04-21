/**
 * Contains some examples about Serialization topic.
 *
 * <p>
 * Java provides a mechanism, called object serialization where an object can be represented as a
 * sequence of bytes that includes the object's data as well as information about the object's type
 * and the types of data stored in the object.
 * </p>
 * <p>
 * After a serialized object has been written into a file, it can be read from the file and
 * deserialized that is, the type information and bytes that represent the object and its data can
 * be used to recreate the object in memory.
 * </p>
 * <p>
 * Most impressive is that the entire process is JVM independent, meaning an object can be
 * serialized on one platform and deserialized on an entirely different platform.
 * </p>
 * <p>
 * Classes <b>ObjectInputStream</b> and <b>ObjectOutputStream</b> are high-level streams that
 * contain the methods for serializing and deserializing an object.
 * </p>
 * <p>
 * The ObjectOutputStream class contains many write methods for writing various data types, but one
 * method in particular stands out:
 * </p>
 *
 * <head> <link rel="stylesheet" type="text/css" href="../../../files/mystyle.css"></head>
 *
 * <pre>
 * <span class="kwd">public</span><span class="pln"> </span><span class="kwd">final</span><span class="pln"> </span><span class="kwd">void</span><span class="pln"> writeObject</span><span class="pun">(</span><span class="typ">Object</span><span class="pln"> x</span><span class="pun">)</span><span class="pln"> </span><span class="kwd">throws</span><span class="pln"> </span><span class="typ">IOException</span>
 * </pre>
 * <p>
 * The above method serializes an Object and sends it to the output stream. Similarly, the
 * ObjectInputStream class contains the following method for deserializing an object:
 * </p>
 *
 * <pre>
 * <span class="kwd">public</span><span class="pln"> </span><span class="kwd">final</span><span class="pln"> </span><span class="typ">Object</span><span class="pln"> readObject</span><span class="pun">()</span><span class="pln"> </span><span class="kwd">throws</span><span class="pln"> </span><span class="typ">IOException</span><span class="pun">,</span><span class="pln">
 *                                  </span><span class="typ">ClassNotFoundException</span>
 * </pre>
 * <p>
 * This method retrieves the next Object out of the stream and deserializes it. The return value is
 * Object, so you will need to cast it to its appropriate data type.
 * </p>
 *
 * <p>
 * A class to be serialized successfully, two conditions must be met:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The class must implement the java.io.Serializable interface.
 * </p>
 * </li>
 * <li>
 * <p>
 * All of the fields in the class must be serializable. If a field is not serializable, it must be
 * marked transient.
 * </p>
 * </li>
 * </ul>
 * <p>
 * If you are curious to know if a Java Standard Class is serializable or not, check the
 * documentation for the class. The test is simple: If the class implements java.io.Serializable,
 * then it is serializable; otherwise, it's not.
 * </p>
 */
package tutorialspoint.serialization;