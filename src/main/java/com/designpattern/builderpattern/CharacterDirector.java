package com.designpattern.builderpattern;

public class CharacterDirector {
    private final Character.Builder builder;

    public CharacterDirector(Character.Builder builder) {
        this.builder = builder;
    }

    public Character createWarrior(String username) {
        return builder
                .job("Warrior")
                .level(1)
                .weapon("Sword")
                .armor("Chain Mail")
                .username(username)
                .hp(100)
                .mp(10)
                .build();
    }

    public Character createMage(String username) {
        return builder
                .job("Mage")
                .level(1)
                .weapon("Staff")
                .armor("Robe")
                .username(username)
                .hp(50)
                .mp(100)
                .build();
    }
}
