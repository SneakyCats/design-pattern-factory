package com.blooster.factory.method;

public class AlimentFactory {

    public static Aliment getAliment(String type, String name, String conservation) {
        if("Legume".equalsIgnoreCase(type)) return new Legume(name, conservation);
        if("Fruits".equalsIgnoreCase(type)) return new Fruits(name, conservation);
        return null;
    }
}
