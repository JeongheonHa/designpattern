package com.designpattern.prototypepattern;

public class concreteMonster implements Monster {

    private String name;
    private int hp;

    @Override
    public Monster clone() {
        try {
            return (Monster) super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Monster setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public int getHP() {
        return hp;
    }

    @Override
    public Monster setHP(int hp) {
        this.hp = hp;
        return this;
    }

    @Override
    public String toString() {
        return "concreteMonster{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
