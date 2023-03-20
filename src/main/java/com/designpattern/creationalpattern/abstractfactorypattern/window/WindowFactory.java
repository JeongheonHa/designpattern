package com.designpattern.creationalpattern.abstractfactorypattern.window;

import com.designpattern.creationalpattern.abstractfactorypattern.Button;
import com.designpattern.creationalpattern.abstractfactorypattern.GUIFactory;
import com.designpattern.creationalpattern.abstractfactorypattern.TextField;

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
