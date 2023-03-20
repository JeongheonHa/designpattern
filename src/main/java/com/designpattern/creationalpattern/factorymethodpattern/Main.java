package com.designpattern.creationalpattern.factorymethodpattern;

public class Main {
    public static void main(String[] args) {
        AnimalFarm farm = new CatFarm();
        farm.raiseAnimal();

        farm = new DogFarm();
        farm.raiseAnimal();
    }
}
