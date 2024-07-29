package com.ecommerce;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 250.50),
            new Order("O002", "Bob", 150.75),
            new Order("O003", "Charlie", 325.20),
            new Order("O004", "Diana", 200.00),
            new Order("O005", "Eve", 400.00)
        };

        System.out.println("Bubble Sort:");
        SortingAlgorithms.bubbleSort(orders);
        Arrays.stream(orders).forEach(System.out::println);

        orders = new Order[]{
            new Order("O001", "Alice", 250.50),
            new Order("O002", "Bob", 150.75),
            new Order("O003", "Charlie", 325.20),
            new Order("O004", "Diana", 200.00),
            new Order("O005", "Eve", 400.00)
        };

        System.out.println("Quick Sort:");
        SortingAlgorithms.quickSort(orders, 0, orders.length - 1);
        Arrays.stream(orders).forEach(System.out::println);
    }
}