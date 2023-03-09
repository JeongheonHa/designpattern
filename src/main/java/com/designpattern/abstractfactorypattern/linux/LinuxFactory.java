package com.designpattern.abstractfactorypattern.linux;

import com.designpattern.abstractfactorypattern.Button;
import com.designpattern.abstractfactorypattern.GUIFactory;
import com.designpattern.abstractfactorypattern.TextField;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextField createTextField() {
        return new LinuxTextField();
    }
}
