package br.com.letscode.java;

public class QuintalException extends Exception {

    private static final String messageDefault = "Ocorreu um fluxo de exceção no Quintal.";

    public QuintalException(Exception cause) {
        super(messageDefault, cause);
    }

    public QuintalException(String message) {
        super(message);
    }
}
