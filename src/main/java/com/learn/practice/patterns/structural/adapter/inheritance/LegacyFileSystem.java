package com.learn.practice.patterns.structural.adapter.inheritance;

// Legacy class for file operations (cannot be modified)
class LegacyFileSystem {
    protected boolean writeFile(String path, byte[] content) {
        System.out.println("Legacy system writing " + content.length + " bytes to " + path);
        // Implementation for writing to the filesystem
        return true;
    }

    protected byte[] readFile(String path) {
        System.out.println("Legacy system reading from " + path);
        // Implementation for reading from the filesystem
        return "Sample file content".getBytes();
    }

    protected boolean removeFile(String path) {
        System.out.println("Legacy system removing file " + path);
        // Implementation for deleting a file
        return true;
    }

    protected long checkDiskSpace() {
        long space = 1024 * 1024 * 100; // 100 MB for example
        System.out.println("Legacy system reports " + space + " bytes available");
        return space;
    }
}