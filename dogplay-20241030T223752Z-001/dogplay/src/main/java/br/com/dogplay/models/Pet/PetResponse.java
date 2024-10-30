package br.com.dogplay.models.Pet;

public record PetResponse(String nome, int idade, String nomeTutor) {
    public PetResponse(Pet pet, int idade) {
        this(pet.getNome(), idade, pet.getTutor().getNome());

    }
}
