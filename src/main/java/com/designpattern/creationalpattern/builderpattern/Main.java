package com.designpattern.creationalpattern.builderpattern;

public class Main {
    public static void main(String[] args) {
        Character warrior = new Character.Builder()
                .username("name1")
                .job("warrior")
                .level(30)
                .hp(200)
                .weapon("sword")
                .armor("armor")
                .build();

        Character mage = new Character.Builder()
                .username("name2")
                .job("mage")
                .level(30)
                .hp(100)
                .mp(200)
                .weapon("stick")
                .build();

        // 디렉터를 이용해서 캐릭터 객체를 생성
        CharacterDirector director = new CharacterDirector(new Character.Builder());
        Character warrior2 = director.createWarrior("name3");
        Character mage2 = director.createMage("name4");

        System.out.println(warrior);
        System.out.println(warrior2);
        System.out.println(mage);
        System.out.println(mage2);
    }
}
