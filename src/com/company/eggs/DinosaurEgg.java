package com.company.eggs;

public class DinosaurEgg extends Egg {

    @Override
    public void getDescription() {
        setEggType("Динозавърско яйце");
        System.out.println("Създаде се динозавърско яйце");
    }
}
