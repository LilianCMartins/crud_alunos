package com.example.crud_alunos.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;



    @Entity
    public class Aluno {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotBlank
        private String nome;

        @Email
        @NotBlank
        @Column(unique = true)
        private String email;

        @Min(0)
        private Integer idade;

        private String curso;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Integer getIdade() {
            return idade;
        }

        public void setIdade(Integer idade) {
            this.idade = idade;
        }

        public String getCurso() {
            return curso;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }

        // getters e setters (ou use Lombok)
    }


