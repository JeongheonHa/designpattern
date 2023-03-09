package com.designpattern.factorymethodpattern;

public class DogFarm extends AnimalFarm{
    @Override
    protected Animal getAnimal() {
        return new Dog();
    }
}
