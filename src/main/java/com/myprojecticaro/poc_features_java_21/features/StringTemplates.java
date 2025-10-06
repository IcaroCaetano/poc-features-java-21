package com.myprojecticaro.poc_features_java_21.features;

/**
 * Demonstrates the use of <b>String Templates</b>, a preview feature introduced in Java 21 (JEP 430).
 * <p>
 * String Templates simplify string interpolation by allowing expressions to be directly embedded
 * inside string literals using the {@code STR} processor. This improves readability and reduces
 * the need for manual concatenation or {@link String#format(String, Object...)} calls.
 * </p>
 *
 * <h2>Example</h2>
 * <pre>{@code
 * StringTemplates.run();
 * // Output:
 * // The sum of 5 and 10 is 15
 * }</pre>
 *
 * <h2>Key Concepts</h2>
 * <ul>
 *   <li><b>STR Processor</b> – A built-in string template processor that evaluates expressions inside braces {@code \{}}.</li>
 *   <li><b>Template Expressions</b> – Allow embedding Java expressions directly into strings.</li>
 *   <li><b>Preview Feature</b> – Available as a preview in Java 21; must be enabled with {@code --enable-preview} at compile and runtime.</li>
 * </ul>
 *
 * <p>
 * This example demonstrates how string templates enhance expressiveness and eliminate boilerplate
 * when building dynamic strings in Java.
 * </p>
 *
 * @author Icaro
 * @version 1.0
 * @since Java 21 (Preview)
 * @see <a href="https://openjdk.org/jeps/430">JEP 430: String Templates (Preview)</a>
 */
public class StringTemplates {
    public static void run() {
        int a = 5, b = 10;
        String result = STR."The sum of \{a} and \{b} is \{a + b}";
        System.out.println(result);
    }
}
