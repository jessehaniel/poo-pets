package br.com.letscode.java;

public class Quintal {

    private Animal[] pets;
    private int qtdAnimais;

    public Quintal(int capacidade) {
        this.pets = new Animal[capacidade];
        this.qtdAnimais = 0;
    }

    public Animal[] getPets() {
        return pets;
    }

    public void adicionar(Animal animal) throws QuintalException {
        validarSeAindaCabemMaisAnimais();
        validarSeAnimalPermitido(animal);
        this.pets[qtdAnimais] = animal;
        this.qtdAnimais++;
    }

    private void validarSeAnimalPermitido(Animal animal) throws AnimalNaoPermitidoNoQuintalException {
        if (animal instanceof AnimalSelvagem) {
            throw new AnimalNaoPermitidoNoQuintalException();
        }
    }

    private void validarSeAindaCabemMaisAnimais() throws QuintalJaEstaCheioException {
        if (this.qtdAnimais == this.pets.length) {
            throw new QuintalJaEstaCheioException();
        }
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
