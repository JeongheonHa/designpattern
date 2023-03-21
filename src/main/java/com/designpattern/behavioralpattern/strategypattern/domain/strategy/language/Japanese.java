package com.designpattern.behavioralpattern.strategypattern.domain.strategy.language;

public class Japanese implements LanguageStrategy{
    @Override
    public void language() {
        System.out.println("일본어를 지원합니다.");
    }
}
