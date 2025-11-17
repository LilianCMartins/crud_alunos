package com.example.crud_alunos.service;

import jakarta.validation.Valid;
import com.example.crud_alunos.model.Aluno;

import java.util.List;

public interface AlunoService {
    Aluno create(@Valid Aluno aluno);
    List<Aluno> findAll();
    Aluno findById(Long id);
    Aluno update(Long id, Aluno aluno);
    void delete(Long id);
}
