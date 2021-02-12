package br.com.letscode.java;

public class Gato implements AnimalDomestico {

    @Override
    public void comunicar() {
        System.out.println("miau");
    }

    public void afiarUnhas() {
        System.out.println("Estou afiando minhas unhas. Miau!");
    }

    @Override
    public String toString() {
        return "Gato{}";
    }
}
