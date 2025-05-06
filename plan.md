# 3-Day Java Interview Prep Plan (for Kotlin Developers)

## Day 1: Java Fundamentals and Syntax Differences

### Morning: Core Syntax Review
- **Null Safety**: Java's approach vs. Kotlin's `?` and `!!` operators
- **Variable Declarations**: Java's explicit typing and semicolons
- **Access Modifiers**: public, protected, default, private
- **Static vs. Instance Methods/Variables**
- **Primitive Types vs. Objects**: Java has both, while Kotlin has only objects

### Afternoon: OOP in Java
- **Classes and Constructors**: Java's verbosity vs. Kotlin's conciseness
- **Inheritance**: extends vs. open class
- **Interfaces**: Differences in implementation (Java 8+ default methods)
- **Abstract Classes**: When to use them over interfaces
- **Inner Classes**: Normal, static, anonymous, local inner classes
- **Enums**: Java's implementation vs. Kotlin's more powerful version

### Evening: Practice
- Convert 2-3 small Kotlin programs to Java
- Focus on class definitions, nullability, and type declarations

## Day 2: Java-Specific Features and Ecosystem

### Morning: Java Collections Framework
- **Lists, Sets, Maps**: Implementation differences
- **Array operations**: Java arrays vs. Kotlin collections
- **Collections utilities**: Java's Collections class vs. Kotlin's extension functions
- **Mutability**: Java collections are mutable by default

### Afternoon: Java Specific Features
- **Exception Handling**: Checked vs. unchecked exceptions
- **Stream API**: Similar to Kotlin sequences but with different syntax
- **Generics**: Type erasure, wildcards (? extends, ? super)
- **Functional Interfaces & Lambdas**: Syntax differences from Kotlin
- **Optional**: Java's optional vs. Kotlin's nullable types

### Evening: Modern Java Features
- **Java 8**: Lambdas, method references, streams, default methods
- **Java 9-11**: Module system, var keyword, collection factory methods
- **Java 14-21**: Records, pattern matching, sealed classes, switch expressions

## Day 3: Design Patterns and Interview Prep

### Morning: Essential Design Patterns
- **Creational Patterns**:
  - Singleton
  - Factory Method
  - Builder
  - Dependency Injection
- **Structural Patterns**:
  - Adapter
  - Decorator
  - Composite
- **Behavioral Patterns**:
  - Observer
  - Strategy
  - Command
  - Template Method

### Afternoon: Java Ecosystem and Frameworks
- **Build Tools**: Maven/Gradle basics
- **Testing**: JUnit, Mockito fundamentals
- **Popular Frameworks**: Brief overview of Spring (if relevant to the position)
- **Concurrency**: Threads, ExecutorService, CompletableFuture

### Evening: Mock Interview Practice
- **Solve 2-3 coding problems in Java**
- **Verbalize your solutions** as if explaining to an interviewer
- **Practice answering common Java interview questions**:
  - "What's the difference between == and equals()?"
  - "Explain Java memory management"
  - "How does garbage collection work?"
  - "What is the difference between ArrayList and LinkedList?"

## Quick Reference: Kotlin to Java Cheat Sheet

### Variable Declaration
```kotlin
// Kotlin
val name = "John"  // immutable
var age = 30       // mutable
```
```java
// Java
final String name = "John";  // immutable
int age = 30;               // mutable
```

### Null Safety
```kotlin
// Kotlin
val name: String? = null
name?.length // safe call
```
```java
// Java
String name = null;
if (name != null) {
    name.length(); // explicit check
}
```

### String Templates
```kotlin
// Kotlin
val message = "Hello, $name"
```
```java
// Java
String message = "Hello, " + name;
```

### For Loops
```kotlin
// Kotlin
for (item in items) { }
for (i in 1..10) { }
```
```java
// Java
for (Item item : items) { }
for (int i = 1; i <= 10; i++) { }
```

### Functions
```kotlin
// Kotlin
fun add(a: Int, b: Int): Int = a + b
```
```java
// Java
public int add(int a, int b) {
    return a + b;
}
```

### Collections
```kotlin
// Kotlin
val list = listOf(1, 2, 3)
val map = mapOf("one" to 1)
```
```java
// Java
List<Integer> list = Arrays.asList(1, 2, 3);
Map<String, Integer> map = Map.of("one", 1); // Java 9+
```

### Lambda Expressions
```kotlin
// Kotlin
items.filter { it > 10 }
```
```java
// Java
items.stream().filter(item -> item > 10).collect(Collectors.toList());
```

### Extension Functions
```kotlin
// Kotlin
fun String.addExclamation() = this + "!"
```
```java
// Java - no direct equivalent, use utility classes
public class StringUtils {
    public static String addExclamation(String str) {
        return str + "!";
    }
}
```

## Interview Success Tips

1. **Communicate your thought process** as you solve problems
2. **Acknowledge the differences** between Kotlin and Java when relevant
3. **Leverage your Kotlin experience** to show transferable skills
4. **Be honest** about your recent transition back to Java
5. **Ask clarifying questions** when needed
6. **Demonstrate enthusiasm** for learning and adapting

Good luck with your interview!
