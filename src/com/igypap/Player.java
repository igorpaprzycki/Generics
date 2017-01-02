package com.igypap;

/**
 * Created by igypap on 02.01.17.
 */
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}