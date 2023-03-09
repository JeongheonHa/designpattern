package com.designpattern.singletonpattern;

//Bill Pugh Solution
//Lazy Loading, thread-safe
public class Settings {
    private Settings() {
    }

    private static class SettingsHolder {
        private static final Settings SETTINGS = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.SETTINGS;
    }
}
