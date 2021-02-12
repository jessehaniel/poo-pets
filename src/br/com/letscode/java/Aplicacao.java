package br.com.letscode.java;

public class Aplicacao {

    private Quintal meuQuintal;

    public static void main(String[] args) {
        Aplicacao aplicacao = new Aplicacao();
        aplicacao.iniciar();
    }

    private void iniciar() {
        this.meuQuintal = new Quintal(5);
        this.meuQuintal.adicionar(new Cachorro());
        this.meuQuintal.adicionar(new Cachorro());
        this.meuQuintal.adicionar(new Gato());
        this.meuQuintal.adicionar(new Leao());

        this.meuQuintal.listar();
        Animal[] meusPets = this.meuQuintal.getPets();

        for (Animal animal : meusPets) {
            if (animal != null) {
                animal.comunicar();
            }
        }

    }
}
