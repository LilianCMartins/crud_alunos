package com.example.crud_alunos.repository;

import com.example.crud_alunos.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    // O Spring implementa automaticamente esse método
    boolean existsByEmail(String email);

}
