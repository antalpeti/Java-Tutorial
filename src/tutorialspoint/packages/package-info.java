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
 * <ul class="list">
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
 */
package tutorialspoint.packages;