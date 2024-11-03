package br.com.dogplay.models.Pet;
import br.com.dogplay.models.Tutor.Tutor;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "O nome não pode ser vazio!")
    private String nome;
    @NotNull(message = "A data de nascimento não pode ser nula!")
    private LocalDate dataNascimento;
    @NotBlank(message = "A raça não pode ser vazia!")
    private String raca;
    @NotBlank(message = "A cor não pode ser vazia!")
    private String cor;
    @NotBlank(message = "O sexo não pode ser vazio")
    private String sexo;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_dono", nullable = false)
    private Tutor tutor;
}
