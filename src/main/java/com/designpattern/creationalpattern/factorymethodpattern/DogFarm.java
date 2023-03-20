package com.designpattern.creationalpattern.factorymethodpattern;

public class DogFarm extends AnimalFarm{
    @Override
    protected Animal getAnimal() {
        return new Dog();
    }
}
