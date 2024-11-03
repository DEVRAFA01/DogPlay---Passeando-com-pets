package br.com.dogplay.models.Prestador;

import br.com.dogplay.models.Servico.Servico;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Table(name = "prestador")


public class Prestador {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String preco;
    private String passeador;
    private String adestrador;
    private String localizacao;
    @ManyToMany
    @JoinTable (name = "prestador_servico",
            joinColumns = {@JoinColumn(name = "id_prestador") },
            inverseJoinColumns = { @JoinColumn(name = "id_servico") })
    private List<Servico> servicos;

    @Column(name = "nome")
    private String nome;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "email")
    private String email;

    @Column(name = "sexo")
    private String sexo;

    public Prestador(@NotBlank(message = "O nome não pode está vazio!") String nome, String sexo, String email, @Past LocalDate localDate) {
    }
}