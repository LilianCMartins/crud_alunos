package com.example.crud_alunos.service;

import com.example.crud_alunos.exception.ResourceNotFoundException;
import com.example.crud_alunos.model.Aluno;
import com.example.crud_alunos.repository.AlunoRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {

    private final AlunoRepository repo;

    public AlunoServiceImpl(AlunoRepository repo) {
        this.repo = repo;
    }

    @Override
    public Aluno create(@Valid Aluno aluno) {
        if (repo.existsByEmail(aluno.getEmail())) {
            throw new IllegalArgumentException("Email já cadastrado");
        }
        return repo.save(aluno);
    }

    @Override
    public List<Aluno> findAll() {
        return repo.findAll();
    }

    @Override
    public Aluno findById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Aluno não encontrado com id: " + id));
    }

    @Override
    public Aluno update(Long id, Aluno dados) {
        Aluno aluno = findById(id);

        aluno.setNome(dados.getNome());
        aluno.setEmail(dados.getEmail());
        aluno.setIdade(dados.getIdade());
        aluno.setCurso(dados.getCurso());

        return repo.save(aluno);
    }

    @Override
    public void delete(Long id) {
        Aluno aluno = findById(id); // garante que existe
        repo.delete(aluno);
    }
}
