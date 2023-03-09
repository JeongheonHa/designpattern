package com.designpattern.abstractfactorypattern;

import com.designpattern.abstractfactorypattern.linux.LinuxFactory;

public class Main {
    public static void main(String[] args) {
        Application app = new Application(new LinuxFactory());
        app.run();
    }
}
