package br.com.dogplay.models;

import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Table(name = "Usuarios")


public class Usuario {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String nome;
    private String email;
    private String endereco;
    @ManyToMany (mappedBy = "Usuarios")
    private List<Tutor> Tutor;

}
