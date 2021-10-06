package com.blooster.factory.method;

public class Legume implements Aliment {

    public static final String TYPE = "legume";
    private String name = "";
    private String conservation = "";

    public Legume(String name, String conservation) {
        this.name = name;
        this.conservation = conservation;
    }

    public void type() {
        System.out.println("Type : " + TYPE);
    }

    public void conservation() {
        System.out.println("Type : " + this.conservation);
    }

    @Override
    public String toString() {
        return "Legume{" +
                "name='" + name + '\'' +
                ", conservation='" + conservation + '\'' +
                '}';
    }
}