package org.launchcode.cheesemvc.models;

public enum CheeseType {
    HARD ("Hard"),
    SOFT ("Soft"),
    FAKE ("Fake"); // end of types with a semicolon ;

    // enum constructor
    private final String name;
    CheeseType (String name) {
        this.name = name;
    }

    // getter method
    public String getName(){
        return name;
    }
}
