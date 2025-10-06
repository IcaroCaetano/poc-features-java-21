package com.myprojecticaro.poc_features_java_21.features;

/**
 * Demonstrates the use of <b>Record Patterns</b>, a feature introduced in Java 21 (JEP 440).
 * <p>
 * Record patterns allow developers to deconstruct record values directly in pattern matching,
 * making it easier and more concise to extract fields from records without explicit getter calls.
 * </p>
 *
 * <h2>Example</h2>
 * <pre>{@code
 * RecordPatterns.runExample(new Point(5, 10));
 * // Output: Point with x=5, y=10
 * }</pre>
 *
 * <p>
 * This example checks if the given object is an instance of {@code Point} and, if so,
 * destructures it directly in the {@code instanceof} pattern to access its components.
 * </p>
 *
 * @author Icaro
 * @version 1.0
 * @since Java 21
 */
public class RecordPatterns {

     /**
     * A simple record representing a two-dimensional point with {@code x} and {@code y} coordinates.
     */
    record Point(int x, int y) {}

    /**
     * Runs an example demonstrating record pattern matching.
     * <p>
     * If the provided {@code obj} is an instance of {@link Point}, it will destructure it
     * into its components ({@code x} and {@code y}) and print their values.
     * </p>
     *
     * @param obj the object to test for record pattern matching
     */
    public static void runExample(Object obj) {
        if (obj instanceof Point(int x, int y)) {
            System.out.println("Point with x=" + x + ", y=" + y);
        }
    }
}
