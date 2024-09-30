package br.com.dogplay.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Table(name = "Pets")


public class Pets {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String raca;
    private String tamanho;
    private String peso;
    private String descricao;
    private int horaPasseio;
    @ManyToOne
    @JoinColumn (name = "Tutor")
    private Pets Pets;
}