package com.example.test;

import com.example.documents.Document;
import com.example.factories.DocumentFactory;
import com.example.factories.WordDocumentFactory;
import com.example.factories.PdfDocumentFactory;
import com.example.factories.ExcelDocumentFactory;

public class FactoryMethodTest {

    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();
        wordDoc.save();
        wordDoc.close();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        pdfDoc.save();
        pdfDoc.close();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
        excelDoc.save();
        excelDoc.close();
    }
}
