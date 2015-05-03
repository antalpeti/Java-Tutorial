/**
 * Contains some examples about Thread Deadlock topic.
 *
 * <p>
 * Deadlock describes a situation where two or more threads are blocked forever, waiting for each
 * other. Deadlock occurs when multiple threads need the same locks but obtain them in different
 * order. A Java multithreaded program may suffer from the deadlock condition because the
 * <b>synchronized</b> keyword causes the executing thread to block while waiting for the lock, or
 * monitor, associated with the specified object.
 * </p>
 */
package com.tutorialspoint.multithreading.threaddeadlock;