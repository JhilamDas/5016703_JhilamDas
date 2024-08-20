package com.example.stock;

import com.example.observer.Observer;

public interface Stock {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
