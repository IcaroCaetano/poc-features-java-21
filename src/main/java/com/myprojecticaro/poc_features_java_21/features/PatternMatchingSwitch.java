package com.myprojecticaro.poc_features_java_21.features;

public class PatternMatchingSwitch {
    public static void runExample(Object obj) {
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
