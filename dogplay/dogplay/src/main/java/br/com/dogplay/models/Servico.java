package br.com.dogplay.models;

import jakarta.persistence.*;

import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Table(name = "Servico")

public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String taxa;
    private String preco;
    private String localizacao;
    private String endereco;
    private String Atividade;
    private int horaPasseio;
    @ManyToMany(mappedBy = "servicos")
    private List<Prestador> prestador;
}