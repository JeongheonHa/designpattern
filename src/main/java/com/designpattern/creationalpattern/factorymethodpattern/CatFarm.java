package com.designpattern.creationalpattern.factorymethodpattern;

public class CatFarm extends AnimalFarm{
    @Override
    protected Animal getAnimal() {
        return new Cat();
    }
}
