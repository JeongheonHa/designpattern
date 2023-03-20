package com.designpattern.creationalpattern.prototypepattern;

public class MonsterCreator {
    private Monster prototype;

    public MonsterCreator(Monster prototype) {
        this.prototype = prototype;
    }

    public Monster createMonster(String name, int hp) {
        Monster monster = prototype.clone();
        monster.setName(name)
                .setHP(hp);

        return monster;
    }
}
