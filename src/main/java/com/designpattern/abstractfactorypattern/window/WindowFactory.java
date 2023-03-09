package com.designpattern.abstractfactorypattern.window;

import com.designpattern.abstractfactorypattern.Button;
import com.designpattern.abstractfactorypattern.GUIFactory;
import com.designpattern.abstractfactorypattern.TextField;

public class WindowFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public TextField createTextField() {
        return new WindowTextField();
    }
}
