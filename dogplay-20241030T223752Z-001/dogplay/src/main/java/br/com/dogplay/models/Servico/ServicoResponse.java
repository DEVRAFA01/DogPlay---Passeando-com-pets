package br.com.dogplay.models.Servico;

public record ServicoResponse(String nome, String localizacao, int horaPasseio) {
    public ServicoResponse(Servico servico, int horaPasseio) {
        this(servico.getNome(), servico.getLocalizacao(), horaPasseio);
    }
}

