package com.designpattern.behavioralpattern.strategypattern.domain.strategy.move;

public class Run implements MoveStrategy {

    @Override
    public String move(String name) {
        return name + "가 뛰어간다.";
    }
}
