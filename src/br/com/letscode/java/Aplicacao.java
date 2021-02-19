package br.com.letscode.java;

public class Aplicacao {

    private Quintal meuQuintal;

    public static void main(String[] args) {
        Aplicacao aplicacao = new Aplicacao();
        aplicacao.iniciar();
    }

    private void iniciar() {
        iniciarArrayMeuQuintal();
        adicionarAnimaisNoMeuQuintal();

        this.meuQuintal.listar();
        Animal[] meusPets = this.meuQuintal.getPets();

        for (Animal animal : meusPets) {
            if (animal != null) {
                animal.comunicar();
            }
        }
    }

    private void adicionarAnimaisNoMeuQuintal() {
        try {
            this.meuQuintal.adicionar(new Cachorro());
        } catch (QuintalException ex) {
            ex.printStackTrace();
        }
    }

    private void iniciarArrayMeuQuintal() {
        this.meuQuintal = new Quintal(0);
    }
}
