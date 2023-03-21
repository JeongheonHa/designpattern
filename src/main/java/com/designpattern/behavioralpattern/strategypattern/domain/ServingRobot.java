package com.designpattern.behavioralpattern.strategypattern.domain;

import com.designpattern.behavioralpattern.strategypattern.domain.strategy.language.LanguageStrategy;
import com.designpattern.behavioralpattern.strategypattern.domain.strategy.move.MoveStrategy;
import com.designpattern.behavioralpattern.strategypattern.domain.strategy.speak.SpeakStrategy;

public class ServingRobot implements Robot{

    private final MoveStrategy moveStrategy;
    private final SpeakStrategy speakStrategy;
    private final LanguageStrategy languageStrategy;

    public ServingRobot(MoveStrategy moveStrategy, SpeakStrategy speakStrategy, LanguageStrategy languageStrategy) {
        this.moveStrategy = moveStrategy;
        this.speakStrategy = speakStrategy;
        this.languageStrategy = languageStrategy;
    }

    @Override
    public String move(final String name) {
        return moveStrategy.move(name);
    }

    @Override
    public void speak(final String name) {
        speakStrategy.speak(name);
    }

    public void setLanguage() {
        languageStrategy.language();
    }
}
