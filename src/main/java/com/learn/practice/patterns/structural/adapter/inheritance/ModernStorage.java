package com.learn.practice.patterns.structural.adapter.inheritance;

// Modern interface that our application expects
public interface ModernStorage {
    boolean saveData(String filename, byte[] data);
    byte[] loadData(String filename);
    boolean deleteData(String filename);
    long getAvailableSpace();
}



