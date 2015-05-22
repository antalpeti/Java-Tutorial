/**
 * Contains some examples about Applet Basics topic.
 *
 * <p>
 * An applet is a Java program that runs in a Web browser. An applet can be a fully functional Java
 * application because it has the entire Java API at its disposal.
 * </p>
 * <p>
 * There are some important differences between an applet and a standalone Java application,
 * including the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * An applet is a Java class that extends the java.applet.Applet class.
 * </p>
 * </li>
 * <li>
 * <p>
 * A main() method is not invoked on an applet, and an applet class will not define main().
 * </p>
 * </li>
 * <li>
 * <p>
 * Applets are designed to be embedded within an HTML page.
 * </p>
 * </li>
 * <li>
 * <p>
 * When a user views an HTML page that contains an applet, the code for the applet is downloaded to
 * the user's machine.
 * </p>
 * </li>
 * <li>
 * <p>
 * A JVM is required to view an applet. The JVM can be either a plug-in of the Web browser or a
 * separate runtime environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * The JVM on the user's machine creates an instance of the applet class and invokes various methods
 * during the applet's lifetime.
 * </p>
 * </li>
 * <li>
 * <p>
 * Applets have strict security rules that are enforced by the Web browser. The security of an
 * applet is often referred to as sandbox security, comparing the applet to a child playing in a
 * sandbox with various rules that must be followed.
 * </p>
 * </li>
 * <li>
 * <p>
 * Other classes that the applet needs can be downloaded in a single Java Archive (JAR) file.
 * </p>
 * </li>
 * </ul>
 *
 * <h2>Life Cycle of an Applet:</h2>
 * <p>
 * Four methods in the Applet class give you the framework on which you build any serious applet:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>init:</b> This method is intended for whatever initialization is needed for your applet. It is
 * called after the param tags inside the applet tag have been processed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>start:</b> This method is automatically called after the browser calls the init method. It is
 * also called whenever the user returns to the page containing the applet after having gone off to
 * other pages.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>stop:</b> This method is automatically called when the user moves off the page on which the
 * applet sits. It can, therefore, be called repeatedly in the same applet.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>destroy:</b> This method is only called when the browser shuts down normally. Because applets
 * are meant to live on an HTML page, you should not normally leave resources behind after a user
 * leaves the page that contains the applet.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>paint:</b> Invoked immediately after the start() method, and also any time the applet needs to
 * repaint itself in the browser. The paint() method is actually inherited from the java.awt.
 * </p>
 * </li>
 * </ul>
 *
 * <h2>The Applet CLASS:</h2>
 * <p>
 * Every applet is an extension of the <i>java.applet.Applet class</i>. The base Applet class
 * provides methods that a derived Applet class may call to obtain information and services from the
 * browser context.
 * </p>
 * <p>
 * These include methods that do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Get applet parameters
 * </p>
 * </li>
 * <li>
 * <p>
 * Get the network location of the HTML file that contains the applet
 * </p>
 * </li>
 * <li>
 * <p>
 * Get the network location of the applet class directory
 * </p>
 * </li>
 * <li>
 * <p>
 * Print a status message in the browser
 * </p>
 * </li>
 * <li>
 * <p>
 * Fetch an image
 * </p>
 * </li>
 * <li>
 * <p>
 * Fetch an audio clip
 * </p>
 * </li>
 * <li>
 * <p>
 * Play an audio clip
 * </p>
 * </li>
 * <li>
 * <p>
 * Resize the applet
 * </p>
 * </li>
 * </ul>
 * <p>
 * Additionally, the Applet class provides an interface by which the viewer or browser obtains
 * information about the applet and controls the applet's execution. The viewer may:
 * </p>
 * <ul>
 * <li>
 * <p>
 * request information about the author, version and copyright of the applet
 * </p>
 * </li>
 * <li>
 * <p>
 * request a description of the parameters the applet recognizes
 * </p>
 * </li>
 * <li>
 * <p>
 * initialize the applet
 * </p>
 * </li>
 * <li>
 * <p>
 * destroy the applet
 * </p>
 * </li>
 * <li>
 * <p>
 * start the applet's execution
 * </p>
 * </li>
 * <li>
 * <p>
 * stop the applet's execution
 * </p>
 * </li>
 * </ul>
 * <p>
 * The Applet class provides default implementations of each of these methods. Those implementations
 * may be overridden as necessary.
 * </p>
 */
package com.tutorialspoint.appletbasics;