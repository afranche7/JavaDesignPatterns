package com.learn.practice.patterns.creational.dependencyinjection;

public interface UserService {
    void registerUser(String username);

    void deleteUser(String username);
}