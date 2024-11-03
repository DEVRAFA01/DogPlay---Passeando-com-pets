package br.com.dogplay.models.Prestador;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

public record PrestadorRequest(@NotBlank(message = "O nome não pode está vazio!")
                         String nome,
                         @Past
                         LocalDate dataNascimento,
                         String email,
                         String sexo,
                         Prestador prestador) {
    public Prestador toPrestador() {
        return new Prestador(nome(), sexo(), email(), dataNascimento());
    }
}