package com.designpattern.abstractfactorypattern.window;

import com.designpattern.abstractfactorypattern.Button;

public class WindowButton implements Button {
    @Override
    public void click() {
        System.out.println("원도우 버튼 클릭");
    }
}
