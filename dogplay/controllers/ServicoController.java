package br.com.dogplay.controllers;

import br.com.dogplay.models.Servico;
import br.com.dogplay.services.ServicoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping("/api/servico")
public class ServicoController {

    private final ServicoService servicoService;

    public ServicoController (ServicoService servicoService){
        this.servicoService = servicoService;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Servico servico){
        return ResponseEntity.ok(servicoService.save(servico));
    }

    @GetMapping
    public ResponseEntity findAll(){
        return ResponseEntity.ok(servicoService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable UUID id){
        servicoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
