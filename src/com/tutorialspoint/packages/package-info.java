/**
 * Contains some examples about Packages topic.
 *
 * <p>
 * Packages are used in Java in order to prevent naming conflicts, to control access, to make
 * searching/locating and usage of classes, interfaces, enumerations and annotations easier, etc.
 * </p>
 *
 * <p>
 * A Package can be defined as a grouping of related types(classes, interfaces, enumerations and
 * annotations ) providing access protection and name space management.
 * </p>
 *
 * <p>
 * Some of the existing packages in Java are::
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>java.lang</b> - bundles the fundamental classes
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>java.io</b> - classes for input , output functions are bundled in this package
 * </p>
 * </li>
 * </ul>
 *
 * <p>
 * Programmers can define their own packages to bundle group of classes/interfaces, etc. It is a
 * good practice to group related classes implemented by you so that a programmer can easily
 * determine that the classes, interfaces, enumerations, annotations are related.
 * </p>
 *
 * <p>
 * Since the package creates a new namespace there won't be any name conflicts with names in other
 * packages. Using packages, it is easier to provide access control and it is also easier to locate
 * the related classes.
 * </p>
 *
 * <h2>Creating a package:</h2>
 *
 * <p>
 * When creating a package, you should choose a name for the package and put a <b>package</b>
 * statement with that name at the top of every source file that contains the classes, interfaces,
 * enumerations, and annotation types that you want to include in the package.
 * </p>
 *
 * <p>
 * The <b>package</b> statement should be the first line in the source file. There can be only one
 * package statement in each source file, and it applies to all types in the file.
 * </p>
 *
 * <p>
 * If a package statement is not used then the class, interfaces, enumerations, and annotation types
 * will be put into an unnamed package.
 * </p>
 *
 * <h2>The import Keyword:</h2>
 *
 * <p>
 * If a class wants to use another class in the same package, the package name does not need to be
 * used. Classes in the same package find each other without any special syntax.
 * </p>
 *
 * <p>
 * What happens if the Boss class is not in the payroll package? The Boss class must then use one of
 * the following techniques for referring to a class in a different package.
 * </p>
 *
 * <ul>
 * <li>
 * <p>
 * The fully qualified name of the class can be used. For example: <code>payroll.Employee</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * The package can be imported using the import keyword and the wild card (*). For example:
 * <code>import payroll.*;</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * The class itself can be imported using the import keyword. For example:
 * <code>import payroll.Employee;</code>
 * </p>
 * </li>
 * </ul>
 *
 * <p>
 * <b>Note:</b> A class file can contain any number of import statements. The import statements must
 * appear after the package statement and before the class declaration.
 * </p>
 *
 * <h2>The Directory Structure of Packages:</h2>
 *
 * <p>
 * Two major results occur when a class is placed in a package:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The name of the package becomes a part of the name of the class, as we just discussed in the
 * previous section.
 * </p>
 * </li>
 * <li>
 * <p>
 * The name of the package must match the directory structure where the corresponding bytecode
 * resides.
 * </p>
 * </li>
 * </ul>
 *
 * <p>
 * Here is simple way of managing your files in Java:
 * </p>
 *
 * <p>
 * Put the source code for a class, interface, enumeration, or annotation type in a text file whose
 * name is the simple name of the type and whose extension is <b>.java</b>. For example:
 * </p>
 *
 * <pre>
 * <code>// File Name : Car.java
 * package vehicle;
 * 
 * public class Car {
 *   // Class implementation.
 * }</code>
 * </pre>
 *
 * <p>
 * Now, put the source file in a directory whose name reflects the name of the package to which the
 * class belongs:
 * </p>
 *
 * <pre>
 * ....\vehicle\Car.java
 * </pre>
 *
 * <p>
 * Now, the qualified class name and pathname would be as below:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Class name -&gt; vehicle.Car
 * </p>
 * </li>
 * <li>
 * <p>
 * Path name -&gt; vehicle\Car.java (in windows)
 * </p>
 * </li>
 * </ul>
 *
 * <p>
 * In general, a company uses its reversed Internet domain name for its package names. Example: A
 * company's Internet domain name is apple.com, then all its package names would start with
 * com.apple. Each component of the package name corresponds to a subdirectory.
 * </p>
 *
 * <p>
 * Example: The company had a com.apple.computers package that contained a Dell.java source file, it
 * would be contained in a series of subdirectories like this:
 * </p>
 *
 * <pre>
 * ....\com\apple\computers\Dell.java
 * </pre>
 *
 * <p>
 * At the time of compilation, the compiler creates a different output file for each class,
 * interface and enumeration defined in it. The base name of the output file is the name of the
 * type, and its extension is <b> .class</b>
 * </p>
 *
 * <p>
 * Like the .java source files, the compiled .class files should be in a series of directories that
 * reflect the package name. However, the path to the .class files does not have to be the same as
 * the path to the .java source files. You can arrange your source and class directories separately,
 * as:
 * </p>
 *
 * <pre>
 * <path-one>\sources\com\apple\computers\Dell.java
 * <path-two>\classes\com\apple\computers\Dell.class
 * </pre>
 *
 * <p>
 * By doing this, it is possible to give the classes directory to other programmers without
 * revealing your sources. You also need to manage source and class files in this manner so that the
 * compiler and the Java Virtual Machine (JVM) can find all the types your program uses.
 * </p>
 *
 * <p>
 * The full path to the classes directory, &lt;path-two&gt;\classes, is called the class path, and
 * is set with the CLASSPATH system variable. Both the compiler and the JVM construct the path to
 * your .class files by adding the package name to the class path.
 * </p>
 *
 * <p>
 * Say &lt;path-two&gt;\classes is the class path, and the package name is com.apple.computers, then
 * the compiler and JVM will look for .class files in &lt;path-two&gt;\classes\com\apple\compters.
 * </p>
 *
 * <p>
 * A class path may include several paths. Multiple paths should be separated by a semicolon
 * (Windows) or colon (Unix). By default, the compiler and the JVM search the current directory and
 * the JAR file containing the Java platform classes so that these directories are automatically in
 * the class path.
 * </p>
 *
 * <h2>Set CLASSPATH System Variable:</h2>
 *
 * <p>
 * To display the current CLASSPATH variable, use the following commands in Windows and UNIX (Bourne
 * shell):
 * </p>
 * <ul>
 * <li>
 * <p>
 * In Windows -&gt; C:\&gt; <code>set CLASSPATH</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * In UNIX -&gt; <code>% echo $CLASSPATH</code>
 * </p>
 * </li>
 * </ul>
 *
 * <p>
 * To delete the current contents of the CLASSPATH variable, use :
 * </p>
 *
 * <ul>
 * <li>
 * <p>
 * In Windows -&gt; C:\&gt; <code>set CLASSPATH=</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * In UNIX -&gt; <code>% unset CLASSPATH; export CLASSPATH</code>
 * </p>
 * </li>
 * </ul>
 *
 * <p>
 * To set the CLASSPATH variable:
 * </p>
 *
 * <ul>
 * <li>
 * <p>
 * In Windows -&gt; <code>set CLASSPATH=C:\<code>users</code>\jack\java\classes</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * In UNIX -&gt; % <code>CLASSPATH=/home/jack/java/classes; export CLASSPATH</code>
 * </p>
 * </li>
 * </ul>
 */
package com.tutorialspoint.packages;