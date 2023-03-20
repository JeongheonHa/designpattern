package com.designpattern.creationalpattern.prototypepattern;

public interface Monster extends Cloneable {
    Monster clone();
    String getName();
    Monster setName(String name);
    int getHP();
    Monster setHP(int hp);
}
