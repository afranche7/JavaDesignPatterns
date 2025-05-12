# Types of Dependency Injection

## Constructor injection
```java
class ServiceImpl {
    private final Database database;
    private final Logger logger;
    
    // Dependencies are provided through the constructor
    public ServiceImpl(Database database, Logger logger) {
        this.database = database;
        this.logger = logger;
    }
}
```

## Setter injection
```java
class ServiceImpl {
    private Database database;
    private Logger logger;
    
    // Default constructor
    public ServiceImpl() {}
    
    // Setter method for injecting database
    public void setDatabase(Database database) {
        this.database = database;
    }
    
    // Setter method for injecting logger
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
```