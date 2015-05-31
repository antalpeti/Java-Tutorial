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
 *
 * <h2>Invoking an Applet:</h2>
 *
 * <p>
 * An applet may be invoked by embedding directives in an HTML file and viewing the file through an
 * applet viewer or Java-enabled browser.
 * </p>
 * <p>
 * The &lt;applet&gt; tag is the basis for embedding an applet in an HTML file.
 * </p>
 * <p>
 * The code attribute of the &lt;applet&gt; tag is required. It specifies the Applet class to run.
 * Width and height are also required to specify the initial size of the panel in which an applet
 * runs. The applet directive must be closed with a &lt;/applet&gt; tag.
 * </p>
 * <p>
 * If an applet takes parameters, values may be passed for the parameters by adding &lt;param&gt;
 * tags between &lt;applet&gt; and &lt;/applet&gt;. The browser ignores text and other tags between
 * the applet tags.
 * </p>
 * <p>
 * Non-Java-enabled browsers do not process &lt;applet&gt; and &lt;/applet&gt;. Therefore, anything
 * that appears between the tags, not related to the applet, is visible in non-Java-enabled
 * browsers.
 * </p>
 * <p>
 * The viewer or browser looks for the compiled Java code at the location of the document. To
 * specify otherwise, use the codebase attribute of the &lt;applet&gt; tag.
 * </p>
 * <p>
 * If an applet resides in a package other than the default, the holding package must be specified
 * in the code attribute using the period character (.) to separate package/class components.
 * </p>
 *
 * <h2>Application Conversion to Applets:</h2>
 * <p>
 * It is easy to convert a graphical Java application (that is, an application that uses the AWT and
 * that you can start with the java program launcher) into an applet that you can embed in a web
 * page.
 * </p>
 * <p>
 * Here are the specific steps for converting an application to an applet.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Make an HTML page with the appropriate tag to load the applet code.
 * </p>
 * </li>
 * <li>
 * <p>
 * Supply a subclass of the JApplet class. Make this class public. Otherwise, the applet cannot be
 * loaded.
 * </p>
 * </li>
 * <li>
 * <p>
 * Eliminate the main method in the application. Do not construct a frame window for the
 * application. Your application will be displayed inside the browser.
 * </p>
 * </li>
 * <li>
 * <p>
 * Move any initialization code from the frame window constructor to the init method of the applet.
 * You don't need to explicitly construct the applet object.the browser instantiates it for you and
 * calls the init method.
 * </p>
 * </li>
 * <li>
 * <p>
 * Remove the call to setSize; for applets, sizing is done with the width and height parameters in
 * the HTML file.
 * </p>
 * </li>
 * <li>
 * <p>
 * Remove the call to setDefaultCloseOperation. An applet cannot be closed; it terminates when the
 * browser exits.
 * </p>
 * </li>
 * <li>
 * <p>
 * If the application calls setTitle, eliminate the call to the method. Applets cannot have title
 * bars. (You can, of course, title the web page itself, using the HTML title tag.)
 * </p>
 * </li>
 * <li>
 * <p>
 * Don't call setVisible(true). The applet is displayed automatically.
 * </p>
 * </li>
 * </ul>
 */
package com.tutorialspoint.appletbasics;