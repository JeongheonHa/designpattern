package com.designpattern.creationalpattern.abstractfactorypattern;

import com.designpattern.creationalpattern.abstractfactorypattern.linux.LinuxFactory;

public class Main {
    public static void main(String[] args) {
        Application app = new Application(new LinuxFactory());
        app.run();
    }
}
