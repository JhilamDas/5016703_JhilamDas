package com.example.test;

import com.example.image.Image;
import com.example.image.ProxyImage;

public class ProxyPatternTest {

    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Image will be loaded from disk
        image1.display();
        // Image will be displayed from cache
        image1.display();

        // Image will be loaded from disk
        image2.display();
        // Image will be displayed from cache
        image2.display();
    }
}