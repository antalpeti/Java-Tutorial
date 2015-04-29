/**
 * Contains some examples about Multithreading topic.
 *
 * <head> <link rel="stylesheet" type="text/css" href="../../../files/mystyle.css"></head>
 * <p>
 * Java is a<i>multithreaded programming language</i> which means we can develop multithreaded
 * program using Java. A multithreaded program contains two or more parts that can run concurrently
 * and each part can handle different task at the same time making optimal use of the available
 * resources specially when your computer has multiple CPUs.
 * </p>
 * <p>
 * By definition multitasking is when multiple processes share common processing resources such as a
 * CPU. Multithreading extends the idea of multitasking into applications where you can subdivide
 * specific operations within a single application into individual threads. Each of the threads can
 * run in parallel. The OS divides processing time not only among different applications, but also
 * among each thread within an application.
 * </p>
 * <p>
 * Multithreading enables you to write in a way where multiple activities can proceed concurrently
 * in the same program.
 * </p>
 *
 * <h2>Life Cycle of a Thread:</h2>
 * <p>
 * A thread goes through various stages in its life cycle. For example, a thread is born, started,
 * runs, and then dies. Following diagram shows complete life cycle of a thread.
 * </p>
 *
 * <img src="java_thread.jpg" alt="Java Thread" width="100%"> </center>
 * <p>
 * Above-mentioned stages are explained here:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>New:</b> A new thread begins its life cycle in the new state. It remains in this state until
 * the program starts the thread. It is also referred to as a born thread.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Runnable:</b> After a newly born thread is started, the thread becomes runnable. A thread in
 * this state is considered to be executing its task.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Waiting:</b> Sometimes, a thread transitions to the waiting state while the thread waits for
 * another thread to perform a task.A thread transitions back to the runnable state only when
 * another thread signals the waiting thread to continue executing.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Timed waiting:</b> A runnable thread can enter the timed waiting state for a specified
 * interval of time. A thread in this state transitions back to the runnable state when that time
 * interval expires or when the event it is waiting for occurs.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Terminated: </b> A runnable thread enters the terminated state when it completes its task or
 * otherwise terminates.
 * </p>
 * </li>
 * </ul>
 *
 * <h2>Thread Priorities:</h2>
 * <p>
 * Every Java thread has a priority that helps the operating system determine the order in which
 * threads are scheduled.
 * </p>
 * <p>
 * Java thread priorities are in the range between MIN_PRIORITY (a constant of 1) and MAX_PRIORITY
 * (a constant of 10). By default, every thread is given priority NORM_PRIORITY (a constant of 5).
 * </p>
 * <p>
 * Threads with higher priority are more important to a program and should be allocated processor
 * time before lower-priority threads. However, thread priorities cannot guarantee the order in
 * which threads execute and very much platform dependentant.
 * </p>
 *
 * <h2>Create Thread by Implementing Runnable Interface:</h2>
 * <p>
 * If your class is intended to be executed as a thread then you can achieve this by implementing
 * <b>Runnable</b> interface. You will need to follow three basic steps:
 * </p>
 *
 * <h3>Step 1:</h3>
 * <p>
 * As a first step you need to implement a run() method provided by <b>Runnable</b> interface. This
 * method provides entry point for the thread and you will put you complete business logic inside
 * this method. Following is simple syntax of run() method:
 * </p>
 *
 * <pre>
 * <span class="kwd">public</span><span class="pln"> </span><span class="kwd">void</span><span class="pln"> run</span><span class="pun">(</span><span class="pln"> </span><span class="pun">)</span>
 * </pre>
 *
 * <h3>Step 2:</h3>
 * <p>
 * At second step you will instantiate a <b>Thread</b> object using the following constructor:
 * </p>
 *
 * <pre>
 * <span class="typ">Thread</span><span class="pun">(</span><span class="typ">Runnable</span><span class="pln"> threadObj</span><span class="pun">,</span><span class="pln"> </span><span class="typ">String</span><span class="pln"> threadName</span><span class="pun">);</span>
 * </pre>
 * <p>
 * Where, <i>threadObj</i> is an instance of a class that implements the <b>Runnable</b> interface
 * and <b>threadName</b> is the name given to the new thread.
 * </p>
 * <h3>Step 3</h3>
 * <p>
 * Once Thread object is created, you can start it by calling <b>start( )</b> method, which executes
 * a call to run( ) method. Following is simple syntax of start() method:
 * </p>
 */
package tutorialspoint.multithreading;