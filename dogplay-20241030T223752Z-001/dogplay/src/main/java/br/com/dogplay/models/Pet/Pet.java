package br.com.dogplay.models.Pet;
import br.com.dogplay.models.Tutor;
import jakarta.persistence.*;
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
    private String nome;
    private LocalDate dataNascimento;
    private String raca;
    private String cor;
    private String sexo;
    @ManyToOne
    @JoinColumn(name = "id_dono")
    private Tutor tutor;
}
