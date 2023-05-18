package com.company.services;

import com.company.eggs.Egg;

import java.util.Random;

// Decorator
public class DecorateEgg extends Egg {

    private Egg egg;

    public DecorateEgg(Egg egg) {
        this.egg = egg;
    }

    @Override
    public void getDescription() {
        Random random = new Random();
        int RandomNumber = random.nextInt(2);

        switch (RandomNumber) {
            case 0 -> {
                egg.setEggType(egg.getEggType() + ", оцветено");
                System.out.println("Яйцето беше оцветено");
            }
            case 1 -> {
                egg.setEggType(egg.getEggType() + ", облепено със стикери");
                System.out.println("Яйцето беше облепено със стикери");
            }
        };
    }
}
