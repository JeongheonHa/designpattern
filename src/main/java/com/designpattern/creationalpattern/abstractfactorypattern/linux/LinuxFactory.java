package com.designpattern.creationalpattern.abstractfactorypattern.linux;

import com.designpattern.creationalpattern.abstractfactorypattern.Button;
import com.designpattern.creationalpattern.abstractfactorypattern.GUIFactory;
import com.designpattern.creationalpattern.abstractfactorypattern.TextField;

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
