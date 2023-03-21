package com.designpattern.behavioralpattern.strategypattern.domain;

import com.designpattern.behavioralpattern.strategypattern.domain.strategy.language.LanguageStrategy;
import com.designpattern.behavioralpattern.strategypattern.domain.strategy.move.MoveStrategy;
import com.designpattern.behavioralpattern.strategypattern.domain.strategy.speak.SpeakStrategy;

public class DeliveryRobot implements Robot{

    private final MoveStrategy moveStrategy;
    private final SpeakStrategy speakStrategy;
    private LanguageStrategy languageStrategy;

    public DeliveryRobot(MoveStrategy moveStrategy, SpeakStrategy speakStrategy) {
        this.moveStrategy = moveStrategy;
        this.speakStrategy = speakStrategy;
    }

    public void setLanguageStrategy(LanguageStrategy languageStrategy) {
        this.languageStrategy = languageStrategy;
    }

    @Override
    public String move(String name) {
         return moveStrategy.move(name);
    }

    @Override
    public void speak(String name) {
        speakStrategy.speak(name);
    }

    public void language() {
        languageStrategy.language();
    }
}
