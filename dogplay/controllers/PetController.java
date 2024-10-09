package br.com.dogplay.controllers;


import br.com.dogplay.models.Prestador;
import br.com.dogplay.services.PrestadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prestador")

public class PrestadorController {
    @Autowired
    private PrestadorService prestadorService;

    @PostMapping
    public Prestador createPrestador(@RequestBody Prestador prestador) {
        return PrestadorService.savePrestador(prestador);
    }

    @GetMapping
    public List<Prestador> listprestador() {
        return PrestadorService.getAllPrestador();
    }

    @GetMapping("id_prestador")
    public ResponseEntity<Prestador> getPet(@PathVariable Long id) {
        return PrestadorService.ById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void removePet(@PathVariable Long id) {
        petsService.deletePet(id);
    }
}
