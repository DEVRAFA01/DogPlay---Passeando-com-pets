package br.com.dogplay.controllers;

import br.com.dogplay.models.Pet.Pet;
import br.com.dogplay.models.Pet.PetRequest;
import br.com.dogplay.services.PetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
//import java.util.UUID;

@RestController
@RequestMapping("/pets")
public class PetsController {

    private final PetService petsService;

    public PetsController(PetService petsService) {
        this.petsService = petsService;
    }

    @PostMapping
    public ResponseEntity<Pet> save(@RequestBody PetRequest pets) {
        Pet aux = petsService.savePet(pets.toPet());
        return ResponseEntity.ok(aux);
    }

    @GetMapping
    public ResponseEntity<List<Pet>> findAll() {
        return ResponseEntity.ok(petsService.getAllPets());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pet> buscar(@PathVariable Long id) {
        Optional<Pet> aux = petsService.getPetById(id);
        return aux.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pet> atualizar(@PathVariable Long id, @RequestBody Pet pet) {
        var aux = petsService.update(pet, id);
        return ResponseEntity.ok(aux);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Pet> apagar(@PathVariable Long id) {
        petsService.deletePet(id);
        return ResponseEntity.noContent().build();
    }
}
