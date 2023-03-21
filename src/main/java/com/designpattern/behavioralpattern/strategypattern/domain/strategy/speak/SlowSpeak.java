package com.designpattern.behavioralpattern.strategypattern.domain.strategy.speak;

public class SlowSpeak implements SpeakStrategy{
    @Override
    public void speak(String name) {
        System.out.println(name + "가 느리게 말합니다.");
    }
}
