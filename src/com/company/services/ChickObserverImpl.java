package com.company.services;

// Observer
public class ChickObserverImpl implements ChickObserver {
    @Override
    public void update(int eggCount) {
        if (eggCount > 5) {
            System.out.println("Яйцата са готови");
        }
    }
}
