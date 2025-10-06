package com.myprojecticaro.poc_features_java_21.features;

/**
* Demonstrates the use of <b>Pattern Matching for switch</b> (JEP 441), 
* a feature introduced in Java 21 that enhances the {@code switch} statement 
* and expression to support pattern matching directly.
* <p>
* This feature allows developers to simplify conditional logic by matching 
* object types and applying additional conditions (via {@code when} clauses)
* directly inside the switch expression.
* </p>
*
* <h2>Example:</h2>
* <pre>{@code
* PatternMatchingSwitch.runExample(42);          // Output: Integer: 42
* PatternMatchingSwitch.runExample("hello");     // Output: Short string: hello
* PatternMatchingSwitch.runExample("longword");  // Output: Long string: longword
* PatternMatchingSwitch.runExample(null);        // Output: Null value
* }</pre>
*
* <p><b>JEP Reference:</b> <a href="https://openjdk.org/jeps/441">
* JEP 441: Pattern Matching for switch</a></p>
*/
public class PatternMatchingSwitch {

      /**
     * Demonstrates how pattern matching works with {@code switch} expressions.
     * <p>
     * Depending on the runtime type and characteristics of the provided {@code obj},
     * the method matches the value against several cases:
     * </p>
     * <ul>
     *   <li>{@code Integer i} → prints "Integer: {i}"</li>
     *   <li>{@code String s when s.length() > 5} → prints "Long string: {s}"</li>
     *   <li>{@code String s} → prints "Short string: {s}"</li>
     *   <li>{@code null} → prints "Null value"</li>
     *   <li>{@code default} → prints "Unknown type"</li>
     * </ul>
     *
     * @param obj the object to be matched in the switch expression
     */
    public static void run(Object obj) {
        String result = switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s when s.length() > 5 -> "Long string: " + s;
            case String s -> "Short string: " + s;
            case null -> "Null value";
            default -> "Unknown type";
        };
        System.out.println(result);
    }
}
