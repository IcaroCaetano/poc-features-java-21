package com.myprojecticaro.poc_features_java_21.features;

import java.util.concurrent.*;

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
