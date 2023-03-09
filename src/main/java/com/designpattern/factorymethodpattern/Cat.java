package com.designpattern.factorymethodpattern;

public class Cat implements Animal{
    @Override
    public String getName() {
        return "고양이";
    }

    @Override
    public String getSound() {
        return "야옹";
    }
}
