package com.study.ezam02;

public class Factory {

    private static class factoryName {
    }

    private static factoryName string = new factoryName();

    public static factoryName getInstance() {
        if(string == null) {
            string = new factoryName();
        }
        return string;
    }
}
