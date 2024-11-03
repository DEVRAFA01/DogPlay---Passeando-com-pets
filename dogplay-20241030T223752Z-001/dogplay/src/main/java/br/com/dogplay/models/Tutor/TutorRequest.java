package br.com.dogplay.models.Tutor;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

public record TutorRequest(@NotBlank(message = "O nome não pode está vazio!")
                             @Past
                             Long id,
                             String cpf,
                             String nome,
                             String email,
                             String endereco) {
    public class SomeClass {
        private Long id;
        private String cpf;
        private String email;
        private String endereco;

        // Other fields and methods...

        public Tutor toTutor() {
            return new Tutor( id(), cpf(), email(), endereco());
        }
}
}