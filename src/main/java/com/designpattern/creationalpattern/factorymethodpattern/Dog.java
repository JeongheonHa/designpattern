package com.designpattern.creationalpattern.factorymethodpattern;

public class Dog implements Animal{
    @Override
    public String getName() {
        return "강아지";
    }

    @Override
    public String getSound() {
        return "멍멍";
    }
}
