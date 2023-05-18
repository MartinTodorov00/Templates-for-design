package com.company.eggs;

public abstract class Egg {

    protected String eggType;

    public String getEggType() {
        return eggType;
    }

    public void setEggType(String eggType) {
        this.eggType = eggType;
    }

    public abstract void getDescription();
}
