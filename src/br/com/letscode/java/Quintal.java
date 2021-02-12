package br.com.letscode.java;

public class Quintal {

    //capacidade máxima total = 5
//    private Cachorro[] cachorros = new Cachorro[5];
//    private Gato[] gatos = new Gato[5];
//    private Galinha[] galinhas = new Galinha[5];
//    private Pato[] patos = new Pato[5];
    //É UM -> Animal

    private Animal[] pets;
    private int qtdAnimais;

    public Quintal(int capacidade) {
        this.pets = new Animal[capacidade];
        this.qtdAnimais = 0;
    }

    public Animal[] getPets() {
        return pets;
    }

    public void adicionar(Animal animal) {
        if (this.qtdAnimais == this.pets.length) {
            System.err.println("O quintal já está cheio!");
            return;
        }
        this.pets[qtdAnimais] = animal;
        this.qtdAnimais++;
    }

    public void remover(int indice) {
        if (indice < 0 || indice >= this.qtdAnimais) {
            System.err.println("Este não é um índice válido para remoção");
            return;
        }//FIXME existe um bug nessa remoção. Os demais elementos precisam realocados
        this.pets[indice] = null;
        this.qtdAnimais--;
    }

    public void listar() {
        System.out.println();
        System.out.println(">>> Listando todos os pets do quintal <<<");
        for (Animal animal : this.pets) {
            System.out.println(animal);
        }
        System.out.println("==========================================");
    }

}
