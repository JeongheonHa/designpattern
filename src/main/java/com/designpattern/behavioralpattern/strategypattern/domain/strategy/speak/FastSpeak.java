package com.designpattern.behavioralpattern.strategypattern.domain.strategy.speak;

public class FastSpeak implements SpeakStrategy{
    @Override
    public void speak(final String name) {
        System.out.println(name + "가 빠르게 말합니다.");
    }
}
