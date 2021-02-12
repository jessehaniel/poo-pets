package br.com.letscode.java;

public class Cachorro implements AnimalDomestico {

    @Override
    public void comunicar() {
        System.out.println("au-au");
    }

    public void fingeDeMorto() {
        System.out.println("Fingindo de morto, mas não estou! Au-au");
    }

    public void rolar() {
        System.out.println("Rolando, rolando. Au-au.");
    }

    @Override
    public String toString() {
        return "Cachorro{}";
    }
}
