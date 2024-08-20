package com.inventory;

public class Main {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();

        Product product1 = new Product("P001", "Laptop", 10, 1500.00);
        Product product2 = new Product("P002", "Smartphone", 20, 800.00);
        inventoryManager.addProduct(product1);
        inventoryManager.addProduct(product2);
       
        System.out.println("Product ID: " + product1.getProductId() + ", Name: " + product1.getProductName());
        System.out.println("Product ID: " + product2.getProductId() + ", Name: " + product2.getProductName());
       
        product1.setPrice(1400.00);
        inventoryManager.updateProduct(product1);
      
        inventoryManager.deleteProduct("P002");
       
        System.out.println("Updated Inventory:");
        Product retrievedProduct = inventoryManager.getProduct("P001");
        if (retrievedProduct != null) {
            System.out.println("Product ID: " + retrievedProduct.getProductId() + ", Name: " + retrievedProduct.getProductName() + ", Price: " + retrievedProduct.getPrice());
        }

        Product deletedProduct = inventoryManager.getProduct("P002");
        if (deletedProduct == null) {
            System.out.println("Product ID: P002 not found");
        }
    }
}
