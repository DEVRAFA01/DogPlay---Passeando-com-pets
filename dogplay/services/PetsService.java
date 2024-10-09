package br.com.dogplay.services;

import br.com.dogplay.models.Pets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


    @Service
    public class PetsService {
        @Autowired
        private br.com.dogplay.Repository.RepositoryPets RepositoryPets;

        public Pets savePet(Pets pet) {
            return RepositoryPets.save(pet);
        }

        public List<Pets> getAllPets() {
            return RepositoryPets.findAll();
        }

        public Optional<Pets> getPetById(Long id) {
            return RepositoryPets.findById(id);
        }

        public void deletePet(Long id) {
            RepositoryPets.deleteById(id);
        }
    }



