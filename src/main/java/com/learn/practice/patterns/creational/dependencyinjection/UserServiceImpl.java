package com.learn.practice.patterns.creational.dependencyinjection;

public class UserServiceImpl implements UserService {
    private final Database database;
    private final Logger logger;

    public UserServiceImpl(Database database, Logger logger) {
        this.database = database;
        this.logger = logger;
    }

    @Override
    public void registerUser(String username) {
        logger.log("Registering user: " + username);
        database.connect();
        database.query("INSERT INTO users (username) VALUES ('" + username + "')");
        logger.log("User registered successfully");
    }

    @Override
    public void deleteUser(String username) {
        logger.log("Deleting user: " + username);
        database.connect();
        database.query("DELETE FROM users WHERE username = '" + username + "'");
        logger.log("User deleted successfully");
    }
}


