package com.learn.practice.patterns.creational.dependencyinjection;

public class Database {

    public Database(String connectionString) {
    }

    public void connect() {
        System.out.println("Database Connected !");
    }

    public void query(String query) {
        System.out.println("Executing query: " + query);
    }
}
