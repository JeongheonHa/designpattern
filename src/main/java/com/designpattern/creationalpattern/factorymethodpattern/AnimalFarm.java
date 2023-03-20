package com.designpattern.creationalpattern.factorymethodpattern;

public abstract class AnimalFarm {
    public void raiseAnimal() {
        Animal animal = getAnimal();
        System.out.println(animal.getName() + " 이/가 " + animal.getSound() + " 소리를 내며 운다.");
    }

    // 객체의 생성을 서브 클래스에 맡김으로써 클라이언트는 구체적인 클래스에 의존하지 않고 객체 생성가능.
    protected abstract Animal getAnimal();
}
