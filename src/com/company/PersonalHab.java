package com.company;

public class PersonalHab {
    private String name;
    private boolean Frenchfrices;
    private boolean sleep;
    private boolean adventurous;

    public PersonalHab(String name, boolean frenchfrices, boolean sleep, boolean adventurous) {
        this.name = name;
        Frenchfrices = frenchfrices;
        this.sleep = sleep;
        this.adventurous = adventurous;
    }

    public PersonalHab() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFrenchfrices() {
        return Frenchfrices;
    }

    public void setFrenchfrices(boolean frenchfrices) {
        Frenchfrices = frenchfrices;
    }

    public boolean isSleep() {
        return sleep;
    }

    public void setSleep(boolean sleep) {
        this.sleep = sleep;
    }

    public boolean isAdventurous() {
        return adventurous;
    }

    public void setAdventurous(boolean adventurous) {
        this.adventurous = adventurous;
    }
}
