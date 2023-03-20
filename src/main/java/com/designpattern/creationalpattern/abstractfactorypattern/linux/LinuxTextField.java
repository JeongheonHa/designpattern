package com.designpattern.creationalpattern.abstractfactorypattern.linux;

import com.designpattern.creationalpattern.abstractfactorypattern.TextField;

public class LinuxTextField implements TextField {
    @Override
    public void input(String text) {
        System.out.println("리눅스 text field 입력 : " + text);
    }
}
