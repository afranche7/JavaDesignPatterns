package com.learn.practice.patterns.creational.dependencyinjection;

import java.util.HashMap;
import java.util.Map;

public class ApplicationContext {
    private final Map<Class<?>, Object> components = new HashMap<>();

    static class MySQLDatabase extends Database {
        public MySQLDatabase(String connectionString) {
            super(connectionString);
        }
    }

    static class ConsoleLogger extends Logger {
        public ConsoleLogger(String name) {
            super(name);
        }
    }

    public ApplicationContext() {
        // Register dependencies
        register(Database.class, new MySQLDatabase("connectionString"));
        register(Logger.class, new ConsoleLogger("ConsoleLogger"));

        // Register services with their dependencies
        Database db = (Database) components.get(Database.class);
        Logger logger = (Logger) components.get(Logger.class);
        register(UserService.class, new UserServiceImpl(db, logger));
    }

    public void register(Class<?> type, Object implementation) {
        components.put(type, implementation);
    }

    public <T> T getComponent(Class<T> type) {
        return type.cast(components.get(type));
    }
}