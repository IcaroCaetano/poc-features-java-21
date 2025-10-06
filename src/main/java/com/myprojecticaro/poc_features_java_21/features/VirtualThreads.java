package com.myprojecticaro.poc_features_java_21.features;

import java.util.concurrent.*;

/**
 * Demonstrates the use of <b>Virtual Threads</b>, a key feature introduced in Java 21 (JEP 444).
 * <p>
 * Virtual Threads are lightweight threads designed to dramatically improve the scalability
 * of concurrent applications by reducing the cost of thread creation and blocking operations.
 * They allow developers to write high-throughput, concurrent code using the same simple,
 * imperative style as traditional threads.
 * </p>
 *
 * <h2>Example</h2>
 * <pre>{@code
 * VirtualThreads.runExample();
 * // Output (thread names may vary):
 * // Running task 0 on VirtualThread[#23]/runnable@ForkJoinPool-1-worker-1
 * // Running task 1 on VirtualThread[#24]/runnable@ForkJoinPool-1-worker-1
 * // ...
 * }</pre>
 *
 * <h2>Key Concepts</h2>
 * <ul>
 *   <li><b>Virtual Threads</b> – Threads managed by the Java runtime, not tied one-to-one to OS threads.</li>
 *   <li><b>Lightweight Concurrency</b> – Each virtual thread has a very small memory footprint, allowing
 *       thousands or even millions of concurrent tasks.</li>
 *   <li><b>ExecutorService Integration</b> – Virtual threads integrate seamlessly with the {@link java.util.concurrent.ExecutorService} API.</li>
 *   <li><b>Structured Concurrency</b> – Pairs well with {@code StructuredTaskScope} for more readable concurrent code.</li>
 * </ul>
 *
 * <h2>Usage</h2>
 * <p>
 * The example creates a {@link java.util.concurrent.ExecutorService} using
 * {@link Executors#newVirtualThreadPerTaskExecutor()}, which schedules each submitted task
 * on its own virtual thread. Each task simulates work with {@code Thread.sleep()} to demonstrate
 * non-blocking behavior and lightweight execution.
 * </p>
 *
 * <p><b>Note:</b> Virtual threads are a stable feature starting in Java 21 and do not require
 * {@code --enable-preview}.</p>
 *
 * @author Icaro
 * @version 1.0
 * @since Java 21
 * @see java.lang.Thread
 * @see java.util.concurrent.Executors#newVirtualThreadPerTaskExecutor()
 * @see <a href="https://openjdk.org/jeps/444">JEP 444: Virtual Threads</a>
 */
public class VirtualThreads {
    public static void runExample() {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 5; i++) {
                int task = i;
                executor.submit(() -> {
                    Thread.sleep(1000);
                    System.out.println("Running task " + task + " on " + Thread.currentThread());
                    return task;
                });
            }
        }
    }
}
