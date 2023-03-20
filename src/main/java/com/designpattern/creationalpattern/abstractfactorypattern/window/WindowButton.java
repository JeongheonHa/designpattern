package com.designpattern.creationalpattern.abstractfactorypattern.window;

import com.designpattern.creationalpattern.abstractfactorypattern.Button;

public class WindowButton implements Button {
    @Override
    public void click() {
        System.out.println("원도우 버튼 클릭");
    }
}
