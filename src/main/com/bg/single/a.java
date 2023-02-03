package com.bg.single;

public class a {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        System.out.print(singleton.getA());
    }
}
