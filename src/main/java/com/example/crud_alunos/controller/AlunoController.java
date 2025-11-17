package com.example.crud_alunos.controller;


import jakarta.validation.Valid;
import com.example.crud_alunos.model.Aluno;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.crud_alunos.service.AlunoService;

import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    private final AlunoService service;

    public AlunoController(AlunoService service) { this.service = service; }

    @PostMapping
    public ResponseEntity<Aluno> create(@RequestBody @Valid Aluno aluno){
        Aluno created = service.create(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @GetMapping
    public List<Aluno> all() { return service.findAll(); }

    @GetMapping("/{id}")
    public Aluno byId(@PathVariable Long id) { return service.findById(id); }

    @PutMapping("/{id}")
    public Aluno update(@PathVariable Long id, @RequestBody @Valid Aluno aluno){ return service.update(id, aluno); }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
