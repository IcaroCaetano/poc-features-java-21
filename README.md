# ☕ Java 21 Features - Proof of Concept (POC)

This project is a Proof of Concept (POC) showcasing the most important features introduced in Java 21 (LTS).
Each feature is implemented as a simple, runnable example under the features package.

## 📌 Features Covered

### 🔹 Pattern Matching for Switch (JEP 441)

Enhances switch statements and expressions with pattern matching, allowing more concise and readable code.

#### 🔹 Record Patterns (JEP 440)

Introduces record deconstruction directly in instanceof checks and switch expressions.

#### 🔹 Virtual Threads (Project Loom, JEP 444)

Provides lightweight threads that enable massive concurrency with minimal resource consumption.

#### 🔹 Sequenced Collections (JEP 431)

Adds new methods like getFirst(), getLast(), and reversed() for List, Set, and Map.

#### 🔹 Scoped Values (JEP 446)

A more efficient and safer alternative to ThreadLocal for sharing immutable data within and across threads.

#### 🔹 String Templates (Preview, JEP 430)

Introduces string interpolation for easier and more expressive string formatting.


## 📂 Project Structure


````
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

````


## ▶️ Running the Project

1. Clone the repository:

````

git clone https://github.com/your-username/poc-features-java-21.git
cd poc-features-java-21
````

2. Build and run with Java 21:

Using Maven:

````
./mvnw spring-boot:run
````

Using Gradle:

````
./gradlew bootRun
````

3. Check the console output to see the examples in action.
