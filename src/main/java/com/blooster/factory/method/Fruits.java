package com.blooster.factory.method;

public class Fruits implements Aliment {

    public static final String TYPE = "FRUITS";
    private String name;
    private String conservation;

    public Fruits(String name, String conservation) {
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
        return "Fruits{" +
                "name='" + name + '\'' +
                ", conservation='" + conservation + '\'' +
                '}';
    }
}