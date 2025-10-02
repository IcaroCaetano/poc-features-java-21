package com.myprojecticaro.poc_features_java_21.features;

public class RecordPatterns {
    record Point(int x, int y) {}

    public static void runExample(Object obj) {
        if (obj instanceof Point(int x, int y)) {
            System.out.println("Point with x=" + x + ", y=" + y);
        }
    }
}
