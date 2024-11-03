package br.com.dogplay.models.Servico;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

public record ServicoRequest(@NotBlank(message = "O nome não pode está vazio!")
                               String nome,
                               @Past
                               String localizacao,
                               int horaPasseio,
                               String atividade,
                               Servico servico,
                               String taxa,
                               String preco,
                               String endereco

) {
    public Servico toServico() {
        return new Servico(preco(), localizacao(), atividade(), servico(), horaPasseio(), taxa());
    }
}