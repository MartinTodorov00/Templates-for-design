package com.company.eggs;

public class QuailEgg extends Egg {

    @Override
    public void getDescription() {
        setEggType("Пъдпъдъче яйце");
        System.out.println("Създаде се пъдпъдъче яйце");
    }
}
