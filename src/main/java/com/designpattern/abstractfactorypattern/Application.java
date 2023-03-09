package com.designpattern.abstractfactorypattern;

public class Application {
    private GUIFactory factory;
    private Button button;
    private TextField textField;

    public Application(GUIFactory factory) {
        this.factory = factory;
        this.button = factory.createButton();
        this.textField = factory.createTextField();
    }

    public void run() {
        button.click();
        textField.input("안녕하세요");
    }
}
