package com.pucpralunos.abrigo.models;

public class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + this.nome + " e meu e-mail é " + this.email);
    }
}
