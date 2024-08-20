package com.library;

import java.util.Arrays;

public class LibraryManagement {
    private Book[] books;
    private int size;

    public LibraryManagement(int capacity) {
        this.books = new Book[capacity];
        this.size = 0;
    }

    public void addBook(Book book) {
        if (size >= books.length) {
            books = Arrays.copyOf(books, books.length * 2);
        }
        books[size++] = book;
    }

    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public Book binarySearchByTitle(String title) {
        Arrays.sort(books, 0, size, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
        int left = 0, right = size - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int compareResult = books[mid].getTitle().compareToIgnoreCase(title);
            if (compareResult == 0) {
                return books[mid];
            } else if (compareResult < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public void displayBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
}
