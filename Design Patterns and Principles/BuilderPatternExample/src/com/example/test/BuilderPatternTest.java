package com.example.test;

import com.example.computer.Computer;

public class BuilderPatternTest {

    public static void main(String[] args) {
        // Creating different configurations of Computer using the Builder pattern
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setOperatingSystem("Windows 10")
                .build();

        Computer officePC = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGraphicsCard("Integrated")
                .setOperatingSystem("Windows 10")
                .build();

        Computer budgetPC = new Computer.Builder()
                .setCPU("AMD Ryzen 3")
                .setRAM("8GB")
                .setStorage("256GB SSD")
                .setGraphicsCard("Integrated")
                .setOperatingSystem("Linux")
                .build();

        // Print the configurations
        System.out.println(gamingPC);
        System.out.println(officePC);
        System.out.println(budgetPC);
    }
}
