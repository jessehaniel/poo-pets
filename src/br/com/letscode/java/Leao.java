package br.com.letscode.java;

//Leao, AnimalSelvagem, Animal, Object
public class Leao implements AnimalSelvagem{

    @Override
    public void comunicar() {
        System.out.println("Roaarrr!!!");
    }

    @Override
    public String toString() {
        return "Leao{}";
    }
}
