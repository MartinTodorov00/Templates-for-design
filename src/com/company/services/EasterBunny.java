package com.company.services;

import com.company.eggs.Egg;

// Singleton
public class EasterBunny {

    private static EasterBunny instance;

    private EasterBunny() {
    }

    public static EasterBunny getInstance() {
        if (instance == null) {
            instance = new EasterBunny();
        }
        return instance;
    }

    public void createEggs() {
        MagicBag magicBag = new MagicBag();
        Basket basket = new Basket();
        basket.addObserver(new ChickObserverImpl());
        basket.addObserver(new ChickObserverImpl());
        basket.addObserver(new ChickObserverImpl());

        for (int i = 0; i < 10; i++) {
            Egg egg = magicBag.createEgg();
            egg.getDescription();
            DecorateEgg decorateEgg = new DecorateEgg(egg);
            decorateEgg.getDescription();
            System.out.println();
            basket.addEgg(decorateEgg);
        }
    }
}

