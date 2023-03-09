package com.designpattern.factorymethodpattern;

public class CatFarm extends AnimalFarm{
    @Override
    protected Animal getAnimal() {
        return new Cat();
    }
}
