package com.designpattern.prototypepattern;

public class Main {
    public static void main(String[] args) {
        MonsterCreator creator = new MonsterCreator(new concreteMonster());

        Monster monster1 = creator.createMonster("고블린", 20);
        Monster monster2 = creator.createMonster("슬라임", 5);
        Monster monster3 = creator.createMonster("좀비", 30);

        System.out.println(monster1);
        System.out.println(monster2);
        System.out.println(monster3);
    }
}
