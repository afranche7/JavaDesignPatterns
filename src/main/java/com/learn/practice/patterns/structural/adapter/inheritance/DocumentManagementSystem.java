package com.learn.practice.patterns.structural.adapter.inheritance;

// Modern application that uses the ModernStorage interface
public class DocumentManagementSystem {
    private ModernStorage storage;

    public DocumentManagementSystem(ModernStorage storage) {
        this.storage = storage;
    }

    public void saveDocument(String name, byte[] content) {
        if (storage.getAvailableSpace() < content.length) {
            System.out.println("ERROR: Not enough storage space!");
            return;
        }

        if (storage.saveData(name, content)) {
            System.out.println("Document '" + name + "' saved successfully");
        } else {
            System.out.println("Failed to save document '" + name + "'");
        }
    }

    public byte[] openDocument(String name) {
        byte[] content = storage.loadData(name);
        if (content != null) {
            System.out.println("Document '" + name + "' opened successfully");
        } else {
            System.out.println("Failed to open document '" + name + "'");
        }
        return content;
    }

    public void deleteDocument(String name) {
        if (storage.deleteData(name)) {
            System.out.println("Document '" + name + "' deleted successfully");
        } else {
            System.out.println("Failed to delete document '" + name + "'");
        }
    }
}
