package com.library;

public class Main {
    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement(10);

        library.addBook(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("B002", "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("B003", "1984", "George Orwell"));
        library.addBook(new Book("B004", "Pride and Prejudice", "Jane Austen"));
        library.addBook(new Book("B005", "The Catcher in the Rye", "J.D. Salinger"));

        System.out.println("All Books:");
        library.displayBooks();

        System.out.println("\nLinear Search for '1984':");
        Book foundBookLinear = library.linearSearchByTitle("1984");
        if (foundBookLinear != null) {
            System.out.println("Found: " + foundBookLinear);
        } else {
            System.out.println("Book not found.");
        }

        System.out.println("\nBinary Search for '1984':");
        Book foundBookBinary = library.binarySearchByTitle("1984");
        if (foundBookBinary != null) {
            System.out.println("Found: " + foundBookBinary);
        } else {
            System.out.println("Book not found.");
        }
    }
}
