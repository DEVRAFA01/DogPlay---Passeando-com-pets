package br.com.dogplay.models.Tutor;

public record TutorResponse(Long id, String cpf, String email, String endereco) {
    public TutorResponse(Tutor tutor) {
        this(tutor.getId(), tutor.getCpf(), tutor.getEmail(), tutor.getEndereco());
    }
}


