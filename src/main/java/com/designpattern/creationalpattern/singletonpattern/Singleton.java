package com.designpattern.creationalpattern.singletonpattern;

//eum을 사용해서 싱글톤 구현
//thread-safe, 간편
public enum Singleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("싱글톤 객체로 메서드 실행");
    }
}
