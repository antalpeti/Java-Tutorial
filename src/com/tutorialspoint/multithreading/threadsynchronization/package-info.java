/**
 * Contains some examples about Thread Synchronization topic.
 *
 * <head> <link rel="stylesheet" type="text/css" href="../../../../../files/mystyle.css"></head>
 *
 * <p>
 * When we start two or more threads within a program, there may be a situation when multiple
 * threads try to access the same resource and finally they can produce unforeseen result due to
 * concurrency issue. For example if multiple threads try to write within a same file then they may
 * corrupt the data because one of the threads can overwrite data or while one thread is opening the
 * same file at the same time another thread might be closing the same file.
 * </p>
 * <p>
 * So there is a need to synchronize the action of multiple threads and make sure that only one
 * thread can access the resource at a given point in time. This is implemented using a concept
 * called <b>monitors</b>. Each object in Java is associated with a monitor, which a thread can lock
 * or unlock. Only one thread at a time may hold a lock on a monitor.
 * </p>
 * <p>
 * Java programming language provides a very handy way of creating threads and synchronizing their
 * task by using <b>synchronized</b> blocks. You keep shared resources within this block. Following
 * is the general form of the synchronized statement:
 * </p>
 *
 * <pre>
 * <span class="kwd">synchronized</span><span class="pun">(</span><span class="pln">objectidentifier</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
 *    </span><span class="com">// Access shared variables and other shared resources</span><span class="pln">
 * </span><span class="pun">}</span>
 * </pre>
 * <p>
 * Here, the <b>objectidentifier</b> is a reference to an object whose lock associates with the
 * monitor that the synchronized statement represents.
 * </p>
 */
package com.tutorialspoint.multithreading.threadsynchronization;