package br.com.dogplay.models.Prestador;

public record PrestadorResponse(String nome, int idade, String nomePrestador) {
    public PrestadorResponse(Prestador prestador, int idade) {
        this(prestador.getNome(), idade, prestador.getServicos().toString());

    }
}
