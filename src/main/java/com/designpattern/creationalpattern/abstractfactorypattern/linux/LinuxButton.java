package com.designpattern.creationalpattern.abstractfactorypattern.linux;

import com.designpattern.creationalpattern.abstractfactorypattern.Button;

public class LinuxButton implements Button {
    @Override
    public void click() {
        System.out.println("리눅스 버튼 클릭");
    }
}
