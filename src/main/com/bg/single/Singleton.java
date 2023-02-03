package com.bg.single;

public class Singleton {
    private volatile static Singleton singleton;
    private Singleton (){}

    private String a="sds";
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public String getA() {
        return a;
    }
}
