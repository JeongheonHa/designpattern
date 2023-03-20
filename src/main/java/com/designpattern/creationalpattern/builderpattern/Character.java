package com.designpattern.creationalpattern.builderpattern;

public class Character {

    private String job;
    private int level;
    private String weapon;
    private String armor;
    private String username;
    private int hp;
    private int mp;

    public Character(String job, int level, String weapon, String armor, String username, int hp, int mp) {
        this.job = job;
        this.level = level;
        this.weapon = weapon;
        this.armor = armor;
        this.username = username;
        this.hp = hp;
        this.mp = mp;
    }

    @Override
    public String toString() {
        return "{ username: " + username + ", level: " + level + ", job: " + job + ", weapon: " + weapon + ", armor: " + armor + ", hp: " + hp + ", mp: " + mp + " }";
    }

    public static class Builder {

        private String job;
        private int level;
        private String weapon;
        private String armor;
        private String username;
        private int hp;
        private int mp;

        public Builder job(String job) {
            this.job = job;
            return this;
        }

        public Builder level(int level) {
            this.level = level;
            return this;
        }

        public Builder weapon(String weapon) {
            this.weapon = weapon;
            return this;
        }

        public Builder armor(String armor) {
            this.armor = armor;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder hp(int hp) {
            this.hp = hp;
            return this;
        }

        public Builder mp(int mp) {
            this.mp = mp;
            return this;
        }

        public Character build() {
            return new Character(job, level, weapon, armor, username, hp, mp);
        }
    }
}
