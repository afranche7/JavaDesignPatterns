package com.learn.practice.patterns.creational.factory.creator;

import com.learn.practice.patterns.creational.factory.document.Document;

public abstract class DocumentCreator {
    // Factory method
    public abstract Document createDocument();

    // Template method using the factory method
    public void editDocument() {
        Document doc = createDocument();
        doc.open();
        // Do editing
        doc.save();
        doc.close();
    }
}
