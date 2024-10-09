package br.com.dogplay.Repository;

import br.com.dogplay.models.Pets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryPets extends JpaRepository<Pets, Long> {



}
