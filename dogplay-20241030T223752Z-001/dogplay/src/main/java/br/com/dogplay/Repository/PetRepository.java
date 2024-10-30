package br.com.dogplay.Repository;

import br.com.dogplay.models.Pet.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {



}
