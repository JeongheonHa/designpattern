package com.designpattern.behavioralpattern.strategypattern.domain.strategy.move;

public class Walk implements MoveStrategy {

    @Override
    public String move(final String name) {
        return name + "가 걸어간다.";
    }
}
