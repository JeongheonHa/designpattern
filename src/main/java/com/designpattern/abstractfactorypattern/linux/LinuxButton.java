package com.designpattern.abstractfactorypattern.linux;

import com.designpattern.abstractfactorypattern.Button;

public class LinuxButton implements Button {
    @Override
    public void click() {
        System.out.println("리눅스 버튼 클릭");
    }
}
