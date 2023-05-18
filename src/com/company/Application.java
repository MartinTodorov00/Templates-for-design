package com.company;

import com.company.services.EasterBunny;

public class Application {

    public static void main(String[] args) {

        EasterBunny easterBunny = EasterBunny.getInstance();
        easterBunny.createEggs();
    }
}
