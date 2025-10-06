package com.myprojecticaro.poc_features_java_21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myprojecticaro.poc_features_java_21.features.*;

/**
 * Main entry point for the Proof of Concept (POC) application demonstrating
 * the new features introduced in Java 21.
 *
 * <p>This POC showcases key language and platform improvements such as:</p>
 * <ul>
 *   <li>Pattern Matching for switch (JEP 441)</li>
 *   <li>Record Patterns (JEP 440)</li>
 *   <li>Virtual Threads (JEP 444)</li>
 *   <li>Sequenced Collections (JEP 431)</li>
 *   <li>Scoped Values (JEP 446)</li>
 *   <li>String Templates (JEP 430 - Preview)</li>
 * </ul>
 *
 * @author Icaro
 * @version 1.0
 * @since Java 21
 */
@SpringBootApplication
public class PocFeaturesJava21Application {

    public static void main(String[] args) {
        SpringApplication.run(PocFeaturesJava21Application.class, args);

        System.out.println("=== Java 21 Features POC ===\n");

        // 1. Pattern Matching for switch
        System.out.println("🧩 Pattern Matching for switch:");
        PatternMatchingSwitch.runExample("Hello");
        PatternMatchingSwitch.runExample(42);
        PatternMatchingSwitch.runExample(null);
        System.out.println();

        // 2. Record Patterns
        System.out.println("📦 Record Patterns:");
        RecordPatterns.runExample(new RecordPatterns.Point(10, 20));
        System.out.println();

        // 3. Virtual Threads
        System.out.println("🧵 Virtual Threads:");
        VirtualThreads.runExample();
        System.out.println();

        // 4. Sequenced Collections
        System.out.println("📚 Sequenced Collections:");
        SequencedCollections.run();
        System.out.println();

        // 5. Scoped Values
        System.out.println("🌐 Scoped Values:");
        ScopedValues.runExample();
        System.out.println();

        // 6. String Templates
        System.out.println("📝 String Templates:");
        StringTemplates.run();
        System.out.println();

        System.out.println("✅ All Java 21 feature examples executed successfully!");
    }
}
