package com.company.services;

import java.util.List;
import java.util.ArrayList;
import com.company.eggs.Egg;

// Observer
public class Basket {

    private List<Egg> eggs = new ArrayList<>();
    private List<ChickObserver> observers = new ArrayList<>();

    public void addEgg(Egg egg) {
        eggs.add(egg);
        notifyObservers();
    }

    public void addObserver(ChickObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ChickObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (ChickObserver observer : observers) {
            observer.update(eggs.size());
        }
        if (eggs.size() > 5) {
            System.exit(1);
        }
    }
}
