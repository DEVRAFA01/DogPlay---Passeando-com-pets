package br.com.dogplay.controllers;

import br.com.dogplay.models.Pets;
import br.com.dogplay.services.PetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {
    @Autowired
    private PetsService petsService;

    @PostMapping
    public Pets createPet(@RequestBody Pets pet) {
        return petsService.savePet(pet);
    }

    @GetMapping
    public List<Pets> listPets() {
        return petsService.getAllPets();
    }

    @GetMapping("id_pets")
    public ResponseEntity<Pets> getPet(@PathVariable Long id) {
        return petsService.getPetById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void removePet(@PathVariable Long id) {
        petsService.deletePet(id);
    }
}
