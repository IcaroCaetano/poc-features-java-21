package com.myprojecticaro.poc_features_java_21.features;

import java.util.*;

/**
 * Demonstrates the use of <b>Sequenced Collections</b>, a feature introduced in Java 21 (JEP 431).
 * <p>
 * Sequenced Collections provide a unified API for working with collections that have a defined encounter order,
 * such as {@link List}, {@link Set}, and {@link Map}. This feature introduces new default methods that simplify
 * operations like retrieving the first or last element and iterating in reverse order.
 * </p>
 *
 * <h2>Example</h2>
 * <pre>{@code
 * SequencedCollections.run();
 * // Output:
 * // First: A
 * // Last: C
 * // Reversed: [C, B, A]
 * }</pre>
 *
 * <h2>Key Concepts</h2>
 * <ul>
 *   <li><b>getFirst()</b> – Returns the first element in the collection.</li>
 *   <li><b>getLast()</b> – Returns the last element in the collection.</li>
 *   <li><b>reversed()</b> – Returns a reversed view of the collection.</li>
 * </ul>
 *
 * <p>
 * This example shows how these new methods simplify operations that previously required manual indexing or iteration.
 * </p>
 *
 * @author Icaro
 * @version 1.0
 * @since Java 21
 * @see java.util.List
 * @see java.util.Set
 * @see java.util.Map
 * @see <a href="https://openjdk.org/jeps/431">JEP 431: Sequenced Collections</a>
 */
public class SequencedCollections {

        /**
     * Runs an example demonstrating the new sequenced collection methods introduced in Java 21.
     * <p>
     * The method creates a {@link List} with elements "A", "B", and "C", and demonstrates:
     * <ul>
     *   <li>Accessing the first and last elements directly using {@code getFirst()} and {@code getLast()}.</li>
     *   <li>Obtaining a reversed view of the list using {@code reversed()}.</li>
     * </ul>
     * </p>
     */
    public static void run() {
        List<String> list = new ArrayList<>(List.of("A", "B", "C"));

        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("Reversed: " + list.reversed());
    }
}
