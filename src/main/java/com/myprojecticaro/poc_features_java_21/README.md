
# ☕ Java 21 Features - Proof of Concept (POC)

This project demonstrates some of the most relevant and exciting features introduced in Java 21 (LTS).
Each feature is showcased in a simple and runnable example under the features package.

## 📌 Features Covered

### 🔹 Pattern Matching for Switch (JEP 441)

Enhances switch statements and expressions with pattern matching, making the code more concise and expressive.

### 🔹 Record Patterns (JEP 440)

Allows record deconstruction directly in instanceof and switch expressions.

### 🔹 Virtual Threads (Project Loom, JEP 444)

Lightweight threads that enable massive concurrency with minimal overhead.

### 🔹 Sequenced Collections (JEP 431)

Adds getFirst(), getLast(), and reversed() to List, Set, and Map.

### 🔹 Scoped Values (JEP 446)

A safer and faster alternative to ThreadLocal, useful for sharing immutable data across threads.

### 🔹 String Templates (Preview, JEP 430)

Introduces string interpolation for more readable and concise string formatting.

## 📂 Project Structure

´´´´

poc-features-java-21/
 ├─ src/main/java/com/myprojecticaro/poc_features_java_21/
 │   ├─ PocFeaturesJava21Application.java   # Spring Boot entry point
 │   └─ features/
 │       ├─ PatternMatchingSwitch.java
 │       ├─ RecordPatterns.java
 │       ├─ VirtualThreadsExample.java
 │       ├─ SequencedCollectionsExample.java
 │       ├─ ScopedValuesExample.java
 │       └─ StringTemplatesExample.java
´´´´

## ▶️ Running the Project

### 1. Clone the repository:

´´´´

git clone https://github.com/your-username/poc-features-java-21.git
cd poc-features-java-21
´´´´

### 2. Build and run with Java 21:

´´´´

./mvnw spring-boot:run
´´´´
or with Gradle:

´´´´

./gradlew bootRun
´´´´

### 3. Check the console output to see the examples running.

## ⚙️ Requirements

- Java 21 (LTS)

- Maven or Gradle

- (Optional) IDE such as IntelliJ IDEA or Eclipse

- ## 📖 References

- [JEP 441: Pattern Matching for switch](https://openjdk.org/jeps/441)  
- [JEP 440: Record Patterns](https://openjdk.org/jeps/440)  
- [JEP 444: Virtual Threads](https://openjdk.org/jeps/444)  
- [JEP 431: Sequenced Collections](https://openjdk.org/jeps/431)  
- [JEP 446: Scoped Values](https://openjdk.org/jeps/446)  
- [JEP 430: String Templates (Preview)](https://openjdk.org/jeps/430)  

