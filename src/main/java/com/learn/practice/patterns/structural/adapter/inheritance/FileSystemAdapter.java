package com.learn.practice.patterns.structural.adapter.inheritance;

// Class Adapter that extends the legacy class and implements the modern interface
public class FileSystemAdapter extends LegacyFileSystem implements ModernStorage {
    private String baseDirectory;

    public FileSystemAdapter(String baseDirectory) {
        this.baseDirectory = baseDirectory;
    }

    @Override
    public boolean saveData(String filename, byte[] data) {
        String fullPath = baseDirectory + "/" + filename;
        // Using inherited method from LegacyFileSystem
        return writeFile(fullPath, data);
    }

    @Override
    public byte[] loadData(String filename) {
        String fullPath = baseDirectory + "/" + filename;
        // Using inherited method from LegacyFileSystem
        return readFile(fullPath);
    }

    @Override
    public boolean deleteData(String filename) {
        String fullPath = baseDirectory + "/" + filename;
        // Using inherited method from LegacyFileSystem
        return removeFile(fullPath);
    }

    @Override
    public long getAvailableSpace() {
        // Using inherited method from LegacyFileSystem
        return checkDiskSpace();
    }
}
