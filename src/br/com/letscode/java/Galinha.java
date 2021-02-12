package br.com.letscode.java;

public class Galinha implements AnimalDomestico {

    @Override
    public void comunicar() {
        System.out.println("cocoricó");
    }

    public void ciscar() {
        System.out.println("Ciscando, ciscando!");
    }

    @Override
    public String toString() {
        return "Galinha{}";
    }
}
