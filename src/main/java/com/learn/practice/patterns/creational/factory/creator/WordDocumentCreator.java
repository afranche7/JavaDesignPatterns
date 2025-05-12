package com.learn.practice.patterns.creational.factory.creator;

import com.learn.practice.patterns.creational.factory.document.Document;
import com.learn.practice.patterns.creational.factory.document.WordDocument;

public class WordDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
