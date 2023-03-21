package com.designpattern.behavioralpattern.strategypattern.domain;

import com.designpattern.behavioralpattern.strategypattern.domain.strategy.language.English;
import com.designpattern.behavioralpattern.strategypattern.domain.strategy.language.Korean;
import com.designpattern.behavioralpattern.strategypattern.domain.strategy.move.Run;
import com.designpattern.behavioralpattern.strategypattern.domain.strategy.move.Walk;
import com.designpattern.behavioralpattern.strategypattern.domain.strategy.speak.FastSpeak;
import com.designpattern.behavioralpattern.strategypattern.domain.strategy.speak.SlowSpeak;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    @Test
    @DisplayName("로봇이 작동하는지 확인")
    void move() {
        //given
        Robot servingRobot = new ServingRobot(new Run(), new FastSpeak(), new Korean());
        DeliveryRobot deliveryRobot = new DeliveryRobot(new Walk(), new SlowSpeak());
        deliveryRobot.setLanguageStrategy(new English());

        //when
        String result = servingRobot.move("강철이");
        String result2 = deliveryRobot.move("깡철이");

        //then
        assertThat(result).isEqualTo("강철이가 뛰어간다.");
        assertThat(result2).isEqualTo("깡철이가 걸어간다.");
    }

    @Test
    void speak() {
    }

    @Test
    void language() {
    }
}