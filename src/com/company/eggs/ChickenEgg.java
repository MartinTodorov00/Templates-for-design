package com.company.eggs;

public class ChickenEgg extends Egg {

    @Override
    public void getDescription() {
        setEggType("Кокошо яйце");
        System.out.println("Създаде се кокошо яйце");
    }
}
