package com.designpattern.creationalpattern.singletonpattern;

public class Main {
    public static void main(String[] args) {
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();

        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;

        System.out.println(settings1);
        System.out.println(settings2);

        System.out.println(singleton1);
        System.out.println(singleton2);

        Singleton.INSTANCE.doSomething();
    }
}
