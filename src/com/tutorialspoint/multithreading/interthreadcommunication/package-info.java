/**
 * Contains some examples about Interthread Communication topic.
 *
 * <head> <link rel="stylesheet" type="text/css" href="../../../../../files/mystyle.css"></head>
 * <p>
 * Inter thread communication is important when you develop an application where two or more threads
 * exchange some information.
 * </p>
 *
 * <p>
 * There are simply three methods and a little trick which makes thread communication possible.
 * First let's see all the three methods listed below:
 * </p>
 * <table>
 * <tbody>
 * <tr>
 * <th>SN</th>
 * <th>Methods with Description</th>
 * </tr>
 * <tr>
 * <td>1</td>
 * <td><b>public void wait()</b>
 * <p>
 * Causes the current thread to wait until another thread invokes the notify().
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>public void notify()</b>
 * <p>
 * Wakes up a single thread that is waiting on this object's monitor.
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>public void notifyAll()</b>
 * <p>
 * Wakes up all the threads that called wait( ) on the same object.
 * </p>
 * </td>
 * </tr>
 * </tbody>
 * </table>
 * <p>
 * These methods have been implemented as <b>final</b> methods in Object, so they are available in
 * all the classes. All three methods can be called only from within a <b>synchronized</b> context.
 * </p>
 */
package com.tutorialspoint.multithreading.interthreadcommunication;