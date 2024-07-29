package com.ecommerce;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Smartphone", "Electronics"),
            new Product("P003", "Tablet", "Electronics"),
            new Product("P004", "Headphones", "Accessories"),
            new Product("P005", "Charger", "Accessories")
        };

        Product foundProduct = SearchAlgorithms.linearSearch(products, "P003");
        if (foundProduct != null) {
            System.out.println("Linear Search: Found " + foundProduct.getProductName());
        } else {
            System.out.println("Linear Search: Product not found");
        }

        Arrays.sort(products, Comparator.comparing(Product::getProductId));
        foundProduct = SearchAlgorithms.binarySearch(products, "P003");
        if (foundProduct != null) {
            System.out.println("Binary Search: Found " + foundProduct.getProductName());
        } else {
            System.out.println("Binary Search: Product not found");
        }
    }
}