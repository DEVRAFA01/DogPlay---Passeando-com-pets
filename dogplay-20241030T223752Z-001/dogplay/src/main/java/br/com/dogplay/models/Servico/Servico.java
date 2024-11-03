package br.com.dogplay.models.Servico;

import br.com.dogplay.models.Prestador.Prestador;
import jakarta.persistence.*;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Table(name = "Servico")

public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String taxa;
    private String preco;
    private String localizacao;
    private String endereco;
    private String atividade;
    private int horaPasseio;
    @ManyToMany(mappedBy = "servicos")
    private List<Prestador> prestador;

    @Column(name = "nome")
    private String nome;

    public Servico(String preco, @Past String localizacao, String atividade, Servico servico, int horaPasseio, String taxa) {
    }
}