package com.designpattern.behavioralpattern.strategypattern.domain.strategy.language;

public class Korean implements LanguageStrategy{
    @Override
    public void language() {
        System.out.println("한국어를 지원합니다.");
    }
}
