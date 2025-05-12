package com.learn.practice.patterns.creational.factory.creator;

import com.learn.practice.patterns.creational.factory.document.Document;
import com.learn.practice.patterns.creational.factory.document.PDFDocument;

public class PDFDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}
