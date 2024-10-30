package br.com.dogplay.services;

import br.com.dogplay.Repository.PetRepository;
import br.com.dogplay.models.Pet.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PetService {
    @Autowired
    private PetRepository petsRepository;

    public Pet savePet(Pet pet) {
        return petsRepository.save(pet);
    }

    public List<Pet> getAllPets() {
        return petsRepository.findAll();
    }

    public Optional<Pet> getPetById(Long id) {
        return petsRepository.findById(id);
    }

    public void deletePet(Long id) {
        petsRepository.deleteById(id);
    }

    public Pet update(Pet pet, Long id) {
        var aux = petsRepository.findById(id).get();
        if (aux != null) {
            if (pet.getId() != null) {
                aux.setId(pet.getId());
            }
            if (pet.getId() != null) {
                aux.setId(pet.getId());
            }
            return petsRepository.save((aux));
        }
        return null;
    }
}



