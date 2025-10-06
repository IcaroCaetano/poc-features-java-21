import java.util.concurrent.*;

/**
 * Demonstrates the use of <b>Scoped Values</b>, a feature introduced in Java 21 (JEP 446).
 * <p>
 * Scoped Values provide an immutable, thread-safe way to share data across methods and threads
 * without relying on mutable thread-local variables. They are particularly useful when working
 * with <b>virtual threads</b> introduced in Java 21, allowing efficient data propagation
 * in concurrent tasks.
 * </p>
 *
 * <h2>Example</h2>
 * <pre>{@code
 * ScopedValues.runExample();
 * // Output: Scoped value: user-21
 * }</pre>
 *
 * <p>
 * This example defines a scoped value {@code USER}, assigns it the value {@code "user-21"},
 * and runs a virtual-threaded task that accesses it within the same scoped context.
 * </p>
 *
 * <h2>Key Concepts</h2>
 * <ul>
 *   <li>Scoped values are immutable within their scope.</li>
 *   <li>They replace some use cases of {@link ThreadLocal} with better performance and clarity.</li>
 *   <li>They are ideal for structured concurrency and lightweight task isolation.</li>
 * </ul>
 *
 * @author Icaro
 * @version 1.0
 * @since Java 21
 * @see java.lang.ScopedValue
 * @see java.util.concurrent.Executors#newVirtualThreadPerTaskExecutor()
 */
public class ScopedValues {
    private static final ScopedValue<String> USER = ScopedValue.newInstance();

    public static void run() {
        ScopedValue.where(USER, "user-21").run(() -> {
            try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
                executor.submit(() -> {
                    System.out.println("Scoped value: " + USER.get());
                }).get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
