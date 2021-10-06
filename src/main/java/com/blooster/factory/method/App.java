package com.blooster.factory.method;

public class App {

    public static void main(String[] args) {
        Aliment a1 = AlimentFactory.getAliment("fruits", "pomme", "temperature ambiante");
        Aliment a2 = AlimentFactory.getAliment("legume", "courgette", "frigo");
        Aliment a3 = AlimentFactory.getAliment("legume", "pomme de terre", "frigo");

        System.out.println("Aliment a1 : " + a1.toString());
        System.out.println("Aliment a2 : " + a2.toString());
        System.out.println("Aliment a3 : " + a3.toString());
    }
}
