/**
 * Contains some examples about Thread Control topic.
 *
 * <head> <link rel="stylesheet" type="text/css" href="../../../../../files/mystyle.css"></head>
 * <p>
 * Core Java provides a complete control over multithreaded program. You can develop a multithreaded
 * program which can be suspended, resumed or stopped completely based on your requirements. There
 * are various static methods which you can use on thread objects to control their behavior.
 * Following table lists down those methods:
 * </p>
 * <table>
 * <tbody>
 * <tr>
 * <th>SN</th>
 * <th>Methods with Description</th>
 * </tr>
 * <tr>
 * <td>1</td>
 * <td><b>public void suspend()</b>
 * <p>
 * This method puts a thread in suspended state and can be resumed using resume() method.
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>public void stop()</b>
 * <p>
 * This method stops a thread completely.
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>public void resume()</b>
 * <p>
 * This method resumes a thread which was suspended using suspend() method.
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>public void wait()</b>
 * <p>
 * Causes the current thread to wait until another thread invokes the notify().
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>5</td>
 * <td><b>public void notify()</b>
 * <p>
 * Wakes up a single thread that is waiting on this object's monitor.
 * </p>
 * </td>
 * </tr>
 * </tbody>
 * </table>
 *
 * <blockquote>Be aware that latest versions of Java has deprecated the usage of suspend( ), resume(
 * ), and stop( ) methods and so you need to use available alternatives.</blockquote>
 */
package com.tutorialspoint.multithreading.threadcontrol;