# Java Design Patterns

A practical implementation of common design patterns in Java.

## Overview

This project demonstrates multiple design patterns organized into three categories:

- **Creational Patterns**: Singleton, Factory, Builder, Dependency Injection
- **Structural Patterns**: Adapter (Object & Class), Decorator, Composite
- **Behavioral Patterns**: Observer, Strategy, Command, Template Method

## Usage

Run the `Main` class to see examples of all implemented patterns. Each pattern is demonstrated in its own method with clear examples.

```java
public static void main(String[] args) {
    creationalPatterns();
    structuralPatterns();
    behavioralPatterns();
}
```

## Pattern Implementations

- **Singleton**: Single instance creation (e.g., `Singleton`)
- **Factory**: Object creation through a common interface (e.g., `DocumentCreator`)
- **Builder**: Step-by-step complex object construction (e.g., `Computer.Builder`)
- **Adapter**: Interface compatibility (e.g., `AudioPlayerAdapter`, `FileSystemAdapter`)
- **Decorator**: Dynamic functionality addition (e.g., Coffee decorators)
- **Composite**: Tree structures of objects (e.g., Employee hierarchy)
- **Observer**: One-to-many dependency notifications (e.g., `WeatherStation`)
- **Strategy**: Interchangeable algorithms (e.g., sorting strategies)
- **Command**: Encapsulated operations (e.g., `RemoteControl` commands)
- **Template Method**: Algorithm skeleton with customizable steps (e.g., `BeveragePreparation`)
