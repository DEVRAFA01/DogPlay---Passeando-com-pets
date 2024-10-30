package br.com.dogplay.models.Pet;

import br.com.dogplay.models.Tutor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

public record PetRequest(@NotBlank(message = "O nome não pode está vazio!")
                         String nome,
                         @Past
                         LocalDate dataNascimento,
                         String raca,
                         String cor,
                         String sexo,
                         Tutor tutor) {
    public Pet toPet() {
        return new Pet(null,nome(), dataNascimento(), raca(), cor(), sexo(), tutor());
    }
}