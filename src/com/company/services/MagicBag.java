package com.company.services;

import java.util.Random;
import com.company.eggs.ChickenEgg;
import com.company.eggs.DinosaurEgg;
import com.company.eggs.Egg;
import com.company.eggs.QuailEgg;

// Factory
public class MagicBag {

    public Egg createEgg() {
        Random random = new Random();
        int RandomNumberEggType = random.nextInt(3);

        return switch (RandomNumberEggType) {
            case 0 -> new QuailEgg();
            case 1 -> new ChickenEgg();
            case 2 -> new DinosaurEgg();
            default -> null;
        };
    }
}
