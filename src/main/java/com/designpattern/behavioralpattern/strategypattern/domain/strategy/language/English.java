package com.designpattern.behavioralpattern.strategypattern.domain.strategy.language;

public class English implements LanguageStrategy{
    @Override
    public void language() {
        System.out.println("영어를 지원합니다.");
    }
}
