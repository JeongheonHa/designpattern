package com.designpattern.behavioralpattern.strategypattern.domain.strategy.move;

public class Fly implements MoveStrategy {

    @Override
    public String move(String name) {
        return name + "가 날아간다.";
    }
}
