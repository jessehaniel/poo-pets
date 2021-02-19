package br.com.letscode.java;

public class AnimalNaoPermitidoNoQuintalException extends QuintalException {

    public AnimalNaoPermitidoNoQuintalException() {
        super("Não é permitido ter AnimalSelvagem no quintal");
    }
}
