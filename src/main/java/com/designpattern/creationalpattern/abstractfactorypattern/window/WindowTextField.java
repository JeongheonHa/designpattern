package com.designpattern.creationalpattern.abstractfactorypattern.window;

import com.designpattern.creationalpattern.abstractfactorypattern.TextField;

public class WindowTextField implements TextField {
    @Override
    public void input(String text) {
        System.out.println("원도우 text field 입력 : " + text);
    }
}
