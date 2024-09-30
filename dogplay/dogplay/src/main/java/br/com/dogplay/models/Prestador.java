package br.com.dogplay.models;

import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Table(name = "prestador")
public class Prestador {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String anc;
    private String passeador;
    private String adestrador;
    private String localizacao;
    @ManyToMany
    @JoinTable (name = "prestador_servico",
            joinColumns = {@JoinColumn(name = "id_prestador") },
            inverseJoinColumns = { @JoinColumn(name = "id_servico") })
    private List<Servico> servicos;

}