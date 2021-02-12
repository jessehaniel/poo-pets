package br.com.letscode.java;

public class Pato implements Animal {

    @Override
    public void comunicar() {
        System.out.println("Quá-quá");
    }

    @Override
    public String toString() {
        return "Pato{}";
    }
}
